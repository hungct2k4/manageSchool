package Calendars;

import java.util.ArrayList;

public class Schedule {
    public ArrayList<Days> week;

    
    public Schedule(ArrayList<Days> week) {
        this.week = week;
    }

    public Schedule() {
        week = new ArrayList<Days>(8);    
    }

    public ArrayList<Days> getWeek() {
        return week;
    }

    public void setWeek(ArrayList<Days> week) {
        this.week = week;
    }

    public void ShowSchedule() {
        int k = 2;
        for (Days o : week) {
            System.out.print(k + " ");
            for (Time_Subject o1 : o.arrDays) {
                System.out.println(o1);
            }
            k++;
        }
    }
}
