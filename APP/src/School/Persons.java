package School;

public abstract class Persons {
    public String name;
    public String id;
    public String date_of_birth;
    public String address;
    public String phone;
    public int age;
    public String gender;


    public Persons(String name, String id, String date_of_birth, String address, String phone, int age, String gender) {
        this.name = name;
        this.id = id;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }


    public Persons() {

    }
    
   
    public abstract String showInfor();


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
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
}