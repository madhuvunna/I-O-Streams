package output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOS {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:\\Hii.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s ="welcome to My home";
		byte b[]= s.getBytes();
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("sucess");
	}

}
