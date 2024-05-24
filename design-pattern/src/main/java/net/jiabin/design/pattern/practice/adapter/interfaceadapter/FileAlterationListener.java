package net.jiabin.design.pattern.practice.adapter.interfaceadapter;

public interface FileAlterationListener {
    void onStart(final FileAlterationObserver observer);

    void onDirectoryCreate(final File directory);

    void onDirectoryChange(final File directory);

    void onDirectoryDelete(final File directory);

    void onFileCreate(final File file);

    void onFileChange(final File file);

    void onFileDelete(final File file);

    void onStop(final FileAlterationObserver observer);

}