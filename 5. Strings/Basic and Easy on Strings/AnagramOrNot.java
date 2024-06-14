//Anagrams are words, which have same characters in them in different order. We can use sorting, hashmap, and Character Count Arrays to solve this question. 
//Below code is solved using array sorting.
//Time Complexity: O(mlogm + nlogn)
//Space Complexity: O(m+n)

public class AnagramOrNot {
    public static void main(String[] args){
      System.out.print(isAnagram(rat,car)); //returns false 
    }
    public static boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
