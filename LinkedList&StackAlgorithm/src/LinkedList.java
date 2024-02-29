public class LinkedList {


    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void remove(Student a) {

        if (head.getData().equals(a)) {

            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            return;
        }

        Node tail = head;
        Node temp = head.getNext();

        while (temp != null) {
            if (temp.getData().equals(a)) {
                tail.setNext(temp.getNext());
                temp.setNext(null);
                return;
            }
            tail = temp;
            temp = temp.getNext();
        }
    }
    public void addFirst(Student P) {
        Node newNode=new Node();
        newNode.setData(P);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    public Student get(int index) {// the obj of the index is returned
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    public void set(int index, Student student) {// puts the obj into the given index

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.setData(student);
    }
    public static void StudentSorting(LinkedList students) {//sorting the students according to their grades
        int n = students.size;
        Student temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students.get(j - 1).getAverageGrade() < students.get(j).getAverageGrade()) {
                    temp = students.get(j - 1);
                    students.set(j - 1, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }




}



