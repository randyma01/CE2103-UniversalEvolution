package com.universalevolution.enemys;

public class Mercenary extends Enemy {
	
	Mercenary(){
		this.life = 6;
		this.arrowResistance = 7;
		this.magicResistance = 3;
		this.artilleryResistance = 7;
		this.speed = 5;
		this.name = "Mercenary";
	}
	
	Mercenary(int arrowResistance, int magicResistance, int artilleryResistance, int speed, String name ){
		super(arrowResistance, magicResistance, artilleryResistance, speed, name);
		this.life = 6;
	}


}
