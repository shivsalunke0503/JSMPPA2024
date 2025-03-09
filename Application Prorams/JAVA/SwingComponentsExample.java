import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingComponentsExample {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;
    private JComboBox<String> comboBox;
    private JCheckBox checkBox;
    private JRadioButton radioButton1, radioButton2;
    private JList<String> list;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem1, menuItem2;
    private ButtonGroup group;
    private JProgressBar progressBar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SwingComponentsExample window = new SwingComponentsExample();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public SwingComponentsExample() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(10, 10));

        // Create a JPanel to hold the components with 2 columns
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));  // 0 rows (dynamic) and 2 columns with 10px gap

        // Create components
        JLabel label1 = new JLabel("Enter text:");
        textField = new JTextField();
        JButton button1 = new JButton("Show Text");
        JLabel resultLabel = new JLabel("Text will appear here");

        // ComboBox
        JLabel comboLabel = new JLabel("Choose option:");
        comboBox = new JComboBox<>(new String[] { "Option 1", "Option 2", "Option 3" });
        JButton comboButton = new JButton("Show ComboBox selection");

        // CheckBox
        checkBox = new JCheckBox("I agree");
        JButton checkBoxButton = new JButton("Check Box Status");

        // RadioButtons
        radioButton1 = new JRadioButton("Option 1");
        radioButton2 = new JRadioButton("Option 2");
        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        JButton radioButtonButton = new JButton("Show RadioButton selection");

        // JList
        JLabel listLabel = new JLabel("Select an item:");
        list = new JList<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" });
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(list);
        JButton listButton = new JButton("Show List selection");

        // TextArea
        JLabel textAreaLabel = new JLabel("Enter multiple lines:");
        textArea = new JTextArea(3, 20);
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);
        JButton textAreaButton = new JButton("Show TextArea content");

        // Progress Bar
        JLabel progressLabel = new JLabel("Progress:");
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true); // Display percentage
        JButton startProgressButton = new JButton("Start Progress");

        // Add components to the panel (in two columns)
        panel.add(label1);
        panel.add(textField);
        panel.add(button1);
        panel.add(resultLabel);
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(comboLabel);
        panel.add(comboBox);
        panel.add(comboButton);
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(checkBox);
        panel.add(checkBoxButton);
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButtonButton);
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(listLabel);
        panel.add(listScrollPane);
        panel.add(listButton);
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(textAreaLabel);
        panel.add(textAreaScrollPane);
        panel.add(textAreaButton);
        panel.add(new JSeparator(SwingConstants.HORIZONTAL));
        panel.add(progressLabel);
        panel.add(progressBar);
        panel.add(startProgressButton);

        // Add the panel to the frame
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        // Create a menu bar
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        menuItem1 = new JMenuItem("Open");
        menuItem2 = new JMenuItem("Exit");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Action Listeners
        button1.addActionListener(e -> {
            resultLabel.setText("Text: " + textField.getText());
        });

        comboButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "You selected: " + comboBox.getSelectedItem());
        });

        checkBoxButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Checkbox is " + (checkBox.isSelected() ? "Checked" : "Unchecked"));
        });

        radioButtonButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Selected Radio Button: " +
                    (radioButton1.isSelected() ? "Option 1" : "Option 2"));
        });

        listButton.addActionListener(e -> {
            String selectedValue = list.getSelectedValue();
            JOptionPane.showMessageDialog(frame, "You selected: " + selectedValue);
        });

        textAreaButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Text Area Content:\n" + textArea.getText());
        });

        menuItem1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open option selected"));

        menuItem2.addActionListener(e -> System.exit(0));

        // Start Progress Action Listener
        startProgressButton.addActionListener(e -> {
            // Simulate progress increment (e.g., loading)
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i <= 100; i++) {
                        try {
                            Thread.sleep(50); // Simulate work by sleeping for 50 ms
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        progressBar.setValue(i); // Update progress bar value
                    }
                }
            }).start();
        });
    }
}
