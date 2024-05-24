package net.jiabin.design.pattern.practice.composite.safeway;

public class CompositeTestClient {

    public static void main(String[] args) {


        Goods sp;
        Bags BigBag=new Bags("大袋子");
        Bags mediumBag=new Bags("中袋子");
        Bags smallRedBag=new Bags("红色小袋子");
        Bags smallWhiteBag=new Bags("白色小袋子");

        sp=new Goods("婺源特产",2,7.9f);
        smallRedBag.add(sp);

        sp=new Goods("婺源地图",1,9.9f);
        smallRedBag.add(sp);

        sp=new Goods("韶关香菇",2,68);
        smallWhiteBag.add(sp);

        sp=new Goods("韶关红茶",3,180);
        smallWhiteBag.add(sp);

        sp=new Goods("景德镇瓷器",1,380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);

        sp=new Goods("李宁牌运动鞋",1,198);
        BigBag.add(sp);
        BigBag.add(smallWhiteBag);
        BigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        BigBag.show();
        float s=BigBag.calculation();
        System.out.println("要支付的总价是："+s+"元");
    }



}
