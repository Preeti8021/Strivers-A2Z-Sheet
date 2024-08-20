//logic: concatentate goal with itself, if that result contains the string to be checked, then 
//       both strings are rotation of each other 
//TC: O(m*n) SC: O(m)  
//{m - length of goal, n - length of s} 

public class IsStringRotation {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        if(s.length()>goal.length()){
            return false;
        }
        String news = goal + goal;
        if(news.contains(s)){
            return true;
        }
        return false;
    }
}