package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:user_role 
 * @Description: TODO(类说明：用户-角色表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:21
 */ 
public class UserRole implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer rId; 	//外键-角色id
	private String uId; 	//外键-管理员id
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public UserRole(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param rId	外键-角色id
	 * @param uId	外键-管理员id
	 */ 
	public UserRole(Integer rId,String uId){
		this.rId=rId;
		this.uId=uId;
	}
	/**
	 * @Title:setRId 
	 * @Description: TODO(设置RId	外键-角色id)
	 * @param rId
	 */ 
	public void setRId(Integer rId){
		this.rId=rId;
	}
	/**
	 * @Title:setRId 
	 * @Description: TODO(得到RId	外键-角色id)
	 * @return Integer
	 */ 
	public Integer getRId(){
		return rId;
	}
	/**
	 * @Title:setUId 
	 * @Description: TODO(设置UId	外键-管理员id)
	 * @param uId
	 */ 
	public void setUId(String uId){
		this.uId=uId;
	}
	/**
	 * @Title:setUId 
	 * @Description: TODO(得到UId	外键-管理员id)
	 * @return String
	 */ 
	public String getUId(){
		return uId;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "UserRole[rId=" + rId + ",uId=" + uId + "]";
	}
}

