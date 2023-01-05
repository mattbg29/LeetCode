public class Problem_2515 {
    public int closetTarget(String[] words, String target, int startIndex) {
        int minMove = -1;
        int len = words.length;
        for (int i = 0; i < len; i++) {
            if (words[(i + startIndex) % len].equals(target)) {
                minMove = i;
                break;
            }
        }
        int checkLeft = -1;
        if (minMove > 0) {
            if (minMove > len / 2) {
                checkLeft = len - minMove;
            } else {
                checkLeft = minMove;
            }
        }
        for (int i = 0; i <= checkLeft; i++) {
            int checkNow = (startIndex - i) % len;
            if (checkNow < 0) {
                checkNow += len;
            }
            System.out.println(checkNow);
            if (words[checkNow].equals(target)) {
                minMove = i;
                break;
            }
        }
        return minMove;
    }
}
