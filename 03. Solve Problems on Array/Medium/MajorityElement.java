import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        System.out.println(majBF(arr));
        System.out.println(majBetter(arr));
    }

    public static int majBetter(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0; 
        int n = arr.length; 
        for(int i = 0; i<n; i++){
            map.put(arr[i],0);
        }
        int max = 0; 
        int index =0; 
        for(int i =0; i<n; i++){
            count = map.get(arr[i])+1;
            map.put(arr[i],count);
            if(count>max){
                max = count; 
                index = i; 
            }
        }
        if(max > n/2){
            return arr[index];
        }
        return -1;
    }

    public static int majBF(int[] arr) { //O(n2) brute force 
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (arr.length / 2)) {
                result = arr[i];
            }
        }
        return result;
    }
}