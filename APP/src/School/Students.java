package School;
import java.util.Scanner;

import Admin.*;
import Calendars.Schedule;
import LoginAndRegister.Account;

public class Students extends Persons {
    public String grade;
    public Scores scores;
    Scanner input = new Scanner(System.in);
   



    public Students(String name, Schedule schedule, String date_of_birth, String address, String phone, int age,
            String gender, Account acc, String grade, Scores scores) {
        // super(name, schedule, date_of_birth, address, phone, age, gender, acc);
        this.grade = grade;
        this.scores = scores;
    }

    public Students() {

    }
   
    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    
    public String showInfor() {
        return "Student {" +
                "ID = '" + acc.getId() + '\'' +
                ", Name = '" + getName() + '\'' +
                ", Age = '" + getAge() + '\'' +
                ", Gender = '" + getGender() + '\'' +
                ", Address = '" + getAddress() + '\'' +
                ", Phone = '" + getPhone() + '\'' +
            '}';
    }

    public void Menu() {
        System.out.println(showInfor());
        while (true) {            
            System.out.println("Enter 1: Show Information");
            System.out.println("Enter 2: Show Schedule");
            System.out.println("Enter 3: Edit Persion");
            System.out.println("Enter 4: Exit");
            Integer line = input.nextInt();
            switch(line) {
                case 1 : {
                    showInfor();
                    break;
                }
                case 2 : {
                    show_Schedule();
                    break;
                }
                case 3 : {
                    edit_Students();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Wrong Input");
                continue;                    
            }
        }
        
    }
}
