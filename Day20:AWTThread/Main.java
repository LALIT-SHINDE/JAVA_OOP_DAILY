import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements Runnable {

    Label l;
    Thread t;
    int count = 0;

    AWTThreadDemo() {

        l = new Label("Counter : 0");
        l.setBounds(100, 100, 200, 30);

        add(l);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        t = new Thread(this);
        t.start();
    }

    public void run() {

        try {

            while (true) {

                count++;

                l.setText("Counter : " + count);

                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {

        new AWTThreadDemo();
    }
}
