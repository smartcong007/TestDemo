import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
	    List<Integer> list = new ArrayList<Integer>();
	    int i=0;
	    while((i=i+3)<50)
	    	list.add(i);
	    System.out.println("list:"+list.toString());
	    List<List<Integer>> result = getList(list, 2);
	    System.out.println("Result:"+result.toString());
	}
    public static List<List<Integer>> getList(List<Integer> list,int n){
    	List<List<Integer>> reList = new ArrayList<List<Integer>>();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0;i<list.size();i++) {
			map.put(list.get(i), i);
		}
    	if(n==1){
    		for (Integer ii : map.keySet()) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(ii);
				reList.add(temp);
			}
    		return reList;
    	}
    	List<List<Integer>> lastList = getList(list, n-1);
    	for (List<Integer> list2 : lastList) {
			List<Integer> temp = new ArrayList<Integer>();
			for (Integer integer : list2) {
				temp.add(map.get(integer));
			}
			Integer max = getMax(temp);
			for (Integer integer : map.keySet()) {
				if(map.get(integer)>max){
			    list2.add(integer);
				System.out.println("list2:"+list2.toString());
				List<Integer> temp2 = new ArrayList<Integer>();
				temp2.addAll(list2);
				reList.add(temp2);
				list2.remove(list2.size()-1);
				}
			}
		}
    	return reList;
    }
    
    public static Integer getMax(List<Integer> list){
    	Integer max = list.get(0);
    	for(int i=1;i<list.size();i++){
    		if(list.get(i)>max)
    			max=list.get(i);
    	}
    	return max;
    }
   
}
