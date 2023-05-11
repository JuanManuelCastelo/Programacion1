package EjerciciosParcial;

public class TestCamZap {
    public static void main(String[] args) {

        int numero1 = 21; // Estos 2 valores corresponden a definicion de Int
        int numero2 = 10; //
        int suma;
        int resta;
        long division;
        long resto;

        long hexadecimal = 0x40L; //Este valor corresponden a definicion de Long

        float float1 = 366.1416f; // Este valor corresponde a definicion de Float

        char caracter = '@';         // Estos 4 valores corresponden a definicion de Char
        char decimal = 64;           //
        char hexadecimal2 = 0x0040;  //
        char unicode = '\u0040';     //

        String nombre = "Juan Manuel"; // Este valor corresponde a definicion de String

        byte a2 = 1; // Este valor corresponde a la definicion de byte



        suma = numero1 + numero2;
        resta = numero1 - numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("\nLa suma de los numeros es " + suma);
        System.out.println("\nLa resta de los numeros es " + resta);
        System.out.println("\nLa division de los numeros es " + division);
        System.out.println("\nEl resto de los numeros es " + resto);




        System.out.println("\nEl long hexadecimal es " + hexadecimal);

        System.out.println("\nEl numero float es " + float1);

        System.out.println("\nEl caracter char es " + caracter);

        System.out.println("\nEl decimal char es " + decimal);

        System.out.println("\nEl hexadecimal2 char es " + hexadecimal2);

        System.out.println("\nEl unicode char es " + unicode);

        System.out.println("\nLa string es " + nombre);

        System.out.println("\nEl valor asignado al byte es " + a2);

        //***********************************************************************************//

        //Instanciamos la clase en este caso a traves de getter y setter

        Zapato z1 = new Zapato();

        z1.setTalle(40);
        z1.setPrecio(35475.1);
        z1.setNombre("Nike Airforce");

        System.out.println("\nEl nombre de la zapatilla es " + z1.getNombre() + "su talle es " + z1.getTalle() + " y su precio final es " + z1.getPrecio());

        //***********************************************************************************//

        //Instanciamos la clase en este caso a traves de un metodo mostrar dentro de la clase a instaciar y le agregamos 1 variable local

        Camisa c1 = new Camisa();

        c1.talle = 35;
        c1.precio = 36981.33434;
        c1.modelo = "Manga corta";

        c1.mostrarCamisa();

        //***********************************************************************************//

        //Prueba de modificadores and or - incremento y decremento

        if ((numero1 != 10) & (numero2 > 20)) {

            System.out.println("\nEs verdadero porque las expresiones los son");
            System.out.println("\nDe paso le agregamos 1 a numero 1 y le restamos 1 a numero2 " + numero1++ + numero2--);
        } else {
            System.out.println("\nEs falso porque alguna de las expresiones los son");
            System.out.println("\nDe paso le agregamos 1 a numero 1 y le restamos 1 a numero2 " + ++numero1 + " " +  --numero2);
        }


        if ((numero1 != 10) || (numero2 > 20)) {

            System.out.println("\nEs verdadero porque alguna de las expresiones lo es");
        } else {
            System.out.println("\nEs falso porque las expresiones los son");
        }

        //***********************************************************************************//

        // De paso dejo un casteo que es lo ultimo que vimos!! //

        String valor = "956.123333";
        double a;
        a = Double.parseDouble(valor);

        System.out.println("\nLa cadena ya casteada y convertida en double es la siguiente " + a);


        // Y ahora lo casteamos nuevamente para hacer una suma //
        int suma2;
        int p;
        p = (int) a;

        suma2 = suma + p;

        System.out.println("\nY ahora ya casteada hacemos la suma con la variable suma antes definida " + suma2);


    }
    }

