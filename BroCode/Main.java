package BroCode;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        String age = JOptionPane.showInputDialog("How old are you " + name + "?");
        JOptionPane.showMessageDialog(null, "You're  " + age + " years old");
    }
}
