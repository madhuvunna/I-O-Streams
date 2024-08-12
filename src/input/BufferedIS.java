package input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIS {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\chandu.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i=bis.read())!=-1) {
				System.out.println((char)i);
			}
			bis.close();
			fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
