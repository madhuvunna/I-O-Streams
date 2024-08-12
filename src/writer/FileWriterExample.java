package writer;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\madhu.txt");
			fw.write("welcome to java");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
