package org.fenci.greeting;

import org.fenci.greeting.poc.POC;
import org.fenci.greeting.poc.POCData;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Display extends JFrame implements POCData {

    public static HashMap<String, String> POCimageMap;
    public static void main(String[] args) {
        // Create an instance of the JFrame to display the images
        new Display();
    }

    public Display() {
        // Initialize the HashMap to store image file paths
        iniList();
        // Initialize the HashMap to store image file paths
        POCimageMap = new HashMap<>();
        POCimageMap.put("Alcisto", directory + "cadet2ndltalcisto.png");
        POCimageMap.put("Escamilla", directory + "cadet2ndltescamilla.jpg");
        POCimageMap.put("Kimura", directory + "cadet2ndltkimura.jpeg");
        POCimageMap.put("Anderson", directory + "cadetcaptainanderson.jpg");
        POCimageMap.put("Dimatteo", directory + "cadetcaptaindimatteo.png");
        POCimageMap.put("Kinkead", directory + "cadetcaptainkinkead.jpg");

        // Set up the JFrame to full screen
        setExtendedState(JFrame.MAXIMIZED_BOTH); // This makes the frame full screen
        setTitle("POC Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set a GridLayout with 2 rows and 3 columns
        setLayout(new GridLayout(2, 3));

        // Add images to the frame (6 images)
        addImageLabel("Alcisto");
        addImageLabel("Escamilla");
        addImageLabel("Kimura");
        addImageLabel("Anderson");
        addImageLabel("Dimatteo");
        addImageLabel("Kinkead");

        // Make the frame visible
        setVisible(true);
    }

    private void addImageLabel(String name) {
        // Create a JLabel to hold the image
        JLabel imageLabel = new JLabel();

        // Load the image as an ImageIcon
        ImageIcon imageIcon = new ImageIcon(POCimageMap.get(name));

        // Resize the image to fit within the slots (optional scaling)
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Set the scaled image on the label
        imageLabel.setIcon(scaledIcon);

        // Add the label to the frame
        add(imageLabel);
    }
}
