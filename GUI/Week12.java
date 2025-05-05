package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Week12 {
    public static void main(String[] args) {
        // new LoginGUI();

        // menu bar
        JFrame frame = new JFrame("Menu Example");
        JMenuBar menuBar = new JMenuBar();
        // for filemenu
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // add a line to separate it
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        // for cut item
        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        menuBar.add(edit);

        // for help menu
        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");

        help.add(about);
        menuBar.add(help);

        frame.add(menuBar);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
