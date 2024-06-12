import javax.swing.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaTipoMoneda consulta  = new ConsultaTipoMoneda();
        double cantidad = 0;
        int opcion = 0;


        String menu ="""
                Bienvenido a la casa de Cambio Rodrigo
                Elija la opcion de las conversiones mas frecuentes:
                1.- Bolivianos a dolares
                2.- Bolivianos a euros
                3.- Bolivianos a pesos chilenos
                4.- Euros a bolivianos
                5.- Dolares a bolivianos
                6.- Pesos chilenos a bolivianos
                9.- Salir""";

        String salida = "Gracias por su preferencia";


        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            String monedaLocal = "";
            String monedaDestino = "";

            switch (opcion) {
                case 1:
                    monedaLocal = "BOB";
                    monedaDestino = "USD";
                    System.out.println("Digite el monto que desea convertir: ");
                    cantidad = teclado.nextInt();
                    Moneda moneda =consulta.buscarValorMoneda(monedaLocal, monedaDestino, cantidad);
                    System.out.println(moneda);
                    break;
                case 2:
                    monedaLocal = "BOB";
                    monedaDestino = "EUR";
                    System.out.println("Digite el monto que desea convertir: ");
                    cantidad = teclado.nextInt();
                    Moneda moneda2 =consulta.buscarValorMoneda(monedaLocal, monedaDestino, cantidad);
                    System.out.println(moneda2);
                    break;
                case 3:
                    monedaLocal = "BOB";
                    monedaDestino = "CLP";
                    System.out.println("Digite el monto que desea convertir: ");
                    cantidad = teclado.nextInt();
                    Moneda moneda3 =consulta.buscarValorMoneda(monedaLocal, monedaDestino, cantidad);
                    System.out.println(moneda3);
                    break;
                case 4:
                    monedaLocal = "EUR";
                    monedaDestino = "BOB";
                    System.out.println("Digite el monto que desea convertir: ");
                    cantidad = teclado.nextInt();
                    Moneda moneda4 =consulta.buscarValorMoneda(monedaLocal, monedaDestino, cantidad);
                    System.out.println(moneda4);
                    break;
                case 5:
                    monedaLocal = "USD";
                    monedaDestino = "BOB";
                    System.out.println("Digite el monto que desea convertir: ");
                    cantidad = teclado.nextInt();
                    Moneda moneda5 =consulta.buscarValorMoneda(monedaLocal, monedaDestino, cantidad);
                    System.out.println(moneda5);
                    break;
                case 6:
                    monedaLocal = "CLP";
                    monedaDestino = "BOB";
                    System.out.println("Digite el monto que desea convertir: ");
                    cantidad = teclado.nextInt();
                    Moneda moneda6 =consulta.buscarValorMoneda(monedaLocal, monedaDestino, cantidad);
                    System.out.println(moneda6);
                    break;
                case 9:
                    System.out.println("Gracias por su preferencia");
                default:
                    System.out.println("Opcion invalida");
                    break;



            }
        }

    }
}
