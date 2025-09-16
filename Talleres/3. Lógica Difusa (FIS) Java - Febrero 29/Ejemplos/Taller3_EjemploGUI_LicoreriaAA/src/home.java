import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import logic.calculate;

@SuppressWarnings("serial")
public class home extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(home.class.getResource("/assets/icon.ico")));
		setMinimumSize(new Dimension(1100, 700));
		setMaximumSize(new Dimension(1100, 700));
		setTitle("Licorer\u00EDa AA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3_2 = new JLabel("Reset");
		lblNewLabel_3_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2.setFocusable(false);
		lblNewLabel_3_2.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_2.setBounds(730, 254, 60, 26);
		contentPane.add(lblNewLabel_3_2);

		JLabel lblNewLabel = new JLabel("Bienvenid@ a,");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(10, 11, 192, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Licorer\u00EDa AA");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblNewLabel_1.setFocusable(false);
		lblNewLabel_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 75));
		lblNewLabel_1.setBounds(333, 24, 419, 103);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Wake Up");
		lblNewLabel_3.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3.setFocusable(false);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(16, 255, 60, 26);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFocusTraversalKeysEnabled(false);
		lblNewLabel_2.setFocusable(false);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(home.class.getResource("/assets/bot.png")));
		lblNewLabel_2.setBounds(803, 136, 281, 409);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("\u00BFCu\u00E1l es el plan para hoy?");
		lblNewLabel_4.setFocusable(false);
		lblNewLabel_4.setFocusTraversalKeysEnabled(false);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel_4.setBounds(39, 160, 435, 73);
		contentPane.add(lblNewLabel_4);

		JSlider plan = new JSlider();
		plan.setValue(0);
		plan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setLabelFor(plan);
		plan.setBounds(38, 224, 722, 32);
		contentPane.add(plan);

		JLabel lblNewLabel_3_1 = new JLabel(
				"Personaliza los siguientes par\u00E1metros para poder recomendarte la mejor opci\u00F3n!");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setFocusable(false);
		lblNewLabel_3_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_1.setBounds(20, 107, 619, 73);
		contentPane.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2_1 = new JLabel("Relax");
		lblNewLabel_3_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2_1.setFocusable(false);
		lblNewLabel_3_2_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_2_1.setBounds(248, 255, 60, 26);
		contentPane.add(lblNewLabel_3_2_1);

		JLabel lblNewLabel_3_2_1_1 = new JLabel("Party");
		lblNewLabel_3_2_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2_1_1.setFocusable(false);
		lblNewLabel_3_2_1_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_2_1_1.setBounds(489, 255, 60, 26);
		contentPane.add(lblNewLabel_3_2_1_1);

		JLabel lblNewLabel_4_1 = new JLabel("\u00BFC\u00F3mo deseas la intensidad del licor?");
		lblNewLabel_4_1.setFocusable(false);
		lblNewLabel_4_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel_4_1.setBounds(39, 316, 435, 73);
		contentPane.add(lblNewLabel_4_1);

		JSlider intensidad = new JSlider();
		intensidad.setValue(0);
		lblNewLabel_4_1.setLabelFor(intensidad);
		intensidad.setBounds(38, 381, 722, 32);
		contentPane.add(intensidad);

		JLabel lblNewLabel_3_3 = new JLabel("Suave");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_3.setFocusable(false);
		lblNewLabel_3_3.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_3.setBounds(16, 412, 60, 26);
		contentPane.add(lblNewLabel_3_3);

		JLabel lblNewLabel_3_2_1_2 = new JLabel("Moderado");
		lblNewLabel_3_2_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2_1_2.setFocusable(false);
		lblNewLabel_3_2_1_2.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_2_1_2.setBounds(370, 412, 60, 26);
		contentPane.add(lblNewLabel_3_2_1_2);

		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("Fuerte");
		lblNewLabel_3_2_1_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2_1_2_1.setFocusable(false);
		lblNewLabel_3_2_1_2_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_3_2_1_2_1.setBounds(724, 411, 60, 26);
		contentPane.add(lblNewLabel_3_2_1_2_1);

		JLabel lblNewLabel_4_1_1 = new JLabel("\u00BFQu\u00E9 cantidad buscas?");
		lblNewLabel_4_1_1.setFocusTraversalKeysEnabled(false);
		lblNewLabel_4_1_1.setFocusable(false);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel_4_1_1.setBounds(39, 476, 435, 73);
		contentPane.add(lblNewLabel_4_1_1);

		JRadioButton animas = new JRadioButton("Pa' las \u00E1nimas");
		animas.setActionCommand("animas");
		buttonGroup.add(animas);
		animas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		animas.setHorizontalAlignment(SwingConstants.CENTER);
		animas.setBounds(174, 556, 185, 26);
		contentPane.add(animas);

		JRadioButton aburrido = new JRadioButton("Aburrido");
		aburrido.setActionCommand("aburrido");
		buttonGroup.add(aburrido);
		aburrido.setHorizontalAlignment(SwingConstants.CENTER);
		aburrido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aburrido.setBounds(361, 556, 135, 26);
		contentPane.add(aburrido);

		JRadioButton arranque = new JRadioButton("El arranque");
		arranque.setActionCommand("arranque");
		buttonGroup.add(arranque);
		arranque.setHorizontalAlignment(SwingConstants.CENTER);
		arranque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		arranque.setBounds(498, 556, 164, 26);
		contentPane.add(arranque);

		JRadioButton mort = new JRadioButton("P\u00EAcher la mort");
		mort.setActionCommand("mort");
		buttonGroup.add(mort);
		mort.setHorizontalAlignment(SwingConstants.CENTER);
		mort.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mort.setBounds(238, 586, 192, 26);
		contentPane.add(mort);

		JRadioButton nuclear = new JRadioButton("Nuclear");
		nuclear.setActionCommand("nuclear");
		buttonGroup.add(nuclear);
		nuclear.setHorizontalAlignment(SwingConstants.CENTER);
		nuclear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nuclear.setBounds(432, 585, 135, 26);
		contentPane.add(nuclear);

		JProgressBar bar = new JProgressBar();
		bar.setFocusTraversalKeysEnabled(false);
		bar.setFocusable(false);
		bar.setVisible(false);
		bar.setForeground(new Color(107, 142, 35));
		bar.setBounds(803, 624, 271, 26);
		contentPane.add(bar);

		JButton btnNewButton = new JButton("Analizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bar.setVisible(true);
				bar.setValue(15);
				if (isCantidadSelected(animas, aburrido, arranque, mort, nuclear)) {
					new calculate(plan.getValue() / 10, intensidad.getValue() / 10,
							getMl(buttonGroup.getSelection().getActionCommand()));
					String res = calculate.calculateFCL();
					System.out.println(res);
					bar.setValue(100);
					bar.setVisible(false);
					bar.setValue(0);
					// Mensaje con los valores enviados al FCL
//					JOptionPane.showMessageDialog(contentPane,
//							"Plan: " + plan.getValue() / 10 + " intensidad: " + intensidad.getValue() / 10
//									+ " Radio button: " + buttonGroup.getSelection().getActionCommand());
					JOptionPane.showMessageDialog(contentPane, res);
				} else {
					JOptionPane.showMessageDialog(contentPane, "Debe seleccionar una cantidad",
							"La cantidad es obligatoria", 2);
				}
			}

			private boolean isCantidadSelected(JRadioButton animas, JRadioButton aburrido, JRadioButton arranque,
					JRadioButton mort, JRadioButton nuclear) {
				if (animas.isSelected() || aburrido.isSelected() || arranque.isSelected() || mort.isSelected()
						|| nuclear.isSelected()) {
					return true;
				} else {
					return false;
				}
			}

			private int getMl(String cantidad) {
				switch (cantidad) {
				case "animas":
					return 200;
				case "aburrido":
					return 550;
				case "arranque":
					return 1050;
				case "mort":
					return 1500;
				case "nuclear":
					return 1900;

				default:
					return 200;
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(803, 587, 271, 32);
		contentPane.add(btnNewButton);
	}

}
