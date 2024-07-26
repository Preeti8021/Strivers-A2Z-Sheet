//TC - O(nlogn . m) SC - O(1)

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length; 
        Arrays.sort(strs);
        int i = 0, j = 0;
        while(i<strs[0].length() && j<strs[n-1].length()){
            if(strs[0].charAt(i) == strs[n-1].charAt(j)){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,i);
    }
}