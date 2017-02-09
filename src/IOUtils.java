import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.text.DefaultEditorKit.CopyAction;


public class IOUtils {
public static String searchForStringFromFile(String filepath,String keyword){
	FileReader fReader = null;
	BufferedReader bReader = null;
	StringBuffer sbBuffer = new StringBuffer();
	try{
	fReader = new FileReader(filepath);
	bReader = new BufferedReader(fReader);
	String s;
	while((s=bReader.readLine())!=null){
		if(s.toUpperCase().contains(keyword.toUpperCase()))
		sbBuffer.append(s+"\n");
	}
	}catch(FileNotFoundException e1){
		e1.printStackTrace();
	}catch (IOException e2) {
		// TODO: handle exception
		e2.printStackTrace();
	}finally{
		try{
		bReader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	return sbBuffer.length()==0?"KeyWord Not Found!":sbBuffer.toString();
}

public static void ReadFormatedData(String filepath){
	DataInputStream diDataInputStream = null;
	DataOutputStream dataOutputStream = null;
	try{
		dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filepath)));
		dataOutputStream.writeDouble(2.88);
		dataOutputStream.writeDouble(4.55);
		dataOutputStream.writeUTF("The end of the file");
		dataOutputStream.close();
		diDataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(filepath)));
		System.out.println(diDataInputStream.readDouble());
		System.out.println(diDataInputStream.readDouble());
		System.out.println(diDataInputStream.readUTF());
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try {
			diDataInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public static void copy(String FromFile,String ToFile){
	BufferedReader bReader = null;
	PrintWriter pWriter = null;
	try{
		StringBuffer sBuffer = new StringBuffer();
		bReader = new BufferedReader(new FileReader(FromFile));
		String s;
		while((s=bReader.readLine())!=null){
			sBuffer.append(s+"\n");
		}
		System.out.println("**:"+sBuffer.toString());
		pWriter = new PrintWriter(ToFile);
		pWriter.print(sBuffer.toString());
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
		bReader.close();
		pWriter.close();
		}catch(IOException ee){
			ee.printStackTrace();
		}
	}
}
public static void main(String[] args){
	copy("src/HBC.java", "src/TestIO.java");
}
}
