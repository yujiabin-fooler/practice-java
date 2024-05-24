package net.jiabin.design.pattern.practice.prototype.code2;

public class PrototypeTestClient {



    public static void main(String[] args) {

        // 已登录用户
        LoginImpl loginImpl = new LoginImpl();
        loginImpl.login();
        User tempUser = LoginSession.getLoginSession().getLoginedUser();

        User user = LoginSession.getLoginSession().getLoginedUser();// 获得已登录的User对象
        user.address = new Address("新深圳市","新宝安区","新一路");
        // 只能通过私有方法setLoginedUser更新用户信息
        LoginSession.getLoginSession().setLoginedUser(user);

        System.out.println("tempUser：" + tempUser);
        System.out.println("已登录用户：" + LoginSession.getLoginSession().getLoginedUser());
    }



}
