// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int i=0;i<arr.length-1;i++) {
//             if(arr[i]+1 == arr[i+1]) {
//                 break;
//             } else {
//                 ans.add(arr[i]+1);
//             }
//         }
//         return ans.get(k-1);
//     }
// }

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int num = 1;
        int i = 0;

        while(count < k) {
            if(i < arr.length && arr[i] == num) {
                i++;
            } else {
                count++;
            }
            num++;
        }
        return num - 1;
    }
}