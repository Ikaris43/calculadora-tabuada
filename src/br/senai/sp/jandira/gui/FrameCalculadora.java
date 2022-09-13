package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.Cleaner;
import java.net.URL;
import java.util.Set;

import javax.management.NotificationBroadcasterSupport;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.RecolhedorDeDados;

public class FrameCalculadora {

	public String titulo;
	public int altura;
	public int largura;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setBackground(Color.white);

		tela.setLayout(null);

		Container painel = tela.getContentPane();

//		Componentes

//		Titulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setBounds(20, 10, 150, 20);
		labelTitulo.setForeground(Color.red);
		labelTitulo.setFont(new Font("Arial Black", Font.BOLD, 20));

//		Img

//		Subtitulo

		JLabel labelSubtitulo = new JLabel();
		labelSubtitulo.setText("Com a tabuada 1.0 os seus problemas acabaram.");
		labelSubtitulo.setBounds(60, 40, 500, 20);
		labelSubtitulo.setForeground(Color.gray);

		JLabel labelSubtituloDois = new JLabel();
		labelSubtituloDois.setText("Calcule a tabuada que desejar em segundos!");
		labelSubtituloDois.setBounds(60, 55, 500, 20);
		labelSubtituloDois.setForeground(Color.gray);

//		Multiplicando

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(100, 90, 150, 20);
		labelMultiplicando.setFont(new Font("Calibri", Font.PLAIN, 20));

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(350, 90, 110, 30);
		textFieldMultiplicando.setFont(new Font("Calibri", Font.PLAIN, 15));

//		Minimo Multiplicador

		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Minimo Multiplicador: ");
		labelMinMultiplicador.setBounds(100, 140, 200, 20);
		labelMinMultiplicador.setFont(new Font("Calibri", Font.PLAIN, 20));

		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(350, 140, 110, 30);
		textFieldMinMultiplicador.setFont(new Font("Calibri", Font.PLAIN, 15));

//		Maximo Multiplicador

		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Maximo Multiplicador: ");
		labelMaxMultiplicador.setBounds(100, 190, 200, 20);
		labelMaxMultiplicador.setFont(new Font("Calibri", Font.PLAIN, 20));

		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(350, 190, 110, 30);

//		Botão Calcular

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(100, 250, 150, 40);
		buttonCalcular.setFont(new Font("Cambria", Font.PLAIN, 15));

		buttonCalcular.setContentAreaFilled(false);
		buttonCalcular.setOpaque(true);
		buttonCalcular.setBackground(Color.GREEN);
		buttonCalcular.setBorder(new LineBorder(Color.black));

//		Botão Limpar

		JButton buttonLimpar = new JButton();
		buttonLimpar.setBounds(270, 250, 150, 40);
		buttonLimpar.setText("Limpar");
		buttonLimpar.setFont(new Font("Cambria", Font.PLAIN, 15));

		buttonLimpar.setContentAreaFilled(false);
		buttonLimpar.setOpaque(true);
		buttonLimpar.setBackground(Color.ORANGE);
		buttonLimpar.setBorder(new LineBorder(Color.black));

//		Lista

		JList<String> listLista = new JList<String>();
		listLista.setBounds(100, 300, 350, 150);

		JList<String> listListaDois = new JList<String>();
		listListaDois.setBounds(100, 300, 350, 150);

//		Scroll
		JScrollPane scrollScroll = new JScrollPane(listLista);
		scrollScroll.setBounds(100, 300, 350, 150);
		scrollScroll.setBackground(null);
		
////		Imagem
//		URL url = getClass().getResource("/br/senai/sp/jandira/imagens/calculadora.png");
//		ImageIcon icone = new ImageIcon(url);
//		JLabel labelImagem = new JLabel(icone);
//		labelImagem.setIcon(icone);
//		labelImagem.setBounds(10, 500, 200, 100);

		painel.add(labelTitulo);
		painel.add(labelSubtitulo);
		painel.add(labelSubtituloDois);

		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);

		painel.add(labelMinMultiplicador);
		painel.add(textFieldMinMultiplicador);

		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMaxMultiplicador);

		painel.add(buttonCalcular);
		painel.add(buttonLimpar);

		painel.add(scrollScroll);
//		painel.add(labelImagem);


		tela.setVisible(true);

		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				RecolhedorDeDados cliente = new RecolhedorDeDados();

				if (textFieldMultiplicando.getText().matches("[A-Za-z-]")) {
					JOptionPane.showMessageDialog(tela, "Insira um número", "Aviso", JOptionPane.WARNING_MESSAGE);
				}

				else if (textFieldMinMultiplicador.getText().matches("[A-Za-z-]")) {
					JOptionPane.showMessageDialog(tela, "Insira um número", "Aviso", JOptionPane.WARNING_MESSAGE);
				}

				else if (textFieldMaxMultiplicador.getText().matches("[A-Za-z-]")) {
					JOptionPane.showMessageDialog(tela, "Insira um número", "Aviso", JOptionPane.WARNING_MESSAGE);
				}


				else if (textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "Insira um caractere numérico para multiplicar", "Aviso",
							JOptionPane.WARNING_MESSAGE);

				}
				
				else if (textFieldMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "Insira o Minimo Multiplicador", "Aviso",
							JOptionPane.WARNING_MESSAGE); 
				}

				else if (textFieldMaxMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(tela, "Insira o Maximo Multiplicador", "Aviso",
							JOptionPane.WARNING_MESSAGE);

				}
				
				else {
				
				cliente.multiplicador = Integer.parseInt(textFieldMultiplicando.getText());
				cliente.minimoMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
				cliente.maximoMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
				
				
				if (cliente.maximoMultiplicador < cliente.minimoMultiplicador) {
					JOptionPane.showMessageDialog(tela, "O Maximo Multiplicador precisa ser MAIOR que Minimo Multiplicador ", "Aviso",
							JOptionPane.WARNING_MESSAGE);
				} else {
					scrollScroll.setViewportView(listLista);
					listLista.setListData(cliente.getTabuada());
				}
				
				}

			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textFieldMultiplicando.setText(null);
				textFieldMinMultiplicador.setText(null);
				textFieldMaxMultiplicador.setText(null);

				scrollScroll.setViewportView(listListaDois);
			}

		});

	}
}
