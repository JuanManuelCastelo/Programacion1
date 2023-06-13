package EjEmpleado;

public class Empleado {
    private String nombre;
    private double salario;
    private int antiguedad;

    public Empleado(String nombre, double salario, int antiguedad) {
        this.nombre = nombre;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public void aplicarAumento(double porcentajeAumento) {
        salario += salario * porcentajeAumento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
}
