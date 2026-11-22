class Solution {
    public boolean checkString(String s) {
        int count1 = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a') {
                count1++;
            }
        }

        int count2 = 0;
        for(int i=0;i<count1;i++) {
            if(s.charAt(i) != 'a') {
                return false;
            }
            count2++;
        }
        return count1 == count2;
    }
}