import javax.swing.JOptionPane;

public class Hortifruti {
	private int frutas;
	private int legumes;
	private int verduras;
	private int graos;
	private int total;

	double impostoBase = 5;
	
	public double getImpostoBase() {
		return impostoBase;
	}
	public void setImpostoBase(double impostoBase) {
		this.impostoBase = impostoBase;
	}
	public int getFrutas() {
		return frutas;
	}
	public void setFrutas(int frutas) {
		this.frutas = frutas;
	}
	public int getLegumes() {
		return legumes;
	}
	public void setLegumes(int legumes) {
		this.legumes = legumes;
	}
	public int getVerduras() {
		return verduras;
	}
	public void setVerduras(int verduras) {
		this.verduras = verduras;
	}
	public int getGraos() {
		return graos;
	}
	public void setGraos(int graos) {
		this.graos = graos;
	}


	public void inserirDados(){
		this.frutas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de frutas: "));	
		this.legumes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de legumes: "));
		this.verduras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de verduras: "));
		this.graos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de saquinhos de grãos: "));
		//this.impostoBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto base:"));
	}
	
	public void total(int total) {
		this.total = this.frutas + this.legumes + this.verduras + this.graos;
	}
	
	public void atualizar() {
		this.impostoBase += this.impostoBase;
	}
	
	public void mostrar() {
		String mensagem = "Quantidade total comprada: ";
		mensagem += "\nTotal: " + this.total;
		mensagem += "\nImposto base: " + impostoBase;
		JOptionPane.showMessageDialog(null, mensagem);
	}

}