package DayOne;

public class Divide {
    public static void main(String[] args) {
        int num = 23;
        if (num % 5 == 0 && num % 11 ==0) {
            System.out.println("Number is divisible by both 5 and 11");
        } else{
            System.out.println("Number is not divisible by both 5 and 11");
        }
    }
}
