package luebeck.hannelore;


import luebeck.hannelore.move_neg_to_front.MoveNegToFront;
import luebeck.hannelore.sum_exercieses.TwoSumProblem;

import java.util.ArrayList;

public class Main {
    public static int getRandomInteger(int minValue, int maxValue) {
        return (int) ((Math.random() * (maxValue - minValue)) + minValue);
    }
    public static ArrayList<Integer> getRandomIntegerArrayList(int length, int minValue, int maxValue) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            a.add(getRandomInteger(minValue, maxValue));
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("1. Move Negative elements to the front");
        // generate input data
        ArrayList<Integer> a = getRandomIntegerArrayList(10, -10, 10);
        System.out.println("Random Input list");
        System.out.println(a);
        System.out.println("Output list");
        System.out.println(MoveNegToFront.run(a));

        System.out.println("2. Two sum problem");
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(7);
        b.add(11);
        b.add(15);
        System.out.println("Input list");
        System.out.println(b);
        System.out.println("Number of pairs:");
        System.out.println(TwoSumProblem.run(b, 9));

    }
}