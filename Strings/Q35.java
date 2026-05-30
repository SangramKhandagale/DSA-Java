import java.util.*;

public class Q35{

    public static String zigzagConvert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (char ch : s.toCharArray()) {

            rows[currentRow].append(ch);

            if (currentRow == 0) {
                goingDown = true;
            }
            else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int rows = 3;

        System.out.println(zigzagConvert(s, rows));
    }
}