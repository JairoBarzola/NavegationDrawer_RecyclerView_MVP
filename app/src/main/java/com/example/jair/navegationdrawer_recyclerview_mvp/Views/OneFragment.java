package com.example.jair.navegationdrawer_recyclerview_mvp.Views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentPresenter;
import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentView;
import com.example.jair.navegationdrawer_recyclerview_mvp.POJO.Actividad;
import com.example.jair.navegationdrawer_recyclerview_mvp.Presenters.OneFragmentPresenterImpl;
import com.example.jair.navegationdrawer_recyclerview_mvp.R;

import com.example.jair.navegationdrawer_recyclerview_mvp.Adapters.*;

public class OneFragment extends Fragment implements OneFragmentView {


    RecyclerView recyclerView;
    RecyclerAdapter adapter;
     private OneFragmentPresenter presenter;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        presenter = new OneFragmentPresenterImpl(this);
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        adapter = new RecyclerAdapter(getContext(),R.layout.item_fo);
        recyclerView.setAdapter(adapter);
        presenter.loadListPerson();
        return rootView;
    }


    @Override
    public void initRecycler(List<Actividad> actividadList) {
        adapter.setListActividad(actividadList);

    }
}
