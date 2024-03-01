package control;

import model.Livro;
import vision.WindowBook;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		WindowBook j= new WindowBook();
		j.setVisible(true);
		Livro liv = new Livro();
		LivroControle livCon = new LivroControle(j, liv);
	
	}
}
