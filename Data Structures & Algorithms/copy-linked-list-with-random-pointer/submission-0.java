/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

if (head == null) return null;

        Node temp = head;
        Map<Node, Node> hashMap = new HashMap<>();

        // First pass: create deep copies of all nodes and store in map
        while (temp != null) {
            Node newNode = new Node(temp.val);
            hashMap.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;



        while (temp != null) {
            Node copyNode = hashMap.get(temp);
            copyNode.next = hashMap.get(temp.next);
            copyNode.random = hashMap.get(temp.random);
            temp = temp.next;
        }

        return hashMap.get(head);
        
    }
}
