package School;

import Calendars.Schedule;
import LoginAndRegister.Account;

public class Teachers extends Persons {

    public Teachers(String name, Schedule schedule, String date_of_birth, String address, String phone, int age,
            String gender, Account acc) {
        super(name, schedule, date_of_birth, address, phone, age, gender, acc);
    }

    public Teachers() {
    }

    @Override
    public String showInfor() {
        return "Teacher {" +
                "Name = '" + getName() + '\'' +
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
