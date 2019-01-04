package com.groupwork.is238.shuta.frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.groupwork.is238.shuta.R;
import com.groupwork.is238.shuta.adap.ResultsAdapter;
import com.groupwork.is238.shuta.adap.MyResults;

import java.util.ArrayList;
import java.util.List;

public class ResultsFragment extends Fragment {

    private RecyclerView recyclerView;

    private List<MyResults> results = new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        results.add(new MyResults("Mathematics", "95", "A", "1/123"));
        results.add(new MyResults("Physics", "76", "B", "5/123"));
        results.add(new MyResults("Chemistry", "50", "C", "50/123"));
        results.add(new MyResults("Geography", "95", "A", "1/123"));
        results.add(new MyResults("Civics", "95", "A", "7/123"));
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.results_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        recyclerView = view.findViewById(R.id.recycleViewResults);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new ResultsAdapter(results, view.getContext()));
    }
}
