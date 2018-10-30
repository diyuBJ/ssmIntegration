package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:link 
 * @Description: TODO(类说明：友情链接表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:21
 */ 
public class Link implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer lId; 	//链接id
	private String lName; 	//链接名称
	private String lUrl; 	//url地址
	private String lImg;	//图片log地址
	private String lDescribe;	//描述
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Link(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param lId	链接id
	 * @param lName	链接名称
	 * @param lUrl	url地址
	 */ 
	public Link(Integer lId,String lName,String lUrl,String lImg,String lDescribe){
		this.lId=lId;
		this.lName=lName;
		this.lUrl=lUrl;
		this.lDescribe=lDescribe;
		this.lImg=lImg;
	}
	/**
	 * @Title:setLId 
	 * @Description: TODO(设置LId	链接id)
	 * @param lId
	 */ 
	public void setLId(Integer lId){
		this.lId=lId;
	}
	/**
	 * @Title:setLId 
	 * @Description: TODO(得到LId	链接id)
	 * @return Integer
	 */ 
	public Integer getLId(){
		return lId;
	}
	/**
	 * @Title:setLName 
	 * @Description: TODO(设置LName	链接名称)
	 * @param lName
	 */ 
	public void setLName(String lName){
		this.lName=lName;
	}
	/**
	 * @Title:setLName 
	 * @Description: TODO(得到LName	链接名称)
	 * @return String
	 */ 
	public String getLName(){
		return lName;
	}
	/**
	 * @Title:setLUrl 
	 * @Description: TODO(设置LUrl	url地址)
	 * @param lUrl
	 */ 
	public void setLUrl(String lUrl){
		this.lUrl=lUrl;
	}
	/**
	 * @Title:setLUrl 
	 * @Description: TODO(得到LUrl	url地址)
	 * @return String
	 */ 
	public String getLUrl(){
		return lUrl;
	}

	/**
	 * @Title:toString
	 * @Description: TODO(toString)
	 */
	@Override
	public String toString() {
		return "Link{" +
				"lId=" + lId +
				", lName='" + lName + '\'' +
				", lUrl='" + lUrl + '\'' +
				", lImg='" + lImg + '\'' +
				", lDescribe='" + lDescribe + '\'' +
				'}';
	}

	public String getLImg() {
		return lImg;
	}

	public void setLImg(String lImg) {
		this.lImg = lImg;
	}

	public String getLDescribe() {
		return lDescribe;
	}

	public void setLDescribe(String lDescribe) {
		this.lDescribe = lDescribe;
	}
}

