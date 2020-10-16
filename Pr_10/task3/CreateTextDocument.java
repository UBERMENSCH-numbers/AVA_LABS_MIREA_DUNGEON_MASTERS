package Pr_10.task3;

import java.io.File;
import java.io.IOException;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument createNew(String path) {
        File file = new File(path);
        try {
            if (file.createNewFile()){
                System.out.println("file  = " + file + " is created");
            } else System.out.println("file  = " + file + " is not created");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file creating error");
        }
        return new TextDocument(file);
    }

    @Override
    public IDocument createOpen(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return createNew(path);
        }
        return new TextDocument(file);
    }
}
