package basics.operators;

public class RelationalOperator {
    static void main(String[] args) {

        System.out.println(10<2);
        System.out.println(10<=2);
        System.out.println(10==2);
        System.out.println(10>2);
        System.out.println(10>=2);

        //Ternary Operator
        int a = 10>2?100:22;
        System.out.println(a);

        //instanceOf Operator -> Tells whether object is instance of class, subclass or interface.
        RelationalOperator obj = new RelationalOperator();
        System.out.println(obj instanceof RelationalOperator);

    }
}
