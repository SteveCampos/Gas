package energigas.app.systemstrategy.energigas.entidades;

/**
 * Created by Kelvin on 14/07/2016.
 */

public class Pedido {


    private int PeId;
    private String Serie;
    private String Numero;
    private int TipoId;
    private int PrioridadId;
    private int ClienteId;
    private String FechaPedido;
    private String FechaEntrega;
    private String FechaEntregaProgramada;
    private int EstadoId;
    private double Total;
    private String Consolidado;
    private int UsuarioAccion;
    private String FechaAccion;
    private int EstablecimientoId;
    private String DireccionEntrega;
    private String FechaRealEntrega;
    private int UsuarioEntrega;
    private double BaseImponible;
    private double IGV;
    private int ModalidadCreditoId;
    private int VeId;
    private String Scop;
    private String HoraInicio;
    private String HoraFin;
    private String HoraEntrega;
    private String Horario;
    private int VehiculoId;
    private String MotivoCancelado;
    private String MotivoRevertido;
    private String FechaAsignacionVehiculo;
    private int UsuarioAsignacionVehiculo;
    private String HoraLlegada;
    private String HoraSalida;
    private String Inclusion;
    private String ComprobanteVenta;
    private String GuiaRemision;
    private String HoraProgramada;
    private int AgenteId;


    public Pedido() {
    }


    public Pedido(int peId, String serie, String numero, int tipoId, int prioridadId, int clienteId, String fechaPedido, String fechaEntrega, String fechaEntregaProgramada, int estadoId, double total, String consolidado, int usuarioAccion, String fechaAccion, int establecimientoId, String direccionEntrega, String fechaRealEntrega, int usuarioEntrega, double baseImponible, double IGV, int modalidadCreditoId, int veId, String scop, String horaInicio, String horaFin, String horaEntrega, String horario, int vehiculoId, String motivoCancelado, String motivoRevertido, String fechaAsignacionVehiculo, int usuarioAsignacionVehiculo, String horaLlegada, String horaSalida, String inclusion, String comprobanteVenta, String guiaRemision, String horaProgramada, int agenteId) {
        PeId = peId;
        Serie = serie;
        Numero = numero;
        TipoId = tipoId;
        PrioridadId = prioridadId;
        ClienteId = clienteId;
        FechaPedido = fechaPedido;
        FechaEntrega = fechaEntrega;
        FechaEntregaProgramada = fechaEntregaProgramada;
        EstadoId = estadoId;
        Total = total;
        Consolidado = consolidado;
        UsuarioAccion = usuarioAccion;
        FechaAccion = fechaAccion;
        EstablecimientoId = establecimientoId;
        DireccionEntrega = direccionEntrega;
        FechaRealEntrega = fechaRealEntrega;
        UsuarioEntrega = usuarioEntrega;
        BaseImponible = baseImponible;
        this.IGV = IGV;
        ModalidadCreditoId = modalidadCreditoId;
        VeId = veId;
        Scop = scop;
        HoraInicio = horaInicio;
        HoraFin = horaFin;
        HoraEntrega = horaEntrega;
        Horario = horario;
        VehiculoId = vehiculoId;
        MotivoCancelado = motivoCancelado;
        MotivoRevertido = motivoRevertido;
        FechaAsignacionVehiculo = fechaAsignacionVehiculo;
        UsuarioAsignacionVehiculo = usuarioAsignacionVehiculo;
        HoraLlegada = horaLlegada;
        HoraSalida = horaSalida;
        Inclusion = inclusion;
        ComprobanteVenta = comprobanteVenta;
        GuiaRemision = guiaRemision;
        HoraProgramada = horaProgramada;
        AgenteId = agenteId;
    }


    public int getPeId() {
        return PeId;
    }

    public void setPeId(int peId) {
        PeId = peId;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public int getTipoId() {
        return TipoId;
    }

    public void setTipoId(int tipoId) {
        TipoId = tipoId;
    }

    public int getPrioridadId() {
        return PrioridadId;
    }

    public void setPrioridadId(int prioridadId) {
        PrioridadId = prioridadId;
    }

    public int getClienteId() {
        return ClienteId;
    }

    public void setClienteId(int clienteId) {
        ClienteId = clienteId;
    }

    public String getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        FechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }

    public String getFechaEntregaProgramada() {
        return FechaEntregaProgramada;
    }

    public void setFechaEntregaProgramada(String fechaEntregaProgramada) {
        FechaEntregaProgramada = fechaEntregaProgramada;
    }

    public int getEstadoId() {
        return EstadoId;
    }

    public void setEstadoId(int estadoId) {
        EstadoId = estadoId;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public String getConsolidado() {
        return Consolidado;
    }

    public void setConsolidado(String consolidado) {
        Consolidado = consolidado;
    }

    public int getUsuarioAccion() {
        return UsuarioAccion;
    }

    public void setUsuarioAccion(int usuarioAccion) {
        UsuarioAccion = usuarioAccion;
    }

    public String getFechaAccion() {
        return FechaAccion;
    }

    public void setFechaAccion(String fechaAccion) {
        FechaAccion = fechaAccion;
    }

    public int getEstablecimientoId() {
        return EstablecimientoId;
    }

    public void setEstablecimientoId(int establecimientoId) {
        EstablecimientoId = establecimientoId;
    }

    public String getDireccionEntrega() {
        return DireccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        DireccionEntrega = direccionEntrega;
    }

    public String getFechaRealEntrega() {
        return FechaRealEntrega;
    }

    public void setFechaRealEntrega(String fechaRealEntrega) {
        FechaRealEntrega = fechaRealEntrega;
    }

    public int getUsuarioEntrega() {
        return UsuarioEntrega;
    }

    public void setUsuarioEntrega(int usuarioEntrega) {
        UsuarioEntrega = usuarioEntrega;
    }

    public double getBaseImponible() {
        return BaseImponible;
    }

    public void setBaseImponible(double baseImponible) {
        BaseImponible = baseImponible;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public int getModalidadCreditoId() {
        return ModalidadCreditoId;
    }

    public void setModalidadCreditoId(int modalidadCreditoId) {
        ModalidadCreditoId = modalidadCreditoId;
    }

    public int getVeId() {
        return VeId;
    }

    public void setVeId(int veId) {
        VeId = veId;
    }

    public String getScop() {
        return Scop;
    }

    public void setScop(String scop) {
        Scop = scop;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String horaInicio) {
        HoraInicio = horaInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }

    public String getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        HoraEntrega = horaEntrega;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public int getVehiculoId() {
        return VehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        VehiculoId = vehiculoId;
    }

    public String getMotivoCancelado() {
        return MotivoCancelado;
    }

    public void setMotivoCancelado(String motivoCancelado) {
        MotivoCancelado = motivoCancelado;
    }

    public String getMotivoRevertido() {
        return MotivoRevertido;
    }

    public void setMotivoRevertido(String motivoRevertido) {
        MotivoRevertido = motivoRevertido;
    }

    public String getFechaAsignacionVehiculo() {
        return FechaAsignacionVehiculo;
    }

    public void setFechaAsignacionVehiculo(String fechaAsignacionVehiculo) {
        FechaAsignacionVehiculo = fechaAsignacionVehiculo;
    }

    public int getUsuarioAsignacionVehiculo() {
        return UsuarioAsignacionVehiculo;
    }

    public void setUsuarioAsignacionVehiculo(int usuarioAsignacionVehiculo) {
        UsuarioAsignacionVehiculo = usuarioAsignacionVehiculo;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        HoraLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String horaSalida) {
        HoraSalida = horaSalida;
    }

    public String getInclusion() {
        return Inclusion;
    }

    public void setInclusion(String inclusion) {
        Inclusion = inclusion;
    }

    public String getComprobanteVenta() {
        return ComprobanteVenta;
    }

    public void setComprobanteVenta(String comprobanteVenta) {
        ComprobanteVenta = comprobanteVenta;
    }

    public String getGuiaRemision() {
        return GuiaRemision;
    }

    public void setGuiaRemision(String guiaRemision) {
        GuiaRemision = guiaRemision;
    }

    public String getHoraProgramada() {
        return HoraProgramada;
    }

    public void setHoraProgramada(String horaProgramada) {
        HoraProgramada = horaProgramada;
    }

    public int getAgenteId() {
        return AgenteId;
    }

    public void setAgenteId(int agenteId) {
        AgenteId = agenteId;
    }
}
