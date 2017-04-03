package com.example.jair.navegationdrawer_recyclerview_mvp.Interactors;

import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentInteractor;
import com.example.jair.navegationdrawer_recyclerview_mvp.Interfaces.OneFragmentPresenter;
import com.example.jair.navegationdrawer_recyclerview_mvp.POJO.Actividad;
import com.example.jair.navegationdrawer_recyclerview_mvp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 02/04/2017.
 */

public class OneFragmentInteractorImpl implements OneFragmentInteractor {

    private OneFragmentPresenter presenter;

    public OneFragmentInteractorImpl ( OneFragmentPresenter presenter){
        this.presenter= presenter;
    }
    @Override
    public void initRecycler() {

        List<Actividad> actividadList = new ArrayList<>();
        actividadList.add(new Actividad("Jugado al futbol","1 mes","24 dias",R.drawable.foto4,R.color.actividad1));
        actividadList.add(new Actividad("Ido a una discoteca","1 mes","27 dias",R.drawable.foto3,R.color.actividad2));
        actividadList.add(new Actividad("Ido al gimnasio","4 meses","26 dias",R.drawable.foto2,R.color.actividad3));
        actividadList.add(new Actividad("Salido de viaje","8 meses","13 dias",R.drawable.foto1,R.color.actividad4));
        actividadList.add(new Actividad("Jugado al futbol","1 mes","24 dias",R.drawable.foto4,R.color.actividad1));
        actividadList.add(new Actividad("Ido a una discoteca","5 meses","27 dias",R.drawable.foto3,R.color.actividad2));
        actividadList.add(new Actividad("Ido al gimnasio","6 meses","26 dias",R.drawable.foto2,R.color.actividad3));
        actividadList.add(new Actividad("Salido de viaje","9 meses","13 dias",R.drawable.foto1,R.color.actividad4));
        presenter.initRecycler(actividadList);

    }
}
