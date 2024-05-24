package net.jiabin.design.pattern.practice.composite.safeway;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Bags implements Articles{

    private String name;
    private List<Articles> list;


    public Bags(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    @Override
    public float calculation() {
        float s=0;
        for(Object obj:list)
        {
            s+=((Articles)obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for(Object obj:list) {
            ((Articles)obj).show();
        }
    }


    /**
     * 新增对象
     * @param c
     */
    public void add(Articles c) {
        list.add(c);
    }

    /**
     * 删除对象
     * @param c
     */
    public void remove(Articles c) {
        list.remove(c);
    }

    /**
     * 获得list
     * @return
     */
    public List<Articles> getChild(){
        return list;
    }
}
