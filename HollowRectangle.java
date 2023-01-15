//Ar_Lazy_Dev

//Java beginner's course - Bro Code (Youtube)

//loop practice - Hollow Rectangle generator

import java.util.Scanner;

public class HollowRectangle{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nLet's create a hollow rectangle!\n");
        System.out.print("Enter the length of your rectangle:");
        int length = scanner.nextInt(); //input coloumns
        System.out.print("\nEnter the height of your rectangle:");
        int height = scanner.nextInt(); //input rows
        System.out.print("\nEnter the symbol for your rectangle:");
        String symbol = scanner.next(); //input symbol of choice
        scanner.close();
        System.out.println();

        for(int i = 1; i<=height ; i++){ //outer loop manages to change the line ore moving the cursor
            for(int j = 1; j<=length ; j++){ //inner loop prints
                if(i==1 || i==height){ //in first and last row all columns are filled
                    System.out.print(symbol+" ");
                }
                else{              //in other rows only first and last columns fill others fill space
                    if(j==1 || j==length){  
                        System.out.print(symbol+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nHere's your Hollow rectangle :)");
    }
}