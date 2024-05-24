package net.jiabin.design.pattern.practice.adapter.interfaceadapter;

public class FileMonitor extends FileAlterationListenerAdaptor {
    public void onFileCreate(final File file) {
        // 文件创建 doSomething();
    }

    public void onFileDelete(final File file) {
        // 文件删除 doSomething();
    }
}
