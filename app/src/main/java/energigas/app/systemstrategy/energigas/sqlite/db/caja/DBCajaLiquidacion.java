package energigas.app.systemstrategy.energigas.sqlite.db.caja;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import energigas.app.systemstrategy.energigas.entidades.CajaLiquidacion;
import energigas.app.systemstrategy.energigas.sqlite.db.Helper;

/**
 * Created by Kelvin on 14/07/2016.
 */

public class DBCajaLiquidacion {

    public static final String _id = "_id";
    public static final String idRemotoLiquidacion = "idRemotoLiquidacion";
    public static final String kmInicial = "kmInicial";
    public static final String kmFinal = "kmFinal";
    public static final String pesoInicial = "pesoInicial";
    public static final String pesoFinal = "pesoFinal";
    public static final String porcentajeInicial = "porcentajeInicial";
    public static final String porcentajeFinal = "porcentajeFinal";
    public static final String usuarioId = "usuarioId";
    public static final String agenteId = "agenteId";
    public static final String latitudInicial = "latitudInicial";
    public static final String longitudInicial = "longitudInicial";
    public static final String latitudFinal = "latitudFinal";
    public static final String longitudFinal= "longitudFinal";
    public static final String fecha= "fechaHora";
    public static final String tiempo= "tiempo";

    public static final String TABLA_CAJA_LIQUIDACION="CAJA_LIQUIDACION";

    private Helper helper;
    private SQLiteDatabase myDb;
    private final Context mCtx;

    public static final String CREATE_CAJA_LIQUIDACION=
            "create table if not exists "+TABLA_CAJA_LIQUIDACION+" ("
                    +_id+" integer primary key autoincrement,"
                    +idRemotoLiquidacion+" text,"
                    +kmInicial+ " text,"
                    +kmFinal+" text,"
                    +pesoInicial+" text,"
                    +pesoFinal+" text,"
                    +porcentajeInicial+" text,"
                    +porcentajeFinal+" text,"
                    +usuarioId+" text,"
                    +agenteId+" text,"
                    +latitudInicial+" text,"
                    +longitudInicial+" text,"
                    +latitudFinal+" text,"
                    +longitudFinal+" text,"
                    +fecha+" text,"
                    +tiempo+" text"
                    +");";

    public static final String DELETE_TABLE_LIQUIDACION_CAJA="DROP TABLE IF EXISTS " + TABLA_CAJA_LIQUIDACION;
    public DBCajaLiquidacion(Context ctx){
        this.mCtx = ctx;
    }


    public void open()  {
        helper = new Helper (mCtx);
        myDb = helper.getWritableDatabase();
    }
    public void close(){
        if(helper!=null){
            helper.close();
        }
    }

    public long createCajaLiquidacion(CajaLiquidacion cajaLiquidacion){

        ContentValues initialValues = new ContentValues();
        initialValues.put(idRemotoLiquidacion,cajaLiquidacion.getIdRemotoLiquidacion());
        initialValues.put(kmInicial,cajaLiquidacion.getKmInicial());
        initialValues.put(kmFinal,cajaLiquidacion.getKmFinal());
        initialValues.put(pesoInicial,cajaLiquidacion.getPesoInicial());
        initialValues.put(pesoFinal,cajaLiquidacion.getPesoFinal());
        initialValues.put(porcentajeInicial,cajaLiquidacion.getPorcentajeInicial());
        initialValues.put(porcentajeFinal,cajaLiquidacion.getPorcentajeFinal());
        initialValues.put(usuarioId,cajaLiquidacion.getPorcentajeFinal());
        initialValues.put(agenteId,cajaLiquidacion.getAgenteId());
        initialValues.put(latitudInicial,cajaLiquidacion.getLatitudInicial());
        initialValues.put(longitudInicial,cajaLiquidacion.getLongitudInicial());
        initialValues.put(latitudFinal,cajaLiquidacion.getLatitudFinal());
        initialValues.put(longitudFinal,cajaLiquidacion.getLongitudFinal());
        initialValues.put(fecha,cajaLiquidacion.getFecha());
        initialValues.put(tiempo,cajaLiquidacion.getTiempo());

        return myDb.insert(TABLA_CAJA_LIQUIDACION, null, initialValues);
    }

}
