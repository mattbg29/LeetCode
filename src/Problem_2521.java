import java.util.ArrayList;

public class Problem_2521 {
    public int distinctPrimeFactors(int[] nums) {
        ArrayList arr = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            int numNow = nums[i];
            for (int j = 2; j <= numNow; j++) {
                if (numNow % j == 0) {
                    if (!arr.contains(j)) {
                        arr.add(j);
                    }
                    numNow /= j;
                    j = 1;
                }
            }
        }
        return arr.size();
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 8, 16};
        Problem_2521 obj = new Problem_2521();
        System.out.println(obj.distinctPrimeFactors(input));
    }
}
