package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>Make a business card using java application with running-robot</p>
 *
 * @author Byunghak kim, A00825418, SET B 
 * @version 1.0
 */
public class BusinessCard extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        super("Byungahk kim");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(350, 220); // you can change this size but don't make it HUGE!
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        Image img = null;

        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        public BusinessCardPanel() {
            // NOTE: IF YOU ADD AN IMAGE YOU NEED TO LEAVE 'q5' IN THE STRING!
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/running-robot.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(new Color(178, 235, 244));
            g.setColor(new Color(76, 76, 76));
            g.drawString("Title: Information Security Master", X_POSITION - 5 , Y_POSITION + 15);
            g.drawString("Phone: 604.812.8504", X_POSITION, Y_POSITION + 40);
            g.drawString("Link: www.microsoft.com", X_POSITION, Y_POSITION + 80);
            g.drawString("Email: kbyunghak@gmail.com", X_POSITION, Y_POSITION + 60);
            g.drawRect(X_POSITION - 10, Y_POSITION - 10, 185, 150);
            
            g.setColor(new Color(245, 82, 22));
            g.fillRect(X_POSITION + 120, Y_POSITION + 90, 23, 23);// color fill
            g.setColor(new Color(122, 186, 19));
            g.fillRect(X_POSITION + 145, Y_POSITION + 90, 23, 23);// color fill
            g.setColor(new Color(5, 160, 238));
            g.fillRect(X_POSITION + 120, Y_POSITION + 115, 23, 23);// color fill
            g.setColor(new Color(255, 188, 23));
            g.fillRect(X_POSITION  + 145, Y_POSITION + 115, 23, 23);// color fill
            
            g.drawImage(img, 200, 0, this);
        }
    }

    /**
     * <p>The main method.</p>
     */
    public static void main(String[] args) {
        new BusinessCard();
    }

}
