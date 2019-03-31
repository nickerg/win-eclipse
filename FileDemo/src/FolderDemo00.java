import java.io.File;

public class FolderDemo00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("folder");
		if (folder.exists()) {
			System.out.println("文件夹存在");
		}else {
			System.out.println("文件夹不存在");
			folder.mkdirs();// mkdir -p
//			folder.mkdir(); //mkdir
			System.out.println("文件夹已创建");
		}
		if(folder.delete()) {
			System.out.println("文件夹删除成功");
		} else {
			System.out.println("文件夹删除失败");
		}
	}

}
