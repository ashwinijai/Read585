package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    public static void main(String [] args) throws IOException {
        Path path = Paths.get("src/main/resources/test.585");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            int lineNum = 0;
            while((line= reader.readLine()) != null) {
                lineNum++;
                if(lineNum >= 19) {
                    System.out.println(lineNum + "-" + line + " \n");
                    int length = line.length();
                    System.out.println("Customer No - "+line.substring(0,15).trim());
                    System.out.println("Customer Name - "+line.substring(15, 40).trim());
                    System.out.println("Trans code - " + line.substring(40, 45).trim());
                    System.out.println("From Acc Num - " + line.substring(45, 78).trim());
                    System.out.println("To Acc Num - " + line.substring(78, 106).trim());
                    System.out.println("Currency  - " + line.substring(106, length-1).trim());
                }
            }
        }
    }
}
