public class IntegerLinkedList {

    private Node head = null;
    private int size = 0;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node nodeRef) {
            this.data = data;
            this.next = nodeRef;
        }
    }
    private Node getNode(int index){
        Node node = head;
        for(int i=0; i< index && node != null; i++){
            node = node.next;
        }
        return node;
    }
    // add node in the front
    public void add(int item){
        head = new Node(item, head);
        size++;
    }

    // return the number of nodes in the list
    public int size(){
        return size;
    }

    // To check if the value is in the list or not
    public boolean find(int item){
        for(int i=0; i < size; i++){
            if(getNode(i).data == item)
                return true;
        }
        return false;
    }

    // To get the greatest integer number in the list
    public int max(){
        int maximum = getNode(0).data;
        for(int i=0; i < size; i++){
            if(maximum < getNode(i).data)
                maximum = getNode(i).data;
        }
        return maximum;
    }

    //To return the smallest integer in the list
    public int min(){
        int minimum = getNode(0).data;
        for(int i=0; i < size; i++){
            if(minimum > getNode(i).data)
                minimum = getNode(i).data;
        }
        return minimum;
    }

}
