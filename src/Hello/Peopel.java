package Hello;

/**
 * Created by zhongfan on 2017/7/5.
 */

public  class Peopel {
    //public方法
    //方法的作用:为了执行java代码
    public void test_11() {
        System.out.println("111");
    }

    /// 被final 注释的方法，不会被子类覆盖（不允许在继承此类的子类中，覆盖这个用final 修饰的方式）
    public final void test_22() {
        System.out.println("222");
    }


    //private方法  ----- private 方法隐式添加了final
    private void test_03() {
        System.out.println("03");
    }

    //  什么是构造器：一种特殊的方法
    //  构造器的作用：是为了创建所在类的实例
    //  和方法的区别：方法的作用是为了执行java代码：

    //
    public Peopel() {
        System.out.println("Person Constrctor...");
    }

    public Peopel(String sss) {
        System.out.println("Person Constrctor..." + sss);
    }
}
