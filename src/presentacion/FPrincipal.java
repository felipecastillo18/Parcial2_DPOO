package presentacion;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener{

	private JLabel lResultado;
	private JButton boton;
	private Parcial parcial;

	private JTextField a;
	private JTextField b;
	private JTextField c;

	public FPrincipal() {
		this.parcial = new Parcial(0, 0, 0);
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Examen Hector Florez");
		this.setBounds((int)pantalla.getWidth()/2 - 200, (int)pantalla.getHeight()/2 - 300, 400, 600);

		JLabel lA = new JLabel("a:  ");
		lA.setFont(new Font("Arial", Font.PLAIN, 20));
		lA.setHorizontalAlignment(SwingConstants.RIGHT);
		JLabel lB = new JLabel("b:  ");
		lB.setFont(new Font("Arial", Font.PLAIN, 20));
		lB.setHorizontalAlignment(SwingConstants.RIGHT);
		JLabel lC = new JLabel("c:  ");
		lC.setFont(new Font("Arial", Font.PLAIN, 20));
		lC.setHorizontalAlignment(SwingConstants.RIGHT);

		this.a = new JTextField();
		this.a.setFont(new Font("Arial", Font.PLAIN, 20));
		this.b = new JTextField();
		this.b.setFont(new Font("Arial", Font.PLAIN, 20));
		this.c = new JTextField();
		this.c.setFont(new Font("Arial", Font.PLAIN, 20));

		this.boton = new JButton("Calcular");
		this.boton.setFont(new Font("Arial", Font.PLAIN, 20));
		this.boton.addActionListener(this);

		this.lResultado = new JLabel("");
		this.lResultado.setFont(new Font("Arial", Font.BOLD, 30));

		this.add(lA);
		this.add(this.a);
		this.add(lB);
		this.add(this.b);
		this.add(lC);
		this.add(this.c);
		this.add(this.boton);
		this.add(this.lResultado);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int va = Integer.parseInt(this.a.getText());
			int vb = Integer.parseInt(this.b.getText());
			int vc = Integer.parseInt(this.c.getText());
			this.lResultado.setText(this.parcial.calcularRaices(va, vb, vc));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}