public class No_2_primitiveOperators {
    // + - * / % ++ --
    // concat "" +
    // ASCII Code A-Z = 65-90; a-z = 97-122; 0-9 = 48-57

    public static void main(String[] args) {
        System.out.println("hello"+1); // hello1
        System.out.println("hello"+"x"); // hellox
        System.out.println(1.0+5); // 6.0 when int and double operating together, int will be cast into double
        System.out.println(1.0+'B'); // 67.0  B in ASCII code is 66
        System.out.println('B'+1); // 67

    }
}
