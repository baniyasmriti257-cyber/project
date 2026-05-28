import javax.swing.*;
import java.awt.*;

public class NewspaperCoverPage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Daily News - Cover Page");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel header = new JPanel();
        header.setLayout(new FlowLayout());
        header.setBackground(Color.DARK_GRAY);

        JLabel title = new JLabel("DAILY NEWS");
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setForeground(Color.WHITE);

        header.add(title);

       
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2, 2, 10, 10));

        JTextArea news1 = new JTextArea("Breaking News: ");
        JTextArea news2 = new JTextArea("Sports: ");
        JTextArea news3 = new JTextArea("Weather:");
        JTextArea news4 = new JTextArea("World: ");

        center.add(news1);
        center.add(news2);
        center.add(news3);
        center.add(news4);

        
        JPanel left = new JPanel();
        left.setLayout(new FlowLayout());
        left.add(new JLabel("Advertisement Space"));

       
        JPanel right = new JPanel();
        right.setLayout(new FlowLayout());
        right.add(new JLabel("Latest Updates"));

       
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout());
        footer.setBackground(Color.LIGHT_GRAY);
        footer.add(new JLabel("© 2026 Daily News | All rights reserved"));

        
        frame.setLayout(new BorderLayout());

        frame.add(header, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);
        frame.add(footer, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}