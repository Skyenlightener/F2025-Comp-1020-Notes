public class No_1_dataTypes {
    // String int float double byte short char boolean
    // int and double are the most common for integer and floating-point respectively
    // char is a single character in single quotes


    public static void main(String[] args) {
        char c = 'a';
        char c1 = ' ';
        long l = 5L; // long data must have a L at the end
        double d = 5.0d; // d is not necessary for a double
        double d1 = 5.0;
        float f = 5.0f; // f is necessary for a float
        boolean b = true;
        boolean b1;

        //Prac. 1:
        //make a program that has an age variable set to 17.5
        //What type of variable is this going to be?
        //print the variable out in a sentence that says “My age is 17.5”
        double age = 17.5;
        age = 17;
        System.out.println(age); // println does not support format output 17.0

        double age1 = 17.5;
        int intAgeVersion = (int)age1;
        System.out.println(intAgeVersion); // 17.5
        int age2 = 18;
        double doubleAgeVersion = age2;
        System.out.println(doubleAgeVersion);

        // No cast need when going from smaller to bigger
        // The order is double > float > long > int > short > byte


        //Prac. 2:
        //make a program which has two chars with values ‘a’ and ‘z’
        //Print out a sentence that says “The english alphabet goes from a - z”.
        //Answers on next slide (not shown in recording)


    }

}
