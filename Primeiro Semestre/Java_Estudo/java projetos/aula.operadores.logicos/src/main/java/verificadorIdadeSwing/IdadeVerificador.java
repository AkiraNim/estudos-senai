package verificadorIdadeSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IdadeVerificador extends JFrame {

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
					IdadeVerificador frame = new IdadeVerificador();
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
	public IdadeVerificador() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de nascimento");
		lblNewLabel.setBounds(10, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdades = new JLabel("Idade");
		lblIdades.setBounds(10, 130, 57, 14);
		contentPane.add(lblIdades);
		
		JLabel lblSituao = new JLabel("Situação");
		lblSituao.setBounds(10, 155, 63, 14);
		contentPane.add(lblSituao);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setBounds(103, 130, 116, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSituacao = new JLabel("");
		lblSituacao.setBounds(103, 155, 126, 14);
		contentPane.add(lblSituacao);
		
		JButton btnCalc = new JButton("Calcular Idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano=Integer.parseInt(txtAno.getText());
				int idade = 2024-ano;
				String situacao;
				
				if(idade<16) situacao="Não vota";
				
				else{
					situacao=((idade>=16 && idade<18) || (idade>70))?"Voto opcional":"Voto obrigatorio";
				}
				
				lblIdade.setText(Integer.toString(idade));
				lblSituacao.setText(situacao);
				/*lblSituacao.setText("Hello world");*/
			}
		});
		btnCalc.setBounds(34, 73, 126, 23);
		contentPane.add(btnCalc);
		
		txtAno = new JTextField();
		txtAno.setBounds(133, 8, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		
	}
}
