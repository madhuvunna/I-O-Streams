package output;

import java.io.FileOutputStream;

public class FileOpStreamwritebyte {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Hii.txt");
			fos.write(65);
			fos.close();
			System.out.println("sucess");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
