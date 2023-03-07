public class Coche extends Vehiculo{

    protected int numero_puertas;
    protected String color;
    protected String modelo;
    protected String placa;
    protected String tipo_placa;

    public Coche() {
    }

    public Coche(int numero_llantas, int numero_puestos, String marca, String tipo_transporte, int numero_puertas, String color, String modelo, String placa, String tipo_placa) {
        super(numero_llantas, numero_puestos, marca, tipo_transporte);
        this.numero_puertas = numero_puertas;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.tipo_placa = tipo_placa;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_placa() {
        return tipo_placa;
    }

    public void setTipo_placa(String tipo_placa) {
        this.tipo_placa = tipo_placa;
    }

    @Override
    public String toString() {
        return super.toString() + " - Coche {" +
                "numero_puertas = " + numero_puertas +
                ", color = '" + color + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", placa = '" + placa + '\'' +
                ", tipo_placa = '" + tipo_placa + '\'' +
                '}';
    }
}
