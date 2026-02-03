package DayOne;

public class Character {
    public static void main(String[] args) {
        char ch = 'e';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Given Character is vowel");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Given Charater is consonent");
        }
    }
}
