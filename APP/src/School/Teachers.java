package School;
public class Teachers extends Persons{
    public String subject;
    
    public Teachers( ) {

    }
    
    public Teachers(String id, String name, String address, 
        String phone, int age, String gender, String subject) {
        super(id, name, address, phone, age, gender);
        this.subject = subject;
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
