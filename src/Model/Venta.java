package Model;

public class Venta {
    private int numeroVenta;
    private String fecha;
    private String cliente;
    private String productosVendidos;

    public Venta(int numeroVenta,String fecha,String cliente,String productosVendidos) {
        this.numeroVenta=numeroVenta;
        this.fecha=fecha;
        this.cliente = cliente;
        this.productosVendidos=productosVendidos;
    }

    public String getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(String productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
