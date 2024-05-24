package net.jiabin.design.pattern.practice.visitor;

import java.util.List;

public class Shoping {
    private List<GoodsItem> list;

    public Shoping(List<GoodsItem> list) {
        this.list = list;
    }

    public List<GoodsItem> getList() {
        return list;
    }

    public void setList(List<GoodsItem> list) {
        this.list = list;
    }

    public double perchase() {
        double costTotal = 0.0;
        for (GoodsItem goodsItem : list) {
            costTotal += goodsItem.accept(goodsItem.getSelfVisitor());
        }
        System.out.println(String.format("购物总价%s", costTotal));
        return costTotal;
    }

}
