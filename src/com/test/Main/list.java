package com.test.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class list {
    public static void main() throws Exception {
        // 본인 순서 조회

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력


        System.out.print("성함 : ");
        String input = br.readLine(); //
        String name = input;
        System.out.print("전화번호 뒷자리 : ");
        input = br.readLine();
        int tel = Integer.parseInt(input);

        System.out.println(" 안녕하세요 " + name + "님, 방문하시겠습니까?(Y/N)");
        input = br.readLine();

        if(input.equals("Y") || input.equals("y")) {
            // 방문하겠다.
            MakeList makelist = find(recommend.arraylist, name, tel);
            if(makelist == null) {
                pass();
            }else {
                makelist.setChecking(1);
            }
        } else if(input.equals("N") || input.equals("n")) {
            // 예약 취소
            MakeList makelist = find(recommend.arraylist, name, tel);
            makelist.setChecking(2);
        }
    }

    private static MakeList find(ArrayList<MakeList> arraylist, String name, int tel) {
        MakeList make = null;
        for(MakeList makelist : arraylist) {
            if(makelist.getName().equals(name) && makelist.getTel()==tel) {
                make = makelist;
            }
        }
        return make;
    }

    private static void pass() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
        System.out.println("잘못된 입력입니다.");
        System.out.println("1. 다시 조회하기 ");
        System.out.println("2. 메인 화면으로 돌아가기");
        String input = br.readLine();
        int num = Integer.parseInt(input);
        switch (num) {
            case 1: list.main(); break;
            case 2: Main.main(); break;
            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
    }

    public static MakeList findlist(String name, int tel, ArrayList<MakeList> arraylist) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
        for(MakeList makelist : arraylist) {
            if(makelist.getName().equals(name) && makelist.getTel()==tel) {
                return makelist;
            } else {
                System.out.println("잘못된 입력입니다.");
                System.out.println("1. 다시 조회하기 ");
                System.out.println("2. 메인 화면으로 돌아가기");
                String input = br.readLine();
                int num = Integer.parseInt(input);
                switch (num) {
                    case 1: list.main(); break;
                    case 2: Main.main(); break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + num);
                }
            }
        }
    }
}

