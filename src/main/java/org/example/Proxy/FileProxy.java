package org.example.Proxy;

public class FileProxy implements File {
    private boolean access;
    private RealFile realFile = new RealFile();

    public FileProxy(String path, boolean access) {
        realFile.setPath(path);
        this.access = access;
    }

    @Override
    public void loadFile() {
        if (access) {
            realFile.loadFile();
        } else {
            System.out.println("you don't possess permissions to access file within" +
                    " path : " + realFile.getPath());
        }
    }
}
