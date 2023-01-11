package fr.dawan.javapoo.interface_.dao;

import java.util.List;

import fr.dawan.javapoo.interface_.model.Product;

public class ProductFileImpl implements IProductDAO{

	@Override
	public void addProduct(Product p) {
		//Ajouter un produit dans un fichier
	}

	@Override
	public void deleteProductById(int id) {
		//Mettre à jour un produit dans un fichier
		
	}

	@Override
	public void updateProduct(Product p) {
		// Supprimer un produit dans un fichier 
		
	}

	@Override
	public List<Product> findAll() {
		// Lister les produits dans un fichier
		return null;
	}

	
}
