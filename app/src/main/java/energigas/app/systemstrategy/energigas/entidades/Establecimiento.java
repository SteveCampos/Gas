package energigas.app.systemstrategy.energigas.entidades;

/**
 * Created by Kelvin on 06/07/2016.
 */

public class Establecimiento {
    private int EstIEstablecimientoId;
    private String EstVCodigo;
    private String EstVDescripcion;
    private int EstIClienteId;
    private int UbId;
    private int EstICategoriaId;
    private int EstICanalId;
    private String EstVTelefono;
    private String EstVCelular;
    private String EstIUsuarioCreacion;
    private String EstDTFechaCreacion;
    private String EstIUsuarioActualizacion;
    private String EstDTFechaActualizacion;
    private int EstIEstadoId;
    private String EstIUsuarioAprobacion;
    private String EstDTFechaAprobacion;
    private String EstVObservacion;
    private String EstVKeyFireBase;
    private String EstVContacto;

    public Establecimiento() {
    }

    public Establecimiento(int estIEstablecimientoId, String estVCodigo, String estVDescripcion, int estIClienteId, int ubId, int estICategoriaId, int estICanalId, String estVTelefono, String estVCelular, String estIUsuarioCreacion, String estDTFechaCreacion, String estIUsuarioActualizacion, String estDTFechaActualizacion, int estIEstadoId, String estIUsuarioAprobacion, String estDTFechaAprobacion, String estVObservacion, String estVKeyFireBase, String estVContacto) {
        EstIEstablecimientoId = estIEstablecimientoId;
        EstVCodigo = estVCodigo;
        EstVDescripcion = estVDescripcion;
        EstIClienteId = estIClienteId;
        UbId = ubId;
        EstICategoriaId = estICategoriaId;
        EstICanalId = estICanalId;
        EstVTelefono = estVTelefono;
        EstVCelular = estVCelular;
        EstIUsuarioCreacion = estIUsuarioCreacion;
        EstDTFechaCreacion = estDTFechaCreacion;
        EstIUsuarioActualizacion = estIUsuarioActualizacion;
        EstDTFechaActualizacion = estDTFechaActualizacion;
        EstIEstadoId = estIEstadoId;
        EstIUsuarioAprobacion = estIUsuarioAprobacion;
        EstDTFechaAprobacion = estDTFechaAprobacion;
        EstVObservacion = estVObservacion;
        EstVKeyFireBase = estVKeyFireBase;
        EstVContacto = estVContacto;
    }

    public int getEstIEstablecimientoId() {
        return EstIEstablecimientoId;
    }

    public void setEstIEstablecimientoId(int estIEstablecimientoId) {
        EstIEstablecimientoId = estIEstablecimientoId;
    }

    public String getEstVCodigo() {
        return EstVCodigo;
    }

    public void setEstVCodigo(String estVCodigo) {
        EstVCodigo = estVCodigo;
    }

    public String getEstVDescripcion() {
        return EstVDescripcion;
    }

    public void setEstVDescripcion(String estVDescripcion) {
        EstVDescripcion = estVDescripcion;
    }

    public int getEstIClienteId() {
        return EstIClienteId;
    }

    public void setEstIClienteId(int estIClienteId) {
        EstIClienteId = estIClienteId;
    }

    public int getUbId() {
        return UbId;
    }

    public void setUbId(int ubId) {
        UbId = ubId;
    }

    public int getEstICategoriaId() {
        return EstICategoriaId;
    }

    public void setEstICategoriaId(int estICategoriaId) {
        EstICategoriaId = estICategoriaId;
    }

    public int getEstICanalId() {
        return EstICanalId;
    }

    public void setEstICanalId(int estICanalId) {
        EstICanalId = estICanalId;
    }

    public String getEstVTelefono() {
        return EstVTelefono;
    }

    public void setEstVTelefono(String estVTelefono) {
        EstVTelefono = estVTelefono;
    }

    public String getEstVCelular() {
        return EstVCelular;
    }

    public void setEstVCelular(String estVCelular) {
        EstVCelular = estVCelular;
    }

    public String getEstIUsuarioCreacion() {
        return EstIUsuarioCreacion;
    }

    public void setEstIUsuarioCreacion(String estIUsuarioCreacion) {
        EstIUsuarioCreacion = estIUsuarioCreacion;
    }

    public String getEstDTFechaCreacion() {
        return EstDTFechaCreacion;
    }

    public void setEstDTFechaCreacion(String estDTFechaCreacion) {
        EstDTFechaCreacion = estDTFechaCreacion;
    }

    public String getEstIUsuarioActualizacion() {
        return EstIUsuarioActualizacion;
    }

    public void setEstIUsuarioActualizacion(String estIUsuarioActualizacion) {
        EstIUsuarioActualizacion = estIUsuarioActualizacion;
    }

    public String getEstDTFechaActualizacion() {
        return EstDTFechaActualizacion;
    }

    public void setEstDTFechaActualizacion(String estDTFechaActualizacion) {
        EstDTFechaActualizacion = estDTFechaActualizacion;
    }

    public int getEstIEstadoId() {
        return EstIEstadoId;
    }

    public void setEstIEstadoId(int estIEstadoId) {
        EstIEstadoId = estIEstadoId;
    }

    public String getEstIUsuarioAprobacion() {
        return EstIUsuarioAprobacion;
    }

    public void setEstIUsuarioAprobacion(String estIUsuarioAprobacion) {
        EstIUsuarioAprobacion = estIUsuarioAprobacion;
    }

    public String getEstDTFechaAprobacion() {
        return EstDTFechaAprobacion;
    }

    public void setEstDTFechaAprobacion(String estDTFechaAprobacion) {
        EstDTFechaAprobacion = estDTFechaAprobacion;
    }

    public String getEstVObservacion() {
        return EstVObservacion;
    }

    public void setEstVObservacion(String estVObservacion) {
        EstVObservacion = estVObservacion;
    }

    public String getEstVKeyFireBase() {
        return EstVKeyFireBase;
    }

    public void setEstVKeyFireBase(String estVKeyFireBase) {
        EstVKeyFireBase = estVKeyFireBase;
    }

    public String getEstVContacto() {
        return EstVContacto;
    }

    public void setEstVContacto(String estVContacto) {
        EstVContacto = estVContacto;
    }
}
