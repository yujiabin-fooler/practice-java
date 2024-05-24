package net.jiabin.design.pattern.practice.prototype.code2;

/**
 * @author Guan
 * 登录Session
 */
public class LoginSession {
    static LoginSession loginSession = null;
    private User loginedUser;// 已登录用户

    public LoginSession() {
    }

    public static LoginSession getLoginSession() {
        if (loginSession == null) {
            loginSession = new LoginSession();
        }
        return loginSession;
    }

//    public User getLoginedUser() {
////        return loginedUser.clone();// 返回已登录用户的一个拷贝
//        return loginedUser;// 返回原始已登录用户
//    }

    public User getLoginedUser() {
        return loginedUser.clone();// 返回已登录用户的一个拷贝
//      return loginedUser;// 返回原始已登录用户
    }


    // 只通过私有方法修改用户信息
    void setLoginedUser(User loginedUser) {
        this.loginedUser = loginedUser;
    }



}

