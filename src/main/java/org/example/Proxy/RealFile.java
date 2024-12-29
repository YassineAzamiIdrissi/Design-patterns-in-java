package org.example.Proxy;

public class RealFile implements File {
    private String path;

    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
    @Override
    public void loadFile() {
        System.out.println("loading file in : "+path);
    }
}
