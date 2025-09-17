import java.util.Scanner;

public class No_8_Loops {

    // for while do while
    // break and continue. break quits the loop at once while continues jumps to the beginning of the loop at once.
    // In this course, we do not use break or continue

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        int i = 0;
//        while(i<5){
//            System.out.print(i+" ");
//            i++;
//        }
//        System.out.println();
//        int j = 0;
//        do{
//            System.out.print(j + " ");
//            j++;
//        }while (j<5);
//        System.out.println();

        /*
        Task: Write a Java program using a for loop to print the first 10 multiples of a given
        number. For example, if the number is 3, your program should print 3, 6, 9, ..., 30.

        Task: Write a Java program using a while loop that reads integers from the user until
        they enter 0. After the user enters 0, print the sum of all entered numbers. Assume the
        user enters valid integers only.

        Task: Write a Java program using a do-while loop that repeatedly asks the user to enter
        a number. The program should add 1 to the number and print the result. The program
        should stop when the user enters a number greater than 100.

         */

//        int number = 5;
//        for (int k = number; k < number * 12; k+=number) {
//            System.out.printf("%-3d",k);
//        }

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Please enter a integer: ");
//        int inputNumber = userInput.nextInt();
//        int sum = inputNumber;
//        while(inputNumber != 0){
//            System.out.println("Please continue: ");
//            inputNumber = userInput.nextInt();
//            sum += inputNumber;
//        }
//        System.out.println(sum);


        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = userInput1.nextInt();
        do{
            System.out.println(++number);
            System.out.println("Please continue: ");
            number = userInput1.nextInt();
        }while (number < 100);
    }
}
