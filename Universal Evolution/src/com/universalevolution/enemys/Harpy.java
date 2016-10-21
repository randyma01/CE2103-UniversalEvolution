package com.universalevolution.enemys;

public class Harpy extends Enemy {
	
	Harpy(){
		this.life = 6;
		this.arrowResistance = 5;
		this.magicResistance = 5;
		this.artilleryResistance = 10;
		this.speed = 5;
		this.name = "Harpy";
	}
	
	Harpy(int arrowResistance, int magicResistance, int artilleryResistance, int speed, String name ){
		super(arrowResistance, magicResistance, artilleryResistance, speed, name);
		this.life = 6;
	}



}
