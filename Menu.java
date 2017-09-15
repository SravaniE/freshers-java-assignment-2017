import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Menu {

		public void CustomerOrder()
		{
			
			try {
				File file = new File("E:\\13b81a05j7\\Rubion\\src\\menu1.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					stringBuffer.append(line);
					stringBuffer.append("\n");
				}
				fileReader.close();
				System.out.println("Menu Card:");
				
				System.out.println(stringBuffer.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
		}
}
