import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoadApp {
public static void main(String[] args) {
String path = "data/sample.txt";
【1】
}

public static void loadFile(String path) {
try {
FileInputStream file = new FileInputStream(path);
InputStreamReader reader = new InputStreamReader(file, "UTF-8");
【2】 buffer = new 【2】;
String line;
【3】 ((line = buffer.readLine()) != null) {
System.out.println(line);
}
buffer.close();
reader.close();
file.close();
} catch (IOException e) {
System.out.println("Load Error");
} finally {
System.out.println("End");
}
}