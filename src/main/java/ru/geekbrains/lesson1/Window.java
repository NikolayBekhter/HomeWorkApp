package ru.geekbrains.lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Window extends JFrame {

    public Window() {

        setTitle("My First Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);

        setLayout(null);

        Font font = new Font("Arial", Font.BOLD, 20);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 445, 60);
        textArea.setFont(font);
        add(textArea);

        JTextArea textAreaMain = new JTextArea();
        textAreaMain.setBounds(20, 100, 445, 300);
        textAreaMain.setFont(font);
        add(textAreaMain);

        JButton send = new JButton("SEND");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                textArea.setText("");
                textAreaMain.append(text + "\n");
            }
        });
        send.setBounds(25, 415, 120, 32);
        add(send);

        JButton saveChat = new JButton("SAVE CHAT");
        saveChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textAreaMain.getText();
                try (FileWriter writer = new FileWriter("D:/chat.txt")){
                    writer.write(text);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        saveChat.setBounds(340, 415, 120, 32);
        add(saveChat);

        JButton clearChat = new JButton("CLEAR CHAT");
        clearChat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaMain.setText("");
            }
        });
        clearChat.setBounds(215, 415, 120, 32);
        add(clearChat);

        setVisible(true);

    }
}
