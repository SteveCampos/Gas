package energigas.app.systemstrategy.energigas.sqlite.db.caja;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import energigas.app.systemstrategy.energigas.entidades.Establecimiento;
import energigas.app.systemstrategy.energigas.sqlite.db.Helper;

/**
 * Created by Kelvin on 06/07/2016.
 */

public class DBEstablecimientos {
    public static final String _id = "_id";
    public static final String EstIEstablecimientoId = "_es_IdEstablecimiento";
    public static final String EstVCodigo = "_es_Codigo";
    public static final String EstVDescripcion = "_es_VDescripcion";
    public static final String EstIClienteId = "_es_IClienteId";
    public static final String UbId = "_es_UbId";
    public static final String EstICategoriaId = "_es_ICategoriaId";
    public static final String EstICanalId = "_es__ICanalId";
    public static final String EstVTelefono = "_es_VTelefono";
    public static final String EstVCelular = "_es_VCelular";
    public static final String EstIUsuarioCreacion = "_es_IUsuarioCreacion";
    public static final String EstDTFechaCreacion = "_es_DTFechaCreacion";
    public static final String EstIUsuarioActualizacion = "_es_IUsuarioActualizacion";
    public static final String EstDTFechaActualizacion = "_es_DTFechaActualizacion";
    public static final String EstIEstadoId = "_es_IEstadoId";
    public static final String EstIUsuarioAprobacion = "_es_IUsuarioAprobacion";
    public static final String EstDTFechaAprobacion = "_es_DTFechaAprobacion";
    public static final String EstVObservacion = "_es_VObservacion";
    public static final String EstVKeyFireBase = "_es_VKeyFireBase";
    public static final String EstVContacto = "_es_VContacto";

    public static final String TABLA_ESTABLECIMIENTOS = "ESTABLECIMIENTOS";

    private Helper helper;
    private SQLiteDatabase myDb;
    private final Context mCtx;

    public static final String CREATE_TABLE_ESTABLECIMIENTOS =
            "create table if not exists " + TABLA_ESTABLECIMIENTOS + " ("
                    + _id + " integer primary key autoincrement,"
                    + EstIEstablecimientoId + " text,"
                    + EstVCodigo + " text,"
                    + EstVDescripcion + " text,"
                    + EstIClienteId + " text,"
                    + UbId + " text,"
                    + EstICategoriaId + " text,"
                    + EstICanalId + " text,"
                    + EstVTelefono + " text,"
                    + EstVCelular + " text,"
                    + EstIUsuarioCreacion + " text,"
                    + EstDTFechaCreacion + " text,"
                    + EstIUsuarioActualizacion + " text,"
                    + EstDTFechaActualizacion + " text,"
                    + EstIEstadoId + " text,"
                    + EstIUsuarioAprobacion + " text,"
                    + EstDTFechaAprobacion + " text,"
                    + EstVObservacion + " text,"
                    + EstVKeyFireBase + " text,"
                    + EstVContacto + " text"
                    + ");";


    public static final String DELETE_TABLE_ESTABLECIMIENTOS = "DROP TABLE IF EXISTS " + TABLA_ESTABLECIMIENTOS;

    public DBEstablecimientos(Context ctx) {
        this.mCtx = ctx;
    }

    public void open() {
        helper = new Helper(mCtx);
        myDb = helper.getWritableDatabase();
    }

    public void close() {
        if (helper != null) {
            helper.close();
        }
    }


    public boolean crearEstablecimientos(List<Establecimiento> establecimientos) {
        boolean estado = true;

        for (Establecimiento establecimiento : establecimientos) {

            ContentValues initialValues = new ContentValues();
            initialValues.put(EstIEstablecimientoId, establecimiento.getEstIEstablecimientoId());
            initialValues.put(EstVCodigo, establecimiento.getEstVCodigo());
            initialValues.put(EstVDescripcion, establecimiento.getEstVDescripcion());
            initialValues.put(EstIClienteId, establecimiento.getEstIClienteId());
            initialValues.put(UbId, establecimiento.getUbId());
            initialValues.put(EstICategoriaId, establecimiento.getEstICategoriaId());
            initialValues.put(EstICanalId, establecimiento.getEstICanalId());
            initialValues.put(EstVTelefono, establecimiento.getEstVTelefono());
            initialValues.put(EstVCelular, establecimiento.getEstVCelular());
            initialValues.put(EstIUsuarioCreacion, establecimiento.getEstIUsuarioCreacion());
            initialValues.put(EstIUsuarioActualizacion, establecimiento.getEstIUsuarioActualizacion());
            initialValues.put(EstDTFechaActualizacion, establecimiento.getEstDTFechaActualizacion());
            initialValues.put(EstIEstadoId, establecimiento.getEstIEstadoId());
            initialValues.put(EstIUsuarioAprobacion, establecimiento.getEstIUsuarioAprobacion());
            initialValues.put(EstVObservacion, establecimiento.getEstVObservacion());
            initialValues.put(EstVKeyFireBase, establecimiento.getEstVKeyFireBase());
            initialValues.put(EstVContacto, establecimiento.getEstVContacto());
            long inserto = myDb.insert(TABLA_ESTABLECIMIENTOS, null, initialValues);
            if (inserto < 0) {
                estado = false;
            }
        }
        return estado;
    }

    public long crearEstablecimiento(Establecimiento establecimiento) {

        ContentValues initialValues = new ContentValues();
        initialValues.put(EstIEstablecimientoId, establecimiento.getEstIEstablecimientoId());
        initialValues.put(EstVCodigo, establecimiento.getEstVCodigo());
        initialValues.put(EstVDescripcion, establecimiento.getEstVDescripcion());
        initialValues.put(EstIClienteId, establecimiento.getEstIClienteId());
        initialValues.put(UbId, establecimiento.getUbId());
        initialValues.put(EstICategoriaId, establecimiento.getEstICategoriaId());
        initialValues.put(EstICanalId, establecimiento.getEstICanalId());
        initialValues.put(EstVTelefono, establecimiento.getEstVTelefono());
        initialValues.put(EstVCelular, establecimiento.getEstVCelular());
        initialValues.put(EstIUsuarioCreacion, establecimiento.getEstIUsuarioCreacion());
        initialValues.put(EstIUsuarioActualizacion, establecimiento.getEstIUsuarioActualizacion());
        initialValues.put(EstDTFechaActualizacion, establecimiento.getEstDTFechaActualizacion());
        initialValues.put(EstIEstadoId, establecimiento.getEstIEstadoId());
        initialValues.put(EstIUsuarioAprobacion, establecimiento.getEstIUsuarioAprobacion());
        initialValues.put(EstVObservacion, establecimiento.getEstVObservacion());
        initialValues.put(EstVKeyFireBase, establecimiento.getEstVKeyFireBase());
        initialValues.put(EstVContacto, establecimiento.getEstVContacto());
        return myDb.insert(TABLA_ESTABLECIMIENTOS, null, initialValues);
    }


    public int actualizarEstablecimiento(Establecimiento establecimiento) {

        ContentValues initialValues = new ContentValues();

        initialValues.put(EstVCodigo, establecimiento.getEstVCodigo());
        initialValues.put(EstVDescripcion, establecimiento.getEstVDescripcion());
        initialValues.put(EstIClienteId, establecimiento.getEstIClienteId());
        initialValues.put(UbId, establecimiento.getUbId());
        initialValues.put(EstICategoriaId, establecimiento.getEstICategoriaId());
        initialValues.put(EstICanalId, establecimiento.getEstICanalId());
        initialValues.put(EstVTelefono, establecimiento.getEstVTelefono());
        initialValues.put(EstVCelular, establecimiento.getEstVCelular());
        initialValues.put(EstIUsuarioCreacion, establecimiento.getEstIUsuarioCreacion());
        initialValues.put(EstIUsuarioActualizacion, establecimiento.getEstIUsuarioActualizacion());
        initialValues.put(EstDTFechaActualizacion, establecimiento.getEstDTFechaActualizacion());
        initialValues.put(EstIEstadoId, establecimiento.getEstIEstadoId());
        initialValues.put(EstIUsuarioAprobacion, establecimiento.getEstIUsuarioAprobacion());
        initialValues.put(EstVObservacion, establecimiento.getEstVObservacion());
        initialValues.put(EstVKeyFireBase, establecimiento.getEstVKeyFireBase());
        initialValues.put(EstVContacto, establecimiento.getEstVContacto());
        return myDb.update(TABLA_ESTABLECIMIENTOS, initialValues,
                EstIEstablecimientoId + "=?", new String[]{establecimiento.getEstIEstablecimientoId() + ""});
    }

    public List<Establecimiento> getEstablecimientos() {
        List<Establecimiento> establecimientoArrayList = new ArrayList<Establecimiento>();
        Cursor cr = myDb.rawQuery(" select * from " + TABLA_ESTABLECIMIENTOS + " ;", null);
        while (cr.moveToNext()) {

            Establecimiento item = new Establecimiento();
            establecimientoArrayList.add(item);
        }
        return establecimientoArrayList;
    }


}
