import java.io.File;

public class ReadFileProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFiles(new File("../FileDemo"),1);
	}
	/**
	 * 输出传入目录的所有文件及文件夹
	 * @param dir	传入目录名
	 * @param tab	输出格式递进
	 */
	public static void printFiles(File dir,int tab) {
		if(dir.isDirectory()) {
//			System.out.println(dir.getName()+"/");
			File file[] = dir.listFiles();
			for (int i = 0; i < file.length; i++) {
				for (int j = 0; j < tab; j++) {
					System.out.print("|--");
					
				}
				System.out.println(file[i].getName());
				if (file[i].isFile()) {
//					System.out.println(file[i].getName());
				}else {
//					System.out.println(file[i].getName()+"/");
//					System.out.print("|--");
					printFiles(file[i],tab+1);
				}
			}
		}
	}

}
