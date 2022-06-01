import java.io.Console;
import java.io.IOException;
import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args) throws IOException {
        var scanner = new java.util.Scanner(System.in);

        String home = System.getProperty("user.home");
        var path = java.nio.file.Paths.get(home);
        var InputFilename = path.resolve(home + "\\Desktop\\input.txt");
        var OutputFilename = path.resolve(home + "\\Desktop\\output.txt");
        var writer = java.nio.file.Files.newBufferedWriter(OutputFilename);

        String tmp = "";


        boolean answer = false;
        while (!answer){
            tmp = "";
            for (String text : java.nio.file.Files.readAllLines(InputFilename)) {
                tmp += text;
            }
            System.out.println(tmp);
            System.out.println("is it correct?");
            System.out.println("yes - true / no - false ");
            answer = scanner.nextBoolean();
            if (answer) {
                writer.write(tmp);
            }
        }
        writer.close();
    }
}