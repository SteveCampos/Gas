package energigas.app.systemstrategy.energigas.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;
import energigas.app.systemstrategy.energigas.R;

/**
 * Created by Kelvin on 12/07/2016.
 */

public class FGastos extends Fragment {
    View rootView;
     int si = 0;



   @BindView(R.id.textNumber)  TextView textView;


    public  FGastos (int e){
       // FGastos gastos = new FGastos();
        this.si=e;
       // return  gastos;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gastos, container, false);
        ButterKnife.bind(this,rootView);
        //textView = (TextView) rootView.findViewById(R.id.textNumber);
        textView.setText(si+"");
        return rootView;
    }

}
