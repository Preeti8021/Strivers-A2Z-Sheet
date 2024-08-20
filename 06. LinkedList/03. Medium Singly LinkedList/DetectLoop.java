public class DetectLoop {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null){
            return false; 
        }
        Set<ListNode> set = new HashSet<>();
        ListNode temp = head; 

        while(temp!= null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next; 
        }

        return false; 
    }
}