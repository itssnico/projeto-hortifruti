import javax.swing.JOptionPane;

public class Verduras extends Hortifruti{

	@Override
	public void setImpostoBase(double impostoBase) {
		// TODO Auto-generated method stub
		super.setImpostoBase(impostoBase*2.5);
	}
	
	public void impostoBase() {
		String mensagem = "Imposto das verduras";
		mensagem += "\n" + getImpostoBase()+ "%";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
}
	