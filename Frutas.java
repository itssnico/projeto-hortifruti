import javax.swing.JOptionPane;

public class Frutas extends Hortifruti{

	@Override
	public void setImpostoBase(double impostoBase) {
		// TODO Auto-generated method stub
		super.setImpostoBase(impostoBase*2);
	}
	
	public void impostoBase() {
		String mensagem = "Imposto das frutas";
		mensagem += "\n" + getImpostoBase()+ "%";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
}
	