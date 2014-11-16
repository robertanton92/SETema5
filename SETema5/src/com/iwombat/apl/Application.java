package com.iwombat.apl;
import com.iwombat.habitat.TipHabitat;
import com.iwombat.organizare.TipOrganizare;


public class Application {
	public static void main(String[] args) {
		//vom crea un obiect de tip organizare, tipul oras!!!
		LocalitateFactory obj=FactoryStructure.getFactory("Organizare");
		TipOrganizare oras= obj.getOrganizare("Oras");
		oras.tip();
		
		////vom crea un obiect de tip habitat, tipul urban!!!
		LocalitateFactory habitat=FactoryStructure.getFactory("Habitat");
		TipHabitat urban= habitat.getHabitat("Urban");
		urban.descriere();
		
		//vom crea un tip de habitat in functie de tipul de organizare!
		LocalitateFactory obj2=FactoryStructure.getFactory("Habitat");
		TipHabitat rural= habitat.getHabitat("Sat");
		rural.descriere();
		
	}
}
