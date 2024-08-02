package StudentManagement;


import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagement {

    // Creating an empty LinkedList
	LinkedList<Student> stuList;

    Student student = new Student();

	// Default Constructor
	public StudentManagement()
	{
		stuList = new LinkedList<>();
	}

    public void add(Student student){
        for(Student s: stuList){
            if(student.getId() == s.getId()){
                System.out.println("Student ID already exists");
                return;
            }
        }
        stuList.add(student);
        // System.out.println("Student added successfully!!");

    }
    public void displayStudent(int id){
        if(stuList.isEmpty()){
            System.out.println("Student record is empty");
        }
        for(Student s: stuList){
            if(s.getId()==id){
                System.out.println("Student rocord is found");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student record with id:" + id + "not found");
    }

    public void deleteStudent(int id){
        for(Student s: stuList){
            if(s.getId()==id){
                stuList.remove(s);
                System.out.println("Student record with id:" + id + "deleted Successfully");
                return;
            }
        }
        System.out.println("Student record with id:" + id + "not found"); 
    }

    public void updateStudent(int id, Scanner scanner){
        for(Student s: stuList){
            if(s.getId()==id){
                System.out.println("Enter student name:");
                String name=scanner.next();
                s.setName(name);
                System.out.println("Enter Student age");
                int age = scanner.nextInt();
                s.setAge(age);
                System.out.println("Student record updated Successfully");
                System.out.println("Updated Student record:" + s);
                return;
            }
        }
        System.out.println("Student record with id:" + id + "not found");
    }

    public void displayAllStudent(){
        if(stuList.isEmpty()){
            System.out.println("Student Records are empty");
        }else{
            for(Student s: stuList){
                System.out.println(s);
            }
        }
    }
}
