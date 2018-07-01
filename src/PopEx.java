//PopEx.java:PopUp Menu範例
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
    //主視窗設定  
		super("Popup menu的示範");
		setLayout(null);  
		setBounds(100,100,300,200);  
		b1 = new Button("這裡按下右鍵"); 
		b1.setBounds(50,60,100,25);
		b1.addMouseListener(this);
		add(b1);   
		popMenu = new PopupMenu();   //建立彈跳視窗
		item1 = new MenuItem("開檔"); //建立選項一
		popMenu.add(item1);   
		menu = new Menu("刪除");      //建立選項二
		item2 = new MenuItem("刪除一列");
		item3 = new MenuItem("刪除一行");
		menu.add(item2);
		menu.add(item3);
		popMenu.add(menu);      
		item4 = new MenuItem("存檔");    //建立選項三
		popMenu.add(item4); 
		popMenu.add(new MenuItem("-")); //分隔線  
		item5 = new MenuItem("求助");    //建立選項四
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
    //判斷是否按右鍵
		if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
			System.out.println("按右鍵");
			int x = e.getX();
			int y = e.getY();
			popMenu.show(b1, x, y);    
		}
		else
			System.out.println("其它鍵");
	}

	public void mouseEntered(MouseEvent e)  {}          
	public void mouseExited(MouseEvent e) {}           
	public void mousePressed(MouseEvent e) {}           
	public void mouseReleased(MouseEvent e) {}

	public static void main(String arg[]) {
		new PopEx();
	}
}