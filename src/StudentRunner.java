import java.util.Scanner;

public class StudentRunner {
    public void run() {
        Student[] student_list = new Student[3];
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < student_list.length; i++){
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter id: ");
            String id = scanner.nextLine();
            Student student = new Student(firstName,lastName,id);
            student_list[i] = student;
        }

        for(Student stud :student_list){
            System.out.println(stud.toString());
        }
        scanner.close();

    }
}
