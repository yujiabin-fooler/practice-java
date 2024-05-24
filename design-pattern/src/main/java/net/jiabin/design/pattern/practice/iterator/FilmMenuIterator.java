package net.jiabin.design.pattern.practice.iterator;

//电影节目的迭代器
public class FilmMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    public FilmMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if(position > menuItems.length-1 || menuItems[position] == null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position ++;
        return menuItem;
    }
}
