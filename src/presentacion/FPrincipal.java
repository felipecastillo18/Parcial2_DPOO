package presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener{
	
	private JLabel lResultado;
	private JButton boton = new JButton();
	private String textoBoton = "Calcular";
	private Parcial parcial;
	
	private JTextField a;
	private JTextField b;
	private JTextField c;

	
	public FPrincipal() {
		this.parcial = new Parcial(0, 0, 0);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Examen Hector Florez");		
		this.setBounds((int)pantalla.getWidth()/2 - 200, (int)pantalla.getHeight()/2 - 300, 400, 600);

		this.lResultado = new JLabel("0");
		this.lResultado.setFont(new Font("Arial", Font.BOLD, 60));
		this.lResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.lResultado, BorderLayout.SOUTH);
		
		this.boton.setFont(new Font("Arial", Font.PLAIN, 20));
		this.boton.setText(textoBoton);
		this.boton.addActionListener(this);
		this.add(boton, BorderLayout.SOUTH);

		
		JPanel pSur = new JPanel();
		pSur.setLayout(new GridLayout(2, 1));

		JPanel pCampos = new JPanel();
		pCampos.setLayout(new FlowLayout());
		this.a = new JTextField(5);
		this.b = new JTextField(5);
		this.c = new JTextField(5);
		pCampos.add(new JLabel("a:"));
		pCampos.add(this.a);
		pCampos.add(new JLabel("b:"));
		pCampos.add(this.b);
		pCampos.add(new JLabel("c:"));
		pCampos.add(this.c);
		pSur.add(pCampos);
		
		this.add(pSur, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		this.boton.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

		
}
