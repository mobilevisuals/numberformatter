package formatter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Formatter {

	public static void main(String[] args) {

		String textToRead = null;
		File file = new File("src/formatter/kunder.txt");
		ArrayList<String> list = new ArrayList<>();
		try (BufferedReader instream = new BufferedReader(new FileReader(file))) {
			while ((textToRead = instream.readLine()) != null) {
				if(textToRead.length()>0)
				{
				StringBuilder stringBuilder= new StringBuilder(textToRead);
				if(stringBuilder.charAt(0)=='0')
					stringBuilder.deleteCharAt(0);
				int position=stringBuilder.indexOf("-");
				if(position!=-1)
				stringBuilder.deleteCharAt(position);
				//!!if(stringBuilder.charAt(0)!='+')
				//!!stringBuilder.insert(0, "+46");
				//stringBuilder.trimToSize();//??
				list.add(stringBuilder.toString());//stringBuilder.toString();??
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Collections.sort(list);
		//remove these//!!
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("dr");
		list2.add("alban");
		Collections.sort(list2);
		Collections.sort(list);
		System.out.println("ddd");//remove!!


	}

}
