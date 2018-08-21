class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 5);
    Triangle triangle = new Triangle(20, 4);

    expectEquals(getArea(rectangle), 50);
    expectEquals(getArea(triangle), 40);
  }

  private static int getArea(Object object) {
    if (object instanceof Shape) {
      return ((Shape) object).getArea();
    } else {
      return -1;
    }
  }

  private static void expectEquals(int val1, int val2) {
    System.out.println(val1 == val2);
  }
}

interface Shape {
  // Also fine if they decide to use a class or abstract class
  int getArea();
}

class Rectangle implements Shape {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public int getArea() {
    return length * width;
  }
}

class Triangle implements Shape {
  private int width;
  private int height;

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public int getArea() {
    return width * height / 2;
  }
}
