package swingMathAula;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingMathAula extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtDem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMathAula frame = new SwingMathAula();
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
	public SwingMathAula() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel newLabel = new JLabel("Numerador");
		newLabel.setBounds(5, 5, 88, 50);
		contentPane.add(newLabel);
		
		txtNum = new JTextField();
		txtNum.setBounds(111, 20, 61, 23);
		txtNum.setColumns(10);
		contentPane.add(txtNum);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(217, 5, 106, 50);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(323, 5, 106, 50);
		contentPane.add(label_2);
		
		JLabel newLabel1 = new JLabel("Denominador");
		newLabel1.setBounds(5, 55, 88, 50);
		contentPane.add(newLabel1);
		
		txtDem = new JTextField();
		txtDem.setBounds(111, 68, 61, 24);
		txtDem.setColumns(10);
		contentPane.add(txtDem);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(217, 55, 106, 50);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(323, 55, 106, 50);
		contentPane.add(label_4);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			private JTextComponent lblDiv;
			private float res;

			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getText());
				int d = Integer.parseInt(txtDem.getText());
				float div = n/d;
				res = n%d;
				lblDiv = null;
				lblDiv.setText(Float.toString(div));
				/*lblResto.setText(Float.toString(res));*/
				
			}
		});
		btnDividir.setBounds(23, 114, 88, 41);
		contentPane.add(btnDividir);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(111, 105, 106, 50);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(217, 105, 106, 50);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(323, 105, 106, 50);
		contentPane.add(label_7);
		
		JLabel lblNewLabel_2 = new JLabel("Divisão: ");
		lblNewLabel_2.setBounds(5, 166, 61, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDiv = new JLabel("0");
		lblDiv.setBounds(111, 174, 47, 23);
		contentPane.add(lblDiv);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(217, 155, 106, 50);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(323, 155, 106, 50);
		contentPane.add(label_9);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Resto: ");
		lblNewLabel_2_1_1_1.setBounds(5, 207, 61, 41);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setBounds(111, 216, 47, 23);
		contentPane.add(lblResto);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(217, 205, 106, 50);
		contentPane.add(label_10);
		
		JLabel label = new JLabel("");
		label.setBounds(323, 205, 106, 50);
		contentPane.add(label);
	}

	public float getContentPaneAlignmentX() {
		return contentPane.getAlignmentX();
	}
	public void setContentPaneAlignmentX(float alignmentX) {
		contentPane.setAlignmentX(alignmentX);
	}
}
