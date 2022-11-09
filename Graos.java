import javax.swing.JOptionPane;

public class Graos extends Hortifruti{

	@Override
	public void setImpostoBase(double impostoBase) {
		// TODO Auto-generated method stub
		super.setImpostoBase(impostoBase*5);
	}
	
	public void impostoBase() {
		String mensagem = "Imposto dos grãos: ";
		mensagem += "\n" + getImpostoBase()+ "%";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
}
	