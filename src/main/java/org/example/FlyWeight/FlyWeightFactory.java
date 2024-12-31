package org.example.FlyWeight;

import java.util.HashMap;

public class FlyWeightFactory {
    private static final HashMap<String, Rectangle> factory = new HashMap<>();

    public static Rectangle getRectangle(int l, int h) {
        String key = l + "_" + h;
        if (!factory.containsKey(key)) {
            Rectangle r = new Rectangle(l, h);
            factory.put(key, r);
        }
        return factory.get(key);
    }
}
