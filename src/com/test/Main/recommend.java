package com.test.Main;

import java.util.*;
import java.io.*;

public class recommend {

    public static ArrayList<MakeList> arraylist;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        System.out.print("성함이 어떻게 되시나요?"); // 이름
        input = br.readLine();
        String name = input;

        System.out.print("몇 분 방문예정이신가요?"); // 인원수
        input = br.readLine();
        int people = Integer.parseInt(input);


        System.out.print("방문 시간은 어떻게 되시나요?"); // 방문시간
        input = br.readLine();
        String[] a = input.split(" ");
        int hour = Integer.parseInt(a[0]);
        int min = Integer.parseInt(a[1]);

        System.out.print("몇 분 방문예정이신가요?"); // 번호
        input = br.readLine();
        int tel = Integer.parseInt(input);


        ArrayList<MakeList> arraylist = new ArrayList<>();
        arraylist.add(new MakeList(name, people, hour, min, tel));
        // 생성


    }
}



class MakeList {
    private String name; // 이름
    private int people; // 인원수
    private int hour; // 방문예정 시
    private int min; // 방문예정 분
    private int tel; // 번호
    private int checking;

    public MakeList(String name, int people, int hour, int min, int tel) {

        this.name =name;
        this.people = people;
        this.hour = hour;
        this.min = min;
        this.tel = tel;
        this.checking = 0; // 기본값
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getChecking() {
        return checking;
    }

    public void setChecking(int checking) {
        this.checking = checking;
    }



}