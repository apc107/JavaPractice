import java.util.Scanner;
public class ScannerBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //���ͤ@��Scanner����
        int x = 0;
        byte b;
        double d = 0;
        String s = "";
        System.out.println("�п�J�@�Ӿ�ơA�@�ӯB�I�ơA�@�Ӧr��G");
        // �p�G��J�w�İϤ����@�ӥi��������ƪ��O��
        if (scan.hasNextInt()) {     
            x = scan.nextInt();      // Ū���o�Ӿ��
        }
        // �p�G��J�w�İϤ����@�ӥi�������B�I�ƪ��O��
        if (scan.hasNextDouble()) {  
            d = scan.nextDouble();     // Ū���o�ӯB�I��
        }
        // �p�G��J�w�İϤ����O��
        if (scan.hasNext()) {        
            s = scan.next();         // Ū���o�Ӹ��
        }
        if (scan.hasNextByte())
        	b = scan.nextByte();
        scan.close();
        System.out.println("x=" + x);
        System.out.println("d=" + d);
        System.out.println("s=" + s);
    }
}
