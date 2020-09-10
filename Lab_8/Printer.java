package Lab_8;

import java.io.FileReader;
import java.io.IOException;

public class Printer {
    public void print(String text) {
        try {
            FileReader reader = new FileReader(text);
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
