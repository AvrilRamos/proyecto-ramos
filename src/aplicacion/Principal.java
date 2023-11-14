package aplicacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import negocio.*;

public class Principal {

    public static void main(String[] args) {
        Storage storage = new Storage();

        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while (option != 5) {
            System.out.println("Menú:");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Borrar un producto");
            System.out.println("3. Modificar un producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");

            System.out.print("Elija una opción (1,2,3,4,5): ");

            option = askForInt(scanner);
            System.out.println("");

            switch (option) {
                case 1:
                    System.out.println("Ingrese los datos del producto:");
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Precio: ");
                    double price = askForDouble(scanner);
                    System.out.print("Cantidad: ");
                    int quantity = askForInt(scanner);

                    Product newProduct = new Product(name, price, quantity);
                    storage.addProduct(newProduct);
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el id del producto a eliminar:");
                    int id = askForInt(scanner);
                    Product toDelete = storage.getProductById(id);
                    if (toDelete== null) {
                        System.out.println("El producto con id " + id + " no existe, intente nuevamente");
                    }else {
                        storage.deleteProduct(toDelete);
                    }
                    break;
                case 3:
                System.out.println("Ingrese el id del producto a modificar:");
                int modifyId = askForInt(scanner);
                Product toModify = storage.getProductById(modifyId);
                if (toModify == null) {
                    System.out.println("El producto con id " + modifyId + " no existe, intente nuevamente");
                } else {
                    System.out.print("Ingrese el nuevo nombre: ");
                    String newName = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio: ");
                    double newPrice = askForDouble(scanner);
                    System.out.print("Ingrese la nueva cantidad: ");
                    int newQuantity = askForInt(scanner);
                    storage.modifyProduct(toModify, newName, newPrice, newQuantity);
                    System.out.println("Producto modificado con éxito.");
                }
                break;

                case 4:
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

                case 5:
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

    private static double askForDouble(Scanner scanner) {
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

    private static int askForInt(Scanner scanner) {
        int number = 0;
        while (number <= 0) {
            try {
                number = scanner.nextInt();
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
