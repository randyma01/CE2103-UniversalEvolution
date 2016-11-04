package com.universalevolution.xml;

import java.io.File;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Class for writing and reader XML Files. Uses th 
 * 
 * @author Fernanda, Ricardo, Randy on 15/09/16. (Updated: 3/10/16).
 */
public class XMLManager {

	String arrayParameter[] = {"", "", "", "", "", ""};
		
	/**
	 * Separate the characters inside a String. Creates
	 * an XML file with the data from the string following
	 * the tags of the data. The genNum (int) parameter
	 * is the number of the generation.
	 * 
	 * @param xml
	 * @params genNum
	 * @throws TransformerException
	 */
	public void XMLFileWriter(String xml, int genNum) throws TransformerException{
		
		XMLGenerations f = new XMLGenerations("generation" + genNum);
		String delimiter = ",";
		int pos = 0;
		int cantidad = 0;
		String[] tokens = xml.split(delimiter);
		while(pos < tokens.length){
			for (int i = 0; i < 6; i++){
				while(true){
					arrayParameter[i] = tokens[pos];
					pos++;
					if (i < 6){
						break;
					}
				}
			}
		f.addGen(arrayParameter);
		System.out.println("Cantidad enemigos " + cantidad);
		cantidad++;
		}
	}
	
	
	/**
	 * It reads an XML with the generation data, keep and 
	 * save the values of each enemy and returns them as
	 * a String. The parameter number (int) is the number
	 * of which generation XML File to read.
	 * 
	 * Based on the code taken from: http://www.codecoffee.com/articles/xml1.html
	 * 
	 * @param number
	 * @return enemies
	 */
	public String XMLFileReader(int number){
		String genEneiesData = ""; /*String for all the data*/
		try {
    		File file = new File("/home/randy/git/Universal-Evolution/Universal Evolution/generation" + number + ".xml"); 
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (file); 
            doc.getDocumentElement ().normalize ();
            
            System.out.println (doc.getDocumentElement().getNodeName());

            /*list for each type of element*/
             NodeList listOfOgres = doc.getElementsByTagName("Ogres");
             NodeList listOfHarpies = doc.getElementsByTagName("Arpias");
             NodeList listOfElfs = doc.getElementsByTagName("Elfos");
             NodeList listOfMercenaries = doc.getElementsByTagName("Mercenarios");
            
            /*Loop for the listOfOgres. Recover all data into ogresData (String) and concatenates on the genEnemiesData (String).*/
            for(int s=0; s<listOfOgres.getLength() ; s++){
            	String ogresData = "O,";

                Node firstOgreNode = listOfOgres.item(s);
                if(firstOgreNode.getNodeType() == Node.ELEMENT_NODE){

                    Element firstOgreElement = (Element)firstOgreNode;

                    NodeList vidaList = firstOgreElement.getElementsByTagName("vida");
                    Element firstVidaElement = (Element)vidaList.item(0);
                    NodeList textFNList = firstVidaElement.getChildNodes();
                    System.out.println("vida : " + ((Node)textFNList.item(0)).getNodeValue().trim());
                    ogresData+=((Node)textFNList.item(0)).getNodeValue().trim() + ",";
                    
                    NodeList velocidadList = firstOgreElement.getElementsByTagName("velocidad");
                    Element velocidadElement = (Element)velocidadList.item(0);
                    NodeList textLNList = velocidadElement.getChildNodes();
                    System.out.println("velocidad: " + ((Node)textLNList.item(0)).getNodeValue().trim());
                    ogresData+=((Node)textLNList.item(0)).getNodeValue().trim() + ",";
                   
                    NodeList ageList = firstOgreElement.getElementsByTagName("resistenciaFechas");
                    Element ageElement = (Element)ageList.item(0);
                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("resistenciaFlechas : " + ((Node)textAgeList.item(0)).getNodeValue().trim());
                    ogresData+=((Node)textAgeList.item(0)).getNodeValue().trim() + ",";
                   
                    NodeList magicList = firstOgreElement.getElementsByTagName("resistenciaMagia");
                    Element magicElement = (Element) magicList.item(0);
                    NodeList textMagicList = magicElement.getChildNodes();
                    System.out.println("resistenciaMagia : " + ((Node)textMagicList.item(0)).getNodeValue().trim());
                    ogresData+=((Node)textMagicList.item(0)).getNodeValue().trim() + ",";
                                       
                    NodeList artList = firstOgreElement.getElementsByTagName("resistenciaArtilleria");
                    Element artElement = (Element)artList.item(0);
                    NodeList textArtList = artElement.getChildNodes();
                    System.out.println("resistenciaArtilleria : " + ((Node)textArtList.item(0)).getNodeValue().trim());
                    ogresData+=((Node)textArtList.item(0)).getNodeValue().trim() + ",";
                    
                }
                genEneiesData += ogresData;
            }
            
            /*Loop for the listOfEfs. Recover all data into elfsData (String) and concatenates on the genEnemiesData (String).*/
            for(int s=0; s<listOfElfs.getLength() ; s++){
            	String elfsData = "E,";

                Node firstElfNode = listOfElfs.item(s);
                if(firstElfNode.getNodeType() == Node.ELEMENT_NODE){

                    Element firstElfElement = (Element)firstElfNode;

                    NodeList vidaList = firstElfElement.getElementsByTagName("vida");
                    Element firstVidaElement = (Element)vidaList.item(0);
                    NodeList textFNList = firstVidaElement.getChildNodes();
                    System.out.println("vida : " + ((Node)textFNList.item(0)).getNodeValue().trim());
                    elfsData+=((Node)textFNList.item(0)).getNodeValue().trim() + ",";          

                    NodeList lastNameList = firstElfElement.getElementsByTagName("velocidad");
                    Element lastNameElement = (Element)lastNameList.item(0);
                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out.println("velocidad: " + ((Node)textLNList.item(0)).getNodeValue().trim());
                    elfsData+=((Node)textLNList.item(0)).getNodeValue().trim() + ",";
                    
                    NodeList ageList = firstElfElement.getElementsByTagName("resistenciaFechas");
                    Element ageElement = (Element)ageList.item(0);
                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("resistenciaFlechas : " + ((Node)textAgeList.item(0)).getNodeValue().trim());
                    elfsData+=((Node)textAgeList.item(0)).getNodeValue().trim() + ",";
                    
                    NodeList magicList = firstElfElement.getElementsByTagName("resistenciaMagia");
                    Element magicElement = (Element) magicList.item(0);
                    NodeList textMagicList = magicElement.getChildNodes();
                    System.out.println("resistenciaMagia : " + ((Node)textMagicList.item(0)).getNodeValue().trim());
                    elfsData+=((Node)textMagicList.item(0)).getNodeValue().trim() + ",";                  
                    
                    NodeList artList = firstElfElement.getElementsByTagName("resistenciaArtilleria");
                    Element artElement = (Element)artList.item(0);
                    NodeList textArtList = artElement.getChildNodes();
                    System.out.println("resistenciaArtilleria : " + ((Node)textArtList.item(0)).getNodeValue().trim());
                    elfsData+=((Node)textArtList.item(0)).getNodeValue().trim() + ",";
                }
                genEneiesData += elfsData;
            }

            
            
            /*Loop for the listOfHarpies. Recover all data into harpiesData (String) and concatenates on the genEnemiesData (String).*/
            for(int s=0; s<listOfHarpies.getLength() ; s++){
            	String harpiesData = "H,";

                Node firstHarpyNode = listOfHarpies.item(s);
                if(firstHarpyNode.getNodeType() == Node.ELEMENT_NODE){

                    Element firstHarpyElement = (Element)firstHarpyNode;

                    NodeList vidaList = firstHarpyElement.getElementsByTagName("vida");
                    Element firstVidaElement = (Element)vidaList.item(0);
                    NodeList textFNList = firstVidaElement.getChildNodes();
                    System.out.println("vida : " + ((Node)textFNList.item(0)).getNodeValue().trim());
                    harpiesData+=((Node)textFNList.item(0)).getNodeValue().trim() + ",";

                    NodeList lastNameList = firstHarpyElement.getElementsByTagName("velocidad");
                    Element lastNameElement = (Element)lastNameList.item(0);
                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out.println("velocidad: " + ((Node)textLNList.item(0)).getNodeValue().trim());
                    harpiesData+=((Node)textLNList.item(0)).getNodeValue().trim() + ",";

                    NodeList ageList = firstHarpyElement.getElementsByTagName("resistenciaFechas");
                    Element ageElement = (Element)ageList.item(0);
                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("resistenciaFlechas : " + ((Node)textAgeList.item(0)).getNodeValue().trim());
                    harpiesData+=((Node)textAgeList.item(0)).getNodeValue().trim() + ",";
                    
                    NodeList magicList = firstHarpyElement.getElementsByTagName("resistenciaMagia");
                    Element magicElement = (Element) magicList.item(0);
                    NodeList textMagicList = magicElement.getChildNodes();
                    System.out.println("resistenciaMagia : " + ((Node)textMagicList.item(0)).getNodeValue().trim());
                    harpiesData+=((Node)textMagicList.item(0)).getNodeValue().trim() + ",";
          
                    NodeList artList = firstHarpyElement.getElementsByTagName("resistenciaArtilleria");
                    Element artElement = (Element)artList.item(0);
                    NodeList textArtList = artElement.getChildNodes();
                    System.out.println("resistenciaArtilleria : " + ((Node)textArtList.item(0)).getNodeValue().trim());
                    harpiesData+=((Node)textArtList.item(0)).getNodeValue().trim() + ",";
                }
                genEneiesData += harpiesData;
            }
            
            
            
            /*Loop for the listOfMercenaries. Recover all data into mercenariesData (String) and concatenates on the genEnemiesData (String).*/
            for(int s=0; s<listOfMercenaries.getLength() ; s++){
            	String mercenariesData = "M,";

                Node firstMercNode = listOfMercenaries.item(s);
                if(firstMercNode.getNodeType() == Node.ELEMENT_NODE){

                    Element firstMercElement = (Element)firstMercNode;

                    NodeList vidaList = firstMercElement.getElementsByTagName("vida");
                    Element firstVidaElement = (Element)vidaList.item(0);
                    NodeList textFNList = firstVidaElement.getChildNodes();
                    System.out.println("vida : " + ((Node)textFNList.item(0)).getNodeValue().trim());
                    mercenariesData+=((Node)textFNList.item(0)).getNodeValue().trim() + ",";

                    NodeList lastNameList = firstMercElement.getElementsByTagName("velocidad");
                    Element lastNameElement = (Element)lastNameList.item(0);
                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out.println("velocidad: " + ((Node)textLNList.item(0)).getNodeValue().trim());
                    mercenariesData+=((Node)textLNList.item(0)).getNodeValue().trim() + ",";
                    
                    NodeList ageList = firstMercElement.getElementsByTagName("resistenciaFechas");
                    Element ageElement = (Element)ageList.item(0);
                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("resistenciaFlechas : " + ((Node)textAgeList.item(0)).getNodeValue().trim());
                    mercenariesData+=((Node)textAgeList.item(0)).getNodeValue().trim() + ",";
                    
                    NodeList magicList = firstMercElement.getElementsByTagName("resistenciaMagia");
                    Element magicElement = (Element) magicList.item(0);
                    NodeList textMagicList = magicElement.getChildNodes();
                    System.out.println("resistenciaMagia : " + ((Node)textMagicList.item(0)).getNodeValue().trim());
                    mercenariesData+=((Node)textMagicList.item(0)).getNodeValue().trim() + ",";                
                    
                    NodeList artList = firstMercElement.getElementsByTagName("resistenciaArtilleria");
                    Element artElement = (Element)artList.item(0);
                    NodeList textArtList = artElement.getChildNodes();
                    System.out.println("resistenciaArtilleria : " + ((Node)textArtList.item(0)).getNodeValue().trim());
                    mercenariesData+=((Node)textArtList.item(0)).getNodeValue().trim() + ","; 
                }
                genEneiesData += mercenariesData;
            }

            System.out.println(genEneiesData);
            
        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
		
		return genEneiesData;
	}
}
