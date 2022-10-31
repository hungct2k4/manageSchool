package School;
public class Teachers extends Persons{
    public String subject;
    
    public Teachers(String name, String id, String date_of_birth, String address, String phone, int age,
            String gender, String subject) {
        super(name, id, date_of_birth, address, phone, age, gender);
        this.subject = subject;
    }

    public Teachers( ) {

    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String showInfor() {
        return "Teacher {" +
                "Name = '" + getName() + '\'' +
                ", Age = '" + getAge() + '\'' +
                ", Gender = '" + getGender() + '\'' +
                ", Address = '" + getAddress() + '\'' +
                ", Phone = '" + getPhone() + '\'' +
                ", Score = '" + getSubject() + '\'' +
                '}';
    }
    
}
