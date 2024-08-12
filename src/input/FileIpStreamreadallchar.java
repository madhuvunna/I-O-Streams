package input;

import java.io.FileInputStream;

public class FileIpStreamreadallchar {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\chandu.txt");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
