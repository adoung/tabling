package com.test.Main;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int count = 1;

    public static void main() throws Exception {

        init();
    }
    public static void selectMenu(int select) throws Exception {

        switch (select) {
            case 1:
                System.out.println();
                System.out.println(" 예약 페이지로 이동합니다. ");
                recommend.main(null);
                break;
            case 2:
                System.out.println();
                System.out.println(" 방문 페이지로 이동합니다.");
                check.main(null);
                break;
            case 3:
                System.out.println();
                System.out.println(" 순서 조회 페이지로 이동합니다.");
                list.main();
                break;
            case 4:
                System.out.println();
                System.out.println(" 대기 명단을 확인합니다. ");
                management.main(null);
                break;
            case 5:
                System.out.println();
                System.out.println(" 종료합니다. ");
                break;
            default:
                System.out.println();
                System.out.println(" 다시 입력해주세요.");
                init();
                break;
        }


    }
    public static void init() throws Exception {
        int select = printMenu();
        selectMenu(select);
    }
        public static int printMenu() {
            System.out.println(" 깡통돌곱창에 오신 걸 환영합니다. ");
            System.out.println(" 1. 등록하기 ");
            System.out.println(" 2. 방문 또는 예약 취소하기 ");
            System.out.println(" 3. 순서 조회하기 ");
            System.out.println(" 4. 관리자 로그인 ");
            System.out.println(" 5. 종료하기 ");
            System.out.print( " 선택 : ");
            int select = scanner.nextInt();

            return select;

    }
}
