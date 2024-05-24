package net.jiabin.design.pattern.practice.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTestClient {

    public static void main(String[] args) {
        List<GoodsItem> list = new ArrayList<>();
        list.add(new Milk("某品牌奶粉",160.0,2));
        list.add(new Cherry(80.0,5));
        Shoping shopingClient = new Shoping(list);
        double totalcost=shopingClient.perchase();

    }
}
