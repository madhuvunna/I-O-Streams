package output;

import java.io.FileOutputStream;

public class FileOpStreamwriteString {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\helo.txt");
			String s ="welcome to interview";
			byte b[] = s.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("sucess");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
