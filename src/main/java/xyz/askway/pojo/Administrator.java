package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:administrator 
 * @Description: TODO(类说明：管理员表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:20
 */ 
public class Administrator implements Serializable{
	private static final long serialVersionUID = 1L;
	private String uId; 	//管理员id
	private String uName; 	//姓名
	private String uUserName; 	//账户名
	private String uPassword; 	//密码
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Administrator(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param uId	管理员id
	 * @param uName	姓名
	 * @param uUserName	账户名
	 * @param uPassword	密码
	 */ 
	public Administrator(String uId,String uName,String uUserName,String uPassword){
		this.uId=uId;
		this.uName=uName;
		this.uUserName=uUserName;
		this.uPassword=uPassword;
	}
	/**
	 * @Title:setUId 
	 * @Description: TODO(设置UId	管理员id)
	 * @param uId
	 */ 
	public void setUId(String uId){
		this.uId=uId;
	}
	/**
	 * @Title:setUId 
	 * @Description: TODO(得到UId	管理员id)
	 * @return String
	 */ 
	public String getUId(){
		return uId;
	}
	/**
	 * @Title:setUName 
	 * @Description: TODO(设置UName	姓名)
	 * @param uName
	 */ 
	public void setUName(String uName){
		this.uName=uName;
	}
	/**
	 * @Title:setUName 
	 * @Description: TODO(得到UName	姓名)
	 * @return String
	 */ 
	public String getUName(){
		return uName;
	}
	/**
	 * @Title:setUserName
	 * @Description: TODO(设置UUserName	账户名)
	 * @param uUserName
	 */
	public void setUUserName(String uUserName){
		this.uUserName=uUserName;
	}
	/**
	 * @Title:setUserName
	 * @Description: TODO(得到UUserName	账户名)
	 * @return String
	 */ 
	public String getUUserName(){
		return uUserName;
	}
	/**
	 * @Title:setUPassword 
	 * @Description: TODO(设置UPassword	密码)
	 * @param uPassword
	 */ 
	public void setUPassword(String uPassword){
		this.uPassword=uPassword;
	}
	/**
	 * @Title:setUPassword 
	 * @Description: TODO(得到UPassword	密码)
	 * @return String
	 */ 
	public String getUPassword(){
		return uPassword;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Administrator[uId=" + uId + ",uName=" + uName + ",uUserName=" + uUserName + ","+
		"uPassword=" + uPassword + "]";
	}
}

