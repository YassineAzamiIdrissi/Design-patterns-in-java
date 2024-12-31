package org.example.FlyWeight;

public class Main {
    public static void main(String[] args) {
        // lil observation : there is no new here =D.. this is the power of this
        // pattern. it is made so that we became 100% sure that we get only unique
        // rectangles based on their height - length.
        Rectangle rec_1 = FlyWeightFactory.getRectangle(10, 10);
        rec_1.draw("red");

        Rectangle rec_2 = FlyWeightFactory.getRectangle(10, 10);
        rec_2.draw("blue");
    }
}
