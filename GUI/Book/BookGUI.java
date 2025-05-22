package GUI.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BookGUI extends JFrame implements ActionListener {

    // Data fields
    private JLabel book, author, genre;
    private JTextField enterbook, enterauthor;
    private JComboBox<Genre> entergenre;
    private JButton submit, delete;
    private JScrollPane showbook;
    private JTextArea eachbook;

    private BookManager bookManager;

    BookGUI() {
        bookManager = new BookManager(); // Initialize BookManager

        setTitle("Book GUI");
        setSize(500, 500);

        // Panel 1 components
        book = new JLabel("Book:");
        enterbook = new JTextField(20);

        author = new JLabel("Author:");
        enterauthor = new JTextField(20);

        genre = new JLabel("Genre:");
        entergenre = new JComboBox<>(Genre.values());

        JPanel bookinfo = new JPanel(new GridLayout(3, 2));
        bookinfo.add(book);
        bookinfo.add(enterbook);
        bookinfo.add(author);
        bookinfo.add(enterauthor);
        bookinfo.add(genre);
        bookinfo.add(entergenre);
        add(bookinfo, BorderLayout.CENTER);

        // Panel 2 components
        submit = new JButton("Add");
        delete = new JButton("Delete");

        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(submit);
        buttons.add(delete);
        add(buttons, BorderLayout.SOUTH);

        // Panel 3 components
        eachbook = new JTextArea(5, 20);
        showbook = new JScrollPane(eachbook);
        add(showbook, BorderLayout.EAST);

        submit.addActionListener(this);
        delete.addActionListener(this);

        // press enter to add book
        getRootPane().setDefaultButton(submit);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == delete && enterbook.getText().isEmpty() && enterauthor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Book List is empty already");

        }
        if (e.getSource() == submit && !enterbook.getText().isEmpty() && !enterauthor.getText().isEmpty()) {
            
            bookManager.add(new Book(enterbook.getText(), enterauthor.getText(), (Genre) entergenre.getSelectedItem()));
            updateEastPanel();
        } else if (e.getSource() == delete) {
            bookManager.clear();
            updateEastPanel();
        } else {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty");
        }
    }

    public void updateEastPanel() {
        eachbook.setText("");
        for (Book item : bookManager.getitem()) {
            eachbook.append(item.toString() + "\n");
        }
        enterauthor.setText("");
        enterbook.setText("");
        entergenre.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new BookGUI();
    }
}