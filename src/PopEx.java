//PopEx.java:PopUp Menu�d��
import java.awt.*;
import java.awt.event.*;

public class PopEx extends Frame implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1;
	PopupMenu popMenu;
	Menu menu;
	MenuItem  item1, item2, item3, item4, item5;
	public PopEx() {
    //�D�����]�w  
		super("Popup menu���ܽd");
		setLayout(null);  
		setBounds(100,100,300,200);  
		b1 = new Button("�o�̫��U�k��"); 
		b1.setBounds(50,60,100,25);
		b1.addMouseListener(this);
		add(b1);   
		popMenu = new PopupMenu();   //�إ߼u������
		item1 = new MenuItem("�}��"); //�إ߿ﶵ�@
		popMenu.add(item1);   
		menu = new Menu("�R��");      //�إ߿ﶵ�G
		item2 = new MenuItem("�R���@�C");
		item3 = new MenuItem("�R���@��");
		menu.add(item2);
		menu.add(item3);
		popMenu.add(menu);      
		item4 = new MenuItem("�s��");    //�إ߿ﶵ�T
		popMenu.add(item4); 
		popMenu.add(new MenuItem("-")); //���j�u  
		item5 = new MenuItem("�D�U");    //�إ߿ﶵ�|
		popMenu.add(item5);    
		add(popMenu); 

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	}

	@SuppressWarnings("deprecation")
	public void mouseClicked(MouseEvent e) {
    //�P�_�O�_���k��
		if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
			System.out.println("���k��");
			int x = e.getX();
			int y = e.getY();
			popMenu.show(b1, x, y);    
		}
		else
			System.out.println("�䥦��");
	}

	public void mouseEntered(MouseEvent e)  {}          
	public void mouseExited(MouseEvent e) {}           
	public void mousePressed(MouseEvent e) {}           
	public void mouseReleased(MouseEvent e) {}

	public static void main(String arg[]) {
		new PopEx();
	}
}