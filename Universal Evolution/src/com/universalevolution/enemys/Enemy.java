package com.universalevolution.enemys;

/**
 * Abstract class for the enemies. All fou types
 * inheritate from this class data.
 * 
 * @author randy
 *
 */

public class Enemy {
	
	int life;
	int arrowResistance;
	int magicResistance;
	int artilleryResistance;
	int speed;
	String name;
	
	public int getLife() {return life;}
	public int getArrowResistance() {return arrowResistance;}
	public int getMagicResistance() {return magicResistance;}	
	public int getArtilleryResistance() {return artilleryResistance;}
	public int getSpeed() {return speed;}
	public String getName() {return name;}
	
	public void setLife(int life) {this.life = life;}
	public void setArrowResistance(int arrowResistance) {this.arrowResistance = arrowResistance;}
	public void setMagicResistance(int magicResistance) {this.magicResistance = magicResistance;}
	public void setArtilleryResistance(int artilleryResistance) {this.artilleryResistance = artilleryResistance;}
	public void setSpeed(int speed) {this.speed = speed;}
	public void setName(String name) {this.name = name;}
	
	
	Enemy(){}
	
	Enemy(int arrowResistance, int magicResistance, int artilleryResistance, int speed, String name ){
		this.arrowResistance = arrowResistance;
		this.magicResistance = magicResistance;
		this.artilleryResistance = artilleryResistance;
		this.speed = speed;
		this.name = name;
	}
	
	
}
