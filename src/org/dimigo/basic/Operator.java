package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        // 실습과제 2 - 디미벅스
        int salary = 1700000;
        int person = 3;
        int store = 1500;

        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n", salary);
        System.out.printf("점포 내 직원 수 : %,d명\n", person);
        System.out.printf("점포 수 : %,d개\n", store);

        //long annual = (long)salary * 12 * person * store;
        long annual = salary * 12L * person * store;

        System.out.printf("\n연간 인건비 : %,d명\n", annual);

    }
}
