package com.universalevolution.enemys;


/**
 * Facotry class implementes a Factory Desing Pattern.
 * Creates generally Enemies depeding on which is needed.
 * 
 * @author randy
 *
 */
public class Factory {
	
	public Factory(){}
	
	/**
	 * Creates basic Enemies using the simple
	 * constructor. Needed for the initial 
	 * population.
	 * 
	 * @param newEnemyType
	 * @return Enemy
	 */
	public Enemy makeEnemies(String newEnemyType){
		if(newEnemyType.equals("E")){
			return new Elf(); 
		}else if(newEnemyType.equals("H")){
			return new Harpy();
		}else if(newEnemyType.equals("M")){
			return new Mercenary();
		}else if(newEnemyType.equals("O")){
			return new Ogre();
		}else return null;
	}

	
	/**
	 * Creates evolved Enemies using the complex
	 * constructor. Needed for the newest generations
	 * in the population.
	 * 
	 * @param newEnemyType
	 * @return Enemy
	 */
	public Enemy makeEvolvedEnemies(String newEnemyType, int arrowResistance, int magicResistance, int artilleryResistance, int speed, String name){
		if(newEnemyType.equals("E")){
			return new Elf(arrowResistance, magicResistance, artilleryResistance, speed, name ); 
		}else if(newEnemyType.equals("H")){
			return new Harpy(arrowResistance, magicResistance, artilleryResistance, speed, name );
		}else if(newEnemyType.equals("M")){
			return new Mercenary(arrowResistance, magicResistance, artilleryResistance, speed, name );
		}else if(newEnemyType.equals("O")){
			return new Ogre(arrowResistance, magicResistance, artilleryResistance, speed, name );
		}else return null;
	}
}
