package ru.fizteh.fivt.students.SibgatullinDamir.multifilehashmap;

/**
 * Created by Lenovo on 01.10.2014.
 */
public interface Commands {
    void execute(String[] args, FileMap fileMap) throws MyException;
    String getName();
}
