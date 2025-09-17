public class No_3_variableScope_constants {

    //Global Variables must be declared outside of any method
    //Declaring a variable with the same name as a global one will shadow it
    //Keyword final makes a variable become constant
    static int id = 1000;
    final static int ID = 20000;


    public static void main(String[] args) {
        id = 2000;
        // ID = 1;
        System.out.println(id);
    }

    //How do you make a final static variable?
    //Can you shadow a final static variable?
    //Can all data types be final?
    //Can all data types be global/static?
    //When are some situations where a final variable makes sense?
    //When are some situations where a static variable makes sense?
    //What are some situations where a final static variable makes sense?

    //1. public static final int maxValue = 0;
    //2. u cant
    //3. yes. final is just a modifier
    //4. static is for primitive data types but cannot make local variable to global
    //适合用 static 的场景：
        //类级别共享数据：所有对象共享同一份值（如计数器）
        //工具方法：Math.sqrt() 这种不依赖对象状态的方法。
        //缓存：比如数据库连接池、配置数据，类加载时就初始化好。
}
