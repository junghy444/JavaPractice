package org.dimigo.opp;

public class IdolGroup {
    public static void main(String[] args) {
        String[] groupName = {"인피니트", "방탄소년단", "블랙핑크"};

        String[][] memberName = {
                {"성규", "동우", "우현", "성열", "L", "성종"},
                {"정국", "지민", "뷔", "슈가", "진"},
                {"지수", "제니", "로제", "리사"}
        };

        for(int i = 0; i < groupName.length; i++){
            System.out.println("<< " + groupName[i] + " >>");
            for(int j = 0; j < memberName[i].length; j++){
                System.out.println(memberName[i][j]);
            }
            System.out.println();
        }
    }
}
