package com.example.jair.navegationdrawer_recyclerview_mvp.Presenters;

import com.example.jair.navegationdrawer_recyclerview_mvp.Interactors.OneFragmentInteractorImpl;
import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentInteractor;
import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentPresenter;
import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentView;
import com.example.jair.navegationdrawer_recyclerview_mvp.POJO.Actividad;

import java.util.List;

/**
 * Created by Brian on 02/04/2017.
 */

public class OneFragmentPresenterImpl implements OneFragmentPresenter {
    private OneFragmentView view;
    private OneFragmentInteractor interactor;

    public OneFragmentPresenterImpl(OneFragmentView view){
        this.view=view;
        interactor = new OneFragmentInteractorImpl(this);
    }
    @Override
    public void initRecycler(List<Actividad> actividadList) {
        view.initRecycler(actividadList);
    }

    @Override
    public void loadListPerson() {
        interactor.initRecycler();
    }
}
