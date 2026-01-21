package Stacks;
public class Q7 {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : num.toCharArray()) {
            while (sb.length() > 0 && k > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }
// Remove remaining digits if k > 0
        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }

        String result = sb.substring(idx);
        return result.isEmpty() ? "0" : result;
    }
}
