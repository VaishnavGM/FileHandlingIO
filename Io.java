package Vaish;
import java.io.File;
import java.io.IOException;
public class Io {

	public static void main(String[] args) {
File file = new File("F:\\vaissss\\the\\king");
file.mkdirs();	
boolean foldercreated = file.exists();
if(foldercreated == true)
{
	System.out.println("folder created successfully");
}
File files = new File("F:\\vaissss\\the\\king\\vaishnav.txt");
try {
	files.createNewFile();
	System.out.println("file created successfully");

} catch (IOException e) {
	e.printStackTrace();

}
File filess = new File("F:\\vaissss\\the\\king\\bella.txt");
files.renameTo(filess);
System.out.println(filess.getName());
System.out.println(filess.canExecute());
System.out.println(filess.canRead());
System.out.println(filess.canWrite());
File filed = new File("F:\\");
/*String a[] = filed.list();
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}*/
 File[] s = filed.listFiles();
  
 /* for(int i=0;i<s.length;i++)
	  {
	 if(s[i].isFile()) {
	 System.out.println(s[i]);
 }*/
 /*{
	 if(s[i].isDirectory()) {
		 System.out.println(s[i]);
	 }
	 */
 {
	for(File x :s) {
		if(x.length()>5000)
		{
			System.out.println(x);
		}
		if(x.isFile()) {
		String filename = x.getName();
		int last = filename.lastIndexOf(".");
		String ans = filename.substring(last+1);
		if(ans.equals("txt")) {
		System.out.println(filename);

	}}
	}
}

}}
