package Tugas_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tugas_3 {
    public static void main(String[] args) {
        // frame
        JFrame frame = new JFrame();
        CardLayout card = new CardLayout();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(card);

        // blank label
        JLabel blankLabel = new JLabel("");
        
        // panel signup
        JPanel signUp = new JPanel();
        signUp.setLayout(new BorderLayout());

        // header
        JPanel header = new JPanel();
        header.setLayout(new FlowLayout());
        JLabel title = new JLabel("SIGN UP");
        title.setFont(new Font(null, Font.BOLD, 20));
        header.add(title);

        // content
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
        
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setAlignmentY(Component.CENTER_ALIGNMENT);

        // name
        JLabel name = new JLabel("Name");
        name.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.add(name);
        JTextField namefield = new JTextField();
        namefield.setAlignmentX(Component.LEFT_ALIGNMENT);
        namefield.setMaximumSize(new Dimension(370, 30));
        content.add(namefield);
        content.add(Box.createRigidArea(new Dimension(0, 10)));

        // email
        JLabel email = new JLabel("Email");
        email.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.add(email);
        JTextField emailfield = new JTextField();
        emailfield.setAlignmentX(Component.LEFT_ALIGNMENT);
        emailfield.setMaximumSize(new Dimension(370, 30));
        content.add(emailfield);
        content.add(Box.createRigidArea(new Dimension(0, 10)));

        // password
        JLabel password = new JLabel("Password");
        password.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.add(password);
        JPasswordField passwordfield = new JPasswordField();
        passwordfield.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordfield.setMaximumSize(new Dimension(370, 30));
        content.add(passwordfield);
        content.add(Box.createRigidArea(new Dimension(0, 20)));

        // signup
        JButton signup = new JButton("Sign Up");
        signup.setAlignmentX(Component.LEFT_ALIGNMENT);
        signup.setMaximumSize(new Dimension(80, 30));
        signup.setBackground(Color.decode("#026866"));
        signup.setForeground(Color.decode("#FFFFFF"));
        content.add(signup);
        
        main.add(content);
        // footer
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout(FlowLayout.LEFT));

        // to login
        JLabel toLogin = new JLabel("Do you have an account?");
        footer.add(toLogin);

        // loginbutton
        JButton login2 = new JButton("Login");
        login2.setForeground(Color.decode("#FF0000"));
        footer.add(login2);
        login2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(frame.getContentPane(), "Login");
            }
        });

        // blank1
        JPanel blank1 = new JPanel();
        blank1.add(blankLabel);

        // blank2
        JPanel blank2 = new JPanel();
        blank2.add(blankLabel);

        signUp.add(header, BorderLayout.NORTH);
        signUp.add(main, BorderLayout.CENTER);
        signUp.add(footer, BorderLayout.SOUTH);
        signUp.add(blank1, BorderLayout.WEST);
        signUp.add(blank2, BorderLayout.EAST);

        // panel login
        JPanel Login = new JPanel();
        Login.setLayout(new BorderLayout());
        // header
        JPanel header2 = new JPanel();
        header2.setLayout(new FlowLayout());
        JLabel title2 = new JLabel("LOGIN");
        title2.setFont(new Font(null, Font.BOLD, 20));
        title2.setForeground(Color.decode("#026866"));
        header2.add(title2);

        // content
        JPanel main2 = new JPanel();
        main2.setLayout(new BoxLayout(main2, BoxLayout.X_AXIS));
        
        JPanel content2 = new JPanel();
        content2.setLayout(new BoxLayout(content2, BoxLayout.Y_AXIS));
        content2.setAlignmentY(Component.CENTER_ALIGNMENT);

        // email
        JLabel email2 = new JLabel("Email");
        email2.setAlignmentX(Component.LEFT_ALIGNMENT);
        content2.add(email2);
        JTextField emailfield2 = new JTextField();
        emailfield2.setAlignmentX(Component.LEFT_ALIGNMENT);
        emailfield2.setMaximumSize(new Dimension(370, 30));
        content2.add(emailfield2);
        content2.add(Box.createRigidArea(new Dimension(0, 10)));

        // password
        JLabel password2 = new JLabel("Password");
        password2.setAlignmentX(Component.LEFT_ALIGNMENT);
        content2.add(password2);
        JPasswordField passwordfield2 = new JPasswordField();
        passwordfield2.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordfield2.setMaximumSize(new Dimension(370, 30));
        content2.add(passwordfield2);
        content2.add(Box.createRigidArea(new Dimension(0, 20)));

        // signup
        JButton login = new JButton("Login");
        login.setAlignmentX(Component.LEFT_ALIGNMENT);
        login.setMaximumSize(new Dimension(80, 30));
        login.setBackground(Color.decode("#026866"));
        login.setForeground(Color.decode("#FFFFFF"));
        content2.add(login);
        
        main2.add(content2);
        // footer
        JPanel footer2 = new JPanel();
        footer2.setLayout(new FlowLayout(FlowLayout.LEFT));

        // to signup
        JLabel toSignUp = new JLabel("Do you want to make an account?");
        footer2.add(toSignUp);

        // signupbutton
        JButton signup2 = new JButton("Sign Up");
        signup2.setForeground(Color.decode("#FF0000"));
        footer2.add(signup2);
        signup2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(frame.getContentPane(), "Sign Up");
            }
        });

        // blank3
        JPanel blank3 = new JPanel();
        blank3.add(blankLabel);

        // blank4
        JPanel blank4 = new JPanel();
        blank4.add(blankLabel);

        Login.add(header2, BorderLayout.NORTH);
        Login.add(main2, BorderLayout.CENTER);
        Login.add(footer2, BorderLayout.SOUTH);
        Login.add(blank3, BorderLayout.WEST);
        Login.add(blank4, BorderLayout.EAST);

        frame.add(signUp, "Sign Up");
        frame.add(Login, "Login");
        
        frame.setVisible(true);
    }
}