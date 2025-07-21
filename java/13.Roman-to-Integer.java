class Solution {
    public int romanToInt(String s) {
        int total = 0; 
        int prev =0;

        for (int i = s.length() - 1; i >= 0; i--) { 
            int current = 0;

            char ch = s.charAt(i);
            if (ch == 'I') current = 1;
            else if (ch == 'V') current = 5;
            else if (ch == 'X') current = 10;
            else if (ch == 'L') current = 50;
            else if (ch == 'C') current = 100;
            else if (ch == 'D') current = 500;
            else if (ch == 'M') current = 1000;

          
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current; 
        }

        return total;
    }
}
