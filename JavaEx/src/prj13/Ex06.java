package prj13;
import java.io.*;

public class Ex06 {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\system.ini");
		File dest = new File("c:\\Temp\\system.tx");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
