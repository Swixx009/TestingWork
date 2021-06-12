public class DevKit {

  public static void main(String[] args) {
    // Prints "Hello, World" to the terminal window.


    cmSayHello();
    int intRepeatWorldCount = 2;
    cmSayWorld(intRepeatWorldCount);

  }

  public static  void cmSayHello() {
    System.out.print("Hello");
  }
  public static  void cmSayWorld(int num1) {

    for (int counter = 1; counter <= num1; counter = counter + 1 ) {
      System.out.println(", World");
    }


  }
}
