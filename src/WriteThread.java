import java.util.Random;


public class WriteThread implements Runnable{
    private MyFile mfFile;
    private Thread thread;
    public WriteThread(MyFile mfFile,Thread thread){
    	this.mfFile = mfFile;
    	this.thread = thread;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			if(thread!=null)
			thread.join();
			int r = (int) (Math.random()*26+97);
			char a = (char) r;
			StringBuffer sBuffer = new StringBuffer();
			sBuffer.append(Thread.currentThread().getName()+":");
			for(int i=1;i<=6;i++){
				sBuffer.append(a);
			}
			sBuffer.append('\n');
			mfFile.write(sBuffer);
			System.out.println(Thread.currentThread().getName()+"追加了"+sBuffer.toString());
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}

}
