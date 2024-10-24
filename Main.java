import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* Q1. Write a Java program to print the sum (addition), multiply, subtract,
         divide and remainder of two numbers , takes two numbers as input.  */

        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Create a Scanner object to take the user input (it will be used for all questions)
        Scanner user_input = new Scanner(System.in);

        // 2. Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int firstNum = user_input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNum = user_input.nextInt();

        // 3. Apply the operations on the two numbers and print the result
        // (+)
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        // (-)
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        // (*)
        System.out.println(firstNum + " x " + secondNum + " = " + (firstNum * secondNum));
        // (/)
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
        // (%)
        System.out.println(firstNum + " mod " + secondNum + " = " + (firstNum % secondNum));

        //----------------------------------------------------------------------
        /* Q2. Write a Java program that takes a number as input and prints its
         multiplication table up to 10. */

        // Header
        System.out.println("-------------------Q2-------------------");

        // 2. Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = user_input.nextInt();

        // 3. Loop from 1-10 to multiply and print the result
        for(int i = 1 ; i <= 10;i++){
            System.out.println(i + " x " + num + " = " + (i * num));
        }
        //----------------------------------------------------------------------
        // Q3. Write a Java program to print the area and perimeter of a circle.

        // Header
        System.out.println("-------------------Q3-------------------");

        // 2. Prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        double radius = user_input.nextDouble();

        // 3. Calculate the perimeter and area of a circle
        double cirPerimeter = 2 * Math.PI * radius;
        double cirArea = Math.PI * (radius * radius);

        // 4. Print the result
        System.out.println("The Perimeter = " + cirPerimeter);
        System.out.println("The Area = " + cirArea);

        //----------------------------------------------------------------------
        // Q4. Write a Java program to find out the average of a set of integers.

        // Header
        System.out.println("-------------------Q4-------------------");

        // 2. Prompt the user to enter a count of numbers
        System.out.print("Enter the count of numbers: ");
        int count = user_input.nextInt();

        // To store the total of the integers
        double sum = 0.0;

        // 3. Loop count numbers
        for( int i = 0 ; i < count ; i++){
            // 4. Prompt the user to enter an integer
            System.out.print("Enter an integer: ");
            double userNum = user_input.nextDouble();
            sum = sum + userNum;
        }

        // 5. Calculate the average and print the result
        double average = sum / count;
        System.out.println("The average is: " + average);

        //----------------------------------------------------------------------
        /* Q5. Write a Java program that accepts three integers as input, adds the first
         two integers together, and then determines whether the sum is equal to the third integer. */

        // Header
        System.out.println("-------------------Q5-------------------");

        // 2. Prompt the user to enter three integers
        System.out.print("Enter the first number: ");
        int firNum = user_input.nextInt();

        System.out.print("Enter the second number: ");
        int secNum = user_input.nextInt();

        System.out.print("Enter the third number: ");
        int thiNum = user_input.nextInt();

        user_input.nextLine();

        // 3. Boolean var to determine whether the sum is equal to the third integer.
        boolean isEqual = true;

        // 4. Check for the condition and print the result
        if( firNum + secNum == thiNum) System.out.println("The result is: " + isEqual);
        else System.out.println("The result is: " + !isEqual);

        //----------------------------------------------------------------------
        // Q6. Write a Java program to reverse a word.

        // Header
        System.out.println("-------------------Q6-------------------");

        // 2. Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String actualWord = user_input.nextLine();

        // 3. An empty string to store the reversed word
        String reversedWord = "";

        // 4. Reverse the promoted word
        for(int i = 0 ; i < actualWord.length() ; i++){
            char letter = actualWord.charAt(i);//Returns the char at that index
            reversedWord = letter + reversedWord;//Store the char in the reversedWord var
        }

        // 5. Print the reversed word
        System.out.println("Reversed word: " + reversedWord);

        //----------------------------------------------------------------------
        // Q7. Write a Java program to check whether the given number is even or odd.

        // Header
        System.out.println("-------------------Q7-------------------");

        // 2. Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int enteredNum = user_input.nextInt();

        // 3.
        if(enteredNum % 2 == 0) System.out.println("The number is Even");
        else System.out.println("The number is Odd");

        //----------------------------------------------------------------------
        // Q8. Write a Java program to convert the temperature in Centigrade to Fahrenheit.

        // Header
        System.out.println("-------------------Q8-------------------");

        // 2. Prompt the user to enter a temperature in Centigrade
        System.out.print("Enter temperature in Centigrade: ");
        double centigradeTemp = user_input.nextDouble();

        user_input.nextLine();

        // 3. Convert the temperature in Centigrade to Fahrenheit
        double fahrenheitTemp = centigradeTemp * 9/5 + 32;

        // 4. Print the result
        System.out.println("Temperature in Fahrenheit is: " + fahrenheitTemp);

        //----------------------------------------------------------------------
        /* Q9. Write a Java program that takes a string and a number from the user,
        then prints the character in the given index. */

        // Header
        System.out.println("-------------------Q9-------------------");

        // 2. Prompt the user to enter a string and a number
        System.out.print("Enter a string: ");
        String text = user_input.nextLine();

        System.out.print("Enter a number: ");
        int index = user_input.nextInt();

        // 3. Find the character in the given index and print the result
        System.out.println("The character in the given index is: " + text.charAt(index));

        //----------------------------------------------------------------------
        // Q10. Write a Java program to print the area and perimeter of a rectangle.

        // Header
        System.out.println("-------------------Q10-------------------");

        // 2. Prompt the user to enter the width and height of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = user_input.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = user_input.nextDouble();

        // 3. Calculate the area and perimeter of the rectangle
        double recArea = width * height;
        double recPerimeter = 2 * (width + height);

        // 4. Print the result
        System.out.println("The Area is " + width + " * " + height + " = " + recArea);
        System.out.println("The Perimeter is 2 * (" + width + " + " + height + ") = " +  recPerimeter);

        //----------------------------------------------------------------------
        // Q11. Write a Java program to compare two numbers.

        // Header
        System.out.println("-------------------Q11-------------------");

        // 2. Prompt the user to enter two numbers
        System.out.print("Enter the first integer: ");
        int firInt = user_input.nextInt();

        System.out.print("Enter the second integer: ");
        int secInt = user_input.nextInt();

        // 3. Compare the two numbers and print the result
        if(firInt < secInt) {
            System.out.println(firInt + " != " + secInt);
            System.out.println(firInt + " < " + secInt);
            System.out.println(firInt + " <= " + secInt);

        } else {
            System.out.println(secInt + " != " + firInt);
            System.out.println(secInt + " < " + firInt);
            System.out.println(secInt + " <= " + firInt);
        }

        //----------------------------------------------------------------------
        // Q12. Write a Java program to convert seconds to hours, minutes and seconds.

        // Header
        System.out.println("-------------------Q12-------------------");

        // 2. Prompt the user to enter the seconds
        System.out.print("Enter the seconds: ");
        int userSeconds = user_input.nextInt();

        // 3. convert seconds to hours, minutes and seconds.
        int hours = userSeconds / 3600;
        int minutes = (userSeconds % 3600) / 60;
        int seconds = userSeconds % 60;

        // 4. Print the result as (hh:mm:ss)
        System.out.println(hours + ":" + minutes + ":" + seconds);

        //----------------------------------------------------------------------
        /* Q13. Write a Java program that accepts four integers from the user
        and prints equal if all four are equal, and not equal otherwise. */

        // Header
        System.out.println("-------------------Q13-------------------");

        // 2. Prompt the user to enter four integers
        System.out.print("Enter the first number: ");
        int firstNumber = user_input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = user_input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = user_input.nextInt();

        System.out.print("Enter the fourth number: ");
        int fourthNumber = user_input.nextInt();

        // 3. Check if the four integers are equal
        if (firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }


        //----------------------------------------------------------------------
        /* Q14. Write a Java program that reads an integer and check whether
        it is negative, zero, or positive. */

        // Header
        System.out.println("-------------------Q14-------------------");

        // 2. Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        int checkNum = user_input.nextInt();

        // 3. Check whether the integer is negative, zero, or positive. Then print a message
        if (checkNum == 0 ) System.out.println("The number is zero");
        else if (checkNum > 0) System.out.println("Th number is positive");
        else System.out.println("The number is negative");

        //----------------------------------------------------------------------
        /* Q15. Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 , Don’t count -1). */

        // Header
        System.out.println("-------------------Q15-------------------");

        // Var to take the user input
        int userNum = 0 ;

        // Vars to count the number of positive, negative and zeros entered
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0 ;

        do{
            // 2. Prompt the user to enter a number
            System.out.print("Enter a number: ");
            userNum = user_input.nextInt();

            // 3. Check for the three cases
            if(userNum == 0) zeroNum = zeroNum + 1;
            else if (userNum > 0 ) positiveNum = positiveNum + 1;
            else if( userNum < -1) negativeNum = negativeNum + 1;
        }while (userNum != -1);

        // 4. Print the result
        System.out.println(positiveNum + " positives" + "\n"
                + zeroNum + " zeros" + "\n"
                + negativeNum + " negatives");

        //----------------------------------------------------------------------
        /* Q16. Write a program that prompts the user to input an integer and then
        outputs the number with the digits reversed. */

        // Header
        System.out.println("-------------------Q16-------------------");

        // Var to take the user input
        int userNumber;

        // Var to store the reversed integer
        String reversedNum = "";

        // 2. Prompt the user to enter a number
        System.out.print("Enter a number: ");
        userNumber = user_input.nextInt();

        // 3. Convert the integer to a string
        String numberToString = Integer.toString(userNumber);

        // 4. Loop until the number becomes 0
        for( int i = numberToString.length() - 1 ;  i >= 0 ; i--){
            reversedNum = reversedNum + numberToString.charAt(i);
        }

        // 5. Print the result
        System.out.println("The reversed number is: " + reversedNum);

        //----------------------------------------------------------------------
        /* Q17. Write a program to enter the numbers till the user wants and at the end
        the program should display the largest and smallest numbers entered. */

        // Header
        System.out.println("-------------------Q17-------------------");

        // Var to take the user input
        int usrNum = 0;

        // Vars to store the largest and smallest numbers
        int largestNum = 0;
        int smallestNum = 0;

        do{
            // 2. Prompt the user to enter a number
            System.out.print("Enter any number or 0 to exit: ");
            usrNum = user_input.nextInt();

            user_input.nextLine();

            // 3. Find the largest and smallest numbers
            if (usrNum != 0){
                if (usrNum > largestNum) largestNum = usrNum;
                else if (usrNum < smallestNum) smallestNum = usrNum;
            }
        }while (usrNum != 0);

        // 4.Print the result
        System.out.println("The largest number is: " + largestNum
                + "\nThe smallest number is: " + smallestNum);

        //----------------------------------------------------------------------
        /* Q18. Determine and print the number of times the character
        ‘a’ appears in the input entered by the user. */

        // Header
        System.out.println("-------------------Q18-------------------");

        // A counter var
        int aCounter = 0;

        // 2. Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String usrText = user_input.nextLine();

        // 3. Loop through the string and check how many times the letter 'a' appears in the input
        for(int i = 0 ; i < usrText.length() ; i++) {
            if (usrText.charAt(i) == 'a') aCounter = aCounter + 1;
        }

        // 4. Print the result
        System.out.println("Number of a's: " + aCounter);

        //----------------------------------------------------------------------
        // Close the scanner
        user_input.close();
    }
}