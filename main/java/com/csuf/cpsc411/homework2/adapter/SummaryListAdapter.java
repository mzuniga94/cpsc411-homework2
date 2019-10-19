package com.csuf.cpsc411.homework2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.BaseAdapter;

import com.csuf.cpsc411.homework2.R;
import com.csuf.cpsc411.homework2.model.Student;
import com.csuf.cpsc411.homework2.model.StudentDB;

public class SummaryListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return StudentDB.getInstance().getStudentList().size();
    }

    @Override
    public Object getItem(int i) {
        return StudentDB.getInstance().getStudentList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row_view;

        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.student_row, viewGroup, false);
        } else row_view = view;

        Student s = StudentDB.getInstance().getStudentList().get(i);

        ((TextView) row_view.findViewById(R.id.first_name)).setText(s.getFirstName());
        ((TextView) row_view.findViewById(R.id.last_name)).setText(s.getLastName());
        ((TextView) row_view.findViewById(R.id.cwid)).setText(s.getCWID());

        return row_view;
    }
}
