package energigas.app.systemstrategy.energigas.sqlite.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import energigas.app.systemstrategy.energigas.entidades.Establecimiento;

/**
 * Created by Kelvin on 06/07/2016.
 */

public class DBEstablecimientos {

    public static final String EstIEstablecimientoId="EstIEstablecimientoId";
    public static final String EstVCodigo="EstVCodigo";
    public static final String EstVDescripcion="EstVDescripcion";
    public static final String EstIClienteId="EstIClienteId";
    public static final String UbId="UbId";
    public static final String EstICategoriaId="EstICategoriaId";
    public static final String EstICanalId="EstICanalId";
    public static final String EstVTelefono="EstVTelefono";
    public static final String EstVCelular="EstVCelular";
    public static final String EstIUsuarioCreacion="EstIUsuarioCreacion";
    public static final String EstDTFechaCreacion="EstDTFechaCreacion";
    public static final String EstIUsuarioActualizacion="EstIUsuarioActualizacion";
    public static final String EstDTFechaActualizacion="EstDTFechaActualizacion";
    public static final String EstIEstadoId="EstIEstadoId";
    public static final String EstIUsuarioAprobacion="EstIUsuarioAprobacion";
    public static final String EstDTFechaAprobacion="EstDTFechaAprobacion";
    public static final String EstVObservacion="EstVObservacion";
    public static final String EstVKeyFireBase="EstVKeyFireBase";
    public static final String EstVContacto="EstVContacto";

    public static final String TABLA_ESTABLECIMIENTOS="ESTABLECIMIENTOS";

    private Helper helper;
    private SQLiteDatabase myDb;
    private final Context mCtx;

    public static final String CREATE_TABLE_ESTABLECIMIENTOS=
            "create table if not exists "+TABLA_ESTABLECIMIENTOS+" ("
                    +EstIEstablecimientoId+" integer primary key,"
                    +EstVCodigo+" text,"
                    +EstVDescripcion+ " text,"
                    +EstIClienteId+" text,"
                    +UbId+" text,"
                    +EstICategoriaId+" text,"
                    +EstICanalId+" text,"
                    +EstVTelefono+" text,"
                    +EstVCelular+" text,"
                    +EstIUsuarioCreacion+" text,"
                    +EstDTFechaCreacion+" text,"
                    +EstIUsuarioActualizacion+" text,"
                    +EstDTFechaActualizacion+" text,"
                    +EstIEstadoId+" text,"
                    +EstIUsuarioAprobacion+" text,"
                    +EstDTFechaAprobacion+" text,"
                    +EstVObservacion+" text,"
                    +EstVKeyFireBase+" text,"
                    +EstVContacto+" text"
                    +");";


    public static final String DELETE_TABLE_ESTABLECIMIENTOS="DROP TABLE IF EXISTS " + TABLA_ESTABLECIMIENTOS;
    public DBEstablecimientos(Context ctx){
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

    public long crearEstablecimiento(Establecimiento establecimiento){

        ContentValues initialValues = new ContentValues();
        initialValues.put(EstIEstablecimientoId,establecimiento.getEstIEstablecimientoId());
        initialValues.put(EstVCodigo,establecimiento.getEstVCodigo());
        initialValues.put(EstVDescripcion,establecimiento.getEstVDescripcion());
        initialValues.put(EstIClienteId,establecimiento.getEstIClienteId());
        initialValues.put(UbId,establecimiento.getUbId());
        initialValues.put(EstICategoriaId,establecimiento.getEstICategoriaId());
        initialValues.put(EstICanalId,establecimiento.getEstICanalId());
        initialValues.put(EstVTelefono,establecimiento.getEstVTelefono());
        initialValues.put(EstVCelular,establecimiento.getEstVCelular());
        initialValues.put(EstIUsuarioCreacion,establecimiento.getEstIUsuarioCreacion());
        initialValues.put(EstDTFechaCreacion,establecimiento.getEstDTFechaCreacion());
        initialValues.put(EstIUsuarioActualizacion,establecimiento.getEstIUsuarioActualizacion());
        initialValues.put(EstDTFechaActualizacion,establecimiento.getEstDTFechaActualizacion());
        initialValues.put(EstIEstadoId,establecimiento.getEstIEstadoId());
        initialValues.put(EstIUsuarioAprobacion,establecimiento.getEstIUsuarioAprobacion());
        initialValues.put(EstDTFechaAprobacion,establecimiento.getEstDTFechaAprobacion());
        initialValues.put(EstVObservacion,establecimiento.getEstVObservacion());
        initialValues.put(EstVKeyFireBase,establecimiento.getEstVKeyFireBase());
        initialValues.put(EstVContacto,establecimiento.getEstVContacto());
        return myDb.insert(TABLA_ESTABLECIMIENTOS, null, initialValues);
    }


    public int actualizarEstablecimiento(Establecimiento establecimiento){

        ContentValues initialValues = new ContentValues();

        initialValues.put(EstVCodigo,establecimiento.getEstVCodigo());
        initialValues.put(EstVDescripcion,establecimiento.getEstVDescripcion());
        initialValues.put(EstIClienteId,establecimiento.getEstIClienteId());
        initialValues.put(UbId,establecimiento.getUbId());
        initialValues.put(EstICategoriaId,establecimiento.getEstICategoriaId());
        initialValues.put(EstICanalId,establecimiento.getEstICanalId());
        initialValues.put(EstVTelefono,establecimiento.getEstVTelefono());
        initialValues.put(EstVCelular,establecimiento.getEstVCelular());
        initialValues.put(EstIUsuarioCreacion,establecimiento.getEstIUsuarioCreacion());
        initialValues.put(EstDTFechaCreacion,establecimiento.getEstDTFechaCreacion());
        initialValues.put(EstIUsuarioActualizacion,establecimiento.getEstIUsuarioActualizacion());
        initialValues.put(EstDTFechaActualizacion,establecimiento.getEstDTFechaActualizacion());
        initialValues.put(EstIEstadoId,establecimiento.getEstIEstadoId());
        initialValues.put(EstIUsuarioAprobacion,establecimiento.getEstIUsuarioAprobacion());
        initialValues.put(EstDTFechaAprobacion,establecimiento.getEstDTFechaAprobacion());
        initialValues.put(EstVObservacion,establecimiento.getEstVObservacion());
        initialValues.put(EstVKeyFireBase,establecimiento.getEstVKeyFireBase());
        initialValues.put(EstVContacto,establecimiento.getEstVContacto());
        return myDb.update(TABLA_ESTABLECIMIENTOS, initialValues,
                EstIEstablecimientoId+ "=?", new String[]{establecimiento.getEstIEstablecimientoId()+""});
    }

    public List<Establecimiento> getEstablecimientos() {
        List<Establecimiento> establecimientoArrayList = new ArrayList<Establecimiento>();
        Cursor cr = myDb.rawQuery(" select * from "+TABLA_ESTABLECIMIENTOS+" ;", null);
        while (cr.moveToNext()){

            Establecimiento item = new Establecimiento(
                    cr.getInt(cr.getColumnIndexOrThrow(EstIEstablecimientoId)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVCodigo)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVDescripcion)),
                    cr.getInt(cr.getColumnIndexOrThrow(EstIClienteId)),
                    cr.getInt(cr.getColumnIndexOrThrow(UbId)),
                    cr.getInt(cr.getColumnIndexOrThrow(EstICategoriaId)),
                    cr.getInt(cr.getColumnIndexOrThrow(EstICanalId)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVTelefono)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVCelular)),
                    cr.getString(cr.getColumnIndexOrThrow(EstIUsuarioCreacion)),
                    cr.getString(cr.getColumnIndexOrThrow(EstDTFechaCreacion)),
                    cr.getString(cr.getColumnIndexOrThrow(EstIUsuarioActualizacion)),
                    cr.getString(cr.getColumnIndexOrThrow(EstDTFechaActualizacion)),
                    cr.getInt(cr.getColumnIndexOrThrow(EstIEstadoId)),
                    cr.getString(cr.getColumnIndexOrThrow(EstIUsuarioAprobacion)),
                    cr.getString(cr.getColumnIndexOrThrow(EstDTFechaAprobacion)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVObservacion)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVKeyFireBase)),
                    cr.getString(cr.getColumnIndexOrThrow(EstVContacto))
            );
            establecimientoArrayList.add(item);
        }
        return establecimientoArrayList;
    }


}
