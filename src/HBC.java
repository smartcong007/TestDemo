import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class HBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file = new File("src/tt.txt");
		 MyFile mFile = new MyFile(file);
		 List<Thread> list = new ArrayList<Thread>();
		 long time1 = System.currentTimeMillis();
		 for(int i=1;i<101;i++){
			 list.add(new Thread(new WriteThread(mFile,null),"线程"+i));
			 list.get(i-1).start();
		 }
		 while(true){
			 if(Thread.currentThread().getName().equals("main")){
				 System.out.println(System.currentTimeMillis()-time1);
				 break;
			 }
		 }
	}

}
