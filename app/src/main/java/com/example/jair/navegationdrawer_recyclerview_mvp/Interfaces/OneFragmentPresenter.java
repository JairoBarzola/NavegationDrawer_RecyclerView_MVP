package com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces;

import com.example.jair.navegationdrawer_recyclerview_mvp.POJO.Actividad;

import java.util.List;

/**
 * Created by Brian on 02/04/2017.
 */

public interface OneFragmentPresenter {

    void initRecycler(List<Actividad> actividadList);
    void loadListPerson();


}
