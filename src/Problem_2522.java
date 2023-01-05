public class Problem_2522 {
    public int minimumPartition(String s, int k) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' > k) {
                return -1;
            }
            int j = i + 1;
            while (j <= s.length()) {
                if (Double.parseDouble(s.substring(i, j)) <= k) {
                    j++;
                } else {
                    total++;
                    i = j - 2;
                    break;
                }
            }
        }
        total++;
        return total;
    }
}
