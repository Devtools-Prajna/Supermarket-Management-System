import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI{
	int SCREEN_WIDTH = 1000;
	int SCREEN_HEIGHT = 600;
	String FONT_DEFAULT = "proxima-nova";
	int COLOR_GREENISH = 0x1BA466;
	int COLOR_SKY_BLUE = 0x195ABE;
	int FONT_HEADER_SIZE = 30;
	int FONT_DEFAULT_SIZE = 15;
	int POSITION_X_LOGIN = (SCREEN_WIDTH/2)-185;
	int POSITION_Y_LOGIN = (SCREEN_HEIGHT/2)-150;
	int POSITION_X_USER = 0;
	int POSITION_Y_USER = 0;
	
	JFrame frame;

	JPanel userLoginPanel;
	JPanel userSignupPanel;
	JPanel userPanel;

	JPanel adminLoginPanel;
	JPanel adminPanel;

	// objects
	Users users;

	GUI(){
		// objects
		try {
			users = new Users();
		} catch (Exception e) {
			System.out.println(e);
		}

		// frame
		frame = new JFrame();

		// login label
		JLabel labelLogin = new JLabel("LOGIN");
		labelLogin.setBounds(POSITION_X_LOGIN+125, POSITION_Y_LOGIN, 120, 60);
		labelLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));
		
		JLabel labelUsername = new JLabel("Username ");
		labelUsername.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
		labelUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

		JLabel labelPassword = new JLabel("Password ");
		labelPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		labelPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+140, 120, 30);

		// login textfields
		JTextField textfieldUsername = new JTextField();
		textfieldUsername.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
		textfieldUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

		JPasswordField passwordFieldUser = new JPasswordField();
		passwordFieldUser.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+140, 250, 30);
		passwordFieldUser.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

		// Buttons
		JButton btnUserLogin = new JButton("Login");
		btnUserLogin.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+200, 100, 30);
		btnUserLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnUserLogin.setForeground(Color.WHITE);
		btnUserLogin.setBackground(Color.BLACK);
		btnUserLogin.setOpaque(true);
		btnUserLogin.setFocusable(false);
		btnUserLogin.setBorderPainted(false);
		btnUserLogin.setFocusPainted(false);

		JButton btnUserSignup = new JButton("Signup");
		btnUserSignup.setBounds(POSITION_X_LOGIN+270, POSITION_Y_LOGIN+200, 100, 30);
		btnUserSignup.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnUserSignup.setForeground(Color.WHITE);
		btnUserSignup.setBackground(Color.BLACK);
		btnUserSignup.setOpaque(true);
		btnUserSignup.setFocusable(false);
		btnUserSignup.setBorderPainted(false);
		btnUserSignup.setFocusPainted(false);

		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(25, 25, 100, 30);
		btnAdmin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setBackground(Color.RED);
		btnAdmin.setOpaque(true);
		btnAdmin.setFocusable(false);
		btnAdmin.setBorderPainted(false);
		btnAdmin.setFocusPainted(false);

		// panel
		userLoginPanel = new JPanel();
		userLoginPanel.setLayout(null);
		userLoginPanel.add(labelLogin);
		userLoginPanel.add(labelUsername);
		userLoginPanel.add(textfieldUsername);
		userLoginPanel.add(labelPassword);
		userLoginPanel.add(passwordFieldUser);
		userLoginPanel.add(btnUserLogin);
		userLoginPanel.add(btnAdmin);
		userLoginPanel.add(btnUserSignup);

		// set content
		frame.setContentPane(userLoginPanel);

		// actions
		btnUserLogin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(textfieldUsername.getText());

				// labels
				JLabel labelSignedUsername = new JLabel(textfieldUsername.getText());
				labelSignedUsername.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
				labelSignedUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_HEADER_SIZE));

				// buttons
				JButton btnLogout = new JButton("Logout");
				btnLogout.setBounds(POSITION_X_USER, POSITION_Y_USER+SCREEN_HEIGHT-100, 100, 30);
				btnLogout.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnLogout.setForeground(Color.WHITE);
				btnLogout.setBackground(Color.BLACK);
				btnLogout.setOpaque(true);
				btnLogout.setFocusable(false);
				btnLogout.setBorderPainted(false);
				btnLogout.setFocusPainted(false);

				btnLogout.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						frame.setContentPane(userLoginPanel);
					}
					
				});

				// panel
				userPanel = new JPanel();
				userPanel.setBackground(Color.WHITE);
				userPanel.setLayout(null);
				userPanel.add(labelSignedUsername);
				userPanel.add(btnLogout);
				
				// set content
				frame.setContentPane(userPanel);
				frame.validate();				
			}
			
		});

		btnUserSignup.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("signup");
				// elements
				JButton btnUserLogin = new JButton("Login");
				btnUserLogin.setBounds(25, 25, 100, 30);
				btnUserLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUserLogin.setForeground(Color.WHITE);
				btnUserLogin.setBackground(Color.BLACK);
				btnUserLogin.setOpaque(true);
				btnUserLogin.setFocusable(false);
				btnUserLogin.setBorderPainted(false);
				btnUserLogin.setFocusPainted(false);

				JLabel labelSignup = new JLabel("Signup");
				labelSignup.setBounds(POSITION_X_LOGIN+125, POSITION_Y_LOGIN, 120, 60);
				labelSignup.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));
				
				JLabel labelUsername = new JLabel("Username ");
				labelUsername.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
				labelUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

				JLabel labelMobileNumber = new JLabel("Mobile No ");
				labelMobileNumber.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				labelMobileNumber.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+140, 120, 30);

				JLabel labelPassword = new JLabel("Password ");
				labelPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				labelPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+180, 120, 30);

				// login textfields
				JTextField textfieldUsername = new JTextField();
				textfieldUsername.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
				textfieldUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				JTextField textfieldMobileNumber = new JTextField();
				textfieldMobileNumber.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+140, 250, 30);
				textfieldMobileNumber.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				JPasswordField passwordFieldUser = new JPasswordField();
				passwordFieldUser.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+180, 250, 30);
				passwordFieldUser.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				JButton btnUserSignup = new JButton("Signup");
				btnUserSignup.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+260, 100, 30);
				btnUserSignup.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUserSignup.setForeground(Color.WHITE);
				btnUserSignup.setBackground(Color.BLACK);
				btnUserSignup.setOpaque(true);
				btnUserSignup.setFocusable(false);
				btnUserSignup.setBorderPainted(false);
				btnUserSignup.setFocusPainted(false);

				// panel
				userSignupPanel = new JPanel();
				userSignupPanel.setBackground(Color.WHITE);
				userSignupPanel.setLayout(null);
				userSignupPanel.add(btnUserLogin);
				userSignupPanel.add(labelSignup);
				userSignupPanel.add(labelUsername);
				userSignupPanel.add(labelPassword);
				userSignupPanel.add(labelMobileNumber);
				userSignupPanel.add(textfieldUsername);
				userSignupPanel.add(textfieldMobileNumber);
				userSignupPanel.add(passwordFieldUser);
				userSignupPanel.add(btnUserSignup);

				// actions
				btnUserLogin.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						frame.setContentPane(userLoginPanel);
					}
					
				});

				btnUserSignup.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {

						// set content
						frame.setContentPane(userLoginPanel);
					}
					
				});

				// set content
				frame.setContentPane(userSignupPanel);
				frame.validate();
			}
			
		});

		btnAdmin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("Admin");

				// elements
				JLabel labelAdminLogin = new JLabel("Admin Login");
				labelAdminLogin.setBounds(POSITION_X_LOGIN+100, POSITION_Y_LOGIN, 200, 60);
				labelAdminLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));
				labelAdminLogin.setForeground(Color.RED);

				JLabel labelAdminPassword = new JLabel("Root Password");
				labelAdminPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
				labelAdminPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

				JPasswordField passwordFieldAdmin = new JPasswordField();
				passwordFieldAdmin.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
				passwordFieldAdmin.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				JButton btnAdminLogin = new JButton("Login");
				btnAdminLogin.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+200, 100, 30);
				btnAdminLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnAdminLogin.setForeground(Color.WHITE);
				btnAdminLogin.setBackground(Color.RED);
				btnAdminLogin.setOpaque(true);
				btnAdminLogin.setFocusable(false);
				btnAdminLogin.setBorderPainted(false);
				btnAdminLogin.setFocusPainted(false);

				JButton btnUser = new JButton("User");
				btnUser.setBounds(25, 25, 100, 30);
				btnUser.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUser.setForeground(Color.WHITE);
				btnUser.setBackground(Color.BLACK);
				btnUser.setOpaque(true);
				btnUser.setFocusable(false);
				btnUser.setBorderPainted(false);
				btnUser.setFocusPainted(false);

				// actions
				btnAdminLogin.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {	
						// buttons
						JButton btnLogout = new JButton("Logout");
						btnLogout.setBounds(POSITION_X_USER, POSITION_Y_USER+SCREEN_HEIGHT-100, 100, 30);
						btnLogout.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
						btnLogout.setForeground(Color.WHITE);
						btnLogout.setBackground(Color.RED);
						btnLogout.setOpaque(true);
						btnLogout.setFocusable(false);
						btnLogout.setBorderPainted(false);
						btnLogout.setFocusPainted(false);
		
						btnLogout.addActionListener(new ActionListener(){
		
							@Override
							public void actionPerformed(ActionEvent arg0) {
								// set content
								frame.setContentPane(adminLoginPanel);
							}
							
						});
		
		
						// panel
						adminPanel = new JPanel();
						adminPanel.setBackground(Color.WHITE);
						adminPanel.setLayout(null);
						adminPanel.add(btnLogout);
						
						// set content
						frame.setContentPane(adminPanel);
						frame.validate();				
					}
					
				});

				btnUser.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						frame.setContentPane(userLoginPanel);
					}
					
				});

				// panel
				adminLoginPanel = new JPanel();
				adminLoginPanel.setBackground(Color.WHITE);
				adminLoginPanel.setLayout(null);
				adminLoginPanel.add(labelAdminLogin);
				adminLoginPanel.add(labelAdminPassword);
				adminLoginPanel.add(passwordFieldAdmin);
				adminLoginPanel.add(btnAdminLogin);
				adminLoginPanel.add(btnUser);

				// set content
				frame.setContentPane(adminLoginPanel);
				frame.validate();
			}
			
		});
		
		// frame
		frame.setTitle("Supermarket Management System");
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(null);
	}
}
