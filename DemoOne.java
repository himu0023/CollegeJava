/*
Java program : Class name of file name should we same
This is basic Java syntax :

public class name{
    public static void main(String[] args) {
        System.out.println();
    }
}

Commands : single line and multiple line commands:
single line comment: //
*/

public class DemoOne {
    public static void main(String[] args) {

        // "Variable Declaration: int, float, char, String, boolean, Array, long."
        int a =10;
        String name = "Prime";
        char grade = 'A';
        float pi = 3.14f;
        boolean isPassword = true; 
        // System.out.println(a);

        // Multiple variable 
        int x, y, z;
        x=y=z=10;
        x=y=z=90;
        // System.out.println(x+ " " +y+ " "+z);

        final int b = 20;
        // b= 90 this will throw error because we used final keywords here 
        // System.out.println(b);

        var c = 30; //local variable 
        var d = 12.4f; // local variable
        var e = "Hello"; // local variable
        // System.out.println(e);
    }
}