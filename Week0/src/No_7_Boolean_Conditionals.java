public class No_7_Boolean_Conditionals {
    // && || 短路运算, 若第一个判定直接出结果,则不进行后面的判断,速度快
    // == equals, not for Strings


    /*
    Use the following to compare Strings
    .equals();
    .equalsIgnoreCase();
    .compareTo(); 基于Unicode逐个字符比较Unicode的大小

    == 比较的是地址
     */


    // if else else if
    public static void main(String[] args) {

        System.out.println("apple".compareTo("banana")); // < 0，因为 'a'(97) - 'b'(98) = -1
        System.out.println("hello".compareTo("hello"));  // 0，完全相同
        System.out.println("zoo".compareTo("apple"));    // > 0，因为 'z'(122) - 'a'(97) = 25
        System.out.println("car".compareTo("card"));     // < 0，因为前三个相同，长度差 3-4=-1

        /*
        Check if a number is positive: Write an if/else statement to print "Positive" if a variable
        num is greater than 0, otherwise print "Non-positive".

        Odd or Even: Write an if/else statement that prints "Odd" if a variable number is odd,
        otherwise prints "Even".

        Maximum of Two Numbers: Given two integer variables a and b, write an if/else
        statement to print the larger of the two.

        Check for Zero: Write an if/else statement to print "Zero" if a variable x is 0, otherwise
        print "Not Zero".
         */


    }
}
