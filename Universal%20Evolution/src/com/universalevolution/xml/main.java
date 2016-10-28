package xml;


public class main {

	public static void main(String[] args)throws Exception {
		
		
		XMLgenerations f = new XMLgenerations("generacion1");
		separador l = new separador();
		f.añadirGen(l.separar("O,1,2,3,4,5"));
		
	}
}
