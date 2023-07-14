package Vaish;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Filereaderwritter {

	public static void main(String[] args) {
File file = new File("F:\\vaissss\\the\\king\\kumaravel.txt");
try {
	file.createNewFile();
	FileWriter writter = new FileWriter(file);	
	writter.write("vaishnav");
writter.flush();
writter.close();


FileReader read = new FileReader(file);
/*int reads = read.read();
while(reads!=-1)
{
System.out.print((char)reads);
reads = read.read();}*/
char[] a = new char[(int)file.length()];
System.out.println(a.length);
read.read(a);
for(char b:a)
{
	System.out.print(b);
}
} catch (IOException e) {
	e.printStackTrace();
}




	}

}
