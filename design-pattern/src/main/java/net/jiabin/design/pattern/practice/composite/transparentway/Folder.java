package net.jiabin.design.pattern.practice.composite.transparentway;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{

    private String name;
    private List<IFile> children;

    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {

        return children.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {

        return  children.remove(iFile);
    }

    @Override
    public List<IFile> getChildren() {
        return children;
    }


}
