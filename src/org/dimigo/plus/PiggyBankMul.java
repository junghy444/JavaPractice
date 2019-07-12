package org.dimigo.plus;

public class PiggyBankMul {
    private static int balance;

    public static void putMoney(FamilyMember member, int amount){
        System.out.printf(member.getMemberName() + " : %,d원 넣음\n", amount);
        balance = amount + balance*2;
    }

    public static void printBalance(){
        System.out.printf("돼지저금통 총 금액 : %,d원\n", balance);
    }
}
