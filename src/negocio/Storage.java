package negocio;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner; 

public class Storage {
	private ArrayList<Product> products = new ArrayList<Product>();

	public Storage(){
		loadProducts();
	}

	public void addProduct(Product product){
		products.add(product);
		saveProducts();
	}

	public ArrayList<Product> getProducts(){
		return products;
	}

	private void saveProducts(){
		try{
			FileWriter fw = new FileWriter("products.csv");
			for(Product product : products){
				fw.write(product.getName() + "," +
						product.getPrice() + "," +
						product.getQuantity() + "\n");
			}
			fw.close();
		}catch(IOException ex){
			System.err.println(ex);
		}
	}

	private void loadProducts(){
		try{
			File fichero = new File("products.csv");
			// Crea el fichero si no existe
			// nombre,precio,cantidad\nnombre,precio,cantidad
			fichero.createNewFile();
			Scanner sc = new Scanner(fichero);
			sc.useDelimiter(",|\n");
			while(sc.hasNext()){
				Product product = new Product(sc.next(),
								    Double.parseDouble(sc.next()),
								    Integer.parseInt(sc.next()));
				products.add(product);
			}
			sc.close();
		}catch(IOException ex){
			System.err.println("No hay productos inscritos");
		}
	}
}