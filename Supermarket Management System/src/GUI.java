import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
	int POSITION_X_USER = 200;
	int POSITION_Y_USER = 100;
	int POSITION_X_CONTENT = 200;
	int POSITION_Y_CONTENT = 200;
	String ROOT_PASSWORD = "root001";

	// objects
	Users users;
	Items items;

	// frame
	JFrame frame;

	// panel
	JPanel userLoginPanel;
	JPanel userSignupPanel;
	JPanel userPanel;
	JPanel userProfilePanel;
	JPanel userOrdersPanel;

	JPanel adminLoginPanel;
	JPanel adminPanel;
	JPanel adminControlPanel;
	JPanel adminViewOrdersPanel;	
	// labels
	JLabel labelLogin;
	JLabel labelUsername;
	JLabel labelPassword;
	JLabel labelProfileHeader;
	JLabel labelMarketHeader;
	JLabel labelOrdersHeader;
	JLabel labelProfileUsername;
	JLabel labelProfileMobileNo;
	JLabel labelProfilePassword;
	JLabel labelUserSignup;
	JLabel labelSignupUsername;
	JLabel labelSignupMobileNumber;
	JLabel labelSignupPassword;

	JLabel labelAdminLogin;
	JLabel labelAdminPassword;
	JLabel labelAdminMarketHeader;
	JLabel labelAdminControlHeader;
	JLabel labelAdminViewOrdersHeader;
	JLabel labelAdminAddItemsHeader;
	JLabel labelAdminControlUserIDHeader;
	JLabel labelAdminControlUsernameHeader;
	JLabel labelAdminControlMobileNoHeader;
	JLabel[] labelAdminControlUserID;
	JLabel[] labelAdminControlUsername;
	JLabel[] labelAdminControlMobileNo;
	JLabel labelAdminMarketItemIDHeader;
	JLabel labelAdminMarketItemNameHeader;
	JLabel labelAdminMarketPriceHeader;
	JLabel[] labelAdminMarketItemID;
	JLabel[] labelAdminMarketItemName;
	JLabel[] labelAdminMarketPrice;
	JLabel labelAdminMarketAddItemName;
	JLabel labelAdminMarketAddPrice;

	// checkbox
	JCheckBox[] checkboxControl;
	JCheckBox[] checkboxMarket;
	
	// textfields
	JTextField textfieldUsername;
	JTextField textfieldEditUsername;
	JTextField textfieldEditMobileNo;
	JTextField textfieldSignupUsername;
	JTextField textfieldSignupMobileNumber;

	JTextField textfieldAdminMarketAddItemName;
	JTextField textfieldAdminMarketAddPrice;

	// passwordfileds
	JPasswordField passwordFieldUser;
	JPasswordField passfieldEditPassword;
	JPasswordField passwordFieldSignupUser;
	JPasswordField passwordFieldAdmin;
	
	// buttons
	JButton btnProfile;
	JButton btnUserLoginAttempt;
	JButton btnUserSignupPanel;
	JButton btnMarket;
	JButton btnOrders;
	JButton btnLogout;
	JButton btnDeleteAccount;
	JButton btnSaveChanges;
	JButton btnUserLoginPanel;
	JButton btnUserSignupAttempt;
	
	JButton btnAdmin;
	JButton btnAdminLoginAtttempt;
	JButton btnAdminUser;
	JButton btnAdminLogout;
	JButton btnAdminControl;
	JButton btnAdminControlDelete;
	JButton btnAdminMarket;
	JButton btnAdminViewOrders;
	JButton btnAdminMarketAdditem;
	JButton btnAdminMarketDelete;

	GUI() throws Exception{
		// objects
		users = new Users();
		items = new Items();

		// frame
		frame = new JFrame();

		// login label
		labelLogin = new JLabel("LOGIN");
		labelLogin.setBounds(POSITION_X_LOGIN+125, POSITION_Y_LOGIN, 120, 60);
		labelLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));
		
		labelUsername = new JLabel("Username ");
		labelUsername.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
		labelUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

		labelPassword = new JLabel("Password ");
		labelPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		labelPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+140, 120, 30);

		// login textfields
		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
		textfieldUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

		passwordFieldUser = new JPasswordField();
		passwordFieldUser.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+140, 250, 30);
		passwordFieldUser.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

		// Buttons
		btnUserLoginAttempt = new JButton("Login");
		btnUserLoginAttempt.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+200, 100, 30);
		btnUserLoginAttempt.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnUserLoginAttempt.setForeground(Color.WHITE);
		btnUserLoginAttempt.setBackground(Color.BLACK);
		btnUserLoginAttempt.setOpaque(true);
		btnUserLoginAttempt.setFocusable(false);
		btnUserLoginAttempt.setBorderPainted(false);
		btnUserLoginAttempt.setFocusPainted(false);

		btnUserSignupPanel = new JButton("Signup");
		btnUserSignupPanel.setBounds(POSITION_X_LOGIN+270, POSITION_Y_LOGIN+200, 100, 30);
		btnUserSignupPanel.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
		btnUserSignupPanel.setForeground(Color.WHITE);
		btnUserSignupPanel.setBackground(Color.BLACK);
		btnUserSignupPanel.setOpaque(true);
		btnUserSignupPanel.setFocusable(false);
		btnUserSignupPanel.setBorderPainted(false);
		btnUserSignupPanel.setFocusPainted(false);

		btnAdmin = new JButton("Admin");
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
		userLoginPanel.add(btnUserLoginAttempt);
		userLoginPanel.add(btnAdmin);
		userLoginPanel.add(btnUserSignupPanel);

		// set content
		frame.setContentPane(userLoginPanel);

		// actions
		btnUserLoginAttempt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("User Login attempt: " + textfieldUsername.getText()+ " " + String.valueOf(passwordFieldUser.getPassword()) + " ");

				String[] userinfo = users.getUserinfo(textfieldUsername.getText());

				if(textfieldUsername.getText().equals("") || String.valueOf(passwordFieldUser.getPassword()).equals("")){
					JOptionPane.showMessageDialog(null, "Please provide all the information", "Error", JOptionPane.ERROR_MESSAGE);
				}else if(textfieldUsername.getText().equals(userinfo[1]) && String.valueOf(passwordFieldUser.getPassword()).equals(userinfo[3])){				
					int userID = Integer.valueOf(userinfo[0]);
					String username = userinfo[1];
					String mobileNo = userinfo[2];
					String password = userinfo[3];

					System.out.println(username + " user panel");

					// user market elements
					labelMarketHeader = new JLabel("MARKET");
					labelMarketHeader.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
					labelMarketHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

					labelAdminMarketItemIDHeader = new JLabel("Item ID");
					labelAdminMarketItemIDHeader.setBounds(200, 200, 100, 30);
					labelAdminMarketItemIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelAdminMarketItemNameHeader = new JLabel("Item Name");
					labelAdminMarketItemNameHeader.setBounds(300, 200, 300, 30);
					labelAdminMarketItemNameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelAdminMarketPriceHeader = new JLabel("Price/Quantity");
					labelAdminMarketPriceHeader.setBounds(600, 200, 100, 30);
					labelAdminMarketPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					checkboxMarket = new JCheckBox[100];
					labelAdminMarketItemID = new JLabel[100];
					labelAdminMarketItemName = new JLabel[100];
					labelAdminMarketPrice = new JLabel[100];

					// user profile elements
					labelProfileHeader = new JLabel("PROFILE");
					labelProfileHeader.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
					labelProfileHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

					labelProfileUsername = new JLabel("Username");
					labelProfileUsername.setBounds(POSITION_X_USER, POSITION_Y_USER+100, 200, 30);
					labelProfileUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelProfileMobileNo = new JLabel("Mobile No");
					labelProfileMobileNo.setBounds(POSITION_X_USER, POSITION_Y_USER+150, 200, 30);
					labelProfileMobileNo.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					labelProfilePassword = new JLabel("Password");
					labelProfilePassword.setBounds(POSITION_X_USER, POSITION_Y_USER+200, 200, 30);
					labelProfilePassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

					textfieldEditUsername = new JTextField();
					textfieldEditUsername.setText(username);
					textfieldEditUsername.setBounds(POSITION_X_USER+100, POSITION_Y_USER+100, 250, 30);
					textfieldEditUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
					
					textfieldEditMobileNo = new JTextField();
					textfieldEditMobileNo.setText(mobileNo);
					textfieldEditMobileNo.setBounds(POSITION_X_USER+100, POSITION_Y_USER+150, 250, 30);
					textfieldEditMobileNo.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
					
					passfieldEditPassword = new JPasswordField();
					passfieldEditPassword.setText(password);
					passfieldEditPassword.setBounds(POSITION_X_USER+100, POSITION_Y_USER+200, 250, 30);
					passfieldEditPassword.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

					// user orders elements
					labelOrdersHeader = new JLabel("ORDERS");
					labelOrdersHeader.setBounds(POSITION_X_USER, POSITION_Y_USER, 400, 30);
					labelOrdersHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

					// buttons
					btnProfile = new JButton("Profile");
					btnProfile.setBounds(0, 100, 150, 50);
					btnProfile.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnProfile.setForeground(Color.WHITE);
					btnProfile.setBackground(Color.BLACK);
					btnProfile.setOpaque(true);
					btnProfile.setFocusable(false);
					btnProfile.setBorderPainted(false);
					btnProfile.setFocusPainted(false);
					btnProfile.setEnabled(true);
					
					btnMarket = new JButton("Market");
					btnMarket.setBounds(0, 150, 150, 50);
					btnMarket.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnMarket.setForeground(Color.WHITE);
					btnMarket.setBackground(Color.BLACK);
					btnMarket.setOpaque(true);
					btnMarket.setFocusable(false);
					btnMarket.setBorderPainted(false);
					btnMarket.setFocusPainted(false);
					btnMarket.setEnabled(false);
					
					btnOrders = new JButton("Orders");
					btnOrders.setBounds(0, 200, 150, 50);
					btnOrders.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnOrders.setForeground(Color.WHITE);
					btnOrders.setBackground(Color.BLACK);
					btnOrders.setOpaque(true);
					btnOrders.setFocusable(false);
					btnOrders.setBorderPainted(false);
					btnOrders.setFocusPainted(false);
					btnOrders.setEnabled(true);

					btnDeleteAccount = new JButton("Delete Account");
					btnDeleteAccount.setBounds(SCREEN_WIDTH-340, SCREEN_HEIGHT-100, 150, 50);
					btnDeleteAccount.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnDeleteAccount.setForeground(Color.WHITE);
					btnDeleteAccount.setBackground(Color.BLACK);
					btnDeleteAccount.setOpaque(true);
					btnDeleteAccount.setFocusable(false);
					btnDeleteAccount.setBorderPainted(false);
					btnDeleteAccount.setFocusPainted(false);

					btnSaveChanges = new JButton("Save Changes");
					btnSaveChanges.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
					btnSaveChanges.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnSaveChanges.setForeground(Color.WHITE);
					btnSaveChanges.setBackground(Color.BLACK);
					btnSaveChanges.setOpaque(true);
					btnSaveChanges.setFocusable(false);
					btnSaveChanges.setBorderPainted(false);
					btnSaveChanges.setFocusPainted(false);
					
					btnLogout = new JButton("Logout");
					btnLogout.setBounds(0, SCREEN_HEIGHT-100, 150, 50);
					btnLogout.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
					btnLogout.setForeground(Color.WHITE);
					btnLogout.setBackground(Color.BLACK);
					btnLogout.setOpaque(true);
					btnLogout.setFocusable(false);
					btnLogout.setBorderPainted(false);
					btnLogout.setFocusPainted(false);

					// panel
					userPanel = new JPanel();
					userPanel.setBackground(Color.WHITE);
					userPanel.setLayout(null);
					userPanel.add(btnProfile);
					userPanel.add(btnMarket);
					userPanel.add(btnOrders);
					userPanel.add(btnLogout);
					userPanel.add(labelMarketHeader);

					userProfilePanel = new JPanel();
					userProfilePanel.setBackground(Color.WHITE);
					userProfilePanel.setLayout(null);

					userOrdersPanel = new JPanel();
					userOrdersPanel.setBackground(Color.WHITE);
					userOrdersPanel.setLayout(null);


					// actions
					btnProfile.addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(username + "User Profile panel");
							btnMarket.setEnabled(true);
							btnProfile.setEnabled(false);
							btnOrders.setEnabled(true);

							userProfilePanel.add(labelProfileHeader);
							userProfilePanel.add(labelProfileUsername);
							userProfilePanel.add(textfieldEditUsername);
							userProfilePanel.add(labelProfileMobileNo);
							userProfilePanel.add(textfieldEditMobileNo);
							userProfilePanel.add(labelProfilePassword);
							userProfilePanel.add(passfieldEditPassword);
							userProfilePanel.add(btnProfile);
							userProfilePanel.add(btnMarket);
							userProfilePanel.add(btnOrders);
							userProfilePanel.add(btnLogout);
							userProfilePanel.add(btnSaveChanges);
							userProfilePanel.add(btnDeleteAccount);

							frame.setContentPane(userProfilePanel);
							frame.validate();
						}
					});

					btnMarket.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(username + " User Market panel");

							btnMarket.setEnabled(false);
							btnProfile.setEnabled(true);
							btnOrders.setEnabled(true);
							
							userPanel.add(btnProfile);
							userPanel.add(btnMarket);
							userPanel.add(btnOrders);
							userPanel.add(btnLogout);
							userPanel.add(labelMarketHeader);

							frame.setContentPane(userPanel);
							frame.validate();
						}
						
					});

					btnOrders.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(username + " order panel");

							btnMarket.setEnabled(true);
							btnProfile.setEnabled(true);
							btnOrders.setEnabled(false);

							userOrdersPanel.add(btnProfile);
							userOrdersPanel.add(btnMarket);
							userOrdersPanel.add(btnOrders);
							userOrdersPanel.add(btnLogout);
							userOrdersPanel.add(labelOrdersHeader);

							frame.setContentPane(userOrdersPanel);
							frame.validate();
						}
						
					});
					
					btnDeleteAccount.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							int answer = JOptionPane.showConfirmDialog(null, "Do you really want to delete your account?", "Confirm", JOptionPane.YES_NO_OPTION);
							if(answer == 0){
								System.out.println("User account deleted: " + username);
								users.removeUser(userID);
								System.out.println(users);

								try {
									System.out.println("Svaing userinfo....");
									users.saveUserinfo();
									users = new Users();
								} catch (Exception e) {
									e.printStackTrace();
								}

								frame.setContentPane(userLoginPanel);
								frame.validate();
							}
						}
						
					});

					btnSaveChanges.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							String username = textfieldEditUsername.getText();
							String mobileNo = textfieldEditMobileNo.getText();
							String password = String.valueOf(passfieldEditPassword.getPassword());

							System.out.println("Edit userinfo: " + username + " " + mobileNo + " " + password);

							users.editUserinfo(userID, username, mobileNo, password);
							JOptionPane.showMessageDialog(null, "Successfully applied changes!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
						}
						
					});

					btnLogout.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							// set content
							int answer = JOptionPane.showConfirmDialog(null, "Do you really want to signout?", "Confirm", JOptionPane.YES_NO_OPTION);
							if(answer == 0){
								System.out.println("logging out: " + username);
								frame.setContentPane(userLoginPanel);
								frame.validate();
							}
						}
						
					});

					// set content
					frame.setContentPane(userPanel);
					frame.validate();				
				}else{
					JOptionPane.showMessageDialog(null, "Username or Password doesn't match!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});

		btnUserSignupPanel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("User signup panel");
				// elements
				btnUserLoginPanel = new JButton("Login");
				btnUserLoginPanel.setBounds(25, 25, 100, 30);
				btnUserLoginPanel.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUserLoginPanel.setForeground(Color.WHITE);
				btnUserLoginPanel.setBackground(Color.BLACK);
				btnUserLoginPanel.setOpaque(true);
				btnUserLoginPanel.setFocusable(false);
				btnUserLoginPanel.setBorderPainted(false);
				btnUserLoginPanel.setFocusPainted(false);

				labelUserSignup = new JLabel("Signup");
				labelUserSignup.setBounds(POSITION_X_LOGIN+125, POSITION_Y_LOGIN, 120, 60);
				labelUserSignup.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));
				
				labelSignupUsername = new JLabel("Username ");
				labelSignupUsername.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
				labelSignupUsername.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

				labelSignupMobileNumber = new JLabel("Mobile No ");
				labelSignupMobileNumber.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				labelSignupMobileNumber.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+140, 120, 30);

				labelSignupPassword = new JLabel("Password ");
				labelSignupPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				labelSignupPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+180, 120, 30);

				// login textfields
				textfieldSignupUsername = new JTextField();
				textfieldSignupUsername.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
				textfieldSignupUsername.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				textfieldSignupMobileNumber = new JTextField();
				textfieldSignupMobileNumber.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+140, 250, 30);
				textfieldSignupMobileNumber.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				passwordFieldSignupUser = new JPasswordField();
				passwordFieldSignupUser.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+180, 250, 30);
				passwordFieldSignupUser.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				btnUserSignupAttempt = new JButton("Signup");
				btnUserSignupAttempt.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+260, 100, 30);
				btnUserSignupAttempt.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnUserSignupAttempt.setForeground(Color.WHITE);
				btnUserSignupAttempt.setBackground(Color.BLACK);
				btnUserSignupAttempt.setOpaque(true);
				btnUserSignupAttempt.setFocusable(false);
				btnUserSignupAttempt.setBorderPainted(false);
				btnUserSignupAttempt.setFocusPainted(false);

				// panel
				userSignupPanel = new JPanel();
				userSignupPanel.setBackground(Color.WHITE);
				userSignupPanel.setLayout(null);
				userSignupPanel.add(btnUserLoginPanel);
				userSignupPanel.add(labelUserSignup);
				userSignupPanel.add(labelSignupUsername);
				userSignupPanel.add(labelSignupPassword);
				userSignupPanel.add(labelSignupMobileNumber);
				userSignupPanel.add(textfieldSignupUsername);
				userSignupPanel.add(textfieldSignupMobileNumber);
				userSignupPanel.add(passwordFieldSignupUser);
				userSignupPanel.add(btnUserSignupAttempt);

				// actions
				btnUserLoginPanel.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						System.out.println("user login panel");
						frame.setContentPane(userLoginPanel);
						frame.validate();
					}
					
				});

				btnUserSignupAttempt.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String signupUsername = textfieldSignupUsername.getText();
						String signupMobileNo = textfieldSignupMobileNumber.getText();
						String signupPassword = String.valueOf(passwordFieldSignupUser.getPassword());

						System.out.println("Signup attempt: "+signupUsername+" " +signupMobileNo+" "+signupPassword);

						// System.out.println(username + " " + mobileNo + " " + password);
						if(signupUsername.equals("") || signupMobileNo.equals("") || signupPassword.equals("")){
							// System.out.println("Please provide all information");
							JOptionPane.showMessageDialog(null, "Please provide all the information", "Error", JOptionPane.ERROR_MESSAGE);
						}else if(signupUsername.equals(users.getUserinfo(signupUsername)[1])){
							// System.out.println("User Already Exists");
							JOptionPane.showMessageDialog(null, "User already Exists", "Error", JOptionPane.ERROR_MESSAGE);
						}else{
							users.createUser(signupUsername, signupMobileNo, signupPassword);
							// System.out.println("New User Created!");
							JOptionPane.showMessageDialog(null, "Successfully Signed Up", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
							frame.setContentPane(userLoginPanel);
						}
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
				System.out.println("Admin panel");
				// elements
				labelAdminLogin = new JLabel("Admin Login");
				labelAdminLogin.setBounds(POSITION_X_LOGIN+100, POSITION_Y_LOGIN, 200, 60);
				labelAdminLogin.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));
				labelAdminLogin.setForeground(Color.RED);

				labelAdminPassword = new JLabel("Root Password");
				labelAdminPassword.setBounds(POSITION_X_LOGIN, POSITION_Y_LOGIN+100, 120, 30);
				labelAdminPassword.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

				passwordFieldAdmin = new JPasswordField();
				passwordFieldAdmin.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+100, 250, 30);
				passwordFieldAdmin.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

				btnAdminLoginAtttempt = new JButton("Login");
				btnAdminLoginAtttempt.setBounds(POSITION_X_LOGIN+120, POSITION_Y_LOGIN+200, 100, 30);
				btnAdminLoginAtttempt.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnAdminLoginAtttempt.setForeground(Color.WHITE);
				btnAdminLoginAtttempt.setBackground(Color.RED);
				btnAdminLoginAtttempt.setOpaque(true);
				btnAdminLoginAtttempt.setFocusable(false);
				btnAdminLoginAtttempt.setBorderPainted(false);
				btnAdminLoginAtttempt.setFocusPainted(false);

				btnAdminUser = new JButton("User");
				btnAdminUser.setBounds(25, 25, 100, 30);
				btnAdminUser.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
				btnAdminUser.setForeground(Color.WHITE);
				btnAdminUser.setBackground(Color.BLACK);
				btnAdminUser.setOpaque(true);
				btnAdminUser.setFocusable(false);
				btnAdminUser.setBorderPainted(false);
				btnAdminUser.setFocusPainted(false);

				// actions
				btnAdminLoginAtttempt.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {	
						System.out.println("admin login attempt");
						if(!String.valueOf(passwordFieldAdmin.getPassword()).equals(ROOT_PASSWORD)){
							JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Error", JOptionPane.ERROR_MESSAGE);
						}else{
							System.out.println("Admin panel");

							// control labels
							labelAdminControlHeader = new JLabel("CONTROL PANEL");
							labelAdminControlHeader.setBounds(200, 100, 400, 30);
							labelAdminControlHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

							labelAdminControlUserIDHeader = new JLabel("User ID");
							labelAdminControlUserIDHeader.setBounds(200, 150, 100, 30);
							labelAdminControlUserIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminControlUsernameHeader = new JLabel("Username");
							labelAdminControlUsernameHeader.setBounds(300, 150, 300, 30);
							labelAdminControlUsernameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminControlMobileNoHeader = new JLabel("Mobile No");
							labelAdminControlMobileNoHeader.setBounds(600, 150, 100, 30);
							labelAdminControlMobileNoHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							checkboxControl = new JCheckBox[100];
							labelAdminControlUserID = new JLabel[100];
							labelAdminControlUsername = new JLabel[100];
							labelAdminControlMobileNo = new JLabel[100];

							// market labels
							labelAdminMarketHeader = new JLabel("MARKET");
							labelAdminMarketHeader.setBounds(200, 100, 400, 30);
							labelAdminMarketHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

							// element add items
							labelAdminMarketAddItemName = new JLabel("Item Name");
							labelAdminMarketAddItemName.setBounds(300, 150, 100, 30);
							labelAdminMarketAddItemName.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							textfieldAdminMarketAddItemName = new JTextField();
							textfieldAdminMarketAddItemName.setBounds(390, 150, 200, 30);
							textfieldAdminMarketAddItemName.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

							labelAdminMarketAddPrice = new JLabel("Price");
							labelAdminMarketAddPrice.setBounds(600, 150, 100, 30);
							labelAdminMarketAddPrice.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							textfieldAdminMarketAddPrice = new JTextField();
							textfieldAdminMarketAddPrice.setBounds(650, 150, 100, 30);
							textfieldAdminMarketAddPrice.setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

							// label display items
							labelAdminMarketItemIDHeader = new JLabel("Item ID");
							labelAdminMarketItemIDHeader.setBounds(200, 200, 100, 30);
							labelAdminMarketItemIDHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminMarketItemNameHeader = new JLabel("Item Name");
							labelAdminMarketItemNameHeader.setBounds(300, 200, 300, 30);
							labelAdminMarketItemNameHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							labelAdminMarketPriceHeader = new JLabel("Price/Quantity");
							labelAdminMarketPriceHeader.setBounds(600, 200, 100, 30);
							labelAdminMarketPriceHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));

							checkboxMarket = new JCheckBox[100];
							labelAdminMarketItemID = new JLabel[100];
							labelAdminMarketItemName = new JLabel[100];
							labelAdminMarketPrice = new JLabel[100];


							// view orders labels
							labelAdminViewOrdersHeader = new JLabel("VIEW ORDERS");
							labelAdminViewOrdersHeader.setBounds(200, 100, 400, 30);
							labelAdminViewOrdersHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

							// add new items labels
							labelAdminAddItemsHeader = new JLabel("ADD NEW ITEMS");
							labelAdminAddItemsHeader.setBounds(200, 100, 400, 30);
							labelAdminAddItemsHeader.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_HEADER_SIZE));

							// admin conrtol buttons
							btnAdminControl = new JButton("Control Panel");
							btnAdminControl.setBounds(0, 100, 150, 50);
							btnAdminControl.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminControl.setForeground(Color.WHITE);
							btnAdminControl.setBackground(Color.RED);
							btnAdminControl.setOpaque(true);
							btnAdminControl.setFocusable(false);
							btnAdminControl.setBorderPainted(false);
							btnAdminControl.setFocusPainted(false);
							btnAdminControl.setEnabled(true);

							btnAdminControlDelete = new JButton("Delete");
							btnAdminControlDelete.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
							btnAdminControlDelete.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminControlDelete.setForeground(Color.WHITE);
							btnAdminControlDelete.setBackground(Color.RED);
							btnAdminControlDelete.setOpaque(true);
							btnAdminControlDelete.setFocusable(false);
							btnAdminControlDelete.setBorderPainted(false);
							btnAdminControlDelete.setFocusPainted(false);
							
							// admin market buttons
							btnAdminMarket = new JButton("Market");
							btnAdminMarket.setBounds(0, 150, 150, 50);
							btnAdminMarket.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminMarket.setForeground(Color.WHITE);
							btnAdminMarket.setBackground(Color.RED);
							btnAdminMarket.setOpaque(true);
							btnAdminMarket.setFocusable(false);
							btnAdminMarket.setBorderPainted(false);
							btnAdminMarket.setFocusPainted(false);
							btnAdminMarket.setEnabled(false);

							btnAdminMarketAdditem = new JButton("Add");
							btnAdminMarketAdditem.setBounds(800, 150, 100, 30);
							btnAdminMarketAdditem.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminMarketAdditem.setForeground(Color.WHITE);
							btnAdminMarketAdditem.setBackground(Color.RED);
							btnAdminMarketAdditem.setOpaque(true);
							btnAdminMarketAdditem.setFocusable(false);
							btnAdminMarketAdditem.setBorderPainted(false);
							btnAdminMarketAdditem.setFocusPainted(false);

							btnAdminMarketDelete = new JButton("Delete");
							btnAdminMarketDelete.setBounds(SCREEN_WIDTH-170, SCREEN_HEIGHT-100, 150, 50);
							btnAdminMarketDelete.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminMarketDelete.setForeground(Color.WHITE);
							btnAdminMarketDelete.setBackground(Color.RED);
							btnAdminMarketDelete.setOpaque(true);
							btnAdminMarketDelete.setFocusable(false);
							btnAdminMarketDelete.setBorderPainted(false);
							btnAdminMarketDelete.setFocusPainted(false);
							
							// admin view order buttons
							btnAdminViewOrders = new JButton("View Orders");
							btnAdminViewOrders.setBounds(0, 200, 150, 50);
							btnAdminViewOrders.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminViewOrders.setForeground(Color.WHITE);
							btnAdminViewOrders.setBackground(Color.RED);
							btnAdminViewOrders.setOpaque(true);
							btnAdminViewOrders.setFocusable(false);
							btnAdminViewOrders.setBorderPainted(false);
							btnAdminViewOrders.setFocusPainted(false);
							btnAdminViewOrders.setEnabled(true);

							// admin logout buttons
							btnAdminLogout = new JButton("Logout");
							btnAdminLogout.setBounds(0, SCREEN_HEIGHT-100, 150, 50);
							btnAdminLogout.setFont(new Font(FONT_DEFAULT, Font.BOLD, FONT_DEFAULT_SIZE));
							btnAdminLogout.setForeground(Color.WHITE);
							btnAdminLogout.setBackground(Color.RED);
							btnAdminLogout.setOpaque(true);
							btnAdminLogout.setFocusable(false);
							btnAdminLogout.setBorderPainted(false);
							btnAdminLogout.setFocusPainted(false);
							
							// admin panel
							adminPanel = new JPanel();
							adminPanel.setBackground(Color.WHITE);
							adminPanel.setLayout(null);
							adminPanel.add(labelAdminMarketHeader);
							adminPanel.add(btnAdminControl);
							adminPanel.add(btnAdminMarket);
							adminPanel.add(btnAdminViewOrders);
							adminPanel.add(btnAdminLogout);
							adminPanel.add(labelAdminMarketItemIDHeader);
							adminPanel.add(labelAdminMarketItemNameHeader);
							adminPanel.add(labelAdminMarketPriceHeader);
							adminPanel.add(labelAdminMarketAddItemName);
							adminPanel.add(labelAdminMarketAddPrice);
							adminPanel.add(textfieldAdminMarketAddItemName);
							adminPanel.add(textfieldAdminMarketAddPrice);
							adminPanel.add(btnAdminMarketAdditem);
							adminPanel.add(btnAdminMarketDelete);


							for(int i=0; i<=items.newItemID; i++){
								checkboxMarket[i] = new JCheckBox();
								checkboxMarket[i].setBounds(160, (200+30*(i+1)), 30, 30);
								checkboxMarket[i].setBackground(Color.WHITE);
								checkboxMarket[i].setFocusable(false);
								
								labelAdminMarketItemID[i] = new JLabel(String.valueOf(i));
								labelAdminMarketItemID[i].setBounds(200, (200+30*(i+1)), 100, 30);
								labelAdminMarketItemID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								labelAdminMarketItemName[i] = new JLabel(items.itemName[i]);
								labelAdminMarketItemName[i].setBounds(300, (200+30*(i+1)), 100, 30);
								labelAdminMarketItemName[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								labelAdminMarketPrice[i] = new JLabel(String.valueOf(items.price[i]));
								labelAdminMarketPrice[i].setBounds(600, (200+30*(i+1)), 100, 30);
								labelAdminMarketPrice[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								adminPanel.add(checkboxMarket[i]);
								adminPanel.add(labelAdminMarketItemID[i]);
								adminPanel.add(labelAdminMarketItemName[i]);
								adminPanel.add(labelAdminMarketPrice[i]);
							}
							
							// admin control panel
							adminControlPanel = new JPanel();
							adminControlPanel.setBackground(Color.WHITE);
							adminControlPanel.setLayout(null);
							adminControlPanel.add(labelAdminControlHeader);
							adminControlPanel.add(labelAdminControlUserIDHeader);
							adminControlPanel.add(labelAdminControlUsernameHeader);
							adminControlPanel.add(labelAdminControlMobileNoHeader);
							adminControlPanel.add(btnAdminControlDelete);

							for(int i=0; i<=users.newUserID; i++){
								checkboxControl[i] = new JCheckBox();
								checkboxControl[i].setBounds(160, (150+30*(i+1)), 30, 30);
								checkboxControl[i].setBackground(Color.WHITE);
								checkboxControl[i].setFocusable(false);

								labelAdminControlUserID[i] = new JLabel(String.valueOf(i));
								labelAdminControlUserID[i].setBounds(200, (150+30*(i+1)), 100, 30);
								labelAdminControlUserID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								labelAdminControlUsername[i] = new JLabel(users.username[i]);
								labelAdminControlUsername[i].setBounds(300, (150+30*(i+1)), 100, 30);
								labelAdminControlUsername[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								labelAdminControlMobileNo[i] = new JLabel(users.mobileNo[i]);
								labelAdminControlMobileNo[i].setBounds(600, (150+30*(i+1)), 100, 30);
								labelAdminControlMobileNo[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

								adminControlPanel.add(checkboxControl[i]);
								adminControlPanel.add(labelAdminControlUserID[i]);
								adminControlPanel.add(labelAdminControlUsername[i]);
								adminControlPanel.add(labelAdminControlMobileNo[i]);

							}

							// admin view orders panel
							adminViewOrdersPanel = new JPanel();
							adminViewOrdersPanel.setBackground(Color.WHITE);
							adminViewOrdersPanel.setLayout(null);

							// refresh panel
							JPanel tempPanel = new JPanel();
							tempPanel.setLayout(null);

							// action admin control
							btnAdminControl.addActionListener(new ActionListener(){
								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin control panel");
									btnAdminControl.setEnabled(false);
									btnAdminMarket.setEnabled(true);
									btnAdminViewOrders.setEnabled(true);

									adminControlPanel.add(btnAdminControl);
									adminControlPanel.add(btnAdminMarket);
									adminControlPanel.add(btnAdminViewOrders);
									adminControlPanel.add(btnAdminLogout);
									
									
									frame.setContentPane(adminControlPanel);
									frame.validate();
								}
							});

							btnAdminControlDelete.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									for(int i=0; i<=users.newUserID; i++){
										if(checkboxControl[i].isSelected()){
											for(int k=0; k<=users.newUserID; k++){
												tempPanel.add(checkboxControl[k]);
												tempPanel.add(labelAdminControlUserID[k]);
												tempPanel.add(labelAdminControlUsername[k]);
												tempPanel.add(labelAdminControlMobileNo[k]);
											}

											System.out.println("deleting item: " + i + " " + users.username[i] + " " + users.mobileNo[i]);
											users.removeUser(i);

											for(int k=0; k<=users.newUserID; k++){
												checkboxControl[k] = new JCheckBox();
												checkboxControl[k].setBounds(160, (150+30*(k+1)), 30, 30);
												checkboxControl[k].setBackground(Color.WHITE);
												checkboxControl[k].setFocusable(false);
		
												labelAdminControlUserID[k] = new JLabel(String.valueOf(k));
												labelAdminControlUserID[k].setBounds(200, (150+30*(k+1)), 100, 30);
												labelAdminControlUserID[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
				
												labelAdminControlUsername[k] = new JLabel(users.username[k]);
												labelAdminControlUsername[k].setBounds(300, (150+30*(k+1)), 100, 30);
												labelAdminControlUsername[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
				
												labelAdminControlMobileNo[k] = new JLabel(String.valueOf(users.mobileNo[k]));
												labelAdminControlMobileNo[k].setBounds(600, (150+30*(k+1)), 100, 30);
												labelAdminControlMobileNo[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
		
												adminControlPanel.add(checkboxControl[k]);
												adminControlPanel.add(labelAdminControlUserID[k]);
												adminControlPanel.add(labelAdminControlUsername[k]);
												adminControlPanel.add(labelAdminControlMobileNo[k]);
											}

											break;
										}
									}
									
									try {
										System.out.println("Saving userinfo....");
										users.saveUserinfo();
										users = new Users();
									} catch (Exception e) {
										e.printStackTrace();
									}
									

									frame.setContentPane(adminControlPanel);
									frame.validate();
								}
								
							});

							// action admin market
							btnAdminMarket.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin market panel");

									btnAdminMarket.setEnabled(false);
									btnAdminControl.setEnabled(true);
									btnAdminViewOrders.setEnabled(true);

									adminPanel.add(btnAdminControl);
									adminPanel.add(btnAdminMarket);
									adminPanel.add(btnAdminViewOrders);
									adminPanel.add(btnAdminLogout);

									frame.setContentPane(adminPanel);
									frame.validate();
								}
								
							});

							btnAdminMarketAdditem.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									String itemName = textfieldAdminMarketAddItemName.getText();
									double price = Double.valueOf(textfieldAdminMarketAddPrice.getText());

									for(int i=0; i<=items.newItemID; i++){
										tempPanel.add(checkboxMarket[i]);
										tempPanel.add(labelAdminMarketItemID[i]);
										tempPanel.add(labelAdminMarketItemName[i]);
										tempPanel.add(labelAdminMarketPrice[i]);
									}

									items.createItem(itemName, price);
									System.out.println(items);

									for(int i=0; i<=items.newItemID; i++){
										checkboxMarket[i] = new JCheckBox();
										checkboxMarket[i].setBounds(160, (200+30*(i+1)), 30, 30);
										checkboxMarket[i].setBackground(Color.WHITE);
										checkboxMarket[i].setFocusable(false);

										labelAdminMarketItemID[i] = new JLabel(String.valueOf(i));
										labelAdminMarketItemID[i].setBounds(200, (200+30*(i+1)), 100, 30);
										labelAdminMarketItemID[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
		
										labelAdminMarketItemName[i] = new JLabel(items.itemName[i]);
										labelAdminMarketItemName[i].setBounds(300, (200+30*(i+1)), 100, 30);
										labelAdminMarketItemName[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
		
										labelAdminMarketPrice[i] = new JLabel(String.valueOf(items.price[i]));
										labelAdminMarketPrice[i].setBounds(600, (200+30*(i+1)), 100, 30);
										labelAdminMarketPrice[i].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));

										textfieldAdminMarketAddItemName.setText("");
										textfieldAdminMarketAddPrice.setText("");
		
										adminPanel.add(checkboxMarket[i]);
										adminPanel.add(labelAdminMarketItemID[i]);
										adminPanel.add(labelAdminMarketItemName[i]);
										adminPanel.add(labelAdminMarketPrice[i]);
									}

									try {
										System.out.println("Saving userinfo....");
										users.saveUserinfo();
										users = new Users();
									} catch (Exception e) {
										e.printStackTrace();
									}

									frame.setContentPane(adminPanel);
									frame.validate();

								}
								
							});

							btnAdminMarketDelete.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									for(int i=0; i<=items.newItemID; i++){
										if(checkboxMarket[i].isSelected()){
											for(int k=0; k<=items.newItemID; k++){
												tempPanel.add(checkboxMarket[k]);
												tempPanel.add(labelAdminMarketItemID[k]);
												tempPanel.add(labelAdminMarketItemName[k]);
												tempPanel.add(labelAdminMarketPrice[k]);
											}

											System.out.println("deleting item: " + i + " " + items.itemName[i] + " " + items.price[i]);
											items.removeItem(items.itemName[i]);

											for(int k=0; k<=items.newItemID; k++){
												checkboxMarket[k] = new JCheckBox();
												checkboxMarket[k].setBounds(160, (200+30*(k+1)), 30, 30);
												checkboxMarket[k].setBackground(Color.WHITE);
												checkboxMarket[k].setFocusable(false);
		
												labelAdminMarketItemID[k] = new JLabel(String.valueOf(k));
												labelAdminMarketItemID[k].setBounds(200, (200+30*(k+1)), 100, 30);
												labelAdminMarketItemID[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
				
												labelAdminMarketItemName[k] = new JLabel(items.itemName[k]);
												labelAdminMarketItemName[k].setBounds(300, (200+30*(k+1)), 100, 30);
												labelAdminMarketItemName[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
				
												labelAdminMarketPrice[k] = new JLabel(String.valueOf(items.price[k]));
												labelAdminMarketPrice[k].setBounds(600, (200+30*(k+1)), 100, 30);
												labelAdminMarketPrice[k].setFont(new Font(FONT_DEFAULT, Font.PLAIN, FONT_DEFAULT_SIZE));
		
												textfieldAdminMarketAddItemName.setText("");
												textfieldAdminMarketAddPrice.setText("");
				
												adminPanel.add(checkboxMarket[k]);
												adminPanel.add(labelAdminMarketItemID[k]);
												adminPanel.add(labelAdminMarketItemName[k]);
												adminPanel.add(labelAdminMarketPrice[k]);
											}

											break;
										}
									}

									try {
										System.out.println("Saving iteminfo....");
										items.saveIteminfo();
										items = new Items();
									} catch (Exception e) {
										e.printStackTrace();
									}
									
									frame.setContentPane(adminPanel);
									frame.validate();
								}
								
							});

							// actions admin view orders
							btnAdminViewOrders.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin View Orders panel");

									btnAdminMarket.setEnabled(true);
									btnAdminControl.setEnabled(true);
									btnAdminViewOrders.setEnabled(false);

									adminViewOrdersPanel.add(labelAdminViewOrdersHeader);
									adminViewOrdersPanel.add(btnAdminControl);
									adminViewOrdersPanel.add(btnAdminMarket);
									adminViewOrdersPanel.add(btnAdminViewOrders);
									adminViewOrdersPanel.add(btnAdminLogout);

									frame.setContentPane(adminViewOrdersPanel);
									frame.validate();
								}
								
							});

							// action admin logout
							btnAdminLogout.addActionListener(new ActionListener(){
			
								@Override
								public void actionPerformed(ActionEvent arg0) {
									System.out.println("Admin Logout attempt");
									int answer = JOptionPane.showConfirmDialog(null, "Do you really want to signout?", "Confirm", JOptionPane.YES_NO_OPTION);
									if(answer == 0){
										System.out.println("Admin logging out...");
										frame.setContentPane(adminLoginPanel);
									}
								}
								
							});							
							
							// set content
							frame.setContentPane(adminPanel);
							frame.validate();	
						}
			
					}
					
				});

				btnAdminUser.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// set content
						frame.setContentPane(userLoginPanel);
						frame.validate();
					}
					
				});

				// panel
				adminLoginPanel = new JPanel();
				adminLoginPanel.setBackground(Color.WHITE);
				adminLoginPanel.setLayout(null);
				adminLoginPanel.add(labelAdminLogin);
				adminLoginPanel.add(labelAdminPassword);
				adminLoginPanel.add(passwordFieldAdmin);
				adminLoginPanel.add(btnAdminLoginAtttempt);
				adminLoginPanel.add(btnAdminUser);

				// set content
				frame.setContentPane(adminLoginPanel);
				frame.validate();
			}
			
		});

		// saves everything to files
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				// System.out.println("Window closing listener");
				try {
					System.out.println("Saving userinfo....");
					users.saveUserinfo();
					System.out.println("Saving iteminfo....");
					items.saveIteminfo();
				} catch (Exception e1) {
					System.out.println(e1);
				}
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
