import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class RWByCharStream {

	public static void main(String[] args) {
		try {
//			File file = new File("test.txt");
			FileInputStream fileInputStream = new FileInputStream("test.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("copy.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
			char input[] = new char[100];
			int length = 0;
			while ((length = inputStreamReader.read(input)) != -1) {
//				System.out.println(new String(input, 0, length)); 
				outputStreamWriter.write(input, 0, length);
			}
			inputStreamReader.close();
			outputStreamWriter.close();
			fileInputStream.close();
			fileOutputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
