package net.jiabin.design.pattern.practice.proxy.staticproxy;

//代理角色。代理房东租房
public class ProxyObject implements Rent{

    private Renters renters;

    public ProxyObject(Renters renters){
        this.renters = renters;
    }

    //租房操作，可以添加一些额外操作
    public void rent() {
        seeHouse();//看房
        renters.rent();
        hetong();//签合同
        fare();//收中介费
    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    public void hetong(){
        System.out.println("签订租赁合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }


}

