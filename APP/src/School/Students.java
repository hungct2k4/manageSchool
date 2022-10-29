package School;
import Admin.*;

public class Students extends Persons{

    public String grade;
    public Scores scores;
    
    

    public Students() {

    }
    
    public Students(String id, String name, String address, String phone, 
            int age, String gender, String grade, Scores score) {
        super(id, name, address, phone, age, gender);
        this.grade = grade;
        this.scores = score;
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
