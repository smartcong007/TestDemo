import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File file = new File("src/tt.txt");
    MyFile mFile = new MyFile(file);
    List<Thread> list = new ArrayList<Thread>();
    for(int i=1;i<101;i++){
    	if(i==1)
    	   list.add(new Thread(new WriteThread(mFile, null),i+"线程"));
    	else
    		list.add(new Thread(new WriteThread(mFile, list.get(i-2)),i+"线程"));
    }
    long time1 = System.currentTimeMillis();
    for(Thread t:list){
    	t.start();
    }
    while(true){
    	if(!list.get(list.size()-1).isAlive()){
    	System.out.println(System.currentTimeMillis()-time1);
    	break;
    	}
    }
    
    
	}

}
