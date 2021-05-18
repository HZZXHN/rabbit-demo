package test;

/**
 * 枚举: 对象的个数是可数且是固定的类型就可以声明枚举类型
 */
enum maoMi{

    XUNXUN(2), // 调用了有参构造
    PAOPAO(3),
    GUAIGUAI;  // 调用了无参构造

    private int age;

    private maoMi(int age){
        this.age = age;
    }

    private maoMi(){
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

    @Override
    public String toString(){
        return super.toString() + "猫咪的年龄" + age;
    }



}



public class EnumTest {

    public void maoMao(maoMi maoMi){

        //switch()中必须是变量,且数据类型只能是非long整数,字符串,枚举
        switch (maoMi){
            // case 后面必须跟常量,产量就是字面量和被final修饰的量
            case XUNXUN:
                System.out.println("是小破寻");
                break;
            case PAOPAO:
                System.out.println("是肥泡");
                break;
            case GUAIGUAI:
                System.out.println("是小乖乖");
                break;
        }
    }

    public static void main(String[] args) {

        maoMi xunxun = maoMi.XUNXUN;

        // 静态环境不能直接访问非静态成员 maoMao(xunxun);
        // 用当前类对象去访问调用
        new EnumTest().maoMao(xunxun);


    }

}



