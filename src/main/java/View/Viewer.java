package View;

import java.util.Scanner;

public class Viewer implements ViewerInterface {
    @Override
    public String request(){
        System.out.println("Введите ингридиенты: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
