package DayOne;

public class LeapYear {
    public static void main(String[] args) {
        int year = 4000;
        boolean isLeap = false;
        if (year%400==0) {
            isLeap=true;
        } else if (year%100==0) {
            isLeap=false;
        }else if (year%4==0) {
            isLeap=true;
        }

        if (isLeap) {
            System.out.println("Year is Leap");
        } else {
            System.out.println("Year is not Leap");
        }
    }
}
