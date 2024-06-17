// Given an integer n representing number of vertices. 
//Find out how many undirected graphs (not necessarily connected) 
//can be constructed out of a given n number of vertices.

//Formula is 2 ^ (n*(n-1)/2)

public class GraphAndVertices {
    public static void main(String[] args){
      int n = 5; 
      System.out.print(count(n));
    }
    static long count(int n) {
        long x = n * (n-1) /2; 
        return (long)Math.pow(2,x);
  }
}
