//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Ingrese el nombre a guardar: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        try (FileWriter writer = new FileWriter("archivo.txt")) {
            writer.write(nombre);
            System.out.println("Nombre guardado en archivo.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar el nombre: " + e.getMessage());
        }


    }
}