class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 5);
    Triangle triangle = new Triangle(20, 4);

    expectEquals(getArea(rectangle), 50);
    expectEquals(getArea(triangle), 40);
  }

  private static int getArea(Object object) {
    if (object instanceof Rectangle) {
      return getRectangleArea((Rectangle) object);
    } else if (object instanceof Triangle) {
      return getTriangleArea((Triangle) object);
    } else {
      return -1;
    }
  }

  private static int getRectangleArea(Rectangle rectangle) {
    return rectangle.length * rectangle.width;
  }

  private static int getTriangleArea(Triangle triangle) {
    return triangle.width * triangle.height / 2;
  }

  private static void expectEquals(int val1, int val2) {
    System.out.println(val1 == val2);
  }
}

class Rectangle {
  public int length;
  public int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }
}

class Triangle {
  public int width;
  public int height;

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
}
