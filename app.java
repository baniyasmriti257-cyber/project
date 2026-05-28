import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class app{
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new GridBagLayout());

        JLabel label1=new JLabel("Name");
        JTextField nameTextField = new JTextField(10);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        frame.add(label1,gridBagConstraints);

        gridBagConstraints.gridx=1;
        gridBagConstraints.gridy=0;
        frame.add(nameTextField,gridBagConstraints);

        frame.setVisible(true);

        JLabel rollabel1=new JLabel("roll");
        JTextField rollTextField=new JTextField(20);

        GridBagConstraints gridBagConstraints1=new GridBagConstraints();
        gridBagConstraints1.gridx=0;
        gridBagConstraints1.gridy=1;
        frame.add(rollabel1,gridBagConstraints1);

        GridBagConstraints gridBagConstraints2=new GridBagConstraints();
        gridBagConstraints2.gridx=1;
        gridBagConstraints2.gridy=1;
        frame.add(rollTextField,gridBagConstraints2);
        frame.setVisible(true);
    }
}