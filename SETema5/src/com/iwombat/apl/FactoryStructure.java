package com.iwombat.apl;

import com.iwombat.habitat.HabitatFactory;
import com.iwombat.organizare.OrganizareFactory;

// aici vom alege in ce tip de "organizare" vrem sa vedem obiectul 
//daca alegem optiunea organizare se va crea un nou iobict OrganizareFactory care va avea 3 optiuni:sat, oras, comuna
//daca alegem cea de-a 2 optiune, adica Habitat , se va crea un obiect de Tipul HabitatFactory care va area 2 optiuni: rural sau urban!
public class FactoryStructure {

	public static LocalitateFactory getFactory(String alege)
	{
		if(alege==null)
		{
			System.out.println("introduceti parametru!");
			return null;
		}
		if(alege.equalsIgnoreCase("Organizare"))
		{
			return new OrganizareFactory();
		}
		if(alege.equalsIgnoreCase("Habitat"))
		{
			return new HabitatFactory();
		}
		System.out.printf("nu exista alegerea dumnevoastra, introduceti o noua alegere!");
		return null;
	}
}
