class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minSoFar = arrays.get(0).get(0);
        int maxSoFar = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDist = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);
            int currMin = curr.get(0);
            int currMax = curr.get(curr.size() - 1);

            maxDist = Math.max(maxDist, Math.abs(currMax - minSoFar));
            maxDist = Math.max(maxDist, Math.abs(maxSoFar - currMin));

            minSoFar = Math.min(minSoFar, currMin);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxDist;
    }
}