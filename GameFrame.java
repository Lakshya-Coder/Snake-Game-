import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameFrame extends JFrame implements ActionListener {

    JRadioButton high;
    JRadioButton medium;
    JRadioButton slow;

    ImageIcon tick_icon = new ImageIcon("tick.png");
    ImageIcon cross_icon = new ImageIcon("cross.png");

    GamePanel panel = null;

    JLabel label = new JLabel("Chose the speed of the snake!");

    GameFrame() {

        label.setHorizontalAlignment(JRadioButton.CENTER);
        label.setVerticalAlignment(JRadioButton.CENTER);
        label.setFont(new Font("Ink Free", Font.BOLD, 20));
        label.setForeground(Color.green);

        ButtonGroup buttonGroup = new ButtonGroup();

        high = new JRadioButton("High");

        high.setFont(new Font("Ink Free", Font.BOLD, 20));
        high.addActionListener(this);
        high.setForeground(Color.cyan);
        high.setBackground(Color.BLACK);

        high.setHorizontalAlignment(JRadioButton.RIGHT);
        high.setVerticalAlignment(JRadioButton.CENTER);
        high.setIcon(cross_icon);
        high.setSelectedIcon(tick_icon);
        high.setFocusable(false);

        medium = new JRadioButton("Medium");

        medium.setHorizontalAlignment(JRadioButton.LEFT);
        medium.setVerticalAlignment(JRadioButton.CENTER);
        medium.setFont(new Font("Ink Free", Font.BOLD, 20));
        medium.addActionListener(this);
        medium.setForeground(Color.cyan);
        medium.setBackground(Color.BLACK);
        medium.setIcon(cross_icon);
        medium.setSelectedIcon(tick_icon);
        medium.setFocusable(false);

        slow = new JRadioButton("slow");

        slow.setHorizontalAlignment(JRadioButton.CENTER);
        slow.setVerticalAlignment(JRadioButton.CENTER);
        slow.setFont(new Font("Ink Free", Font.BOLD, 20));
        slow.addActionListener(this);
        slow.setForeground(Color.cyan);
        slow.setBackground(Color.BLACK);
        slow.setIcon(cross_icon);
        slow.setSelectedIcon(tick_icon);
        slow.setFocusable(false);

        buttonGroup.add(high);
        buttonGroup.add(slow);
        buttonGroup.add(medium);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label, BorderLayout.NORTH);
        this.add(medium, BorderLayout.CENTER);
        this.add(high, BorderLayout.WEST);
        this.add(slow, BorderLayout.EAST);

        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        // this.setLayout(new GridLayout(2,0, 10, 10));
        // this.setResizable(false);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String list[] = { "Yes", "No" };

        if (e.getSource() == high) {
            int x = JOptionPane.showOptionDialog(null, "You choose high!", "High", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, list, 0);

            switch (x) {
                case 0:
                    this.dispose();
                    new GamePanel(50);
                    break;
                default:
                    break;
            }

        } else if (e.getSource() == medium) {
            int x = JOptionPane.showOptionDialog(null, "You choose medium!", "Medium", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, list, 0);

            switch (x) {
                case 0:
                    this.dispose();
                    new GamePanel(80);
                    break;
                default:
                    break;
            }

        } else if (e.getSource() == slow) {
            int x = JOptionPane.showOptionDialog(null, "You choose slow!", "Slow", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, list, 0);

            switch (x) {
                case 0:
                    this.dispose();
                    new GamePanel(150);
                    break;
                default:
                    break;
            }

        }
    }
}
