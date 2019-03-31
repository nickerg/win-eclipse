import java.io.File;
import java.io.IOException;

public class FileDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("hello.txt");
		if(file.exists()) {
			if(file.isFile())
				System.out.println("文件");
			if(file.isDirectory())
				System.out.println("目录");
		}else {
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("已创建文件");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("文件未创建");
				e.printStackTrace();
			}
		}
//		if(file.exists()) {
//			if(file.delete())
//				System.out.println("已删除文件");
//		}
	}

}
