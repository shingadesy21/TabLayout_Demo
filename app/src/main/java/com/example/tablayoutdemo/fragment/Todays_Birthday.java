package com.example.tablayoutdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayoutdemo.R;
import com.example.tablayoutdemo.cardview.CardViewAdapter;
import com.example.tablayoutdemo.cardview.CardViewData;

import java.util.ArrayList;
import java.util.List;

public class Todays_Birthday extends Fragment {
    RecyclerView recyclerView;
    List<CardViewData> card_ViewData_List;
    View view;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.todays_bday,container,false);
        recyclerView=view.findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);


        card_ViewData_List=new ArrayList<>();
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));
        card_ViewData_List.add(new CardViewData("Yogesh","Android Developer"));

        CardViewAdapter adapter=new CardViewAdapter(this,card_ViewData_List);
        recyclerView.setAdapter(adapter);


        return view;
        //return inflater.inflate(R.layout.frgment_home,container,false);
    }
}
