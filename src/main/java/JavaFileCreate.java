import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/kimtaehyeon_macbookm1/Desktop/test.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);

            writer.write("동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세");
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
