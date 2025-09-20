public class No_1_Object {
    /*
    学习目标 (Week 3)

    对象引用 (References to Objects)
    clone() 方法（对象复制）
    对象数组 (Arrays of Objects)
    对象作为方法参数 (Objects as Method Parameters)
    对象中包含对象：安全创建 (Objects in Objects: Safe Creation)
    理解分隔与封装特性 (Compartmentalization & Encapsulation)
    对象中包含对象：安全方法调用 (Objects in Objects: Safe Method Use)
    理解 Java 垃圾回收 (Garbage Collection)
     */

    /*
    对象引用 (References to Objects)

    除了基本类型 (double, float, long, int, short, byte, char, boolean)，其余都是对象。

    包括：
    String
    所有数组
    用户自定义类
    Java 内建类（如 Scanner, ArrayList）
    变量存储的是 对象的引用 (reference)，而不是对象本身。
     */

    /*
    克隆对象 (clone)

    浅拷贝 (shallow copy / aliasing)：只是复制引用，两个变量指向同一个对象。
    深拷贝 (deep copy / clone)：创建一个全新的对象，内容相同，但独立存在。

    实现方式：
    定义 clone() 方法，返回新的对象。
    或者用 复制构造函数 (copy constructor)。
    注意：String 是不可变的，所以不用担心被改动。
     */

    /*
    对象数组 (Arrays of Objects)

    一个对象数组其实是 对多个对象的引用数组。
    浅拷贝数组：只是复制了引用（两个数组共享相同对象）。
    深拷贝数组：需要逐个克隆里面的对象。

    典型方法：
    System.arraycopy()（复制引用）
    for 循环中逐一调用 clone()（完全深拷贝）
     */

    /*
    对象作为方法参数 (Objects as Parameters)

    与数组一样：传递的是引用。
    在方法中修改对象内容，会影响原始对象（因为它们指向同一个堆内存）。

    例：
    void someMethod(Person p) {
        p.setName("NewName");
    }    → 调用后原对象的 name 会被修改。
     */

    /*
    封装与分隔 (Compartmentalization & Encapsulation)

    通过 private 变量 + public 方法 控制数据访问。
    确保对象对外提供接口，而内部实现可随时修改，不影响外部使用。
    提高代码安全性和可维护性。

    Java 垃圾回收 (Garbage Collection)

    堆内存 (Heap)：存放对象。
    当对象不再有任何引用时，会被垃圾回收机制回收。
    程序员不需要手动释放内存，Java 自动处理。
     */

    public static void main(String[] args) {

    }
}
