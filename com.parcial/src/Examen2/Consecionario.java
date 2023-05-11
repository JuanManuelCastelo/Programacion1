package Examen2;

public class Consecionario {
    public int idConsec;
    public String nombreConsec;
    public String marca;
    public String modelo;
    public int stockAuto;


    public void mostrarAuto() {

        System.out.println("\nEl id de la consecionaria es " + idConsec);
        System.out.println("\nEl nombre del consecionario es " + nombreConsec);
        System.out.println("\nLa marca del auto es " + marca);
        System.out.println("\nEl modelo del auto es " + modelo);
        System.out.println("\nEl stock del auto es " + stockAuto);
    }
}
