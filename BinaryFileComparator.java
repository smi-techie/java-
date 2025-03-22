import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileComparator {

    public static void main(String[] args) {
        String file1 = "file1.bin"; // Replace with your first binary file name
        String file2 = "file2.bin"; // Replace with your second binary file name

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 0;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                position++;
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    return; // Exit after finding the first difference
                }
            }
            //Check for different file lengths.
            if(fis1.read() == -1 && fis2.read() == -1){
                System.out.println("Two files are equal");
            }
            else{
                System.out.println("Two files are not equal: Files have different lengths");
            }

        } catch (IOException e) {
            System.err.println("Error comparing files: " + e.getMessage());
        }
    }
}