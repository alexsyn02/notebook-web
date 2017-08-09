package model;

import model.entity.NotebookSingleton;
import model.entity.Record;
import model.exception.NicknameAlreadyExistsException;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class Model {
    private NotebookSingleton notebook;

    public Model() {
        notebook = NotebookSingleton.getInstance();
    }

    public void addRecord(Record record) throws NicknameAlreadyExistsException {
        notebook.add(record);
    }
}
