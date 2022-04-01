package com.infogalaxy.addressbookmanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileAccess {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("MyData.txt"));
            String data;
            while ((data = bufferedReader.readLine()) != null && !data.equalsIgnoreCase("null")) {
                System.out.println(data);
                String[] separeteData = data.split(",");
                System.out.println("FirstName = " + separeteData[0]);
                System.out.println("LastName = " + separeteData[1]);
                System.out.println("Address = " + separeteData[2]);
                System.out.println("City = " + separeteData[3]);
                System.out.println("State = " + separeteData[4]);
                System.out.println("Mono = " + separeteData[5]);
                System.out.println("Email = " + separeteData[6]);
                System.out.println("Zip = " + separeteData[7]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}