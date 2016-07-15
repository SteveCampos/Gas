package energigas.app.systemstrategy.energigas.sqlite.db.caja;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import energigas.app.systemstrategy.energigas.entidades.Establecimiento;
import energigas.app.systemstrategy.energigas.entidades.Pedido;
import energigas.app.systemstrategy.energigas.sqlite.db.Helper;

/**
 * Created by Kelvin on 06/07/2016.
 */

public class DBPedidos {

    public static final String _id = "_id";
    public static final String PeId = "PeId";
    public static final String Serie = "Serie";
    public static final String Numero = "Numero";
    public static final String TipoId = "TipoId";
    public static final String PrioridadId = "PrioridadId";
    public static final String ClienteId = "ClienteId";
    public static final String FechaPedido = "FechaPedido";
    public static final String FechaEntrega = "FechaEntrega";
    public static final String FechaEntregaProgramada = "FechaEntregaProgramada";
    public static final String EstadoId = "EstadoId";
    public static final String Total = "Total";
    public static final String Consolidado = "Consolidado";
    public static final String UsuarioAccion = "UsuarioAccion";
    public static final String FechaAccion = "FechaAccion";
    public static final String EstablecimientoId = "EstablecimientoId";
    public static final String DireccionEntrega = "DireccionEntrega";
    public static final String FechaRealEntrega = "FechaRealEntrega";
    public static final String UsuarioEntrega = "UsuarioEntrega";
    public static final String BaseImponible = "BaseImponible";
    public static final String IGV = "IGV";
    public static final String ModalidadCreditoId = "ModalidadCreditoId";
    public static final String VeId = "VeId";
    public static final String Scop = "Scop";
    public static final String HoraInicio = "HoraInicio";
    public static final String HoraFin = "HoraFin";
    public static final String HoraEntrega = "HoraEntrega";
    public static final String Horario = "Horario";
    public static final String VehiculoId = "VehiculoId";
    public static final String MotivoCancelado = "MotivoCancelado";
    public static final String MotivoRevertido = "MotivoRevertido";
    public static final String FechaAsignacionVehiculo = "FechaAsignacionVehiculo";
    public static final String UsuarioAsignacionVehiculo = "UsuarioAsignacionVehiculo";
    public static final String HoraLlegada = "HoraLlegada";
    public static final String HoraSalida = "HoraSalida";
    public static final String Inclusion = "Inclusion";
    public static final String ComprobanteVenta = "ComprobanteVenta";
    public static final String GuiaRemision = "GuiaRemision";
    public static final String HoraProgramada = "HoraProgramada";
    public static final String AgenteId = "AgenteId";


    public static final String TABLA_PEDIDOS = "PEDIDOS";

    private Helper helper;
    private SQLiteDatabase myDb;
    private final Context mCtx;

    public static final String CREATE_TABLE_PEDIDOS =
            "create table if not exists " + TABLA_PEDIDOS + " ("
                    + _id + " integer primary key autoincrement,"
                    + PeId + " text,"
                    + Serie + " text,"
                    + Numero + " text,"
                    + TipoId + " text,"
                    + PrioridadId + " text,"
                    + ClienteId + " text,"
                    + FechaPedido + " text,"
                    + FechaEntrega + " text,"
                    + FechaEntregaProgramada + " text,"
                    + EstadoId + " text,"
                    + Total + " text,"
                    + Consolidado + " text,"
                    + UsuarioAccion + " text,"
                    + FechaAccion + " text,"
                    + EstablecimientoId + " text,"
                    + DireccionEntrega + " text,"
                    + FechaRealEntrega + " text,"
                    + UsuarioEntrega + " text,"
                    + BaseImponible + " text,"
                    + IGV + " text,"
                    + ModalidadCreditoId + " text,"
                    + VeId + " text,"
                    + Scop + " text,"
                    + HoraInicio + " text,"
                    + HoraFin + " text,"
                    + HoraEntrega + " text,"
                    + Horario + " text,"
                    + VehiculoId + " text,"
                    + MotivoCancelado + " text,"
                    + MotivoRevertido + " text,"
                    + FechaAsignacionVehiculo + " text,"
                    + UsuarioAsignacionVehiculo + " text,"
                    + HoraLlegada + " text,"
                    + HoraSalida + " text,"
                    + Inclusion + " text,"
                    + ComprobanteVenta + " text,"
                    + GuiaRemision + " text,"
                    + HoraProgramada + " text,"
                    + AgenteId + " text "
                    + ");";


    public static final String DELETE_TABLE_PEDIDOS = "DROP TABLE IF EXISTS " + TABLA_PEDIDOS;

    public DBPedidos(Context ctx) {
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

    public long crearPedido(Pedido pedido) {

        ContentValues initialValues = new ContentValues();
        initialValues.put(PeId, pedido.getPeId());
        initialValues.put(Serie, pedido.getSerie());
        initialValues.put(Numero, pedido.getNumero());
        initialValues.put(TipoId, pedido.getTipoId());
        initialValues.put(PrioridadId, pedido.getPrioridadId());
        initialValues.put(ClienteId, pedido.getClienteId());
        initialValues.put(FechaPedido, pedido.getFechaPedido());
        initialValues.put(FechaEntrega, pedido.getFechaEntrega());
        initialValues.put(FechaEntregaProgramada, pedido.getFechaEntregaProgramada());
        initialValues.put(EstadoId, pedido.getEstadoId());
        initialValues.put(Total, pedido.getTotal());
        initialValues.put(Consolidado, pedido.getConsolidado());
        initialValues.put(UsuarioAccion, pedido.getUsuarioAccion());
        initialValues.put(FechaAccion, pedido.getFechaAccion());
        initialValues.put(EstablecimientoId, pedido.getEstablecimientoId());
        initialValues.put(DireccionEntrega, pedido.getDireccionEntrega());
        initialValues.put(FechaRealEntrega, pedido.getFechaRealEntrega());
        initialValues.put(UsuarioEntrega, pedido.getUsuarioEntrega());
        initialValues.put(BaseImponible, pedido.getBaseImponible());
        initialValues.put(IGV, pedido.getIGV());
        initialValues.put(ModalidadCreditoId, pedido.getModalidadCreditoId());
        initialValues.put(VeId, pedido.getVeId());
        initialValues.put(Scop, pedido.getScop());
        initialValues.put(HoraInicio, pedido.getHoraInicio());
        initialValues.put(HoraFin, pedido.getHoraFin());
        initialValues.put(HoraEntrega, pedido.getHoraEntrega());
        initialValues.put(Horario, pedido.getHorario());
        initialValues.put(VehiculoId, pedido.getVehiculoId());
        initialValues.put(MotivoCancelado, pedido.getMotivoCancelado());
        initialValues.put(MotivoRevertido, pedido.getMotivoRevertido());
        initialValues.put(FechaAsignacionVehiculo, pedido.getFechaAsignacionVehiculo());
        initialValues.put(UsuarioAsignacionVehiculo, pedido.getUsuarioAsignacionVehiculo());
        initialValues.put(HoraLlegada, pedido.getHoraLlegada());
        initialValues.put(HoraSalida, pedido.getHoraSalida());
        initialValues.put(Inclusion, pedido.getInclusion());
        initialValues.put(ComprobanteVenta, pedido.getComprobanteVenta());
        initialValues.put(GuiaRemision, pedido.getGuiaRemision());
        initialValues.put(HoraProgramada, pedido.getHoraProgramada());
        initialValues.put(AgenteId, pedido.getAgenteId());

        return myDb.insert(TABLA_PEDIDOS, null, initialValues);
    }



}
