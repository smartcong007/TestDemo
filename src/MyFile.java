import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


public class MyFile {
private File file;
public MyFile(File file){
	this.file = file;
}
public synchronized void write(StringBuffer s){
	BufferedWriter br = null;
	FileWriter fr = null;
	try{
		fr = new FileWriter(file,true);
		br = new BufferedWriter(fr);
		if(s!=null)
			br.append(s);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		
		try {
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}
