package input;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayis {

	public static void main(String[] args) throws IOException {
		byte[] buf = {35,36,37,38};

		ByteArrayInputStream bis = new ByteArrayInputStream(buf);
		int k = 0;
		while ((k = bis.read()) != -1) {
			char ch = (char) k;
			System.out.println("ASCII value of charactres is:" + k + ";special characters is:" + ch);

		}
	}

}
