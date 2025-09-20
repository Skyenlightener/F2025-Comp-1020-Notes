public class No_2_Object2 {
    /*
    学习目标 (Learning Goals, Week 2)
    编写简单到中等复杂度的类
    使用构造函数、实例变量、实例方法、this 关键字
    理解类变量和类方法
    使用用户自定义类的实例
    在同一目录下编译并运行多文件 Java 程序
    在类与主方法中使用用户自定义类
    解释封装的作用和意义
    理解如何通过访问器 (accessors) / 修改器 (mutators) 实现封装
    理解对象引用的概念并正确使用
    理解深拷贝 (deep copy) 与浅拷贝 (shallow copy)
     */

    /*
    访问修饰符 (Access Modifiers)
    public: 任意代码都能访问
    private: 仅在同一个类中可访问
    protected / package-private: 暂时不重点关注

    经验法则：
    实例变量 → private（保护数据）
    实例方法 → public（通常让其他类调用）
     */

    /*
    封装 (Encapsulation)
    目标：保护内部数据，避免外部误用
    方法：把变量设为 private，通过 getter / setter 访问和修改

    好处：
    修改更灵活（只需要改 getter/setter，不用全局改变量名）
    提高可维护性、可靠性
     */

    /*
    可变性 (Mutability)
    可变对象 (mutable)：内容可以在创建后修改（如数组，有 setter 方法的类）
    不可变对象 (immutable)：内容不可修改（没有 setter，变量 private）

    优点：内容始终可预测，更安全
    Java 的 String 是典型不可变对象，每次修改都会创建新对象
     */

    /*
    类变量和类方法 (Class Variables / Methods)
    属于整个类，而不是某个对象
    使用 static 关键字

    例子：
    private static int population → 所有对象共享
    public static int census() → 类方法，直接用类名调用
    还可以有 类常量 (static final)

    调用方法的方式
    实例方法：object.method()
    类方法：ClassName.method()
    同类内部调用：method()（会自动识别是实例方法还是静态方法）
     */

    /*
    对象比较 (Comparing Objects)

    ==：比较的是引用地址，不是对象内容
    .equals()：比较对象内部数据是否相等
    .compareTo()：比较对象大小，返回负数/零/正数
     */














}
