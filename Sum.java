// Keyboard Input With Subtracting

import java.util.*;

class Sum {
    public static void main(String args[]) {
        
        System.out.println("The sum value of two numbers \n");

        Scanner input= new Scanner(System.in);

        int x,y,z;

        System.out.print("Input Your 1st Number : ");
        x=input.nextInt();

        System.out.print("Input Your 2nd Number : ");
        y=input.nextInt();

        z=x+y;
        System.out.print("The value is when you sum the two numbers you entered : " +z);
    }
}