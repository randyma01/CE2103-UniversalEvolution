package com.universalevolution.genetics;

import java.util.Vector;
import java.util.Random;

import com.universalevolution.enemys.*;

/**
 * Evolution class implement a genetic algorithm for creating,
 * Maintaining, crossing and evolving the Enemy objects. 
 *  
 * @author randy
 *
 */
public class Evolution {

	
	int generations = 0; /*number of generations*/
	int ability = 0; /* number that adds ability to the Enemies*/
	int reinforcements = 0; /*number for new Enemies sent for war*/
	int initialPopulation = 16; /*number for the inital populaton*/
	
	Factory enemyFactory = new Factory(); /*intantiation of a factoy for creating enemies*/
	Random randomGenerator = new Random(); /*instantiation of a random for generation random numbers*/

	double perCrossing = 0.7; /*percentage for two Enemies to cross*/
	double perMutation = 0.3; /*percentange for an Enemy to mutate one of is attributes */
	double perReinforcements = 0.5; /*pecentage for adding new Enemies sent for war*/
	
	Vector <Vector<Enemy>> totalPopulation = new Vector <Vector<Enemy>>(); /*vector that contins all the population*/
	Vector <Vector<Enemy>> totalWarriors = new Vector <Vector<Enemy>>(); /*vector that contins all Enemies sent to war*/
	
	public Vector<Vector<Enemy>> getTotalPopulation(){return totalPopulation;}
	public Vector<Vector<Enemy>> getTotalWarriors(){return totalWarriors;}
	
	public  Vector<Enemy> getLastGeneration(){return totalPopulation.lastElement();}
	public  Vector<Enemy> getLastWarriors(){return totalWarriors.lastElement();}
	
	public int getLengthLastGeneration(){return this.getLastGeneration().size();}
	public int getLengthLastWarrior(){return this.getLastWarriors().size();}
	
	public int getGenerations(){return generations;}
	
	
	/**
	 * Creates a vector, initialEnemies, in which insert
	 * 16 new Enemies created randomly with the default
	 * attributes values. Insert this vector to the general
	 * vector, totalPopulation.
	 */
	public void createPopulation(){
		Vector<Enemy> initialEnemies = new Vector<Enemy>(); /*vector for inserting the newest Enemies*/
		String[] identificators= {"E", "H", "M", "O"}; /*array for the identificators*/
		for(int i = 0; i <= initialPopulation; i++){
			String newIdentificator = identificators[randomGenerator.nextInt(4)]; /*1. chooses randomly an indentifictor*/
			Enemy newEnemy = enemyFactory.makeEnemies(newIdentificator); /*2. depending on which identificator creates that Enemy*/
			initialEnemies.add(newEnemy); /*3. insert the Enemy on the vector*/
		}
		System.out.println("***Initial Population Created***");
		totalPopulation.add(initialEnemies); /*4. insert the (initialEnemies vector) on the totalPopulation (vector of vectors)*/
		generations++;
	}
	
	/**
	 * This method return the information of an Enemy vector, specifically
	 * the last vector from totalWarrios, as whole string (warriorsData). 
	 * Uses the method sentWarriorAux() as an auxiliary function. 
	 * 
	 * @return warriorsData
	 */
	public String sentEnemyWarriors(){
		Vector<Enemy> enemyWarriors = new Vector<Enemy>();
		enemyWarriors = this.getLastWarriors();
		String warriorsData = this.sentEnemiesAux(enemyWarriors);
		return warriorsData;
	}
	
	
	/**
	 * This method return the information of an Enemy vector, specifically
	 * the last vector from totalPopulation, as whole string (warriorsData). 
	 * Uses the method sentEnemiesAux() as an auxiliary function. 
	 * 
	 * @return warriorsData
	 */
	public String getEnemyPopulation(){
		Vector<Enemy> enemyPopulation = new Vector<Enemy>();
		enemyPopulation = this.getLastGeneration();
		String enemyData = this.sentEnemiesAux(enemyPopulation);
		return enemyData;
		
	}
	
	

	/**
	 * Receives a vector full of Enemies. Read each Enemies'
	 * information and add it to the String info. Return the
	 * variable info. 
	 * 
	 * @param enemyList
	 * @return info
	 */
	public String sentEnemiesAux(Vector<Enemy> enemyList){
		String info = null;
		Enemy enemyN;
		int length = enemyList.size();
		for(int i =0; i<length; i++){
			enemyN = enemyList.get(i);
			String tempInfo;
			String name = enemyN.getName();
			int life = enemyN.getLife();
			int arrowResistance = enemyN.getArrowResistance();
			int magicResistance = enemyN.getMagicResistance();
			int artilleryResistance = enemyN.getArtilleryResistance();
			int speed = enemyN.getSpeed();
			tempInfo = "Name: " + name + ", " + "Life: " + life + ", " + "ArrowResistance: " + arrowResistance + ", " + "MagicResistance: " + magicResistance + ", " + "ArtilleryResistance: " + artilleryResistance + ", " + "Speed: " + speed;
			info += tempInfo;
		}
		return info;
	}

	
	/**
	 * Receives a vector full of Enemies. Read each Enemies'
	 * information and add it to the String info. Prints 
	 * on screen the variable info
	 * 
	 * @param enemyList
	 */
	public void showEnemies(Vector<Enemy> enemyList){
		String info = "";
		Enemy enemyN;
		int length = enemyList.size();
		for(int i =0; i<length; i++){
			enemyN = enemyList.get(i);
			String tempInfo;
			String name = enemyN.getName();
			int life = enemyN.getLife();
			int arrowResistance = enemyN.getArrowResistance();
			int magicResistance = enemyN.getMagicResistance();
			int artilleryResistance = enemyN.getArtilleryResistance();
			int speed = enemyN.getSpeed();
			tempInfo = "Name: " + name + ", " + "Life: " + life + ", " + "ArrowResistance: " + arrowResistance + ", " + "MagicResistance: " + magicResistance + ", " + "ArtilleryResistance: " + artilleryResistance + ", " + "Speed: " + speed + "\n";
			info += tempInfo;
		}
		System.out.println(info);
	}


	/**
	 * Receives a vector full of Enemies. Randomly chooses
	 * a position from it, from the selected Enemy randomly 
	 * chooses an attribute to change. This new value goes
	 * from 1 t 10
	 * @param enemyList
	 */
	public void mutation(Vector<Enemy> enemyList){
		
		int length = enemyList.size(); /*length of the enemyList*/
		int position = randomGenerator.nextInt(length+1); /*chooses a random number from 0 to the lenght of the enemyList*/
		int newValue = randomGenerator.nextInt(11); /*chooses a random value from 0 to 10*/
		String[] attributes= {"ArrowResistance", "MagicResistance", "ArtillerResistance", "Speed"}; /*array of possible attribute to mutate*/
		Enemy enemy = enemyList.get(position); /*creation of an enemy and assigntion of which*/
		String newAttributeValue = attributes[randomGenerator.nextInt(4)]; /*random selection of the attribute to mutate*/
		
		if (newValue == 0) /*in case that the newValue is 0, adds 1*/
			newValue++;
		
		/*depending on attributed selected, set this newValue to the attribute of the Enemy*/
		if (newAttributeValue.equals("ArrowResistance")){
			enemy.setArrowResistance(newValue);
		}else if (newAttributeValue.equals("magicResistance")){
			enemy.setMagicResistance(newValue);
		}else if (newAttributeValue.equals("artilleryResistance")){
			enemy.setArtilleryResistance(newValue);
		}else if (newAttributeValue.equals("Speed")){
			enemy.setSpeed(newValue);
		}
		System.out.println("***Mutation Occured!***");

	}

	/**
	 * Receives a vector full Enemies. Randomly chooses
	 * two Enemies and cross them. The third Enemy is 
	 * insert on the vector newestEnemies, that it is 
	 * also inserted at the end of the general vector
	 * totalPopulation. Uses an auxiliary function 
	 * , createOffspring, which does the actual
	 * crossing.
	 * 
	 * @param enemyList
	 */
	public void crossing(Vector<Enemy> enemyList){
		
		int length = enemyList.size();/*length of the enemyList*/
		Vector<Enemy> newestEnemies = new Vector<Enemy>(); /*vector for inserting the newest Enemies*/

		for(int i = 0; i <= length; i++){
			Enemy enemy1 = enemyList.get(randomGenerator.nextInt(length)); /*1. choosing randomly from enemyList mate one*/
			Enemy enemy2 = enemyList.get(randomGenerator.nextInt(length)); /*2. choosing randomly from enemyList mate two*/
			Enemy enemy3 = this.createOffspring(enemy1, enemy2); /*3. creates a new Enemy*/
			newestEnemies.add(enemy3); /*4. insert enemy3 on the vector newestEnemies*/
		}
		System.out.println("***Crossing Occured in the Lastest Generation***");
		totalPopulation.add(newestEnemies);
		generations++;
		
	}
	
	/**
	 * Receives two Enemies and make the cross between
	 * them two. The result is a third Enemy. Retuns the 
	 * newest Enemy.
	 * 
	 * @param enemy1
	 * @param enemy2
	 * @return Enemy
	 */
	public Enemy createOffspring(Enemy enemy1, Enemy enemy2){
		int arrowResistance = 0;
		int magicResistance = 0;
		int artilleryResistance = 0;
		int speed = 0;
		String newEnemyType = "";
		String name = "";
		
		
		if( enemy1.getName().equals(enemy2.getName()) ){ /*if the enemies are the same, just repeat all the values*/
			name = enemy1.getName();
			newEnemyType = this.createIdentificator(name); /*identifictor (NewEnemyType) depend on which type of enemy it is*/
			arrowResistance = enemy1.getArrowResistance();
			magicResistance = enemy1.getMagicResistance();
			artilleryResistance = enemy1.getArtilleryResistance();
			speed = enemy1.getSpeed();
		}
		
		/*in case that the enemies are not the same, a random between them and their values happen*/
		else{ 
		 
			String[] possibleNames = {enemy1.getName(), enemy2.getName()}; /*array of the two possible names*/
			name = possibleNames[randomGenerator.nextInt(2)]; /*chooses randomly a name of the array*/
			newEnemyType = this.createIdentificator(name); /*identifictor (NewEnemyType) depend on which type of enemy it is*/
			
			/*the following verifications validate and chooses the values for the attributes between the two enemies*/
			
			/*arrowResistance*/
			arrowResistance = (randomGenerator.nextInt() % 2 == 0) ? enemy1.getArrowResistance() : enemy2.getArrowResistance();
			
			
			/*magicResistance*/
			magicResistance = (randomGenerator.nextInt() % 2 == 0) ? enemy1.getMagicResistance() : enemy2.getMagicResistance();
			
			/*artilleryResistance*/
			artilleryResistance = (randomGenerator.nextInt() % 2 == 0) ? enemy1.getArtilleryResistance() : enemy2.getArtilleryResistance();
			
			/*speed*/
			speed = (randomGenerator.nextInt() % 2 == 0) ? enemy1.getSpeed() : enemy2.getSpeed();			
		}


		Enemy enemy3 = enemyFactory.makeEvolvedEnemies(newEnemyType, arrowResistance, magicResistance, artilleryResistance, speed, name);
		return enemy3;
	}
	
	
	/**
	 * Receives an String, depending from which type
	 * of Enemy it represents is set a string called 
	 * newEnemyType, that works an identificator for 
	 * the Enemy. Returns the string.
	 * 
	 * @param enemy1
	 * @return newEnemyType
	 */
	public String createIdentificator(String name){
		String newEnemyType = "";
		if (name.equals("Elf")){
			newEnemyType = "E";
		}else if(name.equals("Harpy")){
			newEnemyType = "H";
		}else if(name.equals("Mercenary")){
			newEnemyType = "M";
		}else if(name.equals("Ogre")){
			newEnemyType = "O";
		}
		return newEnemyType;
	}
	

	public void getFittest(Vector<Enemy> enemyList){
		
		Vector<Enemy> fittestEnemies = new Vector<Enemy>(); /*vector which contains the fittest Enemies from enemyLIst*/
		int length = enemyList.size(); /*length of the enemyList*/
		Enemy enemy; 
		
		for(int i = 0; i < length; i++){
			enemy = enemyList.get(i);
			if(enemy.getName().equals("Elf")){
				if (this.compareFitnesElf(enemy)){
					if(fittestEnemies.size() == 16 + reinforcements){
						break;
					}else{
						fittestEnemies.add(enemy);
					}
				}
			}else if(enemy.getName().equals("Harpy")){
				if (this.compareFitnesHarpy(enemy)){
					if(fittestEnemies.size() == 16 + reinforcements){
						break;
					}else{
						fittestEnemies.add(enemy);
					}
				}
			}else if (enemy.getName().equals("Mercenary")){
				if (this.compareFitnesMercenary(enemy)){
					if(fittestEnemies.size() == 16 + reinforcements){
						break;
					}else{
						fittestEnemies.add(enemy);
					}
				}
			}else if(enemy.getName().equals("Ogre")){
				if (this.compareFitnesOgre(enemy)){
					fittestEnemies.add(enemy);
					if(fittestEnemies.size() == 16 + reinforcements){
						break;
					}else{
						fittestEnemies.add(enemy);
					}
				}
			}
		}
		System.out.println("***Finnest Warriors!***");
		totalWarriors.add(fittestEnemies);
	}
	
	
	public boolean compareFitnesElf(Enemy enemy){
		if(enemy.getArrowResistance() >  3){
			return true;
		}else if(enemy.getMagicResistance() > 7){
			return true;
		}else if (enemy.getArtilleryResistance() > 3){
			return true;
		}else if(enemy.getSpeed() > 7 ){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean compareFitnesHarpy(Enemy enemy){
		if(enemy.getArrowResistance() >  3){
			return true;
		}else if(enemy.getMagicResistance() > 7){
			return true;
		}else if(enemy.getSpeed() > 5 ){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean compareFitnesMercenary(Enemy enemy){
		if(enemy.getArrowResistance() >  7){
			return true;
		}else if(enemy.getMagicResistance() > 3){
			return true;
		}else if (enemy.getArtilleryResistance() > 7){
			return true;
		}else if(enemy.getSpeed() > 5 ){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean compareFitnesOgre(Enemy enemy){
		if(enemy.getArrowResistance() >  7){
			return true;
		}else if(enemy.getMagicResistance() > 3){
			return true;
		}else if (enemy.getArtilleryResistance() > 3){
			return true;
		}else if(enemy.getSpeed() > 2 ){
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * This methods make automatic all the process of 
	 * evolution: crossing, mutating and choosing the
	 * "fittest" Enemies of the newest generations. It 
	 * is void because all results of the operation are
	 * insert in their respectiv vectors. To use this 
	 * method is importan to have at least one generation
	 * before, or an initial population, created before. 
	 */
	public void enemyEvolution(){
		
		double probCrossing = randomGenerator.nextDouble(); /*probability that crossing happens*/
		if(probCrossing < perCrossing){ /*if the probability of crossing enters the range of the percentage of crossing, it happens*/
			
			this.crossing(this.getLastGeneration()); /*1. creates a new generation by crossing the last one and insert it at the end in totalPopulation*/
			
			double probMutation = randomGenerator.nextDouble();  /*probability that mutation happen happens*/
			if(probMutation < perMutation) /*if the probability of mutating enters the range of the percentage of mutation, it happens*/
				this.mutation(getLastGeneration()); /*2. from the last generation just made, mutates one individual from it*/
			
			/*at this stage the latest generation, as a vector, is at the end of th vector totalPopulation and could possibly have mutated*/
			
			this.getFittest(getLastGeneration()); /*3. from the last generations picks the fittest Enemies*/
			
			double probReinforcements = randomGenerator.nextDouble(); /*probability that more reinforcements are added*/
			if(probReinforcements < perReinforcements)/*if the probability of more reinforcements enters the range of more reinforcements it happens*/
				reinforcements++; /*add one more Enemy*/
			
			ability++;
		}
	}
	
	
	
	
	
	
	
	
}
