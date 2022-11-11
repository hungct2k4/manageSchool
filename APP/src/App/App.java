package App;

import java.util.Scanner;

import School.Manages;
import School.Students;
import School.Teachers;

public class App {
    public static  Manages manage;
    public static Scanner scanner;
    public static void main(String[] args) {

        while (true) {
            System.out.println("-----------Application Manager Students and Teacher-----------");
            System.out.println("Enter 1:   Login by Students ID ");
            System.out.println("Enter 2:   Login by Teacher ID ");
            System.out.println("Enter 3:   Login by Admin ID ");
            System.out.println("Enter 4:   Exit:");
            scanner = new Scanner(System.in);
            int line = scanner.nextInt();
            switch (line) {
                case 1 : {
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    System.out.println("PassWord: ");
                    String password = scanner.nextLine();
                    
                    if (!manage._ManageStudent.containsKey(id)) {
                        System.out.println("Wrong ID");
                        break;
                    } else if (!manage._ManageStudent.get(id).getAcc().getPassword().equals(password)) {
                        System.out.println("Wrong password");
                        break;
                    } else {
                        Students students = manage._ManageStudent.get(id);
                        students.Menu();
                    }

                    break;
                }
                case 2 : {
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    System.out.println("PassWord: ");
                    String password = scanner.nextLine();
                    
                    if (!manage._ManageTeacher.containsKey(id)) {
                        System.out.println("Wrong ID");
                        break;
                    } else if (!manage._ManageTeacher.get(id).getAcc().getPassword().equals(password)) {
                        System.out.println("Wrong password");
                        break;
                    } else {
                        Teachers teachers = manage._ManageTeacher.get(id);
                        teachers.Menu();
                    }

                    break;
                }
                case 3 : {
                    

                    break;
                }
                case 4 : {
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    System.out.println("PassWord: ");
                    String password = scanner.nextLine();

                    if (!manage.getId().equals(id)) {
                        System.out.println("Wrong ID");
                        break;
                    } else if (!manage.getPassword().equals(password)) {
                        System.out.println("Wrong password");
                        break;
                    } else {

                    }
                    break;
                }
                case 5 : {
                    return;
                }
                default:
                    System.out.println("Wrong Input");
                continue;
            }
        }
    }

}