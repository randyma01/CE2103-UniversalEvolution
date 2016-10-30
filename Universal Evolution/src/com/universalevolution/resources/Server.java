//package com.universalevolution.resources;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.universalevolution.genetics.*;
//
//
//@Path("/Server")
//public class Server {
//	
//	int i = 0;
//	Evolution geneticController = new Evolution();
//	
//	@GET
//	@Path("evolution")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String universalEvolution(){
//		System.out.println("Starting evolution.....");
//		geneticController.createPopulation();
//		geneticController.showEnemies(geneticController.getLastGeneration());
//		for(int i = 0; i<=5; i++){
//			geneticController.enemyEvolution();
//			System.out.println("Generation: " + i);
//			geneticController.showEnemies(geneticController.getLastGeneration());
//		}
//		return "Last Generation: "+ geneticController.sentEnemiesAux(geneticController.getLastGeneration());
//		
//	}
//
//	
//	@GET
//	@Path("textplain")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String sayPlainTextHello(){
//		return "Hello, World Chang!";
//	}
//	
//	@GET
//	@Path("xml")
//	@Produces(MediaType.TEXT_XML)
//	public String sayXMLHello(){
//		return "<?xml version=*1.0?>" + "<hello> Hello, World!" + "</hello>";
//	}
//	
//	@GET
//	@Path("html")
//	@Produces(MediaType.TEXT_HTML)
//	public String sayHtmlHello(){
//		return "<hmtl>" + "<title>" + "Hello, World!" + "</title>"
//				+ "<body><h1>" + "Hello, World!" + "</body></h1>" + "</hmtl>" ;
//	}
//
//	
//	
//}
