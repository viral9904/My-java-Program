package practical;

import java.util.Scanner;

public class calsumofdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the numbre: ");
        int n = s.nextInt();

        int sum = 0; 
        int i = 1;   

        
        while (i <= n) {
            sum = sum + i; 
            i++;          
        }

        System.out.println("The sum of the series Is: " + sum);
        s.close();
        }
}