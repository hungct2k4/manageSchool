package School;
import java.util.Hashtable;
import java.util.Scanner;

import Admin.Scores;
import InputF.FileInput;



public class App {

        public static  Manages manage;
        public static Scanner scanner;
        public static void main(String[] args) throws Exception {
        // ArrayList<Students> students = new ArrayList<Students>();
        // ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        manage = new Manages(new Hashtable<String, Students>(), new Hashtable<String, Teachers>());
        
        
        while (true) {
            System.out.println("-----------Application Manager Students and Teacher-----------");
            System.out.println("Enter 1:   Insert Person ");
            System.out.println("Enter 2:   Show information Person");
            System.out.println("Enter 3:   Find persions by id: ");
            System.out.println("Enter 4:   Add Score for Student");
            System.out.println("Enter 5:   Edit score");
            System.out.println("Enter 6:   Read file xml");
            System.out.println("Enter 7:   Exit:");
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: Insert a Students");
                    System.out.println("Enter b: Insert a Teacher");
                    System.out.println("Enter c: Add many Students");

                    String text = scanner.nextLine();
                    switch (text) {
                        case "a": {
                            System.out.print("Enter id: ");
                            String _id = scanner.nextLine();
                            if (manage._ManageStudent.containsKey(_id)) {
                                System.out.println("students have exist, Enter again");
                                break;
                            }
                            else 
                                manage.addStudent(InpuStudents(_id));
                            break;
                        }
                        case "b": {
                            manage.addTeacher(InputTeacher());
                            break;
                        }
                        case "c": {
                            System.out.println("Enter number of students");
                            String _number = scanner.nextLine();
                            int number = Integer.parseInt(_number);
                            for (int i = 1; i <= number; i++) {
                                System.out.println("Enter " + i + "th Students ");
                                System.out.print("Enter id: ");
                                String _id = scanner.nextLine();
                                if (manage._ManageStudent.containsKey(_id)) {
                                    System.out.println("students have exist, Enter again");

                                } else 
                                    manage.addStudent(InpuStudents(_id));
                            }
                            break;
                        }
                            default:
                            System.out.println("Wrong Input");
                            break;
                    }
                    break;
                }
                
                case "2": {
                    System.out.println("Enter a: Show all Students");
                    System.out.println("Enter b: Show all Teacher");

                    String text = scanner.nextLine();
                    switch (text) {
                        case "a": {
                            manage.CheckExistStudents();
                            manage.ShowAllStudents();
                            break;
                        }
                        case "b": {
                            manage.CheckExistTeachers();
                            manage.ShowAllofTeachers();
                            break;
                        }
                        default:
                            System.out.println("Wrong Input");
                        break;
                    }
                    break;
                }
                case "3": {
                    System.out.println("Enter a: Find Student By id");
                    System.out.println("Enter b: Find Teacher by id");
                    System.out.println("Enter c: Find High Score");
                    String text = scanner.nextLine();
                    switch (text) {
                        case "a": {
                            manage.CheckExistStudents();
                            System.out.println("Enter id ");
                            String id = scanner.nextLine();
                            manage.FindStudentById(id);
                            break;
                        }
 
                        case "b": {
                            manage.CheckExistTeachers();
                            String id = scanner.nextLine();
                            manage.FindStudentById(id);
                            break;
                        }

                        case "c": {
                            manage.CheckExistStudents();
                            manage.FindHighScore();
                            break;
                        }

                            default:
                            System.out.println("Wrong Input");
                            break;
                    }
                    break;
                }
                case "4": {
                    System.out.println("Enter Id ");
                    String id = scanner.nextLine();
                    manage.AddScoreForStudents(id, addScoreForStudent());
                    break; 
                }
                case "5": {
                    System.out.println("Enter id ");
                    String _id = scanner.nextLine();
                    System.out.println("Enter subject ");
                    String _subject = scanner.nextLine();
                    System.out.println("Enter New Score ");
                    Double newscore = scanner.nextDouble();
                    manage.CheckExistStudents();
                    manage.EditScoreOfStudents(_id, _subject, newscore);
                    break;
                }
                case "6": {
                    FileInput file = new FileInput();
                    manage._ManageStudent.putAll(file.ReadFileInput());
                    file.ReadFileInput();
                    break;
                }
                case "7": {
                    return;
                }
                default:
                    System.out.println("Wrong Input");
                continue;
            }
        }
    }


    public static Teachers InputTeacher() {
        Scanner scanner = new Scanner(System.in);        

        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter id: ");
        String birthday = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        Teachers teacher = new Teachers(name, id, birthday, address, phone, age, 
            gender, subject);
        System.out.println("------Update Successful------\n");
        return teacher;
    }

    public static Students InpuStudents(String id) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter id: ");
        String birthday = scanner.nextLine();
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        
        Students student = new Students(name, id, birthday, address, phone, age, gender, grade, new Scores());
        System.out.println("------Update Successful------\n");
        return student;
        
    }

    public static Scores addScoreForStudent() {
        System.out.println("Enter Math");
        Double math = scanner.nextDouble();
        System.out.println("Enter English");
        Double english = scanner.nextDouble();
        System.out.println("Enter Music");
        Double music = scanner.nextDouble();
        System.out.println("Enter Science");
        Double science = scanner.nextDouble();
        System.out.println("Enter Physics");
        Double physics = scanner.nextDouble();
        Scores gpa = new Scores(math, english, physics, music, science);
        return gpa;
    }
    
}
