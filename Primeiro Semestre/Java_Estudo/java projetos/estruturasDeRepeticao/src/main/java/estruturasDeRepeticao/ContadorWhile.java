package estruturasDeRepeticao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContadorWhile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorWhile frame = new ContadorWhile();
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
	public ContadorWhile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contagem");
		lblNewLabel.setBounds(10, 11, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContagem = new JLabel("");
		lblContagem.setBounds(92, 11, 72, 14);
		contentPane.add(lblContagem);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc=0;
				String contagem = "";
				while(cc<5) {
					contagem += cc+" ";
					cc++;
				}
				lblContagem.setText(contagem);
				/*lblContagem.setText("Hello world");*/
			}
		});
		btnContar.setBounds(92, 60, 89, 23);
		contentPane.add(btnContar);
	}

}
