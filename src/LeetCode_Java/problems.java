package LeetCode_Java;

import java.util.Arrays;

//Problem 2109. Adding Spaces to a String
class Solution {
    public StringBuilder addSpaces(String s, int[] spaces) {
        int m=s.length();
        int n=spaces.length;
        StringBuilder result=new StringBuilder(" ");
        //Using the Two Pointer Approach
        int fp=0;
        int sp=0;
        while(fp<m){
            if(sp<n && fp==spaces[sp]){
                result.append(' ');
                sp++;
            }
            result.append(s.charAt(fp));
            fp++;
        }
        return result;
    }
    public static void main(String[] args) {
        String s="rithickshanisgoodboy";
        int[]spaces={11,13,17};
        Solution solution = new Solution();
        StringBuilder result = solution.addSpaces(s, spaces);
        System.out.println(result);

    }
}

class Solution1 {
    public char[] addSpaces2(String s, int[] spaces) {
        char[] ch = s.toCharArray();
        char[] totalCh = new char[s.length() + spaces.length];
        // Using the Two Pointer Approach
        int fpi = 0, spc = 0;
        for (int i = 0; i < spaces.length; i++) {
            while (spc < spaces[i]) {
                totalCh[fpi] = ch[spc];
                fpi++;
                spc++;
            }
            totalCh[fpi] = ' ';
            fpi++;
        }
        while (spc < s.length()) {
            totalCh[fpi] = ch[spc];
            fpi++;
            spc++;
        }
        return totalCh;
    }

    public static void main(String[] args) {
        String s = "rithickshanisgoodboy";
        int[] spaces = {11, 13, 17};
        Solution1 solution = new Solution1();
        char[] result = solution.addSpaces2(s, spaces);
        System.out.println(new String(result));
    }
}

//Problem 1: Two Sum

class Solution2{
    public int[] twoSum(int[] nums, int target){
        for(int i=1;i<nums.length;i++){
            for(int j=1;j< nums.length;j++){
                int a=j-i;
                if(nums[a]+nums[j]==target){
                    return new int[]{a,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        Solution2 solution = new Solution2();
        int[] result = solution.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}

//Problem 2825 Make String a Subsequence Using Cyclic Increments

class Solution3 {
    public boolean canMakeSubsequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();


        if (n > m) return false;

        int fp = 0;
        int sp = 0;

        while (fp < m && sp < n) {
            char currentChar = str1.charAt(fp);
            char next = (char) (((currentChar - 'a' + 1) % 26) + 'a');

            if (str2.charAt(sp) == currentChar || str2.charAt(sp) == next) {
                sp++;
            }
            fp++;
        }
        return sp == n;
    }
    public static void main(String[] args) {
        String str1="abc";
        String str2="ad";
        Solution3 solution3=new Solution3();
        Boolean result=solution3.canMakeSubsequence(str1,str2);
        System.out.println(result);
    }
}




