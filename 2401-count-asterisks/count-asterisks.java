class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean insidePair = false;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                insidePair = !insidePair;
            } else if (c == '*' && !insidePair) {
                count++;
            }
        }
        return count;
    }
}