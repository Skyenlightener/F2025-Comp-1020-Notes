public class No_4_methods {
    // Methods are always placed within a class
    // main method with args array as the parameter
    // String parameter which prints out the value to console
    // If u see round brackets you are either defining a method or calling it!


    public static void main(String[] args) {
        String hat = "hat";
        printMessage(hat);
        char c = '+';
        System.out.println(c);

        basicOperater(5, 10,'+');
        basicOperater(1,2,'/');


    }

    // No return value
    public static void printMessage(String msg){
        System.out.println("In printMessage");
        System.out.println(msg);
    }

    //Pause and Practice (see BasicCalculator.java for solution)
    //Create a basic calculator that can perform the four fundamental arithmetic
    //operations: addition, subtraction, multiplication, and division. Focus solely on writing
    //methods with appropriate return types.
    //You can have two int variables in main with the values 8 and 17 (which you could
    //change and re-run your program as you see fit).

    public static void basicOperater(int firstNumber, int secondNumber, char operator){
        int result = 0;
        if (operator == '+'){
            result = firstNumber + secondNumber;
            System.out.printf("%d %c %d = %d", firstNumber,operator,secondNumber,result);
            System.out.println();
        } else if (operator == '-'){
            result = firstNumber - secondNumber;
            System.out.printf("%d %c %d = %d", firstNumber,operator,secondNumber,result);
            System.out.println();
        } else if (operator == '/'){
            result = firstNumber / secondNumber;
            double resultDivision = (double)result;
            System.out.printf("%d %c %d = %f", firstNumber,operator,secondNumber,resultDivision);
            System.out.println();
        } else if (operator == '*'){
            result = firstNumber * secondNumber;
            System.out.printf("%d %c %d = %d", firstNumber,operator,secondNumber,result);
            System.out.println();
        }
    }
}
