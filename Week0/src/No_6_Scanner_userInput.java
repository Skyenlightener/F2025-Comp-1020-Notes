import java.util.Scanner; //导包

public class No_6_Scanner_userInput {
    // Scanner is a class within the package of java.util
    // It takes "keyboard input", "txt files" and "Strings" and other resources to take its input
    // It splits input according to space, tab, and other symbols

    /*

    当用户调用下面的方法时,程序会在console里面停住,并且根据方法的不同将输入解析成不同的数据类型并储存在对应创建的变量中
    common methods:
    1. sc.nextInt()
    2. sc.nextLong()
    3. sc.nextDouble()
    4. sc.next() 读取到第一个空格位置, 获取空格前的内容
    5. sc.nextLine() 读取一整行, 知道回车位置
    6. sc.hasNext() 返回布尔值
     */

    /*
    . 输入中的常见坑

        ⚠️ nextInt() 和 nextLine() 混用时会出问题：
        nextInt() 只读数字，不会读掉回车符。
        之后调用 nextLine() 时，会直接读到刚才遗留的回车，导致跳过。
        解决方法：在 nextInt() 后面加一个 sc.nextLine() 把回车读掉：

     */

    /*
    Type Conversion

    String to Primitive Data Types:
    Integer.parseInt(String)

    Primitive Data Types to String:
    Integer.toString(int);

     */

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in); // round bracket means method as mentioned previously
//        // 这里我们从Scanner类中新建了一个对象,起名为sc, Scanner()这里是调用了构造方法,创建了一个Scanner实例 (instance)
//        // System.in是构造器的参数, 这里表示以键盘输入作为参数
//        System.out.println("Enter your name:");
//        String name = sc.nextLine();
//
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//
//        System.out.printf("Your name is %s, and your age is %d.%n",name,age);
//
//        //Ask the user to type in a number between 0 - 99. Store the input into an int value variable and
//        //then print the value
//
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Please enter a number between 0-99:");
//        String inputNumber = sc1.nextLine();
//        int convertNumber = Integer.parseInt(inputNumber);
//        System.out.println("The number entered is "+ convertNumber);
//        System.out.println();
//
//
//        /*
//        Ask the user to type a decimal number between 0 - 1. Store it in a double value variable and then
//        print the value entered. Following this, multiply the stored value by 10. Finally, convert this new
//        value to an integer and print it out. This process involves capturing user input and performing
//        basic type conversion in Java
//         */
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Please enter a decimal number between 0-1:");
//        double decimalEntered = sc2.nextDouble();
//        System.out.println("The decimal number entered is "+ decimalEntered);
//        double result = decimalEntered * 10;
//        int convertResult = (int)result;
//        System.out.printf("The converted result of entered decimal multiplying by 10 equals: %d%n", convertResult);


        /*
        Ask the user to type in a number between 0 - 99. Store the input into a String input variable.
        Convert the input variable value to an integer and store it in an int convertInput variable. Print
        this variable.
         */

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please enter a floating-point number between 0-99:");
        float input = sc3.nextFloat();
        String convertInput = Float.toString(input);
        System.out.printf("The input after converting to String is %s", convertInput);

    }
}
