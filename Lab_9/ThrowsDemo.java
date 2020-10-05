package Lab_9;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );

        Boolean invalidVal = true;
        while (invalidVal) {
            invalidVal = false;
            try {
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Exception catch: " + e.getMessage());
                invalidVal = true;
            }

        }

    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}