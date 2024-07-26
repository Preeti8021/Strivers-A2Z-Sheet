//Challenge - remove the extra spaces 

//Logic- used stack to store the strings, from string array containing words from given string
class ReverseWordsInString1 {
    public String reverseWords(String s) {
        Stack<String> words = new Stack<>(); 
        String[] arr = s.split(" ");
        for(int i = 0; i<arr.length; i++){
            if(!arr[i].isEmpty()){
                words.push(arr[i]);
            }
        }

        StringBuilder res = new StringBuilder();
        while(!words.isEmpty()){
            res.append(words.pop());
            if(!words.isEmpty()) res.append(" ");
        }

        return res.toString();
    }
}

//Logic- split function with delimiter 
class ReverseWordsInString2 {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}