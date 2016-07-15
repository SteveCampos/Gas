package energigas.app.systemstrategy.energigas.entidades;

/**
 * Created by Kelvin on 14/07/2016.
 */

public class CajaLiquidacion {

    private int idRemotoLiquidacion;
    private double kmInicial;
    private double kmFinal;
    private double pesoInicial;
    private double pesoFinal;
    private double porcentajeInicial;
    private double porcentajeFinal;
    private int usuarioId;
    private int agenteId;
    private String latitudInicial;
    private String longitudInicial;
    private String latitudFinal;
    private String longitudFinal;
    private String fecha;
    private long tiempo;


    public CajaLiquidacion() {
    }


    public CajaLiquidacion(int idRemotoLiquidacion, double kmInicial, double kmFinal, double pesoInicial, double pesoFinal, double porcentajeInicial, double porcentajeFinal, int usuarioId, int agenteId, String latitudInicial, String longitudInicial, String latitudFinal, String longitudFinal, String fecha, long tiempo) {
        this.idRemotoLiquidacion = idRemotoLiquidacion;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.porcentajeInicial = porcentajeInicial;
        this.porcentajeFinal = porcentajeFinal;
        this.usuarioId = usuarioId;
        this.agenteId = agenteId;
        this.latitudInicial = latitudInicial;
        this.longitudInicial = longitudInicial;
        this.latitudFinal = latitudFinal;
        this.longitudFinal = longitudFinal;
        this.fecha = fecha;
        this.tiempo = tiempo;
    }

    public int getIdRemotoLiquidacion() {
        return idRemotoLiquidacion;
    }

    public void setIdRemotoLiquidacion(int idRemotoLiquidacion) {
        this.idRemotoLiquidacion = idRemotoLiquidacion;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public double getPorcentajeInicial() {
        return porcentajeInicial;
    }

    public void setPorcentajeInicial(double porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    public double getPorcentajeFinal() {
        return porcentajeFinal;
    }

    public void setPorcentajeFinal(double porcentajeFinal) {
        this.porcentajeFinal = porcentajeFinal;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(int agenteId) {
        this.agenteId = agenteId;
    }

    public String getLatitudInicial() {
        return latitudInicial;
    }

    public void setLatitudInicial(String latitudInicial) {
        this.latitudInicial = latitudInicial;
    }

    public String getLongitudInicial() {
        return longitudInicial;
    }

    public void setLongitudInicial(String longitudInicial) {
        this.longitudInicial = longitudInicial;
    }

    public String getLatitudFinal() {
        return latitudFinal;
    }

    public void setLatitudFinal(String latitudFinal) {
        this.latitudFinal = latitudFinal;
    }

    public String getLongitudFinal() {
        return longitudFinal;
    }

    public void setLongitudFinal(String longitudFinal) {
        this.longitudFinal = longitudFinal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
}
