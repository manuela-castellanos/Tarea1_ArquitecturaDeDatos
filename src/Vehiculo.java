public class Vehiculo {

    protected int numero_llantas;
    protected int numero_puestos;
    protected String marca;
    protected String tipo_transporte;

    public Vehiculo() {
    }

    public Vehiculo(int numero_llantas, int numero_puestos, String marca, String tipo_transporte) {
        this.numero_llantas = numero_llantas;
        this.numero_puestos = numero_puestos;
        this.marca = marca;
        this.tipo_transporte = tipo_transporte;
    }

    public int getNumero_llantas() {
        return numero_llantas;
    }

    public void setNumero_llantas(int numero_llantas) {
        this.numero_llantas = numero_llantas;
    }

    public int getNumero_puestos() {
        return numero_puestos;
    }

    public void setNumero_puestos(int numero_puestos) {
        this.numero_puestos = numero_puestos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    @Override
    public String toString() {
        return "Vehiculo {" +
                "numero_llantas = " + numero_llantas +
                ", numero_puestos = " + numero_puestos +
                ", marca = '" + marca + '\'' +
                ", tipo_transporte = '" + tipo_transporte + '\'' +
                '}';
    }
}
