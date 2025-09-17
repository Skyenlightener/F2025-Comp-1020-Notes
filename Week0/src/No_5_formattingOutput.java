public class No_5_formattingOutput {

    //Using printf
    //Put everything want to print within the ""

    /*
    %d -> decimal
    %f -> float / double
    %c -> char
    %s -> String
    %n -> newline
     */

    // %6f -> use at least 6 characters
    // %.2f -> keep 2 decimal places
    // %6.2f -> total 6 character + only keep 2 decimals; it will round the number
    // %-f -> left alignment
    // %06f -> fill 0 to the length on the left
    // %+6f -> add plus sign to the front of a positive number
    // %,6f -> 千位分隔

    public static void main(String[] args) {
        double d = 3.145;
        System.out.printf("%010.2f",d);
        System.out.println();

        /*
        Pause & Practice
    1. Decimal Integer Formatting
    - Write a Java program that uses `printf` to print an integer `123` using the `%d` format specifier. Then, print the same integer
    using `%6d` format specifier to ensure it occupies at least 6 characters.

    2. Floating-Point Value Formatting
    - Create a Java program to print a floating-point number `123.4567` using three different format specifiers: `%f`, `%6f`, and
    `%6.2f`. The first should print the number as it is, the second should ensure the printed value is at least 6 characters long, and
    the third should format the number to occupy at least 6 characters with exactly 2 digits after the decimal point.

    3. String Formatting
    - Use `printf` in a Java program to print the string `"Hello World"` using the `%s` format specifier. Experiment with different
    string lengths and observe how the output changes.

    4. Combining Different Types
    - Write a Java program that combines different format specifiers in a single `printf` statement. Print an integer, a floating-point
    number, and a string on the same line using `%d`, `%6.2f`, and `%s` respectively, followed by a newline using `%n`. For example,
    print `42`, `3.14159`, and `"Java"` in this format
         */

        System.out.printf("%d%n%6d%n",123,123);
        System.out.printf("%f%n%6f%n%6.2f%n",123.4567,123.4567,123.4567);
        System.out.printf("%s%n","s");
        System.out.printf("%d%n%f%n%s%n",42,3.14159,"Java");
    }
}
