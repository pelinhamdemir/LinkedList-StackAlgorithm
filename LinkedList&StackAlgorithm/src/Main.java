import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedStack studentStack = new LinkedStack();
        LinkedList studentLinked = new LinkedList();

        while(true){//iterates the options every step
            System.out.println("Choose an option: \n1) Create a student: \n2) Remove a student: \n3) Summarize all students: \n4) Exit:");
            int option = keyboard.nextInt();

            switch (option) {//option selection
                case 1:
                    System.out.println("Enter the ID of the student. ");
                    int ID = keyboard.nextInt();
                    if (ID <= 0) {//checks the validation
                        while(ID <= 0){
                            System.out.println("Invalid input for ID. Please enter a positive integer.");
                            ID = keyboard.nextInt();}
                    }


                    System.out.println("Enter the name of the student. ");
                    String name=keyboard.next();
                    if (!name.matches("[a-zA-Z]+")) {//checks the validation
                        while (!name.matches("[a-zA-Z]+")) {

                            System.out.println("Invalid input for name. Please enter a valid name.");
                            name = keyboard.next();
                        }
                    }

                    System.out.println("Enter the grade1 of the student. ");
                    double grade1 = keyboard.nextDouble();
                    if (grade1 < 0 || grade1 > 120) {//checks the validation
                        while(grade1 < 0  ||grade1 > 120){
                            System.out.println("Invalid input for grade1. Please enter a number between 0 and 100.");
                            grade1 = keyboard.nextDouble();}
                    }


                    System.out.println("Enter the grade2 of the student. ");
                    double grade2 = keyboard.nextDouble();
                    if (grade2 < 0 || grade2 > 120) {//checks the validation
                        while (grade2 < 0 || grade2 > 120) {
                            System.out.println("Invalid input for grade2. Please enter a number between 0 and 100.");
                            grade2 = keyboard.nextDouble();
                        }
                    }
                    System.out.println("Enter the grade3 of the student. ");
                    double grade3 = keyboard.nextDouble();
                    if (grade3 < 0 || grade3 > 120) {//checks the validation
                        while(grade3 < 0  || grade3 > 120) {
                            System.out.println("Invalid input for grade3. Please enter a number between 0 and 100.");
                            grade3 = keyboard.nextDouble();
                        }
                    }
                    //student objects is created with the values entered
                    Student student = new Student(ID, name, grade1, grade2, grade3);
                    studentStack.push(student);
                    studentLinked.addFirst(student);
                    LinkedList.StudentSorting(studentLinked);//linkedlist sorting operation
                    break;


                case 2:


                    if (studentStack.isEmpty()) {
                        System.out.println("No students to remove.");
                    } else {
                        Student removedStudent = studentStack.pop();
                        System.out.println(removedStudent.getName() + "'s ID was " + removedStudent.getID() + ". His grades were " + removedStudent.getGrade1()+ ", " + removedStudent.getGrade2() + " and " + removedStudent.getGrade3() + ". He was ranked " + Student.getRank(removedStudent.getName(), studentLinked) + " in the class.");

                        studentLinked.remove(removedStudent);
                    }

                    break;
                case 3:

                    for(int i=0;i<studentStack.getSize();i++) {// gets the infos of all the students

                        System.out.println(studentStack.get(i).getName() + "'s ID is " + studentStack.get(i).getID() + ". His grades are " + studentStack.get(i).getGrade1() + ", " + studentStack.get(i).getGrade2() + " and " + studentStack.get(i).getGrade3() + ". He is ranked " + Student.getRank(studentStack.get(i).getName(), studentLinked) + " in the class.");

                    }
                    break;
                case 4:
                    for(int i=0;i<studentStack.getSize();i++) {

                        System.out.println(studentStack.get(i).getName() + "'s ID is " + studentStack.get(i).getID() + ". His grades are " + studentStack.get(i).getGrade1() + ", " + studentStack.get(i).getGrade2() + " and " + studentStack.get(i).getGrade3() + ". He is ranked " + Student.getRank(studentStack.get(i).getName(), studentLinked) + " in the class.");

                    }

                    System.exit(0);
            }}}

}