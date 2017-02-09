import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.ChangedCharSetException;

import net.sf.json.JSONArray;

import org.apache.commons.lang.ArrayUtils;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import redis.clients.jedis.Jedis;
import sun.font.LayoutPathImpl.EndType;

public class UniqueArray {
    public static void sort(int arr[]){
    	for(int k:arr){
    		System.out.print(k+" ");
    	}
    	long starTime=System.currentTimeMillis();
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]==arr[j]) arr=ArrayUtils.remove(arr, j);
    		}
    	}
    	 long endTime=System.currentTimeMillis();
    	 long time=endTime-starTime;
    	 System.out.println("去重耗时:"+starTime+" "+endTime+" "+time);
        for(int k:arr){
        	System.out.print(k+" ");
        }
    }
    public static void sort1(int arr[]){
    	for(int k:arr){
    		System.out.print(k+" ");
    	}
    	List<Integer> list=new ArrayList<Integer>();
    	long start=System.currentTimeMillis();
    	for(int i=0;i<arr.length;i++){
    		boolean flag=true;
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]==arr[j]){
    				flag=false;
    				break;
    			}
    		}
    		if(flag)
    			list.add(arr[i]);
    	}
    	long end=System.currentTimeMillis();
    	long time=end-start;
    	System.out.println("去重耗时:"+start+" "+end+" "+time);
    	Iterator<Integer> ir=list.iterator();
    	while(ir.hasNext()){
    		System.out.print(ir.next()+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //��������ȥ��
//    int a[]={1,2,1,6,2,5,2,3,1,2,6,8,6,2,4,6,8,4,5,5,5};
//    int b[]={1,2,1,6,2,5,2,3,1,2,6,8,6,2,4,6,8,4,5,5,1};
//    sort(a);
//    System.out.println();
//    sort1(b);
		
		//��������redis
		Jedis jedis = new Jedis("127.0.0.1",6379);
		jedis.auth("162534");
	      System.out.println("Connection to server sucessfully");
	      //check whether server is running or not
	      System.out.println("Server is running: "+jedis.ping());
	      System.out.println(jedis.get("005"));
//	      jedis.set("client", "javaclient");
//	      System.out.println(jedis.get("client"));
//	      jedis.del("client");
//	      System.out.println(jedis.exists("client"));
//	      Map<String, String> map = new HashMap<String, String>();
//	      map.put("name", "xinxin");
//	      map.put("age", "22");
//	      map.put("qq", "123456");
//	      jedis.hmset("userm",map);
//	      jedis.del("userm");
		//����map����
//		Map<String, String> map=new TreeMap<String, String>();
//		map.put("dasd", "fdsfs");
//		map.put("asds", "cdcsd");
//		map.put("dbsd", "dsfsdf");
//		for(String key:map.keySet()){
//			System.out.println(key+"-"+map.get(key));
//		}
//		
		//���Է����Ӧ��
//		User user=new User();
//		user.setHobby("fssf");
//		user.setUserid("dsfdsf");
//		user.setUsername("xsd");
//		user.setWork("zzz");
//		System.out.println(new utils().toString(user));
		
		//���Ա���С��λ�ķ���
//		double x=23.5445*22;
//	    
//		float a=(float) (1.3246*2.45);
//		
//	    NumberFormat ddf1=NumberFormat.getNumberInstance();
//	    
//	    ddf1.setMaximumFractionDigits(2);
//	    
//	    String s=ddf1.format(x);
//	    
//	   System.out.println(s);
//	   
//	   
//	   System.out.println(ddf1.format(a));
//	   
//	   System.out.println("--------------");
//	   
//	   DecimalFormat df=new DecimalFormat("#.00");
//	   
//	   df.setRoundingMode(RoundingMode.FLOOR);
//	   
//	   float ss=Float.parseFloat(df.format(x));
//	   
//	   System.out.println(ss);
//	   
//	   System.out.println("-----------");
//	   
//	   String c="s";
//	   
//	   System.out.println(c.getBytes().length);
//	   
//	   System.out.println((int)a);
	   
	   //����ö��
//	   Result rs=Enum.valueOf(Result.class, "NULLDATE");
//	   System.out.println(Result.NULLDATE.getMsg());
		
//     Ticket ticket=new Ticket(20);
//     MyThread t1=new MyThread(ticket);
//	 MyThread t2=new MyThread(ticket);
//	 Thread th1=new Thread(t1, "�߳�һ");
//	 Thread th2=new Thread(t2,"�̶߳�");
//	 th1.start();
//	 th2.start();
//	 new Thread(new Runnable() {
//		private int n=10;
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			while(n-->0)
//				try {
//					System.out.println(n);
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//	}).start();	
//		List<String> list=new ArrayList<String>();
//		list.add("xxx");
//		list.add("xx");
//		list.add("x");
//		System.out.println(JSONArray.fromObject(list).toString());
//		String string = "sda\ndsd\n";
//		PrintWriter printWriter = null;
//		try{
//			printWriter = new PrintWriter("src/tt.txt");
//			printWriter.print(string);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}
 
}
