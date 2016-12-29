package Trabalho;

import java.util.*;

public class Diretorio extends Atribuicoes {
	public double size = 0.00;
	
	Diretorio(String name, String path){
		this.name = name;
		this.path = path+"/"+name;
	}
	
	ArrayList<Diretorio> arraydir = new ArrayList<Diretorio>();
	ArrayList<Arquivo> arrayarq = new ArrayList<Arquivo>();
	
//	public String getName(){
//		return this.nome;
//	}
	
	public void includeDir(Diretorio dir){
		
			dir.path = this.path+"/"+dir.name;
			arraydir.add(dir);
			if (dir.arraydir.size()==0 && dir.arrayarq.size()==0){
		else {
			arrumaArv(dir);
		}
	}
	
	public void arrumaArv(Diretorio dir){
		Iterator<Diretorio> it = dir.arraydir.iterator();
		if (it.hasNext()){
			Diretorio dir2 = it.next();
			dir2.path = dir.path+"/"+dir2.path;
			arrumaArv(dir2);
		}
	}
	
	public void includeArq(String name, Arquivo arq){
		arq.path = this.path+"/"+arq.name;
		arrayarq.add(arq);
	}
	
}
