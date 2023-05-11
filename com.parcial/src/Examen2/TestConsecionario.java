package Examen2;

public class TestConsecionario {
    public static void main(String[] args) {

        Consecionario auto1 = new Consecionario();
        auto1.idConsec = 132;
        auto1.nombreConsec = "Tito";
        auto1.marca = "Volswagen";
        auto1.modelo = "Gol";
        auto1.stockAuto = 439;

        Consecionario auto2 = new Consecionario();
        auto2.idConsec = 2222;
        auto2.nombreConsec = "Manolito";
        auto2.marca = "Fiat";
        auto2.modelo = "Palio";
        auto2.stockAuto = 324;

        Consecionario auto3 = new Consecionario();
        auto3.idConsec = 3482;
        auto3.nombreConsec = "El pueblo";
        auto3.marca = "Renault";
        auto3.modelo = "Logan";
        auto3.stockAuto = 333;

        Consecionario auto4 = new Consecionario();
        auto4.idConsec = 2223;
        auto4.nombreConsec = "Paris";
        auto4.marca = "BMW";
        auto4.modelo = "M5";
        auto4.stockAuto = 3334;

        Consecionario auto5 = new Consecionario();
        auto5.idConsec = 23123;
        auto5.nombreConsec = "Maela";
        auto5.marca = "Honda";
        auto5.modelo = "Civic";
        auto5.stockAuto = 345;

        auto1.mostrarAuto();
        auto2.mostrarAuto();
        auto3.mostrarAuto();
        auto4.mostrarAuto();
        auto5.mostrarAuto();

        int sum;
        int resta = 4;
        int div = 12;

        sum = auto1.stockAuto + auto2.stockAuto + auto3.stockAuto+
                auto4.stockAuto + auto5.stockAuto;

        System.out.println("\nLa suma de todos los stocks es " + sum);

        sum = sum - resta;
        System.out.println("\nLa suma - 4 es " + sum);

        sum = sum / div;
        System.out.println("\nLa suma / 12 es " + sum);

    }
}
