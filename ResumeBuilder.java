import java.awt.*;
import javax.swing.*;

public class ResumeBuilder extends JFrame {

    // Define GUI components
    private JComboBox<String> templateChooser;
    private JTextField nameField;
    private JTextField emailField;
    private JTextArea experienceArea;
    private JTextArea educationArea;
    private JButton previewButton;
    private JButton publishButton;


    public ResumeBuilder() {
        // Create GUI components
        templateChooser = new JComboBox<String>(new String[]{"Template 1", "Template 2", "Template 3"});
        nameField = new JTextField();
        emailField = new JTextField();
        experienceArea = new JTextArea();
        educationArea = new JTextArea();
        previewButton = new JButton("Preview");
        publishButton = new JButton("Publish");

        // Add components to frame
        JPanel mainPanel = new JPanel(new GridLayout(6, 2));
        mainPanel.add(new JLabel("Choose a template:"));
        mainPanel.add(templateChooser);
        mainPanel.add(new JLabel("Name:"));
        mainPanel.add(nameField);
        mainPanel.add(new JLabel("Email:"));
        mainPanel.add(emailField);
        mainPanel.add(new JLabel("Hobbies and Work experience:"));
        mainPanel.add(experienceArea);
        mainPanel.add(new JLabel("Education:"));
        mainPanel.add(educationArea);
        mainPanel.add(previewButton);
        mainPanel.add(publishButton);
        add(mainPanel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        ResumeBuilder resumeBuilder = new ResumeBuilder();
    }
}
