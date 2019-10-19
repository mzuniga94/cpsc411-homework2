package com.csuf.cpsc411.homework2.model;

public class CourseEnrollment {

    // Protected members.
    protected String mCourseID;
    protected String mGrade;

    // Constructor
    public CourseEnrollment(String argCourseID, String argGrade) {
        mCourseID = argCourseID;
        mGrade = argGrade;
    }

    public String getCourseID() {
        return mCourseID;
    }

    public void setCourseID(String courseID) {
        mCourseID = courseID;
    }

    public String getGrade() {
        return mGrade;
    }

    public void setGrade(String grade) {
        mGrade = grade;
    }
}
