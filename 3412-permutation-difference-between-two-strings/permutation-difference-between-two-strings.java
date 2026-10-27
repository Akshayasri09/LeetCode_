class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    result += Math.abs(i - j);
                    break;
                }
            }
        }
        return result;
    }
}