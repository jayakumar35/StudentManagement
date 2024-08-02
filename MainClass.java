package StudentManagement;

import java.util.Scanner;

 
public class MainClass {
    
    public static void main(String[] args) {

        StudentManagement stu = new StudentManagement();
        Student student = new Student();
        student.setId(1);
        student.setName("John");
        student.setAge(23);
        stu.add(student);
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Student management system");
        System.out.println("*******************************");
        while(true){
            System.out.println("*******************************");
            System.out.println("1) Add Student to Inventory");
            System.out.println("2) Display Student details");
            System.out.println("3) Delete Student from inventory");
            System.out.println("4) Update student details");
            System.out.println("5) Display all Students in Inventory");
            System.out.println("6) Exists");
            System.out.println("*******************************");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter student name");
                    String name = scanner.next();
                    System.out.println("Enter student age");
                    int age = scanner.nextInt();
                    stu.add(new Student(id,name,age));
                    break;
                case 2:
                    System.out.println("Enter Student ID");
                    id=scanner.nextInt();
                    stu.displayStudent(id);
                    break;
                case 3:
                    System.out.println("Enter student Id to delete");
                    id=scanner.nextInt();
                    stu.deleteStudent(id);
                    break;
                case 4:
                    System.out.println("Enter student Id to update");
                    id=scanner.nextInt();
                    stu.updateStudent(id,scanner);
                    break;
                case 5:
                    System.out.println("************************");
                    stu.displayAllStudent();
                    break;
                case 6:
                    System.out.println("Machine closed");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid Choice");
                    break;
            }
        }
    }
    
    
}
