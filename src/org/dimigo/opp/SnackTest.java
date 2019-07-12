package org.dimigo.opp;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snackArr = {
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)
        };

        printArray(snackArr);

        int sum = 0;
        for(Snack value : snackArr){
            sum += value.calcPrice(

            );
        }

        System.out.print("총 구매 금액 : ");
        System.out.printf("%,d원", sum);

    }

    public static void printArray(Snack[] snackArr) {
        for(Snack value : snackArr){
            System.out.println(value);
        }
    }

}
