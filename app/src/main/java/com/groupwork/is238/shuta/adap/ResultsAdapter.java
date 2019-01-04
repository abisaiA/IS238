package com.groupwork.is238.shuta.adap;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.groupwork.is238.shuta.R;

import java.util.List;

public class ResultsAdapter extends RecyclerView.Adapter<MyHolder> {
    private List<MyResults> results;
    private Context context;

    public ResultsAdapter(List<MyResults> results, Context context) {
        this.results = results;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_results,
                viewGroup, false);
        return new MyHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.getGradeTextView().setText(results.get(i).getGrade());
        myHolder.getMarksTextView().setText(results.get(i).getMarks());
        myHolder.getPositionTextView().setText(results.get(i).getPosition());
        myHolder.getSubjectTextView().setText(results.get(i).getSubject());

        Log.e("TAG*****", String.valueOf(results.size()));
    }

    @Override
    public int getItemCount() {
        return results.size();
    }
}
