package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int no = 1;
        while(true) {
            System.out.print("명령) ");
            String input = scanner.nextLine();
            if(input.equals("등록")) {
                System.out.print("명언 : ");
                scanner.nextLine();
                System.out.print("작가 : ");
                scanner.nextLine();

                System.out.print(no + "번 명언이 등록되었습니다.");
                no++;
            }
            else if(input.equals("종료")) {
                break;
            }
        }
    }
}
