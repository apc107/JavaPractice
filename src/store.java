
interface Product {
     static final String MAKER = "My Corp";
     static final String PHONE = "555-123-4567";
     public int getPrice(int id);
     public void showName();
}
class Book implements Product {
     public int getPrice(int id) {
          if (id == 1)
              return(20);
          else
              return(30);
     }
     public void showName() {
           System.out.println("I'm a book!");
     }
}
class Shoe implements Product {
     public int getPrice(int id) {
          if (id == 1)
              return(5);
          else
              return(10);
     }
     public void showName() {
           System.out.println("I'm a shoe!");
     }
}
class store {
     static Shoe hightop;
     static Book using_java;

     public static void init() {
          hightop = new Shoe();
          using_java = new Book();
     }

     public static void main(String argv[]) {
          init();
          orderInfo(hightop);
          orderInfo(using_java);
     }

     public static void orderInfo(Product item) {
          item.showName();
          System.out.println("To order from " + item.MAKER + " call " +
          item.PHONE + ".");
          System.out.println("Each item costs $" + item.getPrice(1));
     }
}