package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:jurisdiction 
 * @Description: TODO(类说明：权限表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:20
 */ 
public class Jurisdiction implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer jId; 	//权限id
	private String jName; 	//权限名
	private String jContent; 	//权限内容
	private Integer jPpid; 	//权限父id
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Jurisdiction(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param jId	权限id
	 * @param jName	权限名
	 * @param jContent	权限内容
	 * @param jPpid	权限父id
	 */ 
	public Jurisdiction(Integer jId,String jName,String jContent,Integer jPpid){
		this.jId=jId;
		this.jName=jName;
		this.jContent=jContent;
		this.jPpid=jPpid;
	}
	/**
	 * @Title:setJId 
	 * @Description: TODO(设置JId	权限id)
	 * @param jId
	 */ 
	public void setJId(Integer jId){
		this.jId=jId;
	}
	/**
	 * @Title:setJId 
	 * @Description: TODO(得到JId	权限id)
	 * @return Integer
	 */ 
	public Integer getJId(){
		return jId;
	}
	/**
	 * @Title:setJName 
	 * @Description: TODO(设置JName	权限名)
	 * @param jName
	 */ 
	public void setJName(String jName){
		this.jName=jName;
	}
	/**
	 * @Title:setJName 
	 * @Description: TODO(得到JName	权限名)
	 * @return String
	 */ 
	public String getJName(){
		return jName;
	}
	/**
	 * @Title:setJContent 
	 * @Description: TODO(设置JContent	权限内容)
	 * @param jContent
	 */ 
	public void setJContent(String jContent){
		this.jContent=jContent;
	}
	/**
	 * @Title:setJContent 
	 * @Description: TODO(得到JContent	权限内容)
	 * @return String
	 */ 
	public String getJContent(){
		return jContent;
	}
	/**
	 * @Title:setJPpid 
	 * @Description: TODO(设置JPpid	权限父id)
	 * @param jPpid
	 */ 
	public void setJPpid(Integer jPpid){
		this.jPpid=jPpid;
	}
	/**
	 * @Title:setJPpid 
	 * @Description: TODO(得到JPpid	权限父id)
	 * @return Integer
	 */ 
	public Integer getJPpid(){
		return jPpid;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Jurisdiction[jId=" + jId + ",jName=" + jName + ",jContent=" + jContent + ","+
		"jPpid=" + jPpid + "]";
	}
}

