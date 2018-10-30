package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:role_jurisdiction 
 * @Description: TODO(类说明：角色-权限表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:21
 */ 
public class RoleJurisdiction implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer rId; 	//外键-角色id
	private Integer jId; 	//外键-权限id
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public RoleJurisdiction(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param rId	外键-角色id
	 * @param jId	外键-权限id
	 */ 
	public RoleJurisdiction(Integer rId,Integer jId){
		this.rId=rId;
		this.jId=jId;
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
	 * @Title:setJId 
	 * @Description: TODO(设置JId	外键-权限id)
	 * @param jId
	 */ 
	public void setJId(Integer jId){
		this.jId=jId;
	}
	/**
	 * @Title:setJId 
	 * @Description: TODO(得到JId	外键-权限id)
	 * @return Integer
	 */ 
	public Integer getJId(){
		return jId;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "RoleJurisdiction[rId=" + rId + ",jId=" + jId + "]";
	}
}

