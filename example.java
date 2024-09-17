package BasicThings;

import javax.swing.*;

class example{

    public static void main(String args[])

    {

        JFrame x = new JFrame("BasicThings.example of Label");

        JLabel y1;

        y1 = new JLabel("Label 2");

        y1.setBounds(60,60,95,30);

        x.add(y1);

        x.setSize(500,500);

        x.setLayout(null);

        x.setVisible(true);

    }

}