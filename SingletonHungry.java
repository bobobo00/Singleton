package Thread;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Auther danni
 * @Date 2019/11/9 11:44]
 * @Version 1.0
 **/
/* *
    * @Author danni
    * @Description 饿汉模式-无线程安全问题
    * @Date 11:50 2019/11/9
    * @Param
    * @return
 **/
public class SingletonHungry {
    private static final SingletonHungry sing=new SingletonHungry();
    private SingletonHungry() {
    }
    public static SingletonHungry getInstanceof(){
        return sing;
    }
}
/* *
    * @Author danni
    * @Description 懒汉模式-存在线程安全问题-内存可见性
    * @Date 11:51 2019/11/9
    * @Param
    * @return
 **/
class SingletonLazy {
    private static  SingletonLazy sing=null;
    private SingletonLazy() {
    }
    public static SingletonLazy getInstanceof(){
        if(sing==null){
            sing=new SingletonLazy();
        }
        return sing;
    }
}

