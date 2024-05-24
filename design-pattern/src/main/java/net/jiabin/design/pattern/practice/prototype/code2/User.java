package net.jiabin.design.pattern.practice.prototype.code2;

/**
 * @author Guan
 * 用户实体类
 */
//public class User {
//    public int age;
//    public String name;
//    public String phoneNum;
//    public Address address;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                ", phoneNum='" + phoneNum + '\'' +
//                ", address=" + address +
//                '}';
//    }
//}


/**
 * @author Guan
 * 用户实体类
 * 所以需要使用原型模式来进行保护性拷贝，使得在任何地方调用getLoginedUser函数获取到的用户对象都是一个拷贝对象，
 * 即使客户端不小心修改了这个拷贝对象，也不会影响最初的已登录用户对象，确保了它的安全。修改代码如下：
 */
public class User implements Cloneable{

    public int age;
    public String name;
    public String phoneNum;
    public Address address;
    /**
     * 拷贝
     */
    public User clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }


}
