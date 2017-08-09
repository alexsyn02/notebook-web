package model.exception;

import model.entity.Record;

/**
 * Created by Alexandr on 08.08.2017.
 */
public class NicknameAlreadyExistsException extends Exception {

    private Record record;

    public NicknameAlreadyExistsException(Record record) {
        this.record = record;
    }

    public Record getRecord() {
        return record;
    }
}
