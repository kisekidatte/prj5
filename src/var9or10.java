import java.io.*;
import java.util.Scanner;

public class var9or10 {

    public static void main(String[] args) throws IOException {
        DataOutputStream dout = null;

        try {
            File file = new File("1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner sc = new Scanner(file);
            sc.useDelimiter(" ");
            File res = new File("2.txt");
            res.createNewFile();
            dout = new DataOutputStream(new FileOutputStream(res));
            while (sc.hasNext()){
                dout.writeUTF(sc.next());
                dout.writeUTF("\n");
            }
            sc.close();



        }

        catch (EOFException e) {

        }
        catch (IOException ioe) {
            System.out.println("Ошибка создания файла. " + ioe);
        }

        finally {
            dout.flush();
            dout.close();
        }
    }
}