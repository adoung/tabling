package com.test.Main;

import java.io.BufferedReader;
import java.io.FileReader;

public class management {
    public static void main(String[] args) { // 대기명단 확인
        try {
            BufferedReader reader = new BufferedReader(new FileReader(".//dat/reclist.txt"));
            String line = null;

            while((line = reader.readLine()) != null) {
                String[] temp = line.split(",");
                if(Integer.parseInt(temp[6]) == 0) {
                    System.out.println(temp[0] + " . " + temp[1]  + "("+temp[5]+")님 " + temp[2] + "명, " + temp[3] + "시" + temp[4] + "분");
                }
            }

            reader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
