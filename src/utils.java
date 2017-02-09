import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class utils {
public String toString(Object obj){
	Class<?> cl = obj.getClass();
	String r=cl.getName();
//	do{
//		r+="[";
//		Field[] fields=cl.getDeclaredFields();
//		AccessibleObject.setAccessible(fields, true);
//		for(Field f:fields){
//			if(!Modifier.isStatic(f.getModifiers())){
//				if(!r.endsWith("[")) r+=",";
//				r+=f.getName()+"=";
//				try{
//					System.out.println("域类型:"+f.getType().toString());
//					Object val=null;
//					if(f.getType().toString().equals("int")){
//					val=f.getInt(obj);
//					}else{
//						val=f.get(obj);
//					}
//					System.out.println("VAL:"+val);
//					r+=toString(val);
//				}catch(Exception e){
//					e.printStackTrace();
//				}
//			}
//		}
//		r+="]";
//		cl=cl.getSuperclass();
//	}while(cl!=null);
//	return r;
	r+="[";
	try{
	Field[] fields=cl.getDeclaredFields();
	for(Field f:fields){
		if(!f.getType().toString().equals("int")){
			if(r.charAt(r.length()-1)=='[')
			r+=f.getName()+":"+f.get(obj).toString();
			else
				r+=","+f.getName()+":"+f.get(obj).toString();
		}
	}
	r+="]";
	}catch(Exception e){
		e.printStackTrace();
	}
	return r;
}
}
