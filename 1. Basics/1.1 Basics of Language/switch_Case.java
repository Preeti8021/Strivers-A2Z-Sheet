public class Solution {
    public static double areaSwitchCase(int ch, double []a) { //basic switch case statement in java
        switch(ch){
            case 1:  //if 1, return area of circle
            return Math.PI*a[0]*a[0];
            case 2:  //if 2, return area of rectangle
            return a[0] * a[1];
            default:
            return -1;
        }
    }
}
