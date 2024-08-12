package output;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayos {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos1 = new FileOutputStream("D:\\madhu.txt");
		FileOutputStream fos2 = new FileOutputStream("D:\\sushmitha.txt");
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(66);
		bos.writeTo(fos1);
		bos.writeTo(fos2);
		
		bos.flush();
		bos.close();
		
		System.out.println("sucess...");
	}

}
