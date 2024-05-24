package net.jiabin.design.pattern.practice.composite.transparentway;

import java.util.List;

public class CompositeTestClient {

    public static void main(String[] args) {
        //父节点
        Folder folder = new Folder("D:");

        //子节点 目录
        Folder javaFoder = new Folder("java");

        //子节点 helloworld.txt
        Files  files = new Files("helloworld.txt");

        folder.add(javaFoder);
        folder.add(files);

        Folder sprFoder = new Folder("spring");
        Files files2 = new Files("springAop-api");
        javaFoder.add(sprFoder);
        javaFoder.add(files2);

        //子节点 目录
        Folder stuFoder = new Folder("学习");
        Files files1 = new Files("String.txt");

        folder.add(stuFoder);
        folder.add(files1);


        displayTree(folder,0);

    }

    /**
     * 使用递归
     * @param iFile
     * @param deep
     */
    public static  void  displayTree(IFile iFile,int deep){
        for (int i = 0; i < deep;i++){
            System.out.print("--");
        }
        //显示自身名称
        iFile.display();

        List<IFile> children = iFile.getChildren();

        for (IFile file : children) {
            if( file instanceof Files){
                for (int i = 0; i <= deep;i++){
                    System.out.print("---");
                }
                file.display();
            }else{
                displayTree(file,deep+1);
            }
        }

    }


}
