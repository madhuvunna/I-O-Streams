package writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
			try {
				Writer wr = new FileWriter("D:\\output.txt");
				String content = "I love my country";
				wr.write(content);
				wr.close();
				System.out.println("sucess");
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
