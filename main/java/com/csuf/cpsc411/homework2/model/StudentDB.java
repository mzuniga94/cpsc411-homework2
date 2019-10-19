package com.csuf.cpsc411.homework2.model;

import com.csuf.cpsc411.homework2.model.*;

import java.util.ArrayList;

public class StudentDB {
    // Create Singleton for Student database.
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mStudentList;

    static public StudentDB getInstance(){
        return ourInstance;
    }

    public ArrayList<Student> getStudentList() {
        return mStudentList;
    }

    public void setStudentList(ArrayList<Student> argStudentList) {
        mStudentList = argStudentList;
    }
}
