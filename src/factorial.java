import TerminalIO.*;
public class factorial {
    static int nummoves = 0;
    public static void main(String[] args){
        KeyboardReader k = new KeyboardReader();
        int n = k.readInt("Enter number from 1 to 15: ");
        if (n < 1 || n > 15){
            System.out.println("Invalid input - program will now end");
            return;
        }
        System.out.println("Factorial " + n + " = " + factorial(n));
    }
       static int factorial(int n){
            if (n == 1)
                return 1;
            else
                return n*factorial(n - 1);
        }
    
}
