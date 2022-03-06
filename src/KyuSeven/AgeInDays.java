package KyuSeven;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
Did you ever want to know how many days old are you?
Complete the function which returns your age in days.
The birthday is given in the following order: year, month, day.
For example if today is 30 November 2015 then
---------------------------------------------*/

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ageInDays(sc.nextInt(), sc.nextInt(), sc.nextInt()));

        sc.close();

    }

    //The code below is the solution
    public static String ageInDays(int year, int month, int day) {

        //Declaration of the two dates
        LocalDate date1 = LocalDate.of(year, month, day);
        LocalDate date2 = LocalDate.now();

        //Days of difference between date 1 and date 2
        Duration diff = Duration.between(date1.atStartOfDay(), date2.atStartOfDay());
        long dias = diff.toDays();

        return "You are " + dias +  " days old";
        
    }

    /*public class Kata {
        public static String ageInDays(final int y, final int m, int d) {
          return String.format("You are %d days old", LocalDate.now().toEpochDay() - LocalDate.of(y, m, d).toEpochDay());
        }
    }*/
}
