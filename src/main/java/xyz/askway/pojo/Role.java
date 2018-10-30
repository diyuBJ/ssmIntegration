package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:role 
 * @Description: TODO(类说明：角色表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:21
 */ 
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer rId; 	//角色id
	private String rName; 	//角色名
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Role(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param rId	角色id
	 * @param rName	角色名
	 */ 
	public Role(Integer rId,String rName){
		this.rId=rId;
		this.rName=rName;
	}
	/**
	 * @Title:setRId 
	 * @Description: TODO(设置RId	角色id)
	 * @param rId
	 */ 
	public void setRId(Integer rId){
		this.rId=rId;
	}
	/**
	 * @Title:setRId 
	 * @Description: TODO(得到RId	角色id)
	 * @return Integer
	 */ 
	public Integer getRId(){
		return rId;
	}
	/**
	 * @Title:setRName 
	 * @Description: TODO(设置RName	角色名)
	 * @param rName
	 */ 
	public void setRName(String rName){
		this.rName=rName;
	}
	/**
	 * @Title:setRName 
	 * @Description: TODO(得到RName	角色名)
	 * @return String
	 */ 
	public String getRName(){
		return rName;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Role[rId=" + rId + ",rName=" + rName + "]";
	}
}

