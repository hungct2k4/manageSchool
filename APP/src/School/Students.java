package School;
import Admin.*;

public class Students extends Persons{

    public String grade;
    public Scores scores;
    
    

    public Students(String name, String id, String date_of_birth, String address, String phone, int age, String gender,
            String grade, Scores scores) {
        super(name, id, date_of_birth, address, phone, age, gender);
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
                "ID = '" + getId() + '\'' +
                ", Name = '" + getName() + '\'' +
                ", Age = '" + getAge() + '\'' +
                ", Gender = '" + getGender() + '\'' +
                ", Address = '" + getAddress() + '\'' +
                ", Phone = '" + getPhone() + '\'' +
                ", Score = '" + scores.getAverageofscore() + '\'' +
            '}';
    }
}
