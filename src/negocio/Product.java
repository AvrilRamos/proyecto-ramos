package negocio;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object id) {
        Product name = (Product)id;
        return this.id == name.id;
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
        return "\nId:" + id + "Producto: " + name + "\nPrecio unitario: " + price + " euros\nCantidad: " + quantity + "\n";

    }
}
