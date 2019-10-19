package com.csuf.cpsc411.homework2.model;

import java.util.ArrayList;

public class Student {

    // Constructor
    public Student(String argFirstName, String argLastName, int argCWID) {
        mFirstName = argFirstName;
        mLastName = argLastName;
        mCWID = argCWID;
    }

    /* PROTECTED MEMBERS */
    protected String mFirstName;
    protected String mLastName;
    protected int mCWID;

    // List of course enrollment.
    protected ArrayList<CourseEnrollment> mStudentEnrollment;

    /* ACCESSORS */
    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public int getCWID() {
        return mCWID;
    }

    /* MUTATORS */
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public void setCWID(int CWID) {
        mCWID = CWID;
    }

    public ArrayList<CourseEnrollment> getStudentEnrollment() {
        return mStudentEnrollment;
    }

    public void setStudentEnrollment(ArrayList<CourseEnrollment> studentEnrollment) {
        mStudentEnrollment = studentEnrollment;
    }
}
