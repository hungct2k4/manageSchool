package School;
import Admin.*;

import java.util.*;
import java.util.Map.Entry;

public class Manages {
    Scanner scanner;

    public Hashtable<String, Students> _ManageStudent;
    Hashtable<String, Teachers> _ManageTeacher;


    public Manages(Hashtable<String, Students> _ManageStudent, Hashtable<String, Teachers> _ManageTeachers) {
        this._ManageStudent = _ManageStudent;
        this._ManageTeacher = _ManageTeachers;
    }
    
    public void addStudent(Students _students) {
        _students.scores = new Scores();
        this._ManageStudent.put(_students.getId(), _students);
    }

    public void AddScoreForStudents(String id, Scores gpa) {
        _ManageStudent.get(id).scores = gpa;
    }

    public void addTeacher(Teachers teacher) {
        if (!this._ManageTeacher.containsKey(teacher.getId()))
            this._ManageTeacher.put(teacher.getId(), teacher);
    }

    public void ShowScoreGrade (String grade) {
        Set<String> keySet = _ManageStudent.keySet();

        sortStudentsbyGPA();
        for (String key : keySet) {
            if (_ManageStudent.containsKey(key))
            System.out.println(_ManageStudent.get(key).scores.ShowScore());
        }      
    }
    

    public void ShowAllStudents() {
        sortStudentsbyGPA();
        Set<String> keySet = _ManageStudent.keySet();

        for (String key : keySet) {
            if (_ManageStudent.containsKey(key))
            System.out.println(_ManageStudent.get(key).showInfor());
        }
    }

    public void sortStudentsbyNameABC() {
        Set<Entry<String, Students>> entry = _ManageStudent.entrySet();
        ArrayList<Entry<String, Students>> list = new ArrayList<>(entry);

        Collections.sort(list, new Comparator<Entry<String, Students>>() {

            @Override
            public int compare(Entry<String, Students> o1, Entry<String, Students> o2) {
                return o1.getValue().getName().charAt(0) - (o2.getValue().getName().charAt(0));
            }
            
        });
    }

    public void sortStudentsbyName() {
        Set<Entry<String, Students>> entry = _ManageStudent.entrySet();
        ArrayList<Entry<String, Students >> list = new ArrayList<>(entry);

        Collections.sort(list, new Comparator<Entry<String, Students>>() {

            @Override
            public int compare(Entry<String, Students> o1, Entry<String, Students> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }        
        });
    }

    public void sortStudentsbyGPA() { 
        
        Set<Entry<String, Students>> entry = _ManageStudent.entrySet();
        ArrayList<Entry<String, Students >> list = new ArrayList<>(entry);

        Collections.sort(list, new Comparator<Entry<String, Students>>() {

            @Override
            public int compare(Entry<String, Students> o1, Entry<String, Students> o2) {
                if (o1.getValue().scores.getAverageofscore() == o2.getValue().scores.getAverageofscore())
                    return o1.getValue().getName().charAt(0) - o2.getValue().getName().charAt(0);
                
                return (o1.getValue().scores.getAverageofscore() > o2.getValue().scores.getAverageofscore()) ? 1 : -1;
            }  
        });
    }

    

    public void EditScoreOfStudents(String id, String subject, Double newscore) {
        subject = subject.toUpperCase();
        if (subject.equals("MATHS")) {
            _ManageStudent.get(id).scores.setMath(newscore);
        }
        if (subject.equals("ENGLISH")) {
            _ManageStudent.get(id).scores.setEnglish(newscore);
        }
        if (subject.equals("PHYSICS")) {
            _ManageStudent.get(id).scores.setPhysics(newscore);
        }
        if (subject.equals("MUSIC")) {
            _ManageStudent.get(id).scores.setMusic(newscore);
        }
        if (subject.equals("SCIENCES")) {
            _ManageStudent.get(id).scores.setSciences(newscore);
        }
    }

    public void sortTeacherbyName() {
        Set<Entry<String, Teachers>> entry = _ManageTeacher.entrySet();
        ArrayList<Entry<String, Teachers >> list = new ArrayList<>(entry);

        Collections.sort(list, new Comparator<Entry<String, Teachers>>() {

            @Override
            public int compare(Entry<String, Teachers> o1, Entry<String, Teachers> o2) {
                return o1.getValue().getName().charAt(0) - o2.getValue().getName().charAt(0);
            }        
        });
    }
    

    
    public void FindHighScore() {
        Double MAX = 0.0;
        String _key = "";

        Set<String> keySet = _ManageStudent.keySet();

        for (String key : keySet) {
            if (_ManageStudent.get(key).scores.averageofscore > MAX) {
                MAX = _ManageStudent.get(key).scores.averageofscore;
                _key = key;
            }
        }
        System.out.println(_ManageStudent.get(_key).showInfor());
    }

    public void FindStudentById(String id) {
        System.out.println(_ManageStudent.get(id).showInfor());
    }

    
    public void FindTeacherById(String id) {
        System.out.println(_ManageTeacher.get(id).showInfor());
    }
                 
    public void ShowAllofTeachers() {
        Set<String> keySet = _ManageTeacher.keySet();
        
        for (String key : keySet) {
            if (_ManageTeacher.containsKey(key))
                System.out.println(_ManageTeacher.get(key).showInfor());
        }
    }
    public void CheckExistObject(String key) {
        if (_ManageStudent.containsKey(key))
            System.out.println("Enter again");

    }
    public void CheckExistStudents() {
        if (_ManageStudent.size() == 0)
            System.out.println("Empty");
    }
    public void CheckExistStudents(String id) {
        if (_ManageStudent.containsKey(id))
            System.out.println("Empty");
    }
    public void CheckExistTeachers() {
        if (_ManageTeacher.size() == 0)
            System.out.println("Empty");
    }
}
