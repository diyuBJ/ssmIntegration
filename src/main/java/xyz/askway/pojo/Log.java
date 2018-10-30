package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:log 
 * @Description: TODO(类说明：日志表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:21
 */ 
public class Log implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer logId; 	//日志id
	private String uId; 	//管理员id 外键
	private String logIp; 	//ip
	private String logTime; 	//登录时间
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Log(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param logId	日志id
	 * @param uId	管理员id 外键
	 * @param logIp	ip
	 * @param logTime	登录时间
	 */ 
	public Log(Integer logId,String uId,String logIp,String logTime){
		this.logId=logId;
		this.uId=uId;
		this.logIp=logIp;
		this.logTime=logTime;
	}
	/**
	 * @Title:setLogId 
	 * @Description: TODO(设置LogId	日志id)
	 * @param logId
	 */ 
	public void setLogId(Integer logId){
		this.logId=logId;
	}
	/**
	 * @Title:setLogId 
	 * @Description: TODO(得到LogId	日志id)
	 * @return Integer
	 */ 
	public Integer getLogId(){
		return logId;
	}
	/**
	 * @Title:setUId 
	 * @Description: TODO(设置UId	管理员id 外键)
	 * @param uId
	 */ 
	public void setUId(String uId){
		this.uId=uId;
	}
	/**
	 * @Title:setUId 
	 * @Description: TODO(得到UId	管理员id 外键)
	 * @return String
	 */ 
	public String getUId(){
		return uId;
	}
	/**
	 * @Title:setLogIp 
	 * @Description: TODO(设置LogIp	ip)
	 * @param logIp
	 */ 
	public void setLogIp(String logIp){
		this.logIp=logIp;
	}
	/**
	 * @Title:setLogIp 
	 * @Description: TODO(得到LogIp	ip)
	 * @return String
	 */ 
	public String getLogIp(){
		return logIp;
	}
	/**
	 * @Title:setLogTime 
	 * @Description: TODO(设置LogTime	登录时间)
	 * @param logTime
	 */ 
	public void setLogTime(String logTime){
		this.logTime=logTime;
	}
	/**
	 * @Title:setLogTime 
	 * @Description: TODO(得到LogTime	登录时间)
	 * @return String
	 */ 
	public String getLogTime(){
		return logTime;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Log[logId=" + logId + ",uId=" + uId + ",logIp=" + logIp + ","+
		"logTime=" + logTime + "]";
	}
}

