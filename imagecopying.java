package Vaish;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class imagecopying {

	public static void main(String[] args) {
try {
	InputStream input = new FileInputStream("F:\\vaissss\\the\\king\\saami.jpg");
	OutputStream outputs = new FileOutputStream("F:\\vaissss\\the\\god.jpg");
try {
	int inputs = 	input.read();
	while(inputs!=-1)
	{
	outputs.write(inputs);
	inputs = input.read();
	}
} catch (IOException e) {
	e.printStackTrace();
}

} catch (FileNotFoundException e) {
	e.printStackTrace();
	
}
	}

}