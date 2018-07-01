public class MyTest {
  MyTest() {
    System.out.println("°õ¦æ MyTest() «Øºc¤l !");
  }
  MyTest(String x) {
    System.out.println(x);
  }
   MyTest(int x, int y) {
    System.out.println(x++);
    System.out.println(++y);
  }

  public static void main(String[] args) {
    MyTest t = new MyTest();
    new MyTest();
    new MyTest();
    new MyTest("100");
    new MyTest(200,300);
  }
}
