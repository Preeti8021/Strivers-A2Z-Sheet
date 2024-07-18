//Challenge - remove the extra spaces 

public class ReverseWordsInString {
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

//TODO - other methods to remove the spaces (alternative to split("\\s+"))
