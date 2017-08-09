package model.entity;

import model.exception.NicknameAlreadyExistsException;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class NotebookSingleton {

    private static volatile NotebookSingleton instance;
    private ArrayList<Record> records;

    private NotebookSingleton() {
        records = new ArrayList<>();
    }

    public static NotebookSingleton getInstance() {
        NotebookSingleton localInstance = instance;
        if (instance == null) {
            synchronized (NotebookSingleton.class) {
                localInstance = instance;
                if (instance == null) {
                    instance = localInstance = new NotebookSingleton();
                }
            }
        }
        return localInstance;
    }

    public void add(Record inputedRecord) throws NicknameAlreadyExistsException {
        checkNicknameForUnique(inputedRecord);

        Date date = new Date();

        inputedRecord.setDateOfEntryInNotebook(date);
        inputedRecord.setDateOfLastChanging(date);
        records.add(inputedRecord);
    }

    private void checkNicknameForUnique(Record inputedRecord) throws NicknameAlreadyExistsException {
        for (Record record : records) {
            if(record.getNickname().equals(inputedRecord.getNickname())) {
                throw new NicknameAlreadyExistsException(inputedRecord);
            }
        }
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }
}
