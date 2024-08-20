//logic 1 : if stack is empty- then push into stack, and not append to answer string
//          if stack not empty- then push into both stack and even append to answer
//TC: O(N) SC: O(N)

public class RemoveOuterParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                if(!stack.isEmpty()){
                    ans.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    ans.append(s.charAt(i));
                }
            }
        }

        return ans.toString();
    }
}


//Logic 2:
//TC: O(N) SC: O(N) worst case because of string builder

public class Solution2 {
    public String removeOuterParentheses(String s) {
        int counter = 0; 
        StringBuilder ans = new StringBuilder();
        for(int i= 0; i<s.length();i++){
            
            if(s.charAt(i)==')'){
                counter--;
            }
            if(counter!=0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                counter++;
            }
        }
        return ans.toString();
    }
}