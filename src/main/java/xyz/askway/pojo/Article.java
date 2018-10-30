package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:article 
 * @Description: TODO(类说明：文章表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:20
 */ 
public class Article implements Serializable{
	private static final long serialVersionUID = 1L;
	private String aId; 	//文章id
	private String aTitle; 	//标题
	private String aContent; 	//内容
	private String aTitleImg; 	//标题图片
	private String aTime; 	//时间
	private Integer aReadingQuantity; 	//阅读量
	private Integer aCommentnum; 	//评论数
	private Integer pId; 	//栏目id 外键
	private Integer lId; 	//标签id 外键
	private Integer aStatusBar; 	//状态 0不公开 1公开
	private String uId; 	//管理员id 外键
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Article(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param aId	文章id
	 * @param aTitle	标题
	 * @param aContent	内容
	 * @param aTitleImg	标题图片
	 * @param aTime	时间
	 * @param aReadingQuantity	阅读量
	 * @param aCommentnum	评论数
	 * @param pId	栏目id 外键
	 * @param lId	标签id 外键
	 * @param aStatusBar	状态 0不公开 1公开
	 * @param uId	管理员id 外键
	 */ 
	public Article(String aId,String aTitle,String aContent,String aTitleImg,String aTime,Integer aReadingQuantity,Integer aCommentnum,Integer pId,Integer lId,Integer aStatusBar,String uId){
		this.aId=aId;
		this.aTitle=aTitle;
		this.aContent=aContent;
		this.aTitleImg=aTitleImg;
		this.aTime=aTime;
		this.aReadingQuantity=aReadingQuantity;
		this.aCommentnum=aCommentnum;
		this.pId=pId;
		this.lId=lId;
		this.aStatusBar=aStatusBar;
		this.uId=uId;
	}
	/**
	 * @Title:setAId 
	 * @Description: TODO(设置AId	文章id)
	 * @param aId
	 */ 
	public void setAId(String aId){
		this.aId=aId;
	}
	/**
	 * @Title:setAId 
	 * @Description: TODO(得到AId	文章id)
	 * @return String
	 */ 
	public String getAId(){
		return aId;
	}
	/**
	 * @Title:setATitle 
	 * @Description: TODO(设置ATitle	标题)
	 * @param aTitle
	 */ 
	public void setATitle(String aTitle){
		this.aTitle=aTitle;
	}
	/**
	 * @Title:setATitle 
	 * @Description: TODO(得到ATitle	标题)
	 * @return String
	 */ 
	public String getATitle(){
		return aTitle;
	}
	/**
	 * @Title:setAContent 
	 * @Description: TODO(设置AContent	内容)
	 * @param aContent
	 */ 
	public void setAContent(String aContent){
		this.aContent=aContent;
	}
	/**
	 * @Title:setAContent 
	 * @Description: TODO(得到AContent	内容)
	 * @return String
	 */ 
	public String getAContent(){
		return aContent;
	}
	/**
	 * @Title:setATitleImg 
	 * @Description: TODO(设置ATitleImg	标题图片)
	 * @param aTitleImg
	 */ 
	public void setATitleImg(String aTitleImg){
		this.aTitleImg=aTitleImg;
	}
	/**
	 * @Title:setATitleImg 
	 * @Description: TODO(得到ATitleImg	标题图片)
	 * @return String
	 */ 
	public String getATitleImg(){
		return aTitleImg;
	}
	/**
	 * @Title:setATime 
	 * @Description: TODO(设置ATime	时间)
	 * @param aTime
	 */ 
	public void setATime(String aTime){
		this.aTime=aTime;
	}
	/**
	 * @Title:setATime 
	 * @Description: TODO(得到ATime	时间)
	 * @return String
	 */ 
	public String getATime(){
		return aTime;
	}
	/**
	 * @Title:setAReadingQuantity 
	 * @Description: TODO(设置AReadingQuantity	阅读量)
	 * @param aReadingQuantity
	 */ 
	public void setAReadingQuantity(Integer aReadingQuantity){
		this.aReadingQuantity=aReadingQuantity;
	}
	/**
	 * @Title:setAReadingQuantity 
	 * @Description: TODO(得到AReadingQuantity	阅读量)
	 * @return Integer
	 */ 
	public Integer getAReadingQuantity(){
		return aReadingQuantity;
	}
	/**
	 * @Title:setACommentnum 
	 * @Description: TODO(设置ACommentnum	评论数)
	 * @param aCommentnum
	 */ 
	public void setACommentnum(Integer aCommentnum){
		this.aCommentnum=aCommentnum;
	}
	/**
	 * @Title:setACommentnum 
	 * @Description: TODO(得到ACommentnum	评论数)
	 * @return Integer
	 */ 
	public Integer getACommentnum(){
		return aCommentnum;
	}
	/**
	 * @Title:setPId 
	 * @Description: TODO(设置PId	栏目id 外键)
	 * @param pId
	 */ 
	public void setPId(Integer pId){
		this.pId=pId;
	}
	/**
	 * @Title:setPId 
	 * @Description: TODO(得到PId	栏目id 外键)
	 * @return Integer
	 */ 
	public Integer getPId(){
		return pId;
	}
	/**
	 * @Title:setLId 
	 * @Description: TODO(设置LId	标签id 外键)
	 * @param lId
	 */ 
	public void setLId(Integer lId){
		this.lId=lId;
	}
	/**
	 * @Title:setLId 
	 * @Description: TODO(得到LId	标签id 外键)
	 * @return Integer
	 */ 
	public Integer getLId(){
		return lId;
	}
	/**
	 * @Title:setAStatusBar 
	 * @Description: TODO(设置AStatusBar	状态 0不公开 1公开)
	 * @param aStatusBar
	 */ 
	public void setAStatusBar(Integer aStatusBar){
		this.aStatusBar=aStatusBar;
	}
	/**
	 * @Title:setAStatusBar 
	 * @Description: TODO(得到AStatusBar	状态 0不公开 1公开)
	 * @return Integer
	 */ 
	public Integer getAStatusBar(){
		return aStatusBar;
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
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "Article[aId=" + aId + ",aTitle=" + aTitle + ",aContent=" + aContent + ","+
		"aTitleImg=" + aTitleImg + ",aTime=" + aTime + ",aReadingQuantity=" + aReadingQuantity + ","+
		"aCommentnum=" + aCommentnum + ",pId=" + pId + ",lId=" + lId + ","+
		"aStatusBar=" + aStatusBar + ",uId=" + uId + "]";
	}
}

