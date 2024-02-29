public class Student {

    private int ID;
    private String name;
    private double  grade1, grade2,grade3;

    public Student(int ID, String name, double grade1, double grade2, double grade3) {
        this.ID = ID;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {

        return grade2;
    }

    public void setGrade2(double grade2) {

        this.grade2 = grade2;
    }

    public double getGrade3() {

        return grade3;
    }

    public void setGrade3(double grade3) {

        this.grade3 = grade3;
    }
    public double getAverageGrade() {
        return grade1 * 0.3 + grade2 * 0.2 + grade3 * 0.5;
    }

    public static int getRank(String name,LinkedList students){//determines the index of the given string in the given linkedlist which is sorted previously
        Node temp = students.getHead();
        int index;
        for(int i = 0; i< students.size;i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                index=i+1;
                return index;
            }
        }
        return 0;
    }

}

