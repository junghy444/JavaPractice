package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 실습과제 3 - 초간단 게임프로그램
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};

        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int choose = 5;

        do {
            System.out.println("--------------------\n" + "<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정\n" + "2. 공격력 증가\n" + "3. 공격력 감소\n" + "9. 종료");
            System.out.print("--------------------\n" + "메뉴 입력 => ");

            menu = scanner.nextInt();
            switch (menu) {

                case 1:
                    choose = new Random().nextInt(4);
                    System.out.println(character[choose] + "(으)로 설정되었습니다.");
                    break;
                case 2:
                    if(choose == 5) System.out.println("먼저 캐릭터를 설정하세요!!");
                    else {
                        attackPoint[choose] += 10;
                        System.out.println(character[choose] + " 공격력이 증가되었습니다. 현재 공격력 : " + attackPoint[choose]);
                    }
                    break;
                case 3:
                    if(choose == 5) System.out.println("먼저 캐릭터를 설정하세요!!");
                    else {
                        attackPoint[choose] -= 10;
                        System.out.println(character[choose] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[choose]);
                    }
                    break;
                case 9:
                    System.out.println("이제 공부하세요!");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다!!");
                    break;
            }
        } while(menu != 9);
    }
}
