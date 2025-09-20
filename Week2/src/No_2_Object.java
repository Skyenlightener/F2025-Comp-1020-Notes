public class No_2_Object {

    /*
    垃圾回收 (Garbage Collection)

    Java 自动释放不再使用的对象内存（垃圾回收）。
    当一个对象没有任何引用指向它时，它变成 “孤儿对象 (orphan)”，会被垃圾回收机制清理。
    示例：

    Person x = new Person("Nich", 11);
    x = new Person("Claws", 29);
    // 原来的 "Nich" 对象没有引用，成为 orphan

    好处：避免内存泄漏，不需要程序员手动释放。
     */

    /*
    对象中包含对象 (Objects in Objects)

    对象的实例变量可以是其他对象类型（如 Person 内部包含 Person spouse）。
    可以通过构造函数建立对象间的关系（如配偶）。

    方法示例：

    marries(Person other) → 建立双向关系
    divorces() → 解除关系（注意顺序，避免空指针异常）

    可以增加辅助方法：

    isMarried()
    getSpouse()

     */


    /*
    对象作为参数 (Passing Objects)

    Java 总是值传递：传递的是“值的副本”。
    基本类型：传递的是 数值副本（不会影响原变量）。
    对象类型：传递的是 引用副本（指向同一对象），修改对象内容会影响原对象。

    例子：

    如果方法中 重新 new 一个对象并赋值给参数，不会影响原始引用。
    如果方法中 修改参数对象的内容，会影响原始对象。


    对象列表与封装 (Encapsulation with Lists)

    示例扩展：Person 对象包含一个 PersonList children。
    不要直接用数组，而是写一个专门的 PersonList 类：
    内部用“部分填充数组”存储 Person
    提供方法：addPerson、removePerson、toString

    好处：
    分离关注点 (SoC)：不同对象负责不同功能
    可复用 (Reusability)：PersonList 可用于学生列表、员工列表等

    封装 (Encapsulation)：隐藏内部实现，只暴露公共方法
     */
}
