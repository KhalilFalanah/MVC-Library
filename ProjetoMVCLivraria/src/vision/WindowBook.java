package vision;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WindowBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtISBN;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JButton btnCadastrar;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBook frame = new WindowBook();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBook() {
		setTitle("Livraria InfoBio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3, BorderLayout.SOUTH);
		
		btnCadastrar = new JButton("Cadastrar");
		panel3.add(btnCadastrar);
		
	    btnConsultar = new JButton("Consultar");
		panel3.add(btnConsultar);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel2, BorderLayout.CENTER);
		
		JLabel lblISBN = new JLabel("ISBN  ");
		lblISBN.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel2.add(lblISBN);
		
		txtISBN = new JTextField();
		panel2.add(txtISBN);
		txtISBN.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel2.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setColumns(30);
		panel2.add(txtTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel2.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setColumns(47);
		panel2.add(txtAutor);
		
		JPanel panel1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JLabel lblGerenciamento = new JLabel("TELA DE GERENCIAMENTO DE LIVROS");
		lblGerenciamento.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel1.add(lblGerenciamento);
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public void setBtnCadastrar(JButton btnCadastrar) {
		this.btnCadastrar = btnCadastrar;
	}

	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	public JTextField getTxtISBN() {
		return txtISBN;
	}

	public void setTxtISBN(JTextField txtISBN) {
		this.txtISBN = txtISBN;
	}

	public JTextField getTxtTitulo() {
		return txtTitulo;
	}

	public void setTxtTitulo(JTextField txtTitulo) {
		this.txtTitulo = txtTitulo;
	}

	public JTextField getTxtAutor() {
		return txtAutor;
	}

	public void setTxtAutor(JTextField txtAutor) {
		this.txtAutor = txtAutor;
	}
	
	public void limpaTela() {
		txtAutor.setText("");
		txtTitulo.setText("");
		txtISBN.setText("");
	}

}
