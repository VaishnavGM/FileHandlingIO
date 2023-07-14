package Vaish;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
public class Bufferreader {

	public static void main(String[] args) {
File file = new File("F:\\vaissss\\the\\king\\Mani.txt");
	try {
		FileWriter write = new FileWriter(file);
		BufferedWriter writes = new BufferedWriter(write);
		writes.write("vaishnav");
		writes.newLine();
		writes.write("raja");
		writes.flush();
		writes.close();
		FileReader read = new FileReader(file);
		BufferedReader reading = new BufferedReader(read);
		String l = reading.readLine();
		int linecount = 0;
		int sentencecount = 0;
		int wordcount = 0;
		while(l!=null)
		{
			linecount++;
			String [] sentence = l.split("[.]");
			sentencecount = sentence.length+sentencecount;
			String [] word = l.split("");
			wordcount = word.length+wordcount;
			System.out.println(l);
			l = reading.readLine();
		}
		System.out.println(linecount);
		System.out.println(sentencecount);
		System.out.println(wordcount);

	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	}

}
