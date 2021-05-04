import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main{
    public static String open(String TAG0)
    {
        return ("<" +TAG0+ ">");
    }

    public  static String close(String TAG1)
    {
        return ("</"+TAG1+">");
    }

    public static void main(String[] args) throws IOException {

        Html html = new Html();
        File file = new File("D:\\index1.html");
        file.createNewFile();
        String HTML = html.open("html")+html.open("head")+html.getTitle("Html Generator")+html.close("head")+html.open("body")+html.getLabel("Feedback!")+html.getTextArea()+html.getSubmitButton()+html.close("body")+ html.close("html");
        Path path= Paths.get("index1.html");
        Files.writeString(path, HTML);
    }
}
