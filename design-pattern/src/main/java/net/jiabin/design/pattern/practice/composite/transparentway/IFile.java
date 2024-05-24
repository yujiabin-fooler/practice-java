package net.jiabin.design.pattern.practice.composite.transparentway;

import java.util.List;

public interface IFile {

    /**
     * @Description: 显示文件夹的名称
     * @param:
     * @return: void
     **/
    public void display();

    /**
     * @Description: 添加
     * @param: []
     * @return: boolean
     **/
    public boolean add(IFile iFile);

    /**
     * @Description: 删除
     * @param: []
     * @return: boolean
     **/
    public boolean remove(IFile iFile);

    /**
     * @Description: 获得子节点
     * @param: []
     * @return: java.util.List<com.enjoy.cap26.IFile>
     **/
    public List<IFile> getChildren();

}
