package input;

import java.io.FileInputStream;

public class FileIpStreamreadsinglechar {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Chandu.txt");
			int i = fis.read();
			System.out.println((char) i);

			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
