package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.LivroDAO;
import model.Livro;
import vision.WindowBook;

public class LivroControle implements ActionListener {
	
	private WindowBook jan;
	private Livro liv;
	private LivroDAO lidao;
	
	
	public LivroControle(WindowBook jan, Livro liv) {

		this.jan = jan;
		this.liv = liv;
		lidao = new LivroDAO();
		registraListenersAcao();
	}

	public void registraListenersAcao()
	{
		jan.getBtnCadastrar().addActionListener(this);
		jan.getBtnConsultar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Cadastrar"))
		{
			String isbn = jan.getTxtISBN().getText();
			String titulo= jan.getTxtTitulo().getText();
			String autor = jan.getTxtAutor().getText();
			liv.setAutor(autor);
			liv.setISBN(isbn);
			liv.setTitulo(titulo);
			
			if(lidao.cadastraLivro(liv)) {
				System.out.println("Dados gravados com sucesso!!");
				jan.limpaTela();
			}
			else {
				System.out.println("Probelmas na gravação dos dados");
			}
			
		
			
		}
		else if(e.getActionCommand().equals("Consultar")) {
			String isbn = jan.getTxtISBN().getText();
			liv.setISBN(isbn);
		
			if(lidao.consultaLivro(liv)) {
				
			jan.getTxtAutor().setText(liv.getAutor());
			jan.getTxtTitulo().setText(liv.getTitulo());
			
			}
			else
			{
				System.out.println("Livro não encontrado.");
			}
		}
		
	}
	
	

}
