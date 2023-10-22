package negocio;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Devuelve una cadena de caracteres con el nombre precio y cantidad del
     * producto.
     * 
     * @return cadena de caracteres con la información del producto.
     */
    @Override
    public String toString() {
        return "Producto: " + name + "\nPrecio unitario: " + price + " euros\nCantidad: " + quantity + "\n";

    }
}
