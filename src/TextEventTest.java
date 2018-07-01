import java.awt.*;
import java.awt.event.*;
//�OFrame�P�ɤ]�OTextListener
public class TextEventTest extends Frame implements TextListener {
  private TextField tf1,tf2,tf3;
  public static void main(String args[]) {
    TextEventTest test=new TextEventTest();
    test.setSize(300,200);
    test.setVisible(true);
  }

  public TextEventTest() {  //�غc�l
    setLayout(new GridLayout(3,1));
    tf1=new TextField();
    tf1.addTextListener(this);  //��tf1����B�z�ƥ�
    tf2=new TextField();
    tf3=new TextField();
    add(tf1);
    add(tf2);
    add(tf3);
  }

  public void textValueChanged(TextEvent e) {  //��@TextListener��method
    tf2.setText(tf1.getText());  //�Ntf1�̪��r��]�w��tf2
    tf3.setText(tf1.getText());
  }
}
