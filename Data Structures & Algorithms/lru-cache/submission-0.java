class LRUCache {

    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        //constructor to initialize node
        Node(int _key, int _val){
            key = _key;
            val = _val;
        }
    }

        //head and tail dummy nodes
        Node head = new Node(-1,-1);
        Node tail = new Node(-1,-1);

        int cap;

        //hashMap to store key node mapping
        HashMap<Integer, Node> m = new HashMap<>();
    

    public LRUCache(int capacity) {

        cap = capacity;
        head.next = tail;
        tail.prev = head;
        
    }

    //function to add node right after head
    void addNode(Node newNode){
        Node temp = head.next;
        newNode.next = temp;
        newNode.prev = head;
        head.next = newNode;
        temp.prev = newNode;

    }

    //function to remove node 
    void deleteNode(Node delNode){
        Node delPrev = delNode.prev;
        Node delNext = delNode.next;

        delPrev.next = delNext;
        delNext.prev = delPrev;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node resNode = m.get(key);
            int res = resNode.val;
            //remove old mapping
            m.remove(key);
            //move accessed node to front
            deleteNode(resNode);
            addNode(resNode);

            m.put(key, head.next);
            return res;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {

        //if key already exists
        if(m.containsKey(key)){
            Node existingNode = m.get(key);
            m.remove(key);
            deleteNode(existingNode);

        }
        if(m.size() == cap){
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        addNode(new Node(key, value));
        m.put(key, head.next);
        
    }
}
