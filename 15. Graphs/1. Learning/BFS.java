class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>(); 
        int[] visited = new int[V];
        Queue<Integer> q = new LinkedList<>(); 
        //visited array and queue 
        q.add(0);
        visited[0] = 1; 
        
        while(!q.isEmpty()){
            Integer n = q.poll(); 
            res.add(n);
            for(Integer i : adj.get(n)){
                if(visited[i] == 0){
                    visited[i] = 1;
                    q.add(i);
                }
            }
        }
        
        return res; 
    }
}