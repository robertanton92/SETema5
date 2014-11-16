package com.iwombat.habitat;


import com.iwombat.apl.LocalitateFactory;
import com.iwombat.organizare.TipOrganizare;


public class HabitatFactory  extends LocalitateFactory{

	
	//la fel ca si la clasa OrganizareFactory am creat o metoda pentru a vedea ce tip de habitat este rural sau urban!
	public TipHabitat getHabitat(String habitat) {
		if(habitat==null)
		{
			System.out.println("introduceti paramentru!");
			return null;
		}
		if(habitat.equalsIgnoreCase("Rural"))
		{
			return new Rural();
		}
		if(habitat.equalsIgnoreCase("Urban"))
		{
			return new Urban();
		}
		if(habitat.equalsIgnoreCase("Oras"))
		{
			return new Urban();
		}
		if(habitat.equalsIgnoreCase("Sat"))
		{
			return new Rural();
		}
		return null;
	}

	@Override
	public TipOrganizare getOrganizare(String organizare) {
		
		return null;
	}

}
