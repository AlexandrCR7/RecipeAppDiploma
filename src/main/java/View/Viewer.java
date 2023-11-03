package View;

import java.util.Scanner;

public class Viewer {

    public String request(){
        System.out.println("Введите ингридиенты: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
