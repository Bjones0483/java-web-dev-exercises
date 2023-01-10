package exercises;
import java.nio.file.*;
public class ReadArray {
    public static String readArray(String text) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(text)));
        return data;
    }

    public static void main(String[] args) throws Exception {
        String data = readArray("C:\\Users\\bdj32\\OneDrive\\Documents\\dev\\text1.txt");
        System.out.println(data);
        char[] strArr;
        while (data.length() != 0) {
            strArr = data.toCharArray();
            char ch = strArr[0];
            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (ch == strArr[i]) {
                    count++;
                }
            }
            if (ch != ',') {
                if (ch != '.')
                    if (ch != '\t') {
                            System.out.println(ch + " - " + count);
                            data = data.replace("" + ch, "");
                        }
            }
        }
    }
}
