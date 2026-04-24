import javax.swing.*;
import java.awt.*;

public class pra35 extends JFrame {

    private static final String[] LABELS = {
        "Projects - 20%",
        "Quizzes - 10%",
        "Midterm - 30%",
        "Final - 40%"
    };

    private static final int[] VALUES = {20, 10, 30, 40};
    private static final Color[] COLORS = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

    public pra35() {
        super("Grade Distribution Chart");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new ChartPanel());
        setSize(620, 440);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private static class ChartPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int margin = 60;
            int barWidth = 80;
            int gap = 30;
            int baseY = getHeight() - margin;
            int maxBarHeight = getHeight() - 2 * margin;

            int x = margin;
            for (int i = 0; i < VALUES.length; i++) {
                int height = Math.round(VALUES[i] / 100f * maxBarHeight);
                g2.setColor(COLORS[i]);
                g2.fillRect(x, baseY - height, barWidth, height);
                g2.setColor(Color.BLACK);
                g2.drawRect(x, baseY - height, barWidth, height);

                String text = LABELS[i];
                FontMetrics fm = g2.getFontMetrics();
                int textWidth = fm.stringWidth(text);
                g2.drawString(text, x + (barWidth - textWidth) / 2, baseY + fm.getHeight() + 5);
                x += barWidth + gap;
            }

            g2.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new pra35().setVisible(true));
    }
}