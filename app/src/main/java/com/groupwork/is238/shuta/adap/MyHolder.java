package com.groupwork.is238.shuta.adap;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.groupwork.is238.shuta.R;

class MyHolder extends RecyclerView.ViewHolder {
    private TextView subjectTextView, marksTextView, gradeTextView, positionTextView;

    MyHolder(@NonNull View itemView) {
        super(itemView);
        subjectTextView = itemView.findViewById(R.id.subjectTextView);
        marksTextView = itemView.findViewById(R.id.marksTextView);
        gradeTextView = itemView.findViewById(R.id.gradeTextView);
        positionTextView = itemView.findViewById(R.id.positionTextView);
    }


    public TextView getSubjectTextView() {
        return subjectTextView;
    }

    public TextView getMarksTextView() {
        return marksTextView;
    }

    public TextView getGradeTextView() {
        return gradeTextView;
    }

    public TextView getPositionTextView() {
        return positionTextView;
    }
}
