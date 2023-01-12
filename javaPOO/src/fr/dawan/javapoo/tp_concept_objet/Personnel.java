package fr.dawan.javapoo.tp_concept_objet;

import java.util.ArrayList;
import java.util.List;

public class Personnel implements IPersonnel {
	
	List<Employe> lstEmploye;
	
	public Personnel() {
		lstEmploye = new ArrayList<>();
	}

	@Override
	public void ajouterEmploye(Employe employe) {
		lstEmploye.add(employe);
	}

	@Override
	public void calculerSalaires() {
		for (Employe employe : lstEmploye) {
			System.out.println(employe.getIdentite() + " gagne " + employe.calculerSalaire() + " euros");
		}
	}

	@Override
	public double salaireMoyen() {
		double salaireTotal = 0.0;
		for (int i = 0; i < lstEmploye.size(); i++) {
			salaireTotal += lstEmploye.get(i).calculerSalaire();
		}
		return salaireTotal / lstEmploye.size();
	}

}
