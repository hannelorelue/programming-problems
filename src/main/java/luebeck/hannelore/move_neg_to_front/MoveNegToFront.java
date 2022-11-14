package luebeck.hannelore.move_neg_to_front;

import java.util.ArrayList;

public class MoveNegToFront {
    public static ArrayList<Integer> run(ArrayList<Integer> input) {
        //ArrayList<Integer> output = new ArrayList<>();
        int left = 0;
        int right = input.size()-1;
        while (left < right) {
            if (input.get(left) < 0 && input.get(right) < 0) {
                left++;
            } else if (input.get(left) >= 0 && input.get(right) < 0 ) {
                int temp = input.get(left);
                input.set(left, input.get(right));
                input.set(right, temp);
                left = left +1;
                right = right -1;
            } else if (input.get(left) > 0 && input.get(right) > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return input;
    }
}
