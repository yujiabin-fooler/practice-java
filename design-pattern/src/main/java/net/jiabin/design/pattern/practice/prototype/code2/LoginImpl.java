package net.jiabin.design.pattern.practice.prototype.code2;

/**
 * @author Guan
 * 登录实现类
 */
public class LoginImpl implements Login{

    public void login() {
        // 登录到服务器，获取到用户信息
        User loginedUser = new User();

        // 将服务器返回的完整信息设置给loginedUser对象
        loginedUser.age = 22;
        loginedUser.name = "xiaoguan";
        loginedUser.address = new Address("深圳市","宝安区","一路");

        // 登录完后将用户信息设置到Session中LoginSession.getLoginSession()中
        LoginSession.getLoginSession().setLoginedUser(loginedUser);
    }
}

