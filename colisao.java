package SpaceWar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class colisao extends JFrame implements ActionListener{
    
	JLabel gameover = new JLabel(new ImageIcon(getClass().getResource("gameover.jpg")));
	
	JButton btReiniciar = new JButton("Reiniciar");

	public colisao(){
		this.setTitle("Space War");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1023,630);
		this.add(gameover);
		
		
    	gameover.setBounds(0, 0, 1023, 630);
    	
    	gameover.add(btReiniciar);
		btReiniciar.setBounds(60, 500,100, 50);
		btReiniciar.addActionListener(this);

		
		this.setLocationRelativeTo(null);
		setResizable(false);//não redefinir a janela deixando no tamanho padrao 
		this.setVisible(true);

		setLayout(null);



	}

	public static void main(String[] args) {
		new colisao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
			if(e.getSource()==btReiniciar){
				//Criar objeto de outra janela
				Cenario03 c = new Cenario03();
			
				//			c.setModal(true);
				//			c.setVisible(true);
			}

		}
	
}
		