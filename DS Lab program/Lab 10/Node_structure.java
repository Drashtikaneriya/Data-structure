class Node{
    int info;
    Node link;

    public Node(int info){
        this.info=info;
        this.link=null;
    }
}



public class Node_structure {
    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        n1.link =n2;
    }
}
