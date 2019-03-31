import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.text.AbstractDocument.BranchElement;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		if(file.exists()) {
			System.err.println("文件存在");
			try {
				FileInputStream fileInputStream = new FileInputStream(file);//字节流
				InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");// 字符流
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String line;
				while ((line = bufferedReader.readLine())!= null) {
					System.out.println(line);
				}
				bufferedReader.close();
				inputStreamReader.close();
				fileInputStream.close();
				
			}catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		try {
			File writefile = new File("write.txt");
			FileOutputStream fos = new FileOutputStream(writefile);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("hello");
			bw.write(" my");
			bw.write(" name");
			bw.write(" name is ");
			
			bw.close(); 
			osw.close();
			fos.close();
			System.out.println("done");
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
