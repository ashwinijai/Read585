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
                    System.out.println("Customer No - "+line.substring(0,15).trim()); //Customer No length is 15(fixed)
                    System.out.println("Customer Name - "+line.substring(15, 40).trim());//Customer name length cant be decided. we need to check on the max length
                    System.out.println("Trans code - " + line.substring(40, 45).trim());//Transcode length is 3(fixed)
                    System.out.println("From Acc Num - " + line.substring(45, 78).trim());//From Acc Num length is 23 (fixed)
                    System.out.println("To Acc Num - " + line.substring(78, 106).trim());//To Acc Num length is 23 (fixed)
                    System.out.println("Currency  - " + line.substring(106, length-1).trim());//Currency length is 3 (fixed)
                }
            }
        }
    }
}
