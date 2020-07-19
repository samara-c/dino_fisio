import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import java.awt.Font;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private final JTextField textFieldNome;
	private final JTextField textFieldTelefone;
	private final JTextField textFieldTelRes;
	private final JTextField textFieldEndereco;
	private final JTextField textFieldNumero;
	private final JTextField textFieldBairro;
	private final JTextField textFieldCidade;
	private final JTextField textFieldNumDoc1;
	private final JTextField textFieldResponsavel;
	private final JTextField textFieldEmail;
	private final JTextField textFieldObs;
	private final JTextField textFieldComplemento;
	private final JTextField textFieldNumDoc2;
	private final JTextField textFieldOutroTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("InternalFrame.borderColor"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(603,620);
		setTitle("Cadastrar novo paciente");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminino");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		ButtonGroup radioGroup  = new ButtonGroup();
		radioGroup.add(rdbtnNewRadioButton);
		radioGroup.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone residencial:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldTelRes = new JTextField();
		textFieldTelRes.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Telefone celular:");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_3 = new JLabel("Data de Nascimento:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_4 = new JLabel("Menor de 18 anos?");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "Sim"}));
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Endere\u00E7o:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_6 = new JLabel("N\u00FAmero:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldBairro = new JTextField();
		textFieldBairro.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Bairro:");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cidade:");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		
		JLabel lblNewLabel_9 = new JLabel("UF:");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldNumDoc1 = new JTextField();
		textFieldNumDoc1.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("N\u00FAmero documento:");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldResponsavel = new JTextField();
		textFieldResponsavel.setEnabled(false);
		textFieldResponsavel.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Nome do respons\u00E1vel:");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_11.setEnabled(false);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox_3.setEnabled(false);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"M\u00E3e", "Pai", "Irm\u00E3o", "Av\u00F4", "Tio", "Outro"}));
		
		JLabel lblNewLabel_12 = new JLabel("Parentesco");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_12.setEnabled(false);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("E-mail:");
		lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldObs = new JTextField();
		textFieldObs.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Obs.");
		lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldComplemento = new JTextField();
		textFieldComplemento.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Complemento:");
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnLimparForm = new JButton("Limpar formulario");
		btnLimparForm.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton botaoEnviarCadastro = new JButton("Enviar cadastro");
		botaoEnviarCadastro.setFont(new Font("Arial", Font.PLAIN, 12));
		botaoEnviarCadastro.addActionListener(new EnviarCadastro());
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setFont(new Font("Arial", Font.PLAIN, 12));
		botaoVoltar.addActionListener(new EventoVoltar());
		
		JLabel lblNewLabel_16 = new JLabel("Outras informa\u00E7\u00F5es");
		lblNewLabel_16.setFont(new Font("Arial", Font.PLAIN, 11));
		
		final JFormattedTextField textFieldDataNasc = new JFormattedTextField();
		
		JTextArea textAreaInfo = new JTextArea();
		textAreaInfo.setToolTipText("Pergunte ao paciente qual a sua principal queixa (o que lhe trouxe aqui)");
		
		JLabel lblNewLabel_10_1 = new JLabel("Tipo doc.");
		lblNewLabel_10_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		textFieldNumDoc2 = new JTextField();
		textFieldNumDoc2.setColumns(10);
		
		JLabel lblNewLabel_10_2 = new JLabel("N\u00FAmero documento:");
		lblNewLabel_10_2.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Tipo doc.");
		lblNewLabel_10_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"CPF", "RG", "Passaporte", "RNE", "Carteira de Motorista"}));
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"CPF", "RG", "Passaporte", "RNE", "Carteira de Motorista"}));
		
		textFieldOutroTel = new JTextField();
		textFieldOutroTel.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Outro telefone:");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botaoVoltar)
									.addPreferredGap(ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
									.addComponent(btnLimparForm, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(botaoEnviarCadastro, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
									.addGap(4))
								.addComponent(lblNewLabel_5)
								.addComponent(textFieldEndereco, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_13)
											.addGap(299)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_14)
										.addComponent(textFieldObs, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnNewRadioButton)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(12)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_6)
														.addComponent(textFieldNumero, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(2)
													.addComponent(rdbtnNewRadioButton_1))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(textFieldComplemento, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
														.addComponent(lblNewLabel_15))))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addComponent(lblNewLabel_1)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3)
										.addComponent(textFieldDataNasc, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldTelRes, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldOutroTel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
									.addGap(8))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldBairro, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_7))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_8)
										.addComponent(textFieldCidade, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox_2, 0, 93, Short.MAX_VALUE)
										.addComponent(lblNewLabel_9)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textFieldResponsavel, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_11))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_12)
											.addGap(13))
										.addComponent(comboBox_3, 0, 85, Short.MAX_VALUE))))
							.addGap(70))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textAreaInfo, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
							.addGap(62))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_16)
							.addContainerGap(481, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldNumDoc1, 153, 153, 153)
								.addComponent(lblNewLabel_10))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_10_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_10_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldNumDoc2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_10_1_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(61, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_2_1)
						.addComponent(lblNewLabel_2_1_1))
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTelRes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldOutroTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_15))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_9))
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_11)
						.addComponent(lblNewLabel_12))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldResponsavel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_13)
						.addComponent(lblNewLabel_14))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldObs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(lblNewLabel_10_1)
						.addComponent(lblNewLabel_10_2)
						.addComponent(lblNewLabel_10_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNumDoc1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNumDoc2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
					.addComponent(lblNewLabel_16)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textAreaInfo, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(botaoVoltar)
						.addComponent(btnLimparForm)
						.addComponent(botaoEnviarCadastro))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	private class EventoVoltar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new CertezaAcaoJPanel("voltar");
			
			
		}
		
		
	}
	
	private class EnviarCadastro implements ActionListener {
		
		
		public boolean checarCadastro () {
			
			if (textFieldNome.getText().isEmpty()) {
				System.out.println("esta vazio");
				return true;
			}
			
			return false;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (textFieldNome.getText().isEmpty() || textFieldTelefone.getText().isEmpty() || textFieldTelRes.getText().isEmpty() || textFieldOutroTel.getText().isEmpty()
					|| textFieldEndereco.getText().isEmpty())  {
				System.out.println("esta vazio");
			}
		}
		
		
	}
}
