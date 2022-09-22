package methods;

public class Main {

  public static void main(String[] args) {
    findNumber();
  }

  public static void findNumber() {
    int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
    int toFound = 2;
    boolean isExists = false;

    for (int number : numbers) {
      if (number == toFound) {
        isExists = true;
        break;
      }
    }

    String message = isExists ? "Sayı mevcuttur: " : "Sayı mevcut değildir: ";
    message += toFound;
    showMessage(message);
  }

  public static void showMessage(String message) {
    System.out.println(message);
  }
}
