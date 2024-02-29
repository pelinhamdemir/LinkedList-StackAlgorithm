
public class Node {



    private Student data1;
    private Node next1;
    public Node(){
    }

    public Node(Student data, Node next){
        this.data1 = data;
        this.next1 = next;
    }

    public Student getData() {
        return data1;
    }

    public void setData(Student data) {
        this.data1 = data;
    }


    public Node getNext() {
        return next1;
    }

    public void setNext(Node next) {
        this.next1 = next;
    }


}

