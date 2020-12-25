package Restaurent_s;

import java.awt.EventQueue;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Rest {

	private JFrame frame;
	private JTextField textFieldChicken_Burger;
	private JTextField textField_Burger_Meal;
	private JTextField textField_Cheese_Burger;
	private JTextField textField_Qty;
	private JTextField jtxtConvert;
	private JTextArea textArea;;
	
	
	double firstNum;
	double secondNum;
	double result;
	String operation;
	
	double[] i = new double[5];
	
	double India = 1;
	double USA = 74.85;
	double Canadian_Dollar = 56.53;
	double Qatari_riyal = 20.56;
	double Saudi_riyal = 19.96;
	double Sri_lanka =0.41;
	double Russia = 1.03;
	double Singapore = 54.61;
	protected JLabel jlbl_Conver;
	private JTextField jtxtConversion;
	private JTextField textDisplay;
	private JTextField textField_Wrap;
	
	/**
	 * 
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rest window = new Rest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 600, 1120, 700); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(10, 94, 508, 288);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(26, 22, 133, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(26, 49, 160, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Burger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(26, 78, 133, 29);
		panel.add(lblNewLabel_1_2);
		
		textFieldChicken_Burger = new JTextField();
		textFieldChicken_Burger.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldChicken_Burger.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldChicken_Burger.setBounds(262, 28, 153, 20);
		panel.add(textFieldChicken_Burger);
		textFieldChicken_Burger.setColumns(10);
		
		textField_Burger_Meal = new JTextField();
		textField_Burger_Meal.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Burger_Meal.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_Burger_Meal.setColumns(10);
		textField_Burger_Meal.setBounds(262, 54, 153, 20);
		panel.add(textField_Burger_Meal);
		
		textField_Cheese_Burger = new JTextField();
		textField_Cheese_Burger.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Cheese_Burger.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_Cheese_Burger.setColumns(10);
		textField_Cheese_Burger.setBounds(262, 83, 153, 20);
		panel.add(textField_Cheese_Burger);
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(262, 168, 46, 35);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Drink");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(26, 171, 46, 35);
		panel.add(lblNewLabel_3_1);
		
		textField_Qty = new JTextField();
		textField_Qty.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Qty.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_Qty.setBounds(262, 208, 153, 20);
		panel.add(textField_Qty);
		textField_Qty.setColumns(10);
		
		JCheckBox CheckBox_Tax = new JCheckBox("Tax");
		CheckBox_Tax.setFont(new Font("Tahoma", Font.BOLD, 15));
		CheckBox_Tax.setBounds(262, 235, 97, 23);
		panel.add(CheckBox_Tax);
		
		JComboBox comboBox_Drink = new JComboBox();
		comboBox_Drink.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Orange Juice", "Tea", "Ice Tea", "Cola", "Coffee", "Ice Coffee", "Coke"}));
		comboBox_Drink.setToolTipText("Item\r\na\r\nb\r\nc\r\nd");
		comboBox_Drink.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_Drink.setBounds(26, 206, 145, 20);
		panel.add(comboBox_Drink);
		
		JCheckBox CheckBox_Home_Delivery = new JCheckBox("Home Delivery");
		CheckBox_Home_Delivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		CheckBox_Home_Delivery.setBounds(26, 235, 160, 23);
		panel.add(CheckBox_Home_Delivery);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 158, 389, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Paneer Wrap");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(26, 105, 133, 29);
		panel.add(lblNewLabel_1_2_1);
		
		textField_Wrap = new JTextField();
		textField_Wrap.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Wrap.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_Wrap.setColumns(10);
		textField_Wrap.setBounds(262, 110, 153, 20);
		panel.add(textField_Wrap);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(528, 94, 265, 288);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_Convert = new JComboBox();
		comboBox_Convert.setModel(new DefaultComboBoxModel(new String[] {"Currency Convertor", "India", "USA(American)", "Canadian Dollar", "Qatari Riyal", "Saudi Riyal", "Sri Lanka", "Russia", "Singapore"}));
		comboBox_Convert.setToolTipText("Item\r\na\r\nb\r\nc\r\nd");
		comboBox_Convert.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_Convert.setBounds(21, 25, 221, 33);
		panel_1.add(comboBox_Convert);
		
		jtxtConversion = new JTextField();
		jtxtConversion.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtConversion.setFont(new Font("Tahoma", Font.BOLD, 12));
		jtxtConversion.setColumns(10);
		jtxtConversion.setBounds(21, 101, 221, 33);
		panel_1.add(jtxtConversion);
		jtxtConversion.setColumns(10);
		
		JLabel jlbl_Conver = new JLabel("");
		jlbl_Conver.setHorizontalAlignment(SwingConstants.CENTER);
		jlbl_Conver.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_Conver.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlbl_Conver.setBounds(21, 157, 221, 33);
		panel_1.add(jlbl_Conver);
		//=====================Convert=======================
		/*double India = 100.68;
	double USA = 74.85;
	double Canadian_Dollar = 56.53;
	double Qatari_riyal = 20.56;
	double Saudi_riyal = 19.96;
	double Sri_lanka =0.41;
	double Russi = 1.03;
	double Singapore = 54.61;
	protected JLabel jlbl_Conver;
	private JTextField jtxtConversion;*/
		JButton btn_Convert = new JButton("Convert");
		btn_Convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double British_Pound = Double.parseDouble(jtxtConversion.getText());
				if(comboBox_Convert.getSelectedItem().equals("India"))
				{
					String cConvert_1 = String.format("Rs.  %.2f", British_Pound * India);
					jlbl_Conver.setText(cConvert_1);
				}
				if(comboBox_Convert.getSelectedItem().equals("USA(American)"))
				{
					String cConvert_2 = String.format("Rs.  %.2f", British_Pound * USA);
					jlbl_Conver.setText(cConvert_2);
				}
				if(comboBox_Convert.getSelectedItem().equals("Canadian Dollar"))
				{
					String cConvert_3 = String.format("Rs.  %.2f", British_Pound * Canadian_Dollar);
					jlbl_Conver.setText(cConvert_3);
				}
				if(comboBox_Convert.getSelectedItem().equals("Qatari Riyal"))
				{
					String cConvert_4 = String.format("Rs.  %.2f", British_Pound * Qatari_riyal);
					jlbl_Conver.setText(cConvert_4);
				}
				if(comboBox_Convert.getSelectedItem().equals("Saudi Riyal"))
				{
					String cConvert_5 = String.format("Rs.  %.2f", British_Pound * Saudi_riyal);
					jlbl_Conver.setText(cConvert_5);
				}
				if(comboBox_Convert.getSelectedItem().equals("Sri Lanka"))
				{
					String cConvert_6 = String.format("Rs.  %.2f", British_Pound * Sri_lanka);
					jlbl_Conver.setText(cConvert_6);
				}
				if(comboBox_Convert.getSelectedItem().equals("Russia"))
				{
					String cConvert_7 = String.format("Rs.  %.2f", British_Pound * Russia);
					jlbl_Conver.setText(cConvert_7);
				}
				if(comboBox_Convert.getSelectedItem().equals("Singapore"))
				{
					String cConvert_8 = String.format("Rs.  %.2f", British_Pound * Singapore);
					jlbl_Conver.setText(cConvert_8);
				}
				if(comboBox_Convert.getSelectedItem().equals("Currency Convertor"))
				{
					
					jlbl_Conver.setText("0");
					
				}
				
				
			}
		});
		btn_Convert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Convert.setBounds(21, 220, 107, 23);
		panel_1.add(btn_Convert);
		
		JButton btn_Close = new JButton("Close");
		btn_Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jlbl_Conver.setText(null);
				jtxtConversion.setText(null);
				comboBox_Convert.setSelectedItem("Select Once");
			}
		});
		btn_Close.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Close.setBounds(138, 220, 104, 23);
		panel_1.add(btn_Close);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(10, 393, 508, 130);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl_C_Drink = new JLabel("Cost of Drink");
		lbl_C_Drink.setForeground(new Color(0, 0, 0));
		lbl_C_Drink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_C_Drink.setBounds(30, 11, 133, 29);
		panel_2.add(lbl_C_Drink);
		
		JLabel lbl_C_Meal = new JLabel("Cost of Meal");
		lbl_C_Meal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_C_Meal.setBounds(30, 51, 133, 29);
		panel_2.add(lbl_C_Meal);
		
		JLabel lbl_C_Delivery = new JLabel("Cost of Delivery");
		lbl_C_Delivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_C_Delivery.setBounds(30, 91, 133, 29);
		panel_2.add(lbl_C_Delivery);
		
		JLabel jlbl_C_Drink = new JLabel("");
		jlbl_C_Drink.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_C_Drink.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_C_Drink.setBounds(259, 20, 143, 20);
		jlbl_C_Drink.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlbl_C_Drink);
		
		JLabel jlbl_C_Meal = new JLabel("");
		jlbl_C_Meal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_C_Meal.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_C_Meal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlbl_C_Meal.setBounds(259, 60, 143, 20);
		panel_2.add(jlbl_C_Meal);
		
		JLabel jlbl_C_Delivery = new JLabel("");
		jlbl_C_Delivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_C_Delivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_C_Delivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlbl_C_Delivery.setBounds(259, 100, 143, 20);
		panel_2.add(jlbl_C_Delivery);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1_1.setBounds(528, 393, 265, 130);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lbl_Tax = new JLabel("Tax");
		lbl_Tax.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Tax.setBounds(10, 10, 96, 29);
		panel_1_1.add(lbl_Tax);
		
		JLabel lbl_Sub_Total = new JLabel("Sub Total");
		lbl_Sub_Total.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Sub_Total.setBounds(10, 50, 88, 29);
		panel_1_1.add(lbl_Sub_Total);
		
		JLabel lbl_Total = new JLabel("Total");
		lbl_Total.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_Total.setBounds(10, 90, 88, 29);
		panel_1_1.add(lbl_Total);
		
		JLabel jlbl_Tax = new JLabel("");
		jlbl_Tax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_Tax.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_Tax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlbl_Tax.setBounds(112, 19, 143, 20);
		panel_1_1.add(jlbl_Tax);
		
		JLabel jlbl_Sub_Total = new JLabel("");
		jlbl_Sub_Total.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_Sub_Total.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_Sub_Total.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlbl_Sub_Total.setBounds(112, 59, 143, 20);
		panel_1_1.add(jlbl_Sub_Total);
		
		JLabel jlbl_Total = new JLabel("");
		jlbl_Total.setHorizontalAlignment(SwingConstants.RIGHT);
		jlbl_Total.setFont(new Font("Tahoma", Font.BOLD, 15));
		jlbl_Total.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlbl_Total.setBounds(112, 99, 143, 20);
		panel_1_1.add(jlbl_Total);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1_3.setBounds(10, 529, 1084, 121);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JButton btn_Total = new JButton("Total");
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(textFieldChicken_Burger.getText());
				double iChicBurger = 2.39;
				double Burger;
				Burger = (ChicBurger*iChicBurger);
				String pMeal = String.format("%.2f", Burger);
				jlbl_C_Meal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(textField_Burger_Meal.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
				String cMeal = String.format("%.2f", BurgerMeal + Burger);
				jlbl_C_Meal.setText(cMeal);
				
				double CheeseBurger = Double.parseDouble(textField_Cheese_Burger.getText());
				double CheeseBurgerPrice = 3.39;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
				String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
				jlbl_C_Meal.setText(cheese);
				
				
				
				double PaneerWrap = Double.parseDouble(textField_Wrap.getText());
				double PaneerWrapPrice = 4.00;
				double PaneerWrapMeal;
				PaneerWrapMeal = (PaneerWrap * PaneerWrapPrice);
				String Wrap = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger + PaneerWrapMeal);
				jlbl_C_Meal.setText(Wrap);
				
				
				
				
				
				
				
				
				
				//----------Delivery--------------
				double iDelivery = 3.39;
				if(CheckBox_Home_Delivery.isSelected()) {
					String pDelivery = String.format("%.2f", iDelivery);
					jlbl_C_Delivery.setText(pDelivery);
				}
				
				else
				{
					jlbl_C_Delivery.setText("0");
				}
				
				/*--------------------Drinks------------------------------
				
				
				
				
				*/
				
				double Drinks = Double.parseDouble(textField_Qty.getText());
				double Tea  = 1.20 * Drinks;
				double Ice_Tea =  0.90 * Drinks;
				double Coffee = 2.50 * Drinks;
				double Ice_Coffee = 1.10 * Drinks;
				double Cola  = 2.10 * Drinks;
				double Orange_Juice = 1.70 * Drinks;
				double Apple_Juice = 1.99 * Drinks;
				double Coke = 1.60 * Drinks;
				if(comboBox_Drink.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f", Tea);
					jlbl_C_Drink.setText(cTea);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Ice Tea"))
				{
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					jlbl_C_Drink.setText(cIce_Tea);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Coffee"))
				{
					String cCoffee = String.format("%.2f", Coffee);
					jlbl_C_Drink.setText(cCoffee);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Ice_Coffee"))
				{
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					jlbl_C_Drink.setText(cIce_Coffee);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Cola"))
				{
					String cCola = String.format("%.2f", Cola);
					jlbl_C_Drink.setText(cCola);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Orange Juice"))
				{
					String cOrange = String.format("%.2f", Orange_Juice);
					jlbl_C_Drink.setText(cOrange);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Apple Juice"))
				{
					String cApple = String.format("%.2f", Apple_Juice);
					jlbl_C_Drink.setText(cApple);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", Coke);
					jlbl_C_Drink.setText(cCoke);
					
				}
				if(comboBox_Drink.getSelectedItem().equals("Select a Drink"))
				{
					
					jlbl_C_Drink.setText("0");
					
				}
				//=========================Tax Rate===============
				
				double cTotal_1 = Double.parseDouble(jlbl_C_Drink.getText());
				double cTotal_2 = Double.parseDouble(jlbl_C_Meal.getText());
				double cTotal_3 = Double.parseDouble(jlbl_C_Delivery.getText());
				double AllTotal = (cTotal_1 + cTotal_2 + cTotal_3)/100;
				if(CheckBox_Tax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					jlbl_Tax.setText(iTotal);
					
				}
				//========================Total===========================
				double cTotal_4 = Double.parseDouble(jlbl_Tax.getText());
				
				double subTotal = (cTotal_1 + cTotal_2 + cTotal_3);
				String isubTotal = String.format("Rs %.2f", subTotal);
				jlbl_Sub_Total.setText(isubTotal);
				
				double allTotal = (cTotal_1 + cTotal_2 + cTotal_3 + cTotal_4);
				String iTotal = String.format("Rs %.2f", allTotal);
				jlbl_Total.setText(iTotal);
				String iTaxTotal = String.format("Rs %.2f", cTotal_4);
				jlbl_Tax.setText(iTaxTotal);
				
			}
		});
		btn_Total.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Total.setBounds(153, 44, 89, 23);
		panel_1_3.add(btn_Total);
		
		JButton btn_Receipt = new JButton("Receipt");
		btn_Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double Qty1 = Double.parseDouble(textFieldChicken_Burger.getText());
				double Qty2 = Double.parseDouble(textField_Burger_Meal.getText());
				double Qty3 = Double.parseDouble(textField_Cheese_Burger.getText());
				
				textArea.append("\t\nRestaurent Management System:\n\n" + "Chicken Burger:\t\t"
				+ Qty1 + "\nChickent Burger Meal:\t\t" +
				Qty2 +"\nBacon and Cheese Burger:\t\t"
				+ Qty3 + "\n\nThanks for using Job Estomator");
				
				
				
			}
		});
		btn_Receipt.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Receipt.setBounds(382, 44, 100, 23);
		panel_1_3.add(btn_Receipt);
		
		JButton btn_Reset = new JButton("Reset");
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlbl_C_Delivery.setText(null);
				jlbl_Sub_Total.setText(null);
				jlbl_Total.setText(null);
				jlbl_Conver.setText(null);
				jlbl_C_Delivery.setText(null);
				jlbl_C_Drink.setText(null);
				jlbl_C_Meal.setText(null);
				jlbl_Sub_Total.setText(null);
				jlbl_Tax.setText(null);
				jlbl_Total.setText(null);
				textFieldChicken_Burger.setText(null);
				textField_Burger_Meal.setText(null);
				textField_Cheese_Burger.setText(null);
				textField_Qty.setText(null);
				jtxtConversion.setText(null);
				textField_Wrap.setText(null);
				comboBox_Drink.setSelectedItem("Select a Drink");
				comboBox_Convert.setSelectedItem("Currency Convertor");
			}
		});
		btn_Reset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_Reset.setBounds(612, 44, 89, 23);
		panel_1_3.add(btn_Reset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(836, 44, 89, 23);
		panel_1_3.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("         Restaurent management  System     ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(20, 9, 1074, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1_2.setBounds(803, 94, 291, 429);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(31, 57, 236, 361);
		panel_1_2.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 231, 333);
		panel_3.add(textArea);
		//========================calculator==========================
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_4, null);
		panel_4.setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
		textDisplay.setColumns(10);
		textDisplay.setBounds(10, 20, 209, 47);
		panel_4.add(textDisplay);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textDisplay.getText().length() > 0)
				{
					StringBuffer strB = new StringBuffer(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length() -1);
					backSpace = strB.toString();
					textDisplay.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(10, 78, 50, 50);
		panel_4.add(btnBack);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(62, 78, 50, 50);
		panel_4.add(btnC);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMod.setBounds(114, 78, 50, 50);
		panel_4.add(btnMod);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlus.setBounds(166, 78, 50, 50);
		panel_4.add(btnPlus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(10, 129, 50, 50);
		panel_4.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(62, 129, 50, 50);
		panel_4.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(114, 129, 50, 50);
		panel_4.add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSub.setBounds(166, 129, 50, 50);
		panel_4.add(btnSub);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(10, 180, 50, 50);
		panel_4.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(62, 180, 50, 50);
		panel_4.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(114, 180, 50, 50);
		panel_4.add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBounds(166, 180, 50, 50);
		panel_4.add(btnMul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 231, 50, 50);
		panel_4.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(62, 231, 50, 50);
		panel_4.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(114, 231, 50, 50);
		panel_4.add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBounds(166, 231, 50, 50);
		panel_4.add(btnDiv);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(10, 283, 50, 50);
		panel_4.add(btn0);
		
		JButton btnDesi = new JButton(".");
		btnDesi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  EnterNumber = textDisplay.getText() + btnDesi.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btnDesi.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDesi.setBounds(62, 283, 50, 50);
		panel_4.add(btnDesi);
		
		JButton btnPlusEqual = new JButton("\u00B1");
		btnPlusEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPlusEqual.setBounds(114, 283, 50, 50);
		panel_4.add(btnPlusEqual);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(textDisplay.getText());
				if(operation == "+")
				{
					result = firstNum +secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "-")
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "*")
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "/")
				{
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				else if(operation == "%")
				{
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				 
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEqual.setBounds(166, 283, 50, 50);
		panel_4.add(btnEqual);
	}
}
