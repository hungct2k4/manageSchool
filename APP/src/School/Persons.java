package School;

import java.util.ArrayList;
import java.util.Scanner;

import Calendars.Schedule;
import Edit.Manage_Edit;
import LoginAndRegister.Account;

public abstract class Persons {
   
    public String name;
    public Schedule schedule;

    public String date_of_birth;
    public String address;
    public String phone;
    public int age;
    public String gender;
    public Account acc;

    public Scanner input = new Scanner(System.in);

    

    public Persons(String name, Schedule schedule, String date_of_birth, String address, String phone,
            int age, String gender, Account acc) {
        this.name = name;
        this.schedule = schedule;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.acc = acc;
    }

    public Persons() {
        this.name = "";
        this.date_of_birth = "";
        this.address = "";
        this.phone = "";
        this.age = 0;
        this.gender = "";
        this.acc = new Account();

    }



    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public abstract String showInfor();

    public void show_Schedule() {
        schedule.ShowSchedule();
    } 

    public ArrayList<Manage_Edit> edit_Students() {
        
        ArrayList<Manage_Edit> edit = new ArrayList<Manage_Edit>();
        Manage_Edit infor ;
        
        while (true) {
            System.out.println("Enter 1 : Edit name");
            System.out.println("Enter 2 : Edit number phone");
            System.out.println("Enter 3 : Edit address");
            System.out.println("Enter 4 : Exit");

            int line = input.nextInt();
            switch (line) {
                case 1 : {
                    infor = new Manage_Edit();
                    System.out.println("New name:");
                    String newname = input.nextLine();
                    infor.setType(line);
                    infor.setNewinfor(newname);
                    edit.add(infor);
                    break;
                }
                case 2 : {
                    infor = new Manage_Edit();
                    System.out.println("New number phone:");
                    String number = input.nextLine();
                    infor.setType(line);
                    infor.setNewinfor(number);
                    edit.add(infor);
                    break;
                }
                case 3 : {
                    infor = new Manage_Edit();
                    System.out.println("New Address:");
                    String address = input.nextLine();
                    infor.setType(line);
                    infor.setNewinfor(address);
                    edit.add(infor);
                    break;
                }
                case 4 : {
                    return edit;
                }
                    default:
                    System.out.println("Wrong Input");
                    break;
            }
            break;
        }
        return edit;
    }   

}