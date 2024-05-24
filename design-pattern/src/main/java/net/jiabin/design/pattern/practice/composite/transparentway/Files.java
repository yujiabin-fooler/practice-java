package net.jiabin.design.pattern.practice.composite.transparentway;

import java.util.List;

public class Files implements IFile{

    private String name;

    public Files(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChildren() {
        return null;
    }



}
