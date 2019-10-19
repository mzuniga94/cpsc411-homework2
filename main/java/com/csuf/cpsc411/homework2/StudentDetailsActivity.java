package com.csuf.cpsc411.homework2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.csuf.cpsc411.homework2.model.Student;
import com.csuf.cpsc411.homework2.model.StudentDB;

public class StudentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        int studentIndex = getIntent().getIntExtra("StudentIndex",0);
        TextView tv = findViewById(R.id.display_string_id);

        String origStr = (String) tv.getText();
        tv.setText(origStr + studentIndex);
        tv.setTextSize(24);

        Student sObj = StudentDB.getInstance().getStudentList().get(studentIndex);
    }
}
