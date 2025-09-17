import java.util.Scanner;
public class No_9_SpecialOperators {

    // \
    // \n newline
    // \\ \
    // \t tab
    // \"
    // \'

    /*
    common Math methods
    .abs(a)
    .max(a,b)
    .min(a,b)
    .pow(a,b) a^b
    .sqrt(a)
    .cbrt(a)
    .round(a)
    .floor(a) 向下取整
    .ceil(a) 向上取整
    .random() 返回 [0.0, 1.0) 的随机数
    .PI pi
     */

    public static double squareUser(){
        Scanner user = new Scanner (System.in);
        System.out.println("Please enter a number: ");
        String input = user.nextLine();
        int convertInput = Integer.parseInt(input);
        double result = Math.pow(convertInput,2);
        return result;
    }
    public static void main(String[] args) {
        double result = squareUser();
        System.out.println(result);

//        System.out.println(Math.pow(2,2));
//        System.out.println(Math.cbrt(8));
//        System.out.printf("%10.10f",Math.PI);


        /*
        Create a Java program that includes two methods: the main() method and a
        squareUser() method. The main() method is the starting point of your
        program. The squareUser() method should be declared as public static int
        squareUser(). Its role is to prompt the user to input a number. You will need
        to use the Scanner class and its .nextLine() method to read the user's input as
        a string. Once you have the input, convert this string to an integer. Then,
        calculate the square of this number using the appropriate method from the
        Math class. Finally, squareUser() should return the squared value.
        In your main() method, call squareUser() and print the value it returns to the
        console. This program, when run, will allow the user to input a number and
        then display the square of that number
         */


    }
}
