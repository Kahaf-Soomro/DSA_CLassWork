package Recurrsion;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Main {

    static void traverseAll(Node[] heads, int i) {
        if (i == heads.length) return;

        System.out.print("List " + i + ": ");

        for (Node cur = heads[i]; cur != null; cur = cur.next) {
            System.out.print(cur.val + " ");
        }
        System.out.println();
        traverseAll(heads, i + 1);
    }

    public static void main(String[] args) {
        Node[] heads = new Node[3];

        // List 0: 1 -> 2 -> 3
        heads[0] = new Node(1);
        heads[0].next = new Node(2);
        heads[0].next.next = new Node(3);

        // List 1: 5
        heads[1] = new Node(5);

        // List 2: empty (stays null)

        traverseAll(heads, 0);
    }
}