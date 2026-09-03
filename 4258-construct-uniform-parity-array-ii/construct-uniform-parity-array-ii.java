class Solution {
    public boolean uniformArray(int[] nums) {

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num % 2 == 0) {
                minEven = Math.min(minEven, num);
            } else {
                minOdd = Math.min(minOdd, num);
            }
        }

        // All numbers are already even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // All numbers are already odd
        if (minEven == Integer.MAX_VALUE) {
            return true;
        }
        return minOdd < minEven;
    }
}