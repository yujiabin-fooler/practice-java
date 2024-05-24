package net.jiabin.design.pattern.practice.prototype.code1;

import java.util.ArrayList;

/*
 * 书本类型，扮演的是ConcretePrototype角色，而Cloneable扮演Prototype角色
 */
public class Book implements Cloneable {

    private String title;// 标题
    private ArrayList<String> image = new ArrayList<String>();// 图片名列表

    public Book() {
        super();
    }

    /**
     * 重写拷贝方法
     */
    @Override
    protected Book clone()  {
        try {
            Book book = (Book) super.clone();
            return book;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深拷贝重写拷贝方法
     */
//    @Override
//    protected Book clone()  {
//        try {
//            Book book = (Book) super.clone();
//            // 对image对象也调用clone()函数，进行拷贝
//            book.image = (ArrayList<String>) this.image.clone();
//            return book;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//


    public ArrayList<String> getImage() {
        return image;
    }

    public void addImage(String img) {
        this.image.add(img);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 打印内容
     */
    public void showBook() {
        System.out.println("----------------------Start----------------------");

        System.out.println("title：" + title);
        for (String img : image) {
            System.out.println("image name:" + img);
        }

        System.out.println("----------------------End----------------------");
    }
}
