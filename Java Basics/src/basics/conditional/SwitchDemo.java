package basics.conditional;

public class SwitchDemo {
    static void main(String[] args) {

        // Old switch-ways
        switch (2)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Nothing!!");
        }

        // New way - Java 12 onwards.

        String res = switch (31)
        {
            case 1,2 -> "One or Two";
            case 3 -> "Three";
            default -> "Nothing";
        };

        System.out.println(res); //Print - Nothing.
    }
}
