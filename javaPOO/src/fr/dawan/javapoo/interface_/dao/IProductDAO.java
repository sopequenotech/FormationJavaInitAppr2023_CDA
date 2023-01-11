package fr.dawan.javapoo.interface_.dao;

import java.util.List;

import fr.dawan.javapoo.interface_.model.Product;

public interface IProductDAO {
	
	//Lister l'ensemble des fonctionnalités sous forme de méthode 
	void addProduct(Product p);
	void deleteProductById(int id);
	void updateProduct(Product p);
	List<Product> findAll();

}
