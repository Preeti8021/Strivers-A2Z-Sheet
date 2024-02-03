import java.util.*;
public class Solution {
    public static int dataTypes(String type) { // check the type and output the size of the datatype
        if(type.equals("Integer")){
            return 4;
        }
        else if(type.equals("Long")){
            return 8;
        }
        else if(type.equals("Float")){
            return 4;
        }
        else if(type.equals("Double")){
            return 8;
        }
        else{
            return 1;
        }
    }
}
