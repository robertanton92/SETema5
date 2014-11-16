package com.iwombat.organizare;
import com.iwombat.habitat.TipHabitat;
import com.iwombat.apl.LocalitateFactory;

//aceasta clasa se extinde clasa LocalitateFactory
public class OrganizareFactory extends LocalitateFactory {

	// metoda aceasta este pentru a vedea ce tip de organizare are localitatea:oras, sat, comuna!
	public TipOrganizare getOrganizare(String type)
	{
		if(type==null)
		{
			System.out.println("nu ati datat parametru!");
			return null;
		}
		 if(type.equalsIgnoreCase("Oras")){
			 return new Oras();			 
		 }
		 if(type.equalsIgnoreCase("Sat")){
			 return new Sat();			 
		 }
		 if(type.equalsIgnoreCase("Comuna")){
			 return new Comuna();			 
		 }
		 System.out.println("nu ati introdus organizarea corecta!");
		return null;
	}
	
	public TipHabitat getHabitat(String habitat)
	{
		return null;
	}

}
