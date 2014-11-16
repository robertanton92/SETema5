package com.iwombat.apl;
import com.iwombat.habitat.TipHabitat;
import com.iwombat.organizare.TipOrganizare;


//este o clasa abstracta cu 2 metode 
//aici vom crea cele 2 metode una pentru a vedea tipul de organizare si una pentru a vedea ce tip de habitat este
public abstract class LocalitateFactory {
	public abstract TipHabitat getHabitat(String habitat);
	public abstract TipOrganizare getOrganizare(String organizare);
}
