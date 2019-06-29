package SpaceWar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Instrucoes extends JFrame implements ActionListener{
	JLabel instru = new JLabel(new ImageIcon(getClass().getResource("instru.jpg")));
	JLabel ins04 = new JLabel(new ImageIcon(getClass().getResource("ins4.png")));
	JLabel teste = new JLabel(new ImageIcon(getClass().getResource("teste01.png")));
	JLabel seta = new JLabel(new ImageIcon(getClass().getResource("seta.png")));

	JButton btVoltar = new JButton("<< Voltar");

	public Instrucoes(){
		this.setTitle("Instruções");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(1023,630);
		this.add(instru);

		instru.add(teste);
		teste.setBounds(100, 0,600, 700);

		instru.add(ins04);
		ins04.setBounds(15, 150,1820, 600);

		instru.add(ins04);
		ins04.setBounds(15, 150,1820, 600);

		instru.add(seta);
		seta.setBounds(100, 200,1000, 600);

		instru.add(btVoltar);
		btVoltar.setBounds(60, 500,100, 50);
		btVoltar.addActionListener(this);


		this.setLocationRelativeTo(null);
		setResizable(false);//não redefinir a janela deixando no tamanho padrao 
		this.setVisible(true);


		setLayout(null);


	}
	public static void main(String[] args) {
		new Instrucoes();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btVoltar){
			//Criar objeto de outra janela
			Janela c = new Janela();
			this.dispose();
			//			c.setModal(true);
			//			c.setVisible(true);
		}

	}
}
