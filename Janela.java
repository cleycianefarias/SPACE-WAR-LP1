package SpaceWar;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Stack;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Janela extends JFrame implements ActionListener{
	JLabel img = new JLabel(new ImageIcon(getClass().getResource("universo.jpg")));
	JLabel img1 = new JLabel(new ImageIcon(getClass().getResource("Space.png")));
	


	JButton btNovoJogo = new JButton();
	JButton btCreditos = new JButton();
	JButton btInstrucoes = new JButton();



	JButton btAudio = new JButton("OFF");
	JButton btAudio1 = new JButton("ON");

	JButton btFace = new JButton();
	JButton btTwitter = new JButton();
	JButton btInsta = new JButton();

	ImageIcon novojogo = new ImageIcon(getClass().getResource("novoJogo01.png"));
	ImageIcon Creditos = new ImageIcon(getClass().getResource("creditos01.png"));
	ImageIcon Instrucoes = new ImageIcon(getClass().getResource("instrucoes01.png"));

	ImageIcon face = new ImageIcon(getClass().getResource("face01.png"));
	ImageIcon twitter = new ImageIcon(getClass().getResource("twitter01.png"));
	ImageIcon insta = new ImageIcon(getClass().getResource("insta01.png"));

	java.net.URL url = getClass().getResource("audio01.jpg.wav");
	AudioClip audio = Applet.newAudioClip(url);

	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();


	public Janela(){
		this.setTitle("Space War");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1023,630);
		this.add(img);

		img.add(painel1);
		img.add(img1);
		img1.setBounds(200, 100, 600, 128);

		//som
		img.add(btAudio);
		btAudio.setBounds(950, 4, 60, 40);
		btAudio.addActionListener(this);



		//som2
		img.add(btAudio1);
		btAudio1.setBounds(900, 4, 60, 40);
		btAudio1.addActionListener(this);

		//novo jogo
		img.add(btNovoJogo);
		btNovoJogo.setBounds(100, 400, 200, 90);
		btNovoJogo.setIcon(novojogo);
		btNovoJogo.addActionListener(this);


		//creditos
		img.add(btCreditos);
		btCreditos.setBounds(410, 400, 200, 90);
		btCreditos.setIcon(Creditos);
		btCreditos.addActionListener(this);

		//instruções	
		img.add(btInstrucoes);
		btInstrucoes.setBounds(700, 400, 200, 90);
		btInstrucoes.setIcon(Instrucoes);
		btInstrucoes.addActionListener(this);




		//face
		img.add(btFace);
		btFace.setBounds(0, 0, 100, 90);
		btFace.setIcon(face);
		btFace.addActionListener(this);
		btFace.setBorder(null);
		btFace.setBorderPainted(false);
		btFace.setContentAreaFilled(false);
		btFace.setOpaque(false);



		//twitter
		img.add(btTwitter);
		btTwitter.setBounds(0,90,100, 90);
		btTwitter.setIcon(twitter);
		btTwitter.addActionListener(this);
		btTwitter.setBorder(null);
		btTwitter.setBorderPainted(false);
		btTwitter.setContentAreaFilled(false);
		btTwitter.setOpaque(false);


		//insta
		img.add(btInsta);
		btInsta.setBounds(0, 180, 100, 90);
		btInsta.setIcon(insta);
		btInsta.addActionListener(this);
		btInsta.setBorder(null);
		btInsta.setBorderPainted(false);
		btInsta.setContentAreaFilled(false);
		btInsta.setOpaque(false);

		this.setLocationRelativeTo(null);
		setResizable(false);//não redefinir a janela deixando no tamanho padrao 
		this.setVisible(true);

		audio.play();
		setLayout(null);

	}

	public static void main(String[] args) {
		new Janela();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btInstrucoes){
			//Criar objeto de outra janela
			Instrucoes c = new Instrucoes();

			//			c.setModal(true);
			//			c.setVisible(true);
		}
		if(e.getSource()==btNovoJogo){
			//Criar objeto de outra janela
			Cenario03 c = new Cenario03();
			this.dispose();
			//			c.setModal(true);
			//			c.setVisible(true);
		}

		if(e.getSource()==btCreditos){
			//Criar objeto de outra janela
			Creditos c = new Creditos();

			//			c.setModal(true);
			//			c.setVisible(true);
		}

		if(e.getSource()==btFace){
			//Criar objeto de outra janela
			try {
				java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.facebook.com/" ) );
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if(e.getSource()==btInsta){
			//Criar objeto de outra janela
			try {
				java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.instagram.com/?hl=pt-br" ) );
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if(e.getSource()==btTwitter){
			//Criar objeto de outra janela
			try {
				java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://twitter.com/twitter" ) );
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if(e.getSource()==btAudio){
			audio.stop();


		}
		if(e.getSource()==btAudio1){
			audio.play();

		}



	}

}
