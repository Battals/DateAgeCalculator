package demo;

import java.util.Scanner;

public class DateAgeCalculator {
    int yourAge;
    int dateAge;
    boolean agefit;

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your age");
        yourAge = sc.nextInt();
        System.out.println("Write your dates age");
        dateAge = sc.nextInt();
        acceptedAge(yourAge, dateAge);
    }

    public void acceptedAge(int yourAge,int dateAge) {
        int lowestAge = yourAge / 2 + 7;
        int maxAge = yourAge + 10;
        if (dateAge < lowestAge || dateAge > maxAge) {
            agefit = false;
        } else if (dateAge > lowestAge) {
            agefit = true;
        }
returnAge(agefit);
    }

    public boolean returnAge(boolean agefit) {
        if (agefit == false) {
            System.out.println("Your date is either too young or too old for you");
        } else if (agefit == true) {
            System.out.println("Your dates age fits you");
        }
        return agefit;
    }


}



