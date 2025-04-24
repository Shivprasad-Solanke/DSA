import java.text.Format;
import java.util.Scanner;

class day_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        // int a = 10;
        // int b = 20;
        // int sum;
        // sum = a + b;
        // System.out.println( a + " + " + b + " = " + sum) ;
        // System.out.println("hello");  
        
        // Input
        // int x = sc.nextInt();
        // String completeString = sc.nextLine();
        // String singleString = sc.next();
        // System.out.println(x);
        // System.out.println(completeString);
        // System.out.println(singleString);



        // Conditional Statements
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a > b) {
        //     if(a > c){
        //         System.out.println(a+" is greatest than "+b+ " and "+c);
        //     }
        //     else {
        //         System.out.println(a+" is greater than "+b+ " but not "+c);
        //     }
        // }
        // else {
        //     if(b > c){
        //         System.out.println(b+" is greatest than "+a+ " and "+ c);
        //     }
        //     else {
        //         System.out.println(c + " is greatest than "+ a+ " and "+b);
        //     }
        // }
        


        // ASSIGNMENTS 
        // ================

        // 1. Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.

        // ANS
        // =======

        // System.out.println("Enter a no");
        // int A = sc.nextInt();
        // if ( A >= 1 )
        //     System.out.println(1);
        // else if ( A <= -1)
        //     System.out.println(-1);
        // else
        //     System.out.println(0);

        // 2. Write a program to input an integer from user and print 1 if it is odd otherwise print 0.

        // ANS 
        // =======

        //  System.out.println("Enter a no");
        // int A = sc.nextInt();
        // if ( A % 2 == 1 )
        //     System.out.println(1);
        // else
        //     System.out.println(0);

        // 3. Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:

            // For first 50 units Rs. 0.50/unit
            // For next 100 units Rs. 0.75/unit
            // For next 100 units Rs. 1.20/unit
            // For unit above 250 Rs. 1.50/unit
            // An additional surcharge of 20% is added to the bill.

            // NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill.

            // Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.



            // Problem Constraints
            // 1 <= A <= 500



            // Input Format
            // First line of the input contains a single integer A.



            // Output Format
            // Return an integer denoting the floor value of the Electricity bill.



            // Example Input
            // Input 1:

            // 150 
            // Input 2:

            // 4 


            // Example Output
            // Output 1:

            // 120 
            // Output 2:

            // 2    




            // ANSWER
            // ===============

            // System.out.println("Enter the total units : ");
            // int A = sc.nextInt();

            // int remainingUnits=0;
            // double beforeSurcharge=0;
            // double afterSurcharge=0;
            // int Total;

            

            // if (A <= 50){
            //     beforeSurcharge = A * 0.5;  
            // }
            // else if ( A >= 50){

            //     beforeSurcharge = 50 * 0.5;
            //     remainingUnits = A - 50;

            //     if(remainingUnits <= 100) {
            //         beforeSurcharge = beforeSurcharge + ( remainingUnits * 0.75 );
            //     }

            //     else if( remainingUnits > 100) {
            //         beforeSurcharge = beforeSurcharge + ( 100 * 0.75);
            //         remainingUnits -= 100;

            //         if( remainingUnits <= 100 ) {
            //             beforeSurcharge = beforeSurcharge + ( remainingUnits * 1.2 ) ;
            //         }
            //         else if( remainingUnits > 100) {
            //             beforeSurcharge = beforeSurcharge + ( 100 * 1.2 );
            //             remainingUnits -= 100;

            //                 beforeSurcharge = beforeSurcharge + ( remainingUnits * 1.5);
                        
            //         }
            //     }
            // }

            // afterSurcharge = beforeSurcharge  + ( beforeSurcharge * 20) / 100;
            // Total = (int) afterSurcharge;

            // System.out.println("total is == "+Total);

        // 4. Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.

            // </div>Problem Constraints

            // <div id=problem_constraints_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p> </p>

            // 1 <= A <= 1000000

            // 1 <= B <= 1000000

            // 1 <= C <= 1000000

            // </div>

            // Input Format

            // <div id=input_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p> </p>

            // First line is a single integer A.
            // Second line is a single integer B.
            // Third line is a single integer C.


            // </div>

            // Output Format

            // <div id=output_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p></p>

            // One line containing an integer as per the question.

            // </div>


            
            // ANSWER
            // ==============

            // int A = sc.nextInt();
            // int B = sc.nextInt();
            // int C = sc.nextInt();

            // if(A > B){
            //     if(A > C){
            //         System.out.println(A);
            //     }
            //     else{
            //         System.out.println(C);
            //     }
            // }
            // else{
            //     if(B > C) {
            //         System.out.println(B);
            //     }
            //     else{
            //         System.out.println(C);
            //     }
            // }


        // 5. Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C.

            // </div>Problem Constraints

            // <div id=problem_constraints_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p> </p>

            // 1 <= A <= 1000000

            // 1 <= B <= 1000000

            // 1 <= C <= 1000000

            // </div>

            // Input Format

            // <div id=input_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p> </p>

            // First line is a single integer A.
            // Second line is a single integer B.
            // Third line is a single integer C.


            // </div>

            // Output Format

            // <div id=output_format_markdown_content_value style=”background-color: #f9f9f9; padding: 5px 10px; “><p></p>

            // One line containing an integer as per the question.

            // </div>

            // ANSWER
            // ==========

            // int A = sc.nextInt();
            // int B = sc.nextInt();
            // int C = sc.nextInt();

            // if(A < B){
            //     if(A < C){
            //         System.out.println(A);
            //     }
            //     else{
            //         System.out.println(C);
            //     }
            // }
            // else{
            //     if(B < C) {
            //         System.out.println(B);
            //     }
            //     else{
            //         System.out.println(C);
            //     }
            // }


        // 6. Problem Description

            // You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.

            // NOTE: It is guaranteed that Cost Price and Selling Price are not equal.

            // NOTE: You have to take input of the Cost Price(C) and Selling Price(S) from the user.



            // Problem Constraints

            // 1 <= C, S <= 109

            // C ≠ S
            // Input Format

            // First line of the input contains a single integer C.
            // Second line of the input contains a single integer S.
            // Output Format

            // Print two integers in separate lines.
            // First integer denotes whether there is a profit or loss. If there is a profit, print 1, else print -1.

            // Second integer is a non-negative integer denoting the absolute value of total profit or loss.
            // Example Input

            // Input 1:
            // 2 4
            // Input 2:

            // 4 1
            // Example Output

            // Output 1:
            // 1 2
            // Output 2:

            // -1 3
            // Example Explanation

            // Explanation 1:
            // Cost Price = 2 Selling Price = 4 As Cost Price < Selling Price, there is a profit. Total Profit = Selling Price - Cost Price = 4 - 2 = 2
            // Explanation 2:

            // Cost Price = 4 Selling Price = 1 As Cost Price > Selling Price, there is a loss. Total Loss = Cost Price - Selling Price = 4 - 1 = 3 
            // Join the Party: https://twitter.com/unst4bl3_1


            // ANSWER
            // =======

            int C = sc.nextInt();
            int S = sc.nextInt();
            if(S > C){
                System.out.println(1);
                System.out.println(S - C);
            }
            else{
                System.out.println(-1);
                System.out.println(C - S);
            } 
                        

    }
}