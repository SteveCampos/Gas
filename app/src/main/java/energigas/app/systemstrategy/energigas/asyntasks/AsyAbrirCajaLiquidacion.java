package energigas.app.systemstrategy.energigas.asyntasks;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;


import java.util.List;

import energigas.app.systemstrategy.energigas.R;
import energigas.app.systemstrategy.energigas.apiRest.RestAPI;
import energigas.app.systemstrategy.energigas.entidades.CajaLiquidacion;
import energigas.app.systemstrategy.energigas.entidades.Establecimiento;
import energigas.app.systemstrategy.energigas.sqlite.db.caja.DBEstablecimientos;
import energigas.app.systemstrategy.energigas.sqlite.db.caja.DBCajaLiquidacion;
import energigas.app.systemstrategy.energigas.utils.Utils;

/**
 * Created by Kelvin on 14/07/2016.
 */

public class AsyAbrirCajaLiquidacion extends AsyncTask<CajaLiquidacion, Void, Void> {

    private ProgressDialog progressDialog;
    private Activity activity;
    private FloatingActionButton actionButton;
    private DBCajaLiquidacion dbCajaLiquidacion;
    private DBEstablecimientos dbEstablecimientos;
    private List<Establecimiento> listEstablec;
    private RestAPI restAPI;
    private boolean insertAllIsSuccess;


    private static final String TAG = AsyAbrirCajaLiquidacion.class.getSimpleName();

    public AsyAbrirCajaLiquidacion(Activity activity, FloatingActionButton actionButton) {
        this.activity = activity;
        this.actionButton = actionButton;
        dbCajaLiquidacion = new DBCajaLiquidacion(activity);
        dbEstablecimientos = new DBEstablecimientos(activity);
        dbCajaLiquidacion.open();
        dbEstablecimientos.open();

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createDialog();
    }

    @Override
    protected Void doInBackground(CajaLiquidacion... params) {

        //Guardar idLiquidacion.
       /* CajaLiquidacion cajaLiquidacion = null;
        long estadoInserto = dbCajaLiquidacion.createCajaLiquidacion(cajaLiquidacion);
        Log.d(TAG," inserto caja liquidacion: "+estadoInserto);*/
        //Guardar data en las tablas de instancia.
        //Guardar Establecimientos.
        /*List<Establecimiento> listEstablecimientos = null;
        for (Establecimiento establecimiento : listEstablecimientos) {
            long insert = dbEstablecimientos.crearEstablecimiento(establecimiento);
            Log.d(TAG, " inseto establecimeinto: " + insert);
        }*/
        try {
            restAPI = new RestAPI();
            ObjectMapper mapper = new ObjectMapper();
            JSONObject objectEstaObject = restAPI.flst_ObtenerEstablecimientos(1);
            listEstablec = mapper.readValue(Utils.getListObject(objectEstaObject).toString(), new TypeReference<List<Establecimiento>>() {});
            Log.d(TAG, " PERSONA: " + listEstablec.get(0).getEstVDescripcion());
            insertAllIsSuccess = dbEstablecimientos.crearEstablecimientos(listEstablec);

        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, " ESTABLEC: ERROR: " + e.getMessage());
        }


        return null;
    }


    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        dismissDialog();


    }

    private void createDialog() {

        progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle(R.string.main_dialog_title);
        progressDialog.setMessage(activity.getString(R.string.main_dialog_message_loanding));
        progressDialog.setIndeterminate(true);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setCancelable(false);
        progressDialog.show();

    }

    private void dismissDialog() {

        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            actionButton.setVisibility(View.GONE);
        }

        if(insertAllIsSuccess){
            Toast.makeText(activity, "Importancion exitosa", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(activity, "Ocurrio un error", Toast.LENGTH_SHORT).show();
        }

    }
}
