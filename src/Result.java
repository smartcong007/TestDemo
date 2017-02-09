
public enum Result {
SYSERROR(-1,"系统错误"),NULLDATE(0,"查询数据为空"),SUCCESS(1,"操作成功");
private int state;
private String msg;
private Result(int state,String msg){
	this.state=state;
	this.msg=msg;
}
public String getMsg(){
	return msg;
}
}
