import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConfigText {
    public static void main(String[] args) throws IOException {

        String filepath = args[0];
        Object obj;
        // String filepath="E:\\sucide\\config.txt" ;
        ArrayList<String> linesread=new ArrayList<>();

        try {
            FileReader fr = new FileReader(filepath);

            BufferedReader bf = new BufferedReader(fr);
            String currentLine = bf.readLine();
            System.out.println(currentLine);
            linesread.add(currentLine);
            currentLine=bf.readLine();

            // System.out.println(Arrays.asList(currentLine.split("=")));
            // System.out.println(currentLine);
            for (String s : linesread) {

                String[] tokens = s.split("=");
                System.out.println(tokens[1]);

            }
            bf.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


