public class Conversion {
    private double cantidad;
    private String monedaLocal;
    private String monedaDestino;
    private double convertido;


public Conversion(double cantidad, String monedaLocal, String monedaDestino, double convertido) {
    this.cantidad = cantidad;
    this.monedaLocal = monedaLocal;
    this.monedaDestino = monedaDestino;
    this.convertido = convertido;
   }

    public String getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(String monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getConvertido() {
        return convertido;
    }

    public void setConvertido(double convertido) {
        this.convertido = convertido;
    }

    @Override
    public String toString() {
        return "Rsultado: " + cantidad + monedaLocal + "a" + monedaDestino + "son: " +convertido;
    }
}


