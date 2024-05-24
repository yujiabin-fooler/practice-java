package net.jiabin.design.pattern.practice.iterator;

import java.util.List;

//电视界面的迭代器
public class TVChanneMenuIterator implements Iterator{

    List<MenuItem> menuItems;
    int position = 0;

    public TVChanneMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if(position > menuItems.size()-1 || menuItems.get(position) == null){
            return false;
        }else{
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position ++;
        return menuItem;
    }
}
