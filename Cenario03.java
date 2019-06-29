package SpaceWar;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Cenario03 extends JFrame implements ActionListener {

	int tiajuli = 0;
	JMenuBar menuBar = new JMenuBar();
	JMenu mnSistema = new JMenu("Sistema");
	JMenuItem miSair = new JMenuItem("Sair");
	JMenuItem miSom = new JMenuItem("Som");

	//JLabelpontos = new JLabel("0");

	
	JLabel img = new JLabel(new ImageIcon(getClass().getResource("universo.jpg")));
	JLabel img1 = new JLabel(new ImageIcon(getClass().getResource("nave3.png")));
	JLabel imgMeteoro = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro1 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro2 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro3 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro4 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro5 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro6 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro7 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro8 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));
	JLabel imgMeteoro9 = new JLabel(new ImageIcon(getClass().getResource("missel03b.png")));




	//Inserindo Inimigos

	JLabel imgInimigo = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));
	JLabel imgInimigo1 = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));
	JLabel imgInimigo2 = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));
	JLabel imgInimigo3 = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));
	JLabel imgInimigo4 = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));
	JLabel imgInimigo5 = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));
	JLabel imgInimigo6 = new JLabel(new ImageIcon(getClass().getResource("meteoro3.png")));


	//posição da nave
	int PosiNavex = 440;
	int PosiNavey = 480;
	//misseis
	Stack<Integer> pilha =new Stack <>();

	int [] posicao= {0,0,0,0,0,0,0,0,0,0};





	boolean [] teste = {false, false, false, false , false, false, false, false, false, false};

	int [] vet = {1,1,1,1,1,1,1,1,1,1};
	public Cenario03(){

		this.setTitle("Space War");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1023,630);


		menuBar.setBounds(0, 0, 1023, 30);
		img.add(menuBar);
		menuBar.add(mnSistema);
		mnSistema.add(miSair);

		miSair.addActionListener(this);


		pilha.push(0);
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		pilha.push(6);
		pilha.push(7);
		pilha.push(8);
		pilha.push(9);
		this.add(img);
		img.add(img1);
		img1.setBounds(PosiNavex, PosiNavey, 125, 98);
		img.add(imgMeteoro);
		imgMeteoro.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro1);
		imgMeteoro1.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro2);
		imgMeteoro2.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro3);
		imgMeteoro3.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro4);
		imgMeteoro4.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro5);
		imgMeteoro5.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro6);
		imgMeteoro6.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro7);
		imgMeteoro7.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro8);
		imgMeteoro8.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);
		img.add(imgMeteoro9);
		imgMeteoro9.setBounds(PosiNavex+52, PosiNavey+30, 24, 38);


		//adicionando inimigos
		img.add(imgInimigo);
		imgInimigo.setBounds(0, -80, 83, 63);
		img.add(imgInimigo1);
		imgInimigo1.setBounds(180, -90, 83, 63);
		img.add(imgInimigo2);
		imgInimigo2.setBounds(360, -120, 83, 63);
		img.add(imgInimigo3);
		imgInimigo3.setBounds(500, -90, 83, 63);
		img.add(imgInimigo3);
		imgInimigo4.setBounds(600,-120, 83, 63);
		img.add(imgInimigo4);
		imgInimigo4.setBounds(780,-90, 83, 63);
		img.add(imgInimigo5);
		imgInimigo5.setBounds(880,-120, 83, 63);
		img.add(imgInimigo6);
		imgInimigo6.setBounds(650, -99, 83, 63);


		new InimigoAutomatico().start();
		new vetorx().start();
		new vetor().start();
		new testabateumet().start();

		new testabateu().start();

		this.setLocationRelativeTo(null);
		setResizable(false);//não redefinir a janela deixando no tamanho padrao
		this.setVisible(true);
		AdicionarMovimento();

		setLayout(null);

	}

	public class InimigoAutomatico extends Thread{
		public void run(){
			while (true){
				try{sleep(20);} catch(Exception erro){}
				imgInimigo.setBounds(0, imgInimigo.getY()+1, 83, 63);
				imgInimigo1.setBounds(100, imgInimigo1.getY()+2, 83, 63);
				imgInimigo2.setBounds(200, imgInimigo2.getY()+1, 83, 63);
				imgInimigo3.setBounds(400, imgInimigo3.getY()+2, 83, 63);
				imgInimigo4.setBounds(600, imgInimigo4.getY()+1, 83, 63);
				imgInimigo5.setBounds(700, imgInimigo5.getY()+2, 83, 63);
				imgInimigo6.setBounds(800, imgInimigo6.getY()+1, 83, 63);


				if(imgInimigo.getY()>630){
					imgInimigo.setBounds(0, -80, 83, 63);    
				}
				if(imgInimigo1.getY()>630){
					imgInimigo1.setBounds(0, -80, 83, 63);    
				}
				if(imgInimigo2.getY()>630){
					imgInimigo2.setBounds(0, -80, 83, 63);    
				}
				if(imgInimigo3.getY()>630){
					imgInimigo3.setBounds(0, -80, 83, 63);    
				}
				if(imgInimigo4.getY()>630){
					imgInimigo4.setBounds(0, -80, 83, 128);    
				}
				if(imgInimigo5.getY()>630){
					imgInimigo5.setBounds(0, -80, 83, 128);    
				}
				if(imgInimigo6.getY()>630){
					imgInimigo6.setBounds(0, -80, 83, 128);    
				}

			}
		}
	}

	int aux2=0;
	public void AdicionarMovimento(){
		addKeyListener(new KeyListener() {


			public void keyTyped(KeyEvent e) {


			}


			public void keyReleased(KeyEvent e) {


			}


			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==38){
					PosiNavey -=10;
				}
				if(e.getKeyCode()==40){
					PosiNavey +=10;
				}
				if(e.getKeyCode()==37){
					PosiNavex -=10;
				}
				if(e.getKeyCode()==39){
					PosiNavex +=10;
				}
				if(pilha.size()!=0) {
					if(e.getKeyCode()==32){
						int aux = pilha.pop();
						System.out.println(aux);
						vet[aux]=0;
						teste[aux]=true;
						posicao[aux]=PosiNavex;
					}
				}

				if (PosiNavey<-10){
					PosiNavey = -10;
				}
				if (PosiNavey>480){
					PosiNavey = 480;
				}
				if (PosiNavex<0){
					PosiNavex = 0;
				}
				if (PosiNavex>883){
					PosiNavex = 883;
				}
				if(vet[0]==1 && vet[1]==1 && vet[2]==1 && vet[3]==1 && vet[4]==1 && vet[5]==1 && vet[6]==1 && vet[7]==1 && vet[8]==1 && vet[9]==1) {
					img1.setBounds(PosiNavex, PosiNavey, 125, 100);
					imgMeteoro.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro1.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro2.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro3.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro4.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro5.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro6.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro7.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro8.setBounds(PosiNavex, PosiNavey, 24, 38);
					imgMeteoro9.setBounds(PosiNavex, PosiNavey, 24, 38);
				}else {
					if(vet[0]==1) {
						imgMeteoro.setBounds(PosiNavex+65, PosiNavey+45, 24, 38);
					}else {
						new Movimento().start();
					}
					if(vet[1]==1) {
						imgMeteoro1.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento1().start();
					}
					if(vet[2]==1) {
						imgMeteoro2.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento2().start();
					}
					if(vet[3]==1) {
						imgMeteoro3.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento3().start();
					}
					if(vet[4]==1) {
						imgMeteoro4.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento4().start();
					}
					if(vet[5]==1) {
						imgMeteoro5.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento5().start();
					}
					if(vet[6]==1) {
						imgMeteoro6.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento6().start();
					}
					if(vet[7]==1) {
						imgMeteoro7.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento7().start();
					}
					if(vet[8]==1) {
						imgMeteoro8.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento8().start();
					}
					if(vet[9]==1) {
						imgMeteoro9.setBounds(PosiNavex, PosiNavey, 24, 38);
					}else {
						new Movimento9().start();
					}

					img1.setBounds(PosiNavex, PosiNavey, 128, 128);
				}
				System.out.println(PosiNavex+" "+PosiNavey);
			}
		});




	}
	boolean atacar = true;
	int bateu=0;
	public class testabateu extends Thread{
		public void run() {
			while(atacar) {
				try{sleep(10);}catch(Exception erro) {}
				if(bateu==0) {
					if(bateu(img1,imgInimigo)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
					if(bateu(img1,imgInimigo1)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
					if(bateu(img1,imgInimigo2)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
					if(bateu(img1,imgInimigo3)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
					if(bateu(img1,imgInimigo4)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
					if(bateu(img1,imgInimigo5)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
					if(bateu(img1,imgInimigo6)) {
						colisao d = new colisao();
						dispose();
						bateu=1;
					}
				}


			}
		}
	}
	int aux;
	Bate kilo = new Bate();
	Medo outra = new Medo();
	public class testabateumet extends Thread{
		public void run() {
			while(true) {
				try{sleep(10);}catch(Exception erro) {}
				outra=kilo.bateu(imgInimigo, x, y);
				if(outra.aqui) {
					imgInimigo.setBounds(0, -80, 83, 63);
					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						
						aux = aux+10;
						
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						
						aux = aux+10;
					}

				}

				outra=kilo.bateu(imgInimigo1, x, y);
				if(outra.aqui) {
					imgInimigo1.setBounds(0, -80, 83, 63);

					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						aux = aux+10;
					}

				}



				outra=kilo.bateu(imgInimigo2, x, y);
				if(outra.aqui) {
					imgInimigo2.setBounds(0, -80, 83, 63);
					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						aux = aux+10;
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						aux = aux+10;
					}

				}




				outra=kilo.bateu(imgInimigo3, x, y);
				if(outra.aqui) {
					imgInimigo3.setBounds(0, -80, 83, 63);
					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						aux = aux+10;
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						aux = aux+10;
					}

				}

				outra=kilo.bateu(imgInimigo4, x, y);
				if(outra.aqui) {
					imgInimigo4.setBounds(0, -80, 83, 63);
					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						aux = aux+10;
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						aux = aux+10;
					}

				}



				outra=kilo.bateu(imgInimigo5, x, y);
				if(outra.aqui) {
					imgInimigo5.setBounds(0, -80, 83, 63);
					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						aux = aux+10;
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						aux = aux+10;
					}

				}

				outra=kilo.bateu(imgInimigo6, x, y);
				if(outra.aqui) {
					imgInimigo6.setBounds(0, -80, 83, 63);
					
					if(outra.vet==0) {
						imgMeteoro.setBounds(PosiNavex+65,-10, 24, 38);
						vet[0]=1;
						pilha.push(0);
						teste[0]=false;
						aux = aux+10;
					}
					
					
					if(outra.vet==1) {
						imgMeteoro1.setBounds(PosiNavex+65,-10, 24, 38);
						vet[1]=1;
						pilha.push(1);
						teste[1]=false;
						aux = aux+10;
					}
					
					if(outra.vet==2) {
						imgMeteoro2.setBounds(PosiNavex+65,-10, 24, 38);
						vet[2]=1;
						pilha.push(2);
						teste[2]=false;
						aux = aux+10;
					}
					
					if(outra.vet==3) {
						imgMeteoro3.setBounds(PosiNavex+65,-10, 24, 38);
						vet[3]=1;
						pilha.push(3);
						teste[3]=false;
						aux = aux+10;
					}
					
					if(outra.vet==4) {
						imgMeteoro4.setBounds(PosiNavex+65,-10, 24, 38);
						vet[4]=1;
						pilha.push(4);
						teste[4]=false;
						aux = aux+10;
					}
					
					if(outra.vet==5) {
						imgMeteoro5.setBounds(PosiNavex+65,-10, 24, 38);
						vet[5]=1;
						pilha.push(5);
						teste[5]=false;
						aux = aux+10;
					}
					
					if(outra.vet==6) {

						imgMeteoro6.setBounds(PosiNavex+65,-10, 24, 38);
						vet[6]=1;
						pilha.push(6);
						teste[6]=false;
						aux = aux+10;
					}
					
					if(outra.vet==7) {
						imgMeteoro7.setBounds(PosiNavex+65,-10, 24, 38);
						vet[7]=1;
						pilha.push(7);
						teste[9]=false;
						aux = aux+10;
					}
					if(outra.vet==8) {
						imgMeteoro8.setBounds(PosiNavex+65,-10, 24, 38);
						vet[8]=1;
						pilha.push(8);
						teste[8]=false;
						aux = aux+10;
					}
					
					
					
					if(outra.vet==9) {
						imgMeteoro9.setBounds(PosiNavex+65,-10, 24, 38);
						vet[9]=1;
						pilha.push(9);
						teste[9]=false;
						aux = aux+10;
					}
				}
System.out.println(aux);


			}
		}
	}



	public class Movimento extends Thread{
		public void run(int i) {
			if(i==1){
				teste[0]=false;
			}
			while(teste[0]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro.setBounds(posicao[0],imgMeteoro.getY()-1,200,100);
				if(imgMeteoro.getY()<-10) {
					teste[0]=false;
					pilha.push(0);
					vet[0]=1;
				}
			}
		}
	}

	public class Movimento1 extends Thread{
		public void run() {
			while(teste[1]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro1.setBounds(posicao[1],imgMeteoro1.getY()-1,24,38);
				if(imgMeteoro1.getY()<-10) {
					teste[1]=false;
					pilha.push(1);
					vet[1]=1;
					imgMeteoro1.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento2 extends Thread{
		public void run() {
			while(teste[2]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro2.setBounds(posicao[2],imgMeteoro2.getY()-1,24,38);
				if(imgMeteoro2.getY()<-10) {
					teste[2]=false;
					pilha.push(2);
					vet[2]=1;
					imgMeteoro2.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento3 extends Thread{
		public void run() {
			while(teste[3]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro3.setBounds(posicao[3],imgMeteoro3.getY()-1,24,38);
				if(imgMeteoro3.getY()<-10) {
					teste[3]=false;
					pilha.push(3);
					vet[3]=1;
					imgMeteoro3.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento4 extends Thread{
		public void run() {
			while(teste[4]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro4.setBounds(posicao[4],imgMeteoro4.getY()-1,24,38);
				if(imgMeteoro4.getY()<-10) {
					teste[4]=false;
					pilha.push(4);
					vet[4]=1;
					imgMeteoro4.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento5 extends Thread{
		public void run() {
			while(teste[5]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro5.setBounds(posicao[5],imgMeteoro5.getY()-1,24,38);
				if(imgMeteoro5.getY()<-10) {
					teste[5]=false;
					pilha.push(5);
					vet[5]=1;
					imgMeteoro5.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento6 extends Thread{
		public void run() {
			while(teste[6]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro6.setBounds(posicao[6],imgMeteoro6.getY()-1,24,38);
				if(imgMeteoro6.getY()<-10) {
					teste[6]=false;
					pilha.push(6);
					vet[6]=1;
					imgMeteoro6.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento7 extends Thread{
		public void run() {
			while(teste[7]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro7.setBounds(posicao[7],imgMeteoro7.getY()-1,24,38);
				if(imgMeteoro7.getY()<-10) {
					teste[7]=false;
					pilha.push(7);
					vet[7]=1;
					imgMeteoro7.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	public class Movimento8 extends Thread{
		public void run() {
			while(teste[8]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro8.setBounds(posicao[8],imgMeteoro8.getY()-1,24,38);
				if(imgMeteoro8.getY()<-10) {
					teste[8]=false;
					pilha.push(8);
					vet[8]=1;
					imgMeteoro8.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}

	public class Movimento9 extends Thread{
		public void run() {
			while(teste[9]) {
				try{sleep(10);}catch(Exception erro) {}
				imgMeteoro9.setBounds(posicao[9],imgMeteoro9.getY()-1,24,38);
				if(imgMeteoro9.getY()<-10) {
					teste[9]=false;
					pilha.push(9);
					vet[9]=1;
					imgMeteoro9.setBounds(PosiNavex, PosiNavey, 24, 38);
				}
			}
		}
	}
	int [] y = new int [10];
	public class vetor extends Thread{
		public void run() {
			while(true) {
				try{sleep(10);}catch(Exception erro) {}
				y[0]=imgMeteoro.getY();
				y[1]=imgMeteoro1.getY();
				y[2]=imgMeteoro2.getY();
				y[3]=imgMeteoro3.getY();
				y[4]=imgMeteoro4.getY();
				y[5]=imgMeteoro5.getY();
				y[6]=imgMeteoro6.getY();
				y[7]=imgMeteoro7.getY();
				y[8]=imgMeteoro8.getY();
				y[9]=imgMeteoro9.getY();



			}
		}
	}
	int [] x = new int [10];
	public class vetorx extends Thread{
		public void run() {
			while(true) {
				try{sleep(10);}catch(Exception erro) {}
				x[0]=imgMeteoro.getX();
				x[1]=imgMeteoro1.getX();
				x[2]=imgMeteoro2.getX();
				x[3]=imgMeteoro3.getX();
				x[4]=imgMeteoro4.getX();
				x[5]=imgMeteoro5.getX();
				x[6]=imgMeteoro6.getX();
				x[7]=imgMeteoro7.getX();
				x[8]=imgMeteoro8.getX();
				x[9]=imgMeteoro9.getX();



			}
		}
	}



	public boolean bateu(Component Img, Component Inimigo) {
		int aX = Img.getX();
		int aY = Img.getY();
		int ladoDireitoA = aX+Img.getWidth();
		int ladoEsquerdoA= aX;
		int ladoBaixoA= aY+Img.getHeight();
		int ladoCimaA= aY;

		int bX = Inimigo.getX();
		int bY = Inimigo.getY();
		int ladoDireitoB = bX+Inimigo.getWidth();
		int ladoEsquerdoB= bX;
		int ladoBaixoB= bY+Inimigo.getHeight();
		int ladoCimaB= bY;
		if(Math.abs((bY+Inimigo.getHeight())-aY)<=40 ||Math.abs((bY+Inimigo.getHeight())-aY)>=100  ) {
			ladoDireitoA=aX+Img.getWidth()-48;
		}else {
			if(Math.abs((bY+Inimigo.getHeight())-aY)>=100 ) {
				ladoDireitoA=aX+Img.getWidth()+48;
			}
		}
		if(Math.abs((bY+Inimigo.getHeight())-aY)<=40 ) {
			ladoEsquerdoA=aX+Img.getWidth()-48;
		}else {
			if(Math.abs((bY+Inimigo.getHeight())-aY)>=100 ) {
				ladoEsquerdoA=aX+Img.getWidth()+48;
			}
		}
		boolean bateu = false;

		boolean cDireita=false;
		boolean cCima=false;
		boolean cBaixo=false;
		boolean cEsquerda=false;

		if(ladoDireitoA>=ladoEsquerdoB) {
			cDireita=true;
		}
		if(ladoCimaA<=ladoBaixoB) {
			cCima=true;
		}
		if(ladoBaixoA>=ladoCimaB) {
			cBaixo=true;
		}
		if(ladoEsquerdoA<=ladoDireitoB) {
			cEsquerda=true;
		}

		if(cDireita && cEsquerda && cBaixo && cCima) {
			bateu = true;
		}

		return bateu;
	}

	public static void main(String[] args) {
		Cenario03 c = new Cenario03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==miSair){
			//Criar objeto de outra janela

			this.dispose();


		}

	}

}
