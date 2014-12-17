import TerminalIO.*;
public class fibonacci {
    static int nummoves = 0;
    public static void main(String[] args){
        KeyboardReader k = new KeyboardReader();
        int n = k.readInt("Enter number from 1 to 15: ");
        if (n < 1 || n > 15){
            System.out.println("Invalid input - program will now end");
            return;
        }
        System.out.println("Factorial " + n + " = " + fibonacci(n));
    }
        static int fibonacci (int n){
            if (n <= 2)
                return 1;
            else return fibonacci (n - 1) + fibonacci (n - 2);
        }
}