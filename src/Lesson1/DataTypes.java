package Lesson1;



public class DataTypes {
    public static void main(String[] args) {
        System.out.println("INTEGER DATA TYPES");

        byte b = 127;
        short s = 32;
        int i = 1;
        long l = -356;

        System.out.println("Byte type: has 8 bits, can have the value in range from -128 to 127. " +
                        "Example b = " + b);
        System.out.println("Short type: has 16 bits, can have the value in range from -32,768 to 32,767. " +
                        "Example s = " + s);
        System.out.println("Int type: has 32 bits, can have the value in range from -2,147,483,648 to 2,147,483,647" +
                        "Example i = " + i);
        System.out.println("Long type: has 64 bits, can have the value in range from -9,223,372,036,854,808 to 9,223,372,036,854,808" +
                        "Example l = " + l);
        System.out.println("FLOATING POINT DATA TYPES");

        float f = 127;
        double d = 32.78;

        double result = f /d;

        System.out.println("Float type; has 32 bits. " +
                "Example f = " + f);
        System.out.println("Double type: has 64 bits. " +
                "Example result = " + result);

        System.out.println("ChARACTER DATA TYPES");
 //       char c = 65;
        char c1 = 'A';

        System.out.println("Char type Example: c = " + c1);


        System.out.println("LOGICAL DATA TYPES");

        boolean tr = true;
        boolean fal = false;

        System.out.println("Logical type " +
                "Example: tr = " + tr);
        System.out.println("Logical type " +
                "Example: 7 > 8  is " + (8 >= 8));

        if (fal) System.out.println("you've put the same in variables fal and tr values occasionally");


        int i1 = 5;
        int i2 = 2;
        int i3 = -2;
        int i4 =0;

        int res;
        res = i1 + i2;
        System.out.println("result of i1 + i2 is " + res);
        res = i1 - i2;
        System.out.println("result of i1 - i2 is " + res);
        res = i1 * i2;
        System.out.println("result of i1 * i2 is " + res);
        res = i1 / i2;
        System.out.println("result of i1 / i2 is " + res);
        res = i1 % i2;
        System.out.println("result of i1 % i2 is " + res);



    }
}
