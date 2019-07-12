package org.dimigo.plus;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] familyMembers = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };

        int[] amounts = {
                10000, 5000, 2000, 1000
        };

        FamilyMember.printMemberCnt();

        for(int i = 0; i < 4; i++){
            PiggyBank.putMoney(familyMembers[i],amounts[i]);
        }

        PiggyBank.printBalance();

        PiggyBank.putMoney(familyMembers[2], 1000);

        PiggyBank.printBalance();
    }
}
