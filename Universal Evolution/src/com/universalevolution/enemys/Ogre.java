package com.universalevolution.enemys;

public class Ogre extends Enemy{
	
	Ogre(){
		this.life = 5;
		this.arrowResistance = 7;
		this.magicResistance = 3;
		this.artilleryResistance = 3;
		this.speed = 2;
		this.name = "Ogre";
	}
	
	Ogre(int arrowResistance, int magicResistance, int artilleryResistance, int speed, String name ){
		super(arrowResistance, magicResistance, artilleryResistance, speed, name);
		this.life = 5;
	}

	
}
