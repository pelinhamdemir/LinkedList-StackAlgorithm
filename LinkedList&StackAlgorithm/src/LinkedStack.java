public class LinkedStack {
    public class Node {



        private Student data;
        private Node next;
        public Node(){
        }

        public Node(Student data, Node next){
            this.data = data;
            this.next = next;
        }

        public Student getData() {
            return data;
        }

        public void setData(Student data) {
            this.data = data;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }


    }


    protected Node first = null;
    private int size=0;

    public boolean isEmpty()
    { return first == null; }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(Student data)
    {
        Node oldfirst = first;
        first = new Node();
        first.setData(data);
        first.setNext(oldfirst);
        size++;
    }
    public Student pop()
    {
        Student item = first.getData();
        first = first.getNext();
        size--;
        return item;
    }
    public Student get(int index) {// the obj of the index is returned
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }


}