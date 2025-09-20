public class No_1_Object_1 {

    /*
    学习目标 (Learning Goals, Week 2)
    编写简单到中等复杂度的类
    使用构造函数、实例变量、实例方法、this 关键字
    理解类变量、类方法
    使用用户自定义类的实例
    在同一目录下编译并运行多文件 Java 程序
    在类与主方法中使用用户自定义类
    解释封装的作用及好处
    理解如何通过访问器 (accessor) 和修改器 (mutator) 实现封装
    理解对象引用的概念，并正确使用
    理解深拷贝 (deep copy) 与浅拷贝 (shallow copy) 的区别
     */

    /*
    类 (Class)
    类就是一种新的 数据类型

    由以下部分组成：

    名称：类名，需使用大写开头（CapitalCase）
    实例变量 (instance variables)：保存数据
    实例方法 (instance methods)：定义类能执行的操作

    类常用来表示现实中的对象，比基础数据类型更复杂
    示例：
    int myAge; int yourAge; → 只是数字
    Tree oak; Tree elm; → 可以存储整棵树对象

    类是蓝图/模板，本身不会创建内存实例
    只有 new 之后才会真正生成对象
    实例变量：每个对象都有自己独立的值
    类文件名与类名相同（如 Person.java → Person.class）
     */


    /*
    对象与引用
    声明对象变量时，仅仅是 引用，值为 null
    引用类似图书馆的 索书号，指向对象内存地址
    new 会在堆 (Heap) 中分配内存，返回一个引用
     */


    /*
    实例方法 (Instance Methods)
    只能在对象实例上使用的方法
    可以访问并操作该对象的实例变量

    与普通方法不同：
    不需要 static
    一般加 public
     */


    /*
    this 关键字
    用于表示“当前对象”
    当局部变量与实例变量同名时，this 用来区分

    示例：
    this.age = age; 表示把参数赋值给实例变量
     */

    /*
    toString() 方法
    控制对象如何以字符串形式显示
    当对象传入 System.out.println() 时，Java 会自动调用 toString()
    如果未定义，默认显示“类名@内存地址”（没什么用）
    建议总是重写 toString() 来输出更直观的信息
     */

    /*
    构造函数 (Constructor)
    一种特殊方法，用于在 new 对象时初始化实例变量

    特点：
    与类同名
    没有返回值（连 void 也没有）
    自动调用
    可以定义多个构造函数（重载，参数不同）
    如果没有定义构造函数，Java 会自动提供一个默认构造函数
    一旦手动定义了构造函数，默认的就消失了
     */
    public static void main(String[] args) {

    }


}
