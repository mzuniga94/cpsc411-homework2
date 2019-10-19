package com.csuf.cpsc411.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

// Import Student model
import com.csuf.cpsc411.homework2.model.CourseEnrollment;
import com.csuf.cpsc411.homework2.model.Student;
import com.csuf.cpsc411.homework2.model.StudentDB;

public class MainActivity extends AppCompatActivity {

    LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        createStudentObjects();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);

        root = findViewById(R.id.student_list);

        ArrayList<Student> studentList = StudentDB.getInstance().getStudentList();

        for(int i = 0; i < studentList.size(); ++i) {
            Student s = studentList.get(i);

            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, root, false);

            ((TextView) row_view.findViewById(R.id.first_name)).setText(s.getFirstName());
            ((TextView) row_view.findViewById(R.id.last_name)).setText(s.getLastName());
            ((TextView) row_view.findViewById(R.id.cwid)).setText(s.getCWID());
            root.addView(row_view);
        }
    }

    protected void createStudentObjects() {
        // Creating object for new student
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
