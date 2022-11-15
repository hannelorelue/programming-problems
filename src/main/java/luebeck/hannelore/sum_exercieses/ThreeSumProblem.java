package luebeck.hannelore.sum_exercieses;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreeSumProblem {

    public static boolean run(ArrayList<Integer> input, int sum){
        for (int i =0; i < input.size() -2 ; i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int curr_sum = sum - input.get(i);
            for (int j = i +1; j< input.size(); j++) {
                if (hm.containsKey(curr_sum - input.get(j))) {
                    System.out.println(String.format("The Triplet is %d %d %d", input.get(i), input.get(j), curr_sum - input.get(j)));
                    return true;
                }
                hm.put(input.get(j), 1);
            }
        }
        return false;
    }
}
