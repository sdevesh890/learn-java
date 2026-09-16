package basics.loops;

public class WhileDemo {
    static void main(String[] args) {
         int sum = 0;
         int n = 10;
         // This loop run based on the true/false condition.
         while(n-->0)
         {
             sum+=n;
         }

        System.out.println("Sum of the first 10 numbers: "+sum);
    }
}
