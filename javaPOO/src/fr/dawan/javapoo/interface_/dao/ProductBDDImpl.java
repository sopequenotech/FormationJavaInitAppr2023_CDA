package fr.dawan.javapoo.interface_.dao;

import java.util.List;

import fr.dawan.javapoo.interface_.model.Product;

public class ProductBDDImpl implements IProductDAO{

	@Override
	public void addProduct(Product p) {
		// SQL - Requête d'insertion 
		
	}

	@Override
	public void deleteProductById(int id) {
		// Requête de suppression 
		
	}

	@Override
	public void updateProduct(Product p) {
		// Requête de miste à jour
		
	}

	@Override
	public List<Product> findAll() {
		// Requête de selection
		return null;
	}

}
