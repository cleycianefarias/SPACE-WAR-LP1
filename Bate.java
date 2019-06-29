package SpaceWar;

import java.awt.Component;

public class Bate {
	public Medo bateu(Component Img, int [] vet, int []vety) {

    	Medo nome=new Medo();
   	 for(int i=0;i<vet.length;i++) {
        	int aX = Img.getX();
        	int aY = Img.getY();
        	int ladoDireitoA = aX+Img.getWidth();
        	int ladoEsquerdoA= aX;
        	int ladoBaixoA= aY+Img.getHeight();
        	int ladoCimaA= aY;
       	 
        	int bX = vet[i];
        	int bY = vety[i];
        	int ladoDireitoB = bX+83;
        	int ladoEsquerdoB= bX;
        	int ladoBaixoB= bY+63;
        	int ladoCimaB= bY;
        	if(Math.abs((bY+63)-aY)<=40 ||Math.abs((bY+63)-aY)>=100  ) {
       		 ladoDireitoA=aX+Img.getWidth()-48;
        	}else {
       		 if(Math.abs((bY+63)-aY)>=100 ) {
       			 ladoDireitoA=aX+Img.getWidth()+48;
       		 }
        	}
        	if(Math.abs((bY+63)-aY)<=40 ) {
       		 ladoEsquerdoA=aX+Img.getWidth()-48;
        	}else {
       		 if(Math.abs((bY+63)-aY)>=100 ) {
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
       		 nome.vet=i;
            	nome.aqui = true;
        	}
  	 
   	 }
  	 
    	return nome;
	}

}

