package Pr_10.task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument implements IDocument {
    File file;

    TextDocument (File file) {
        this.file = file;
    }

    @Override
    public void writeText(String text) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("writing to file error");
        }
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public void save() {
    }

    @Override
    public void exit() {

    }


}
