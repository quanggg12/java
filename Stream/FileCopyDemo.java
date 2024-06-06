package Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        // BufferedInputStream in = null;
        // BufferedOutputStream out = null;
        try {
            in = new FileInputStream("D:\\files\\code\\java\\Stream\\file1.txt");
            out = new FileOutputStream("D:\\files\\code\\java\\Stream\\file2.txt");
            // in = new BufferedInputStream(FileInputStream("D:\\files\\code\\java\\Stream\\file1.txt"));
            // out = new BufferedOutputStream(FileOutputStream("D:\\files\\code\\java\\Stream\\file2.txt"));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
        System.out.println("Done");
    }
}
