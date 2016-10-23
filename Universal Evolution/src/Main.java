import java.util.Random;
import java.util.stream.IntStream;

import com.universalevolution.genetics.Evolution;

public class Main {

	public static void main(String[] args) {
		
		
		Evolution darwin = new Evolution();
		
		darwin.createPopulation();
		darwin.showEnemies(darwin.getLastGeneration());
		
		System.out.println("-------------------------------------");
		
		for(int i = 0; i <= 107; i++){
			//darwin.crossing(darwin.getLastGeneration());
			darwin.enemyEvolution();
			System.out.println("i: " +  i + "\n");
			darwin.showEnemies(darwin.getLastGeneration());
			System.out.println("largo de la ultima gen: " +  darwin.getLengthLastGeneration() + "\n");

		}
		darwin.showEnemies(darwin.getLastWarriors());
		System.out.println(darwin.getLengthLastWarrior());
		
//		Random random = new Random();
		
//		int max = 7;
//		int min = 4;
//		
//		for (int i = 0; i<max+7; i++){
//			int xSpeed = (random.nextInt() % 2 == 0) ? min : max;
//		
//			System.out.println("xSpeed: " + xSpeed);
//		}
		
//		darwin.createPopulation();
//		System.out.println("Generation: " + darwin.getGenerations());
//		darwin.showEnemies(darwin.getLastGeneration());
//		System.out.println("Lenth Of Last Generation of Warriors: " + darwin.getLengthLastGeneration());
//		System.out.println("===========================================================");
//		
//		
//		darwin.enemyEvolution();
//		System.out.println("Generation: " + darwin.getGenerations());
//		darwin.showEnemies(darwin.getLastWarriors());
//		System.out.println("Length Of Last Generation of Warriors: " + darwin.getLengthLastGeneration());
//		System.out.println("===========================================================");
//
//
//		darwin.enemyEvolution();
//		System.out.println("Generation: " + darwin.getGenerations());
//		darwin.showEnemies(darwin.getLastWarriors());
//		System.out.println("Length Of Last Generation of Warriors: " + darwin.getLengthLastGeneration());
//		System.out.println("===========================================================");
//		
//		darwin.enemyEvolution();
//		System.out.println("Generation: " + darwin.getGenerations());
//		darwin.showEnemies(darwin.getLastWarriors());
//		System.out.println("Lenth Of Last Generation of Warriors: " + darwin.getLengthLastGeneration());
//		System.out.println("===========================================================");
//		
//		
//		darwin.enemyEvolution();
//		System.out.println("Generation: " + darwin.getGenerations());
//		darwin.showEnemies(darwin.getLastWarriors());
//		System.out.println("Lenth Of Last Generation of Warrior: " + darwin.getLengthLastGeneration());
//		System.out.println("===========================================================");

		
		
		
//		int max = 6;
//		int min = 2;
//		Random rn = new Random();
//		int answer = rn.nextInt(max - min + 1) + min;
//		int answer = rn.nextInt(max+1);
//		System.out.println(answer);
//		
//		for (int i = 0; i<20; i++){
//			int answer = rn.nextInt(max - min + 1) + min;
//			System.out.println(answer);
//		}
		
//		double probCrossing = rn.nextDouble();
//		System.out.println(probCrossing);

	}

}
