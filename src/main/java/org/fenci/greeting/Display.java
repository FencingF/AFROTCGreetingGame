package org.fenci.greeting;

import org.fenci.greeting.poc.POC;
import org.fenci.greeting.poc.POCData;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Display extends JFrame implements POCData {
    private final HashMap<String, JLabel> imageLabelMap; // Stores references to the JLabels
    private HashMap<String, String> POCimageMap;
    private final JPanel imagePanel;

    public static void main(String[] args) {
        Display display = new Display();

        display.addImage("Alcisto");
        display.addImage("Escamilla");
        display.addImage("Laravia");
        display.addImage("Kimura");
        display.addImage("Argueta");
        display.addImage("Kinkead");
    }

    public Display() {
        // Initialize the HashMap to store the JLabel components
        imageLabelMap = new HashMap<>();

        // Initialize the HashMap to store image file paths
        iniList();
        initializeList();

        // Set up the JFrame
        setSize(900, 800); // Set a medium window size
        setTitle("POC Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for images (this will be updated dynamically)
        imagePanel = new JPanel(new GridLayout(2, 3)); // 2 rows, 3 columns for images

        // Panel for the text box at the bottom
        JPanel textBoxPanel = new JPanel();
        JTextField textBox = new JTextField(50); // Create a text box with a width of 50 columns
        textBoxPanel.add(textBox);

        // Add panels to the frame
        add(imagePanel, BorderLayout.CENTER); // Top 2/3 of the screen for images
        add(textBoxPanel, BorderLayout.SOUTH); // Bottom part for text box

        // Make the frame visible
        setVisible(true);
    }

    // Function to dynamically add an image to the display
    public void addImage(String name) {
        if (POCimageMap.containsKey(name)) {
            // Create a JLabel to hold the image
            JLabel imageLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon(POCimageMap.get(name));

            // Resize the image to fit within the slots (optional scaling)
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(202, 250, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            // Set the scaled image on the label
            imageLabel.setIcon(scaledIcon);
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            imageLabel.setVerticalAlignment(JLabel.CENTER);

            // Add the label to the map for later reference
            imageLabelMap.put(name, imageLabel);

            // Add the label to the panel and refresh the display
            imagePanel.add(imageLabel);
            imagePanel.revalidate();
            imagePanel.repaint();
        } else {
            System.out.println("Image for " + name + " not found.");
        }
    }

    // Function to remove an image from the display
    public void removeImage(String name) {
        if (imageLabelMap.containsKey(name)) {
            JLabel imageLabel = imageLabelMap.get(name);

            // Remove the label from the panel
            imagePanel.remove(imageLabel);
            imageLabelMap.remove(name);

            // Refresh the panel after removing the image
            imagePanel.revalidate();
            imagePanel.repaint();
        } else {
            System.out.println("No image to remove for " + name);
        }
    }

    // Initialize the image file paths
    private void initializeList() {
        POCimageMap = new HashMap<>();
        for (POC poccorp : POCList.keySet()) {
            POCimageMap.put(poccorp.getName(), POCList.get(poccorp)); //POCList.get(poccorp) returns the directory
        }
    }
}
