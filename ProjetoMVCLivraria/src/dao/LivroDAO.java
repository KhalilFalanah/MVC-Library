package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import model.Livro;

public class LivroDAO {

	File arq;
	
	public LivroDAO() {
		
	arq = new File("livros.txt");
	
	}
	
	public boolean cadastraLivro(Livro li) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			 fw = new FileWriter(arq, true);
			 bw= new BufferedWriter(fw);
			
			bw.write(li.toString());
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally {
			try {
			fw.close();
			bw.close();
			}
			catch(IOException e){
				
				e.printStackTrace();
			}
		}
		return true;
		
	}
	
	public boolean consultaLivro(Livro li){
		
		boolean resposta = false;
	
		
		
		try {
			
			FileReader fr = new FileReader(arq);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = null;
			String[] campos = new String[3];
			
			
			while((linha=br.readLine())!= null) {
				campos = linha.split("#");
				
				if(campos[0].equals(li.getISBN())) {
					
					li.setTitulo(campos[1]);
					li.setAutor(campos[2]);
					
					resposta = true;
					break;
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resposta;
		
		
	}
	
}
