package ru.mirea.task25.opt1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Создадим круг, квадрат и вызовем у них метод draw(), а затем создадим красную фигуру (круг) с\n" +
                " очень красным цветом с помощью дкоратора и вызовем у нее метод draw()");

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Квадрат: ");
        rectangle.draw();
        System.out.println("\n");
        System.out.println("Круг: ");
        circle.draw();
        System.out.println("\n");

        System.out.println("Создадим красную фигуру из круга с помощью декоратора: ");
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.setRed("очень красный");
        System.out.println("Красный круг:");
        redShapeDecorator.draw();
    }
}
