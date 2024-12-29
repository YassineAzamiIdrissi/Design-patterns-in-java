package org.example.Proxy;

public class Main {
    public static void main(String[] args) {
        File proxy = new FileProxy("some_path",false);
        proxy.loadFile();
    }
}
