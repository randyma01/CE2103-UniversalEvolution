package com.universalevolution.enemys;

public class Elf extends Enemy{
	
	Elf(){
		this.life = 7;
		this.arrowResistance = 3;
		this.magicResistance = 7;
		this.artilleryResistance = 3;
		this.speed = 5;
		this.name = "Elf";
	}
	
	Elf(int arrowResistance, int magicResistance, int artilleryResistance, int speed, String name ){
		super(arrowResistance, magicResistance, artilleryResistance, speed, name);
		this.life = 7;
	}


}
