package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:label 
 * @Description: TODO(类说明：标签表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:20
 */ 
public class Label implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer lId; 	//标签id
	private String lName; 	//标签名称
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Label(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param lId	标签id
	 * @param lName	标签名称
	 */ 
	public Label(Integer lId,String lName){
		this.lId=lId;
		this.lName=lName;
	}
	/**
	 * @Title:setLId 
	 * @Description: TODO(设置LId	标签id)
	 * @param lId
	 */ 
	public void setLId(Integer lId){
		this.lId=lId;
	}
	/**
	 * @Title:setLId 
	 * @Description: TODO(得到LId	标签id)
	 * @return Integer
	 */ 
	public Integer getLId(){
		return lId;
	}
	/**
	 * @Title:setLName 
	 * @Description: TODO(设置LName	标签名称)
	 * @param lName
	 */ 
	public void setLName(String lName){
		this.lName=lName;
	}
	/**
	 * @Title:setLName 
	 * @Description: TODO(得到LName	标签名称)
	 * @return String
	 */ 
	public String getLName(){
		return lName;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Label[lId=" + lId + ",lName=" + lName + "]";
	}
}

