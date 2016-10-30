import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;

import com.universalevolution.genetics.Evolution;
import com.universalevolution.xml.XMLgenerations;
import com.universalevolution.xml.separador;

public class Main {

	public static void main(String[] args) throws TransformerException, FileNotFoundException, IOException {
		
		
//		//public String readFile(String path) throws IOException{
//	    String path = "/home/randy/generacion1.xml";
//	    
//		StringBuilder sb = new StringBuilder();
//	    try (BufferedReader br = new BufferedReader(new FileReader(path))){
//	    	String sCurrentLine = br.readLine();
//
//	        while (sCurrentLine != null) {
//	            sb.append(sCurrentLine);
//	        }
//
//	    }
//
//	    System.out.println(sb.toString());
	    
		
		
//		Evolution darwin = new Evolution();
//		
//		separador l = new separador();
//		
//		darwin.createPopulation();
//		
//		String init = darwin.sentEnemy();
//		l.separar(init, 0);
//		
//		for(int i = 1; i<10; i++){
//			String cadena= "";
//			darwin.enemyEvolution();
//			cadena = darwin.sentEnemy();
//			l.separar(cadena, i);
//		}
		//darwin.showEnemies(darwin.getLastWarriors());
		
//		darwin.enemyEvolution();
//		String first = darwin.sentEnemy();
//		System.out.println(first);
//		//darwin.showEnemies(darwin.getLastGeneration());
//		
//		darwin.enemyEvolution();
//		String second = darwin.sentEnemy();
//		System.out.println(second);
//		//darwin.showEnemies(darwin.getLastGeneration());
		
		
//		l.separar(init,0);
//		l.separar(first,1);
//		l.separar(second,2);
		
		//l.separar("O,2,3,4,5,5");
		
//		darwin.createPopulation();
//		darwin.showEnemies(darwin.getLastGeneration());
//		
//		//System.out.println("-------------------------------------");
//		
//		for(int i = 0; i < 125; i++){
//			//darwin.crossing(darwin.getLastGeneration());
//			darwin.enemyEvolution();
//			System.out.println("i: " +  i + "\n");
//			//darwin.showEnemies(darwin.getLastGeneration());
//			System.out.println("largo de la ultima gen: " +  darwin.getLengthLastGeneration() + "\n");
//			//if (i == 125)
//				//System.out.println("-------------------------------------");
//				//darwin.showEnemies(darwin.getLastWarriors());
//				//System.out.println("-------------------------------------");

//		}
//		darwin.showEnemies(darwin.getLastWarriors());
//		System.out.println(darwin.getLengthLastWarrior());
		
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
