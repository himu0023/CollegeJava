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
        // int a =10;
        // String name = "Prime";
        // char grade = 'A';
        // float pi = 3.14f;
        // boolean isPassword = true; 
        // System.out.println(a);

        // Multiple variable 
        // int x, y, z;
        // x=y=z=10;
        // x=y=z=90;
        // System.out.println(x+ " " +y+ " "+z);

        // final int b = 20;
        // b= 90 this will throw error because we used final keywords here 
        // System.out.println(b);

        // var c = 30; //local variable 
        // var d = 12.4f; // local variable
        // var e = "Hello"; // local variable
        // System.out.println(e);

        // int A = 10;
        // float B = 1233.56f;
        // double C = 123.456;
        // long D = 12343253L;


        // Typecasting: 

        // int a = 10;
        // float b = 12.5f;
        // float c = a+b;
        // System.out.println(c);

        // Widding casting 
        // bytes > short > int > long > float > double

        // Narrowing casting 
        // double > float > long > int > short > bytes

        // OPERATORS
        // Arithmetic: + - * /
        // Assaigment: =, +=, -=, /=, *=
        // Comparision: =, == : compare, === : check the data type
        // Logical: AND, &&, OR, ||, NOT
        // Bitwise: OR, XOR, XNOR



        // String Methods:
        // String name = "Himanshu Bisht";
        // System.out.println(name.length());
        // System.out.println(name.indexOf("B"));
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.charAt(5));

        // String One = "Hello";
        // String Two = "Hello";
        // String Three = "cse";
        // String Name1 = "  Welcome..  ";
        // System.out.println(Name1);
        // System.out.println(Name1.trim());
        // System.out.println(One.equals(Two));
        // System.out.println(One.equals(Three));


        int a = 10; 
        int b = 20; 

        // if (a>b) {
        //     System.out.println("B is smaller than A");
        // } else {
        //     System.out.println("B is greater");
        // }

        // if (a<b) {
        //     System.out.println("B value is big");
        // } else{
        //     System.out.println("A value is Big");
        // }


        int x = 5 ; 
        while (x<10) {
            x++;
            System.out.println("True...");
        }

        do{
            x++;
            System.out.println("True, y");
        }while (x<10);
    }
}


// ten task :
/* 
1. given number to find maximum values
2. given 3 numbers find max value
3. find given number +ve, -ve and zero
4. given number is divided by 5 and 11
5. odd or even
6. find leap year or not
7. Given data is alphabet or not 
8. given data is vowels or consonents
9. given data find alphabet, digit and special char
10. vote eligible or not
*/