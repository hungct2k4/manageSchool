package Calendars;


public class Time_Subject {

    public Subjects subject;
    public Time time;

    public Time_Subject() {
        this.subject = new Subjects();
        this.time = new Time();
    }

    public Subjects getSubject() {
        return subject;
    }
    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    
}
