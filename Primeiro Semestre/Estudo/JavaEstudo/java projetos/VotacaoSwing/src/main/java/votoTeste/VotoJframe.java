package votoTeste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VotoJframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotoJframe frame = new VotoJframe();
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
	public VotoJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(10, 11, 99, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(119, 8, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JButton btnVoto = new JButton("Posso Votar?");
		
		JLabel lblIdade_1 = new JLabel("Sua idade: ");
		lblIdade_1.setBounds(10, 80, 65, 14);
		contentPane.add(lblIdade_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 105, 175, 14);
		contentPane.add(lblResultado);
		
		JLabel lblIdade = new JLabel("");
		lblIdade.setBounds(85, 80, 86, 14);
		contentPane.add(lblIdade);
		
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtAno.getText());
				int i = 2024-a;
				
				lblIdade.setText(Integer.toString(i));
				if(i<16) lblResultado.setText("Idade insuficiente para votar");
				else if(i>=16 && i<18 || i>70) lblResultado.setText("Voto opcional");
				else lblResultado.setText("Voto obrigatório");
			}
		});
		btnVoto.setBounds(62, 46, 123, 23);
		contentPane.add(btnVoto);

	}
}
