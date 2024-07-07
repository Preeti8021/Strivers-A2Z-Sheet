class IntroTrees {
    static int countNodes(int i) {
        if(i<=0){
            return 0; 
        }
        return (int)Math.pow(2,i-1);
    }
    public static void main(String[] args){
        System.out.print(countNodes(5));
    }
}