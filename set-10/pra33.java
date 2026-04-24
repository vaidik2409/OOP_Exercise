import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class pra33 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Text Display");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            Random rand = new Random();

            for (int i = 1; i <= 5; i++) {
                JLabel label = new JLabel("Text " + i);
                label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));

                float red = rand.nextFloat();
                float green = rand.nextFloat();
                float blue = rand.nextFloat();
                float alpha = 0.3f + rand.nextFloat() * 0.7f;
                label.setForeground(new Color(red, green, blue, alpha));

                label.setAlignmentX(Component.CENTER_ALIGNMENT);
                panel.add(label);
            }

            frame.getContentPane().add(panel);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}