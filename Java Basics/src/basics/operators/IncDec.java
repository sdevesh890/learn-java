package basics.operators;

public class IncDec {
    static void main(String[] args) {
        int a = 0;
        int b = a++; // (Post-Increment) First assign then inc
        b = ++a; // (Pre-Increment) First inc then assign.

        int c = 12;
        int d = c--; // (Post-Decrement )
        d = --c; // Pre-Decrement
    }
}
