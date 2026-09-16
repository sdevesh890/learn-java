package basics.operators;

public class BitwiseOperator {
    static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(~b); // -(x+1)

        //Shift Operators

        //Left Shift
        System.out.println(5<<2);

        //Right Shift
        System.out.println(5>>2);

    }
}
