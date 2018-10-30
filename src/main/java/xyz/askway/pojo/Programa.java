package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:programa 
 * @Description: TODO(类说明：栏目表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:21
 */ 
public class Programa implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer pId; 	//栏目id
	private String pName; 	//栏目名称
	private String pAlias; 	//栏目别名
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Programa(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param pId	栏目id
	 * @param pName	栏目名称
	 * @param pAlias	栏目别名
	 */ 
	public Programa(Integer pId,String pName,String pAlias){
		this.pId=pId;
		this.pName=pName;
		this.pAlias=pAlias;
	}
	/**
	 * @Title:setPId 
	 * @Description: TODO(设置PId	栏目id)
	 * @param pId
	 */ 
	public void setPId(Integer pId){
		this.pId=pId;
	}
	/**
	 * @Title:setPId 
	 * @Description: TODO(得到PId	栏目id)
	 * @return Integer
	 */ 
	public Integer getPId(){
		return pId;
	}
	/**
	 * @Title:setPName 
	 * @Description: TODO(设置PName	栏目名称)
	 * @param pName
	 */ 
	public void setPName(String pName){
		this.pName=pName;
	}
	/**
	 * @Title:setPName 
	 * @Description: TODO(得到PName	栏目名称)
	 * @return String
	 */ 
	public String getPName(){
		return pName;
	}
	/**
	 * @Title:setPAlias 
	 * @Description: TODO(设置PAlias	栏目别名)
	 * @param pAlias
	 */ 
	public void setPAlias(String pAlias){
		this.pAlias=pAlias;
	}
	/**
	 * @Title:setPAlias 
	 * @Description: TODO(得到PAlias	栏目别名)
	 * @return String
	 */ 
	public String getPAlias(){
		return pAlias;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Programa[pId=" + pId + ",pName=" + pName + ",pAlias=" + pAlias + "]";
	}
}

