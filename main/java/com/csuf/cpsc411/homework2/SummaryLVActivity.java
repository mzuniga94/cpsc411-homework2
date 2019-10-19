package com.csuf.cpsc411.homework2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.csuf.cpsc411.homework2.adapter.SummaryListAdapter;
import com.csuf.cpsc411.homework2.model.CourseEnrollment;
import com.csuf.cpsc411.homework2.model.Student;
import com.csuf.cpsc411.homework2.model.StudentDB;

import java.util.ArrayList;

public class SummaryLVActivity extends Activity {

    protected ListView mSummaryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.summary_list_lv);

        createPersonsObjects();
        mSummaryView = findViewById(R.id.summary_list_id);
        SummaryListAdapter ad = new SummaryListAdapter();
        mSummaryView.setAdapter(ad);
    }

    protected void createPersonsObjects() {
        Student student = new Student("Jane","Doe", 12345);
        ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("CPSC 120", "A+"));
        courses.add(new CourseEnrollment("CPSC 121", "A"));
        courses.add(new CourseEnrollment("CPSC 131", "A"));
        student.setStudentEnrollment(courses);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);

        // Creating object for a new student
        student = new Student("Ted", "Talk", 67890);
        courses = new ArrayList<CourseEnrollment>();
        courses.add(new CourseEnrollment("ART 300", "A-"));
        courses.add(new CourseEnrollment("ART 311", "A"));
        courses.add(new CourseEnrollment("ART 312", "A"));
        student.setStudentEnrollment(courses);
        students.add(student);

        StudentDB.getInstance().setStudentList(students);
    }
}
