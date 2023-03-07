public class Bicicleta extends Vehiculo{

    protected String modelo;
    protected String accesorios;
    protected String tamaño;
    protected String tipo_bicicleta;
    protected int numer_tarjetaPropiedad;

    public Bicicleta() {
    }

    public Bicicleta(int numero_llantas, int numero_puestos, String marca, String tipo_transporte, String modelo, String accesorios, String tamaño, String tipo_bicicleta, int numer_tarjetaPropiedad) {
        super(numero_llantas, numero_puestos, marca, tipo_transporte);
        this.modelo = modelo;
        this.accesorios = accesorios;
        this.tamaño = tamaño;
        this.tipo_bicicleta = tipo_bicicleta;
        this.numer_tarjetaPropiedad = numer_tarjetaPropiedad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo_bicicleta() {
        return tipo_bicicleta;
    }

    public void setTipo_bicicleta(String tipo_bicicleta) {
        this.tipo_bicicleta = tipo_bicicleta;
    }

    public int getNumer_tarjetaPropiedad() {
        return numer_tarjetaPropiedad;
    }

    public void setNumer_tarjetaPropiedad(int numer_tarjetaPropiedad) {
        this.numer_tarjetaPropiedad = numer_tarjetaPropiedad;
    }

    @Override
    public String toString() {
        return super.toString() + " - Bicicleta {" +
                "modelo = '" + modelo + '\'' +
                ", accesorios = '" + accesorios + '\'' +
                ", tamaño = '" + tamaño + '\'' +
                ", tipo_bicicleta = '" + tipo_bicicleta + '\'' +
                ", numer_tarjetaPropiedad = " + numer_tarjetaPropiedad +
                '}';
    }
}
