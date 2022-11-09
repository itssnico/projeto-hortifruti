import javax.swing.JOptionPane;

public class Legumes extends Hortifruti{

	@Override
	public void setImpostoBase(double impostoBase) {
		// TODO Auto-generated method stub
		super.setImpostoBase(impostoBase*3.5);
	}
	
	public void impostoBase() {
		String mensagem = "Imposto dos legumes";
		mensagem += "\n" + getImpostoBase()+ "%";
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
}
	