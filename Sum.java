// Java Key Board Input

import java.util.*;

class Sum {
    public static void main(String args[]) {

        System.out.println("You can get the sum of two numbers here \n" );

        Scanner input=new Scanner(System.in);

        int x,y,z;

        System.out.print("Input Your 1st Number : ");
        x=input.nextInt();

        System.out.print("Input Your 2nd Number : ");
        y=input.nextInt();

        z=x+y;
        System.out.println("The sum of the two numbers you entered is : " +z);
    }
}