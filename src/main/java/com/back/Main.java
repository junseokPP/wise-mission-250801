package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        String[] contents = new String[100];  // 명언 저장용 배열
        String[] authors = new String[100];   // 작가 저장용 배열
        int count = 0;  // 등록된 명언 수

        while (true) {
            System.out.print("명령) ");
            String input = scanner.nextLine();

            if(input.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();

                System.out.print("작가 : ");
                String author = scanner.nextLine();

                contents[count] = content;
                authors[count] = author;

                System.out.println((count + 1) + "번 명언이 등록되었습니다.");
                count++;
            }
            else if(input.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------------------");

                for (int i = count - 1; i >= 0; i--) {
                    System.out.printf("%d / %s / %s\n", i + 1, authors[i], contents[i]);
                }
            }
            else if(input.equals("종료")) {
                break;
            }
        }
    }
}