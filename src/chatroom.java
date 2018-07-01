// chatroom.java(�D�q�[�c)
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class chatroom extends Frame implements ActionListener
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
TextArea ta; //��͵e��
   TextField tin,tnick_name,tserver;
   String nick_name,server_ip;
   Panel p1,p2;
   Button b1,b2,b3,b4;
   chatroom(String title)  //��ȳ]�w
   {
      super(title);
      setForeground(Color.red);
      setLayout(new BorderLayout());
      addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
      });
      ta=new TextArea();
      tnick_name=new TextField(20);
      b1=new Button("�A���ʺ�");
      b1.addActionListener(this);
      b2=new Button("���IP:");
      b2.addActionListener(this);
      tserver=new TextField(20);
      p1=new Panel();

      p1.add(b1);
      p1.add(tnick_name);
      p1.add(b2);
      p1.add(tserver);
      add(p1,BorderLayout.NORTH);
      add(ta,BorderLayout.CENTER);

      p2=new Panel();
      //p1.setLayout(new FlowLayout());
      tin=new TextField(30);
      b3=new Button("�e�X");
      b4=new Button("�s��");
      b3.addActionListener(this);
      b4.addActionListener(this);
      p2.add(tin);
      p2.add(b3);
      p2.add(b4);
      add(p2,BorderLayout.SOUTH);

      setVisible(true);
      setSize(400,400);
      setLocation(100,100);
   }

   @SuppressWarnings("resource")
public void server_go()
   {
      ServerSocket talk_server=null;
      Socket sokt=null;
      InputStream soktin;
      DataInputStream din;
      try {
         talk_server=new ServerSocket(12345);
      }
      catch (IOException e) {}

      while (true)
      {
      	try {
            sokt=talk_server.accept();
            soktin=sokt.getInputStream();
            din=new DataInputStream(soktin);
            String st=new String(din.readUTF());
            ta.append(st);
        } catch(IOException e){}
      }
   }

   public void actionPerformed(ActionEvent e)
   {
      String str;
      String msg=tin.getText();
      str=e.getActionCommand();
      if (str.equals("�e�X"))
      {
      	ta.append(nick_name+':'+msg+'\n'); //�b�ۤv����r�ϰ���ܰe�X�T��
      	tin.setText(" ");
      	Socket sc=null;
      	OutputStream sout;
      	DataOutputStream dout;
      	try {
           sc=new Socket(server_ip,12345);
           sout=sc.getOutputStream();
           dout=new DataOutputStream(sout);
           dout.writeUTF(nick_name+":"+msg+'\n');
           sc.close();
        }catch(IOException e1){}
      }

      if (str.equals("�s��"))
      {
        try{
           FileWriter f=new FileWriter("log.txt");
           f.write(ta.getText());
           f.close();
        }catch (IOException e2){}
      }

      if (str.equals("�A���ʺ�"))
          nick_name=tnick_name.getText();

      if (str.equals("���IP:"))
          server_ip=tserver.getText();
   }

   public static void main(String args[])
   {
      chatroom ch=new chatroom("�u�W��ͪA��");
      ch.server_go();
   }
}
