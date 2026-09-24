import java.io.File;

public class ListFilesDemo {

    public static void listFiles(File dir) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {

                if (file.isDirectory()) {
                    System.out.println("[DIR] " + file.getAbsolutePath());
                    listFiles(file);

                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {

        File dir = new File("C:/SampleFolder");

        if (dir.exists() && dir.isDirectory()) {
            listFiles(dir);
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}