package DayOne;

public class MaxValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (b>a) {
            if(b>c){
                System.out.println("b is greater.");
            } else {
                System.out.println("c is greater.");
            }
        } else {
            System.out.println("a is greater");
        }
    }
}
