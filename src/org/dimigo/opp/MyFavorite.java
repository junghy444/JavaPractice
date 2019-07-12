package org.dimigo.opp;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        // 실습과제 6 - MyFavorite
        String[ ] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {"인피니트", "박보영", "자료구조"};

        Scanner scanner = new Scanner(System.in);
        String answer;
        int choose;

        do {
            System.out.print("------------------\n");
            System.out.println("1. 질문 선택\n" + "2. 정답 공개\n" + "9. 프로그램 종료");
            System.out.print("------------------\n" + "메뉴 선택 => ");

            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    choose = new Random().nextInt(3);
                    System.out.print(questions[choose] + " ");

                    answer = scanner.next();

                    System.out.println(answer.equals(answers[choose])? "정답입니다!" : "틀렸습니다!");
                    break;

                case 2:
                    StringBuilder sb = new StringBuilder();
                    System.out.println("<< 정답 출력 >>");
                    for(int i = 0; i < 3; i++){
                        sb.append(questions[i]).append(" " + answers[i]).append("입니다.\n");
                    }
                    System.out.println(sb.toString());
                    break;

                case 9:
                    System.out.println("Bye~");
                    scanner.close();
                    break;

                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        } while(choose != 9);
    }
}

