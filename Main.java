
public class Main {

	public static void main(String[] args) {
		Hortifruti hortifruti1 = new Hortifruti();
		hortifruti1.setImpostoBase(5);
		hortifruti1.inserirDados();
		hortifruti1.total(0);
		hortifruti1.mostrar();
		
		Frutas frutas1 = new Frutas();
		frutas1.setImpostoBase(5);
		frutas1.impostoBase();
		
		Legumes legumes1 = new Legumes();
		legumes1.setImpostoBase(5);
		legumes1.impostoBase();
		
		Verduras verduras1 = new Verduras();
		verduras1.setImpostoBase(5);
		verduras1.impostoBase();
		
		Graos graos1 = new Graos();
		graos1.setImpostoBase(5);
		graos1.impostoBase();
	
	}
}
