package aplicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import negocio.*;

public class Principal {

    public static void main(String[] args) {
        Storage storage = new Storage();

        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while (option != 3) {
            System.out.println("Menú:");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Salir");
            System.out.print("Elija una opción (1,2,3): ");

            option = (int) askForNumber(scanner);
            System.out.println("");

            switch (option) {
                case 1:
                    System.out.println("Ingrese los datos del producto:");
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Precio: ");
                    double price = askForNumber(scanner);
                    System.out.print("Cantidad: ");
                    int quantity = (int) askForNumber(scanner);

                    Product newProduct = new Product(name, price, quantity);
                    storage.addProduct(newProduct);
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 2:
                    if (storage.getProducts().isEmpty()) {
                        System.out.println("No hay productos para mostrar.");
                    } else {
                        System.out.println("Lista de productos:");
                        System.out.println("------------------------");
                        for (Product product : storage.getProducts()) {
                            System.out.println(product);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
            printLine();
        }
        scanner.close();
    }

    private static double askForNumber(Scanner scanner) {
        double number = 0;
        while (number <= 0) {
            try {
                number = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Dato invalido, porfavor reingrese un numero:");
            }
            scanner.nextLine();
        }
        ;
        return number;
    }

    private static void printLine() {
        System.out.println("\n----------------------------------------------");
    }
}
