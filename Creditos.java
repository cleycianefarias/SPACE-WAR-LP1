package SpaceWar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Creditos extends JFrame{
	JLabel back = new JLabel(new ImageIcon(getClass().getResource("back.jpg")));
	JLabel credito = new JLabel(new ImageIcon(getClass().getResource("creditos03.png")));
	JLabel Logo = new JLabel(new ImageIcon(getClass().getResource("logo01.png")));
	JLabel Nome = new JLabel(new ImageIcon(getClass().getResource("nome.png")));
	
	public Creditos(){
		this.setTitle("Créditos");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(1023,630);
		this.add(back);

		back.add(credito);
		credito.setBounds(0,-170,1300, 800);
		
		back.add(Logo);
		Logo.setBounds(500,-40,800, 600);

		back.add(Nome);
		Nome.setBounds(-160,100,800, 600);

		this.setLocationRelativeTo(null);
		setResizable(false);//não redefinir a janela deixando no tamanho padrao 
		this.setVisible(true);


		setLayout(null);
	}
public static void main(String[] args) {
	new Creditos();
}

}


