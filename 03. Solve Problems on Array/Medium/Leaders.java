//Bruteforce - iterate from front using two loops O(N^2)
class LeadersBrute {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> r = new ArrayList<>(); 
        for(int i = 0; i<n ;i++){
            boolean flag = true; 
            for(int j = i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    flag = false; 
                }
            }
            if(flag){
                r.add(arr[i]);
            }
        }
        return r; 
    }
}

//Optimal solution- iterate from backwards, store the max element till that point, if some element is 
//greater than max, update max and add to list, as we need to return list in order, reverse the list finally
//TC- O(N) SC - O(N)

public class Leaders {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> r = new ArrayList<>(); 
        int max = arr[n-1];
        for(int i = n-1; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i]; 
                r.add(arr[i]);
            }
        }
        Collections.reverse(r);
        return r; 
    }
}