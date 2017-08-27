package MesadasDeGranito;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Deposito {
	
	Mesada [] vecMesadas; 
	int cantidad;
	
	public Deposito (String path)throws IOException{
		int aux;
		Scanner sc = new Scanner(new File(path));
		vecMesadas = new Mesada [aux=sc.nextInt()];
		System.out.println(aux);
		for (int i = 0; i < vecMesadas.length ; i++) {
			vecMesadas[i] = new Mesada (sc.nextInt(),sc.nextInt());
		}
		
		
		sc.close();
		
	}
	
	public void resolver (){
		int i=0,anc=100,alt=100,aux=0,may=0;
		boolean band=false;
		while(!(i == vecMesadas.length && band==false)){
			
		if(i==vecMesadas.length){
			i=0;
			band=false;
			alt=100;
			anc=100;
			aux=0;
		}
		if(vecMesadas[i].isColocado()!=true &&  vecMesadas[i].domina(alt, anc)){
			vecMesadas[i].setColocado(true);
			alt=vecMesadas[i].getAlto();
			anc=vecMesadas[i].getAncho();
			band=true;
			aux++;
		}
		
		if(aux>may)
			may=aux;
		
		i++;
		
		}
		
		System.out.println(may);
	}

}
