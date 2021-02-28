package kg.megacom;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Cars> carsStack = new Stack<>();
        Cars odyssey  = new Cars("odyssey"); // Создал 5 машин
        Cars ladaSamara = new Cars("ladaSamara"); // Создал 5 машин
        Cars niva = new Cars("niva"); // Создал 5 машин
        Cars camry3_5  = new Cars("camry3_5"); // Создал 5 машин
        Cars landCruiser  = new Cars("landCruiser"); // Создал 5 машин
        carsStack.push(odyssey); // добавил машины в Stack
        carsStack.push(ladaSamara); // добавил машины в Stack
        carsStack.push(niva); // добавил машины в Stack
        carsStack.push(camry3_5); // добавил машины в Stack
        carsStack.push(landCruiser); // добавил машины в Stack
        System.out.println(carsStack.toString());
        carsStack.pop(); // удалил верхний элемент
        System.out.println(carsStack.peek().toString()); // нашел верхний элемент после удаления
        System.out.println(carsStack.search(odyssey)); // нашел позицию первого добавленного элемента

    }
}

class Cars {
    String name;

    public Cars(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                '}';
    }
}