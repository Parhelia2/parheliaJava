import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.*;


class FileTest {




    public static void main(String args[]) throws Exception{

        FileInputStream fileInputStream = new FileInputStream("someFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("Test.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        int a;
        byte [] data = new byte[1024];

        while ((a = fileInputStream.read(data))!= 0){
            fileOutputStream.write(data);
        }



    }
}