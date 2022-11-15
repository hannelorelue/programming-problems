package luebeck.hannelore.sum_exercieses;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumProblem {
    public static int run(ArrayList<Integer> input, int sum){
        int size = input.size();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i < size; i++) {
            if (!hm.containsKey(input.get(i))) {
                hm.put(input.get(i),1);
            } else {
                hm.replace(input.get(i),hm.get(input.get(i)) +1 );
            }
        }
        int count = 0;
        for (int k = 0; k < size; k ++ ) {
            if (hm.containsKey(sum - input.get(k))) {
                count = count + hm.get(sum - input.get(k));
            }
            if (sum - input.get(k) == input.get(k)) {
                count--;
            }
        }
        return count/2;
    }
}
