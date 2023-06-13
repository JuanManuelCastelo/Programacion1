package EjProducto;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getter para el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Getter para el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Getter para la cantidad del producto
    public int getCantidad() {
        return cantidad;
    }

    // Método para calcular el valor total del producto
    public double getValorTotal() {
        return precio * cantidad;
    }
}
