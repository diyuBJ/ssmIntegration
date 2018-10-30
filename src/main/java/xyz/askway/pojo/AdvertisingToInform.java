package xyz.askway.pojo;

import java.io.Serializable;

/**
 * @ClassName:advertising_to_inform 
 * @Description: TODO(类说明：广告通知表 )
 * @author Uncle liu 
 * @date 2018-10-29 17:09:20
 */ 
public class AdvertisingToInform implements Serializable{
	private static final long serialVersionUID = 1L;
	private String gId; 	//文章id
	private String gTitle; 	//标题
	private String gContent; 	//内容
	private String gTitleImg; 	//标题图片
	private String gTime; 	//添加的时间
	private String gDuedate; 	//到期时间
	private Integer gReadingQuantity; 	//阅读量
	private Integer gCommentnum; 	//评论数
	private Integer gStatusBar; 	//状态 0不公开 1公开
	private String uId; 	//管理员id 外键
	private Integer gType; 	//类型
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public AdvertisingToInform(){
	}
	/**
	 * @Description: TODO(有参构造方法) 
	 * @param gId	文章id
	 * @param gTitle	标题
	 * @param gContent	内容
	 * @param gTitleImg	标题图片
	 * @param gTime	添加的时间
	 * @param gDuedate	到期时间
	 * @param gReadingQuantity	阅读量
	 * @param gCommentnum	评论数
	 * @param gStatusBar	状态 0不公开 1公开
	 * @param uId	管理员id 外键
	 * @param gType	类型
	 */ 
	public AdvertisingToInform(String gId,String gTitle,String gContent,String gTitleImg,String gTime,String gDuedate,Integer gReadingQuantity,Integer gCommentnum,Integer gStatusBar,String uId,Integer gType){
		this.gId=gId;
		this.gTitle=gTitle;
		this.gContent=gContent;
		this.gTitleImg=gTitleImg;
		this.gTime=gTime;
		this.gDuedate=gDuedate;
		this.gReadingQuantity=gReadingQuantity;
		this.gCommentnum=gCommentnum;
		this.gStatusBar=gStatusBar;
		this.uId=uId;
		this.gType=gType;
	}
	/**
	 * @Title:setGId 
	 * @Description: TODO(设置GId	文章id)
	 * @param gId
	 */ 
	public void setGId(String gId){
		this.gId=gId;
	}
	/**
	 * @Title:setGId 
	 * @Description: TODO(得到GId	文章id)
	 * @return String
	 */ 
	public String getGId(){
		return gId;
	}
	/**
	 * @Title:setGTitle 
	 * @Description: TODO(设置GTitle	标题)
	 * @param gTitle
	 */ 
	public void setGTitle(String gTitle){
		this.gTitle=gTitle;
	}
	/**
	 * @Title:setGTitle 
	 * @Description: TODO(得到GTitle	标题)
	 * @return String
	 */ 
	public String getGTitle(){
		return gTitle;
	}
	/**
	 * @Title:setGContent 
	 * @Description: TODO(设置GContent	内容)
	 * @param gContent
	 */ 
	public void setGContent(String gContent){
		this.gContent=gContent;
	}
	/**
	 * @Title:setGContent 
	 * @Description: TODO(得到GContent	内容)
	 * @return String
	 */ 
	public String getGContent(){
		return gContent;
	}
	/**
	 * @Title:setGTitleImg 
	 * @Description: TODO(设置GTitleImg	标题图片)
	 * @param gTitleImg
	 */ 
	public void setGTitleImg(String gTitleImg){
		this.gTitleImg=gTitleImg;
	}
	/**
	 * @Title:setGTitleImg 
	 * @Description: TODO(得到GTitleImg	标题图片)
	 * @return String
	 */ 
	public String getGTitleImg(){
		return gTitleImg;
	}
	/**
	 * @Title:setGTime 
	 * @Description: TODO(设置GTime	添加的时间)
	 * @param gTime
	 */ 
	public void setGTime(String gTime){
		this.gTime=gTime;
	}
	/**
	 * @Title:setGTime 
	 * @Description: TODO(得到GTime	添加的时间)
	 * @return String
	 */ 
	public String getGTime(){
		return gTime;
	}
	/**
	 * @Title:setGDuedate 
	 * @Description: TODO(设置GDuedate	到期时间)
	 * @param gDuedate
	 */ 
	public void setGDuedate(String gDuedate){
		this.gDuedate=gDuedate;
	}
	/**
	 * @Title:setGDuedate 
	 * @Description: TODO(得到GDuedate	到期时间)
	 * @return String
	 */ 
	public String getGDuedate(){
		return gDuedate;
	}
	/**
	 * @Title:setGReadingQuantity 
	 * @Description: TODO(设置GReadingQuantity	阅读量)
	 * @param gReadingQuantity
	 */ 
	public void setGReadingQuantity(Integer gReadingQuantity){
		this.gReadingQuantity=gReadingQuantity;
	}
	/**
	 * @Title:setGReadingQuantity 
	 * @Description: TODO(得到GReadingQuantity	阅读量)
	 * @return Integer
	 */ 
	public Integer getGReadingQuantity(){
		return gReadingQuantity;
	}
	/**
	 * @Title:setGCommentnum 
	 * @Description: TODO(设置GCommentnum	评论数)
	 * @param gCommentnum
	 */ 
	public void setGCommentnum(Integer gCommentnum){
		this.gCommentnum=gCommentnum;
	}
	/**
	 * @Title:setGCommentnum 
	 * @Description: TODO(得到GCommentnum	评论数)
	 * @return Integer
	 */ 
	public Integer getGCommentnum(){
		return gCommentnum;
	}
	/**
	 * @Title:setGStatusBar 
	 * @Description: TODO(设置GStatusBar	状态 0不公开 1公开)
	 * @param gStatusBar
	 */ 
	public void setGStatusBar(Integer gStatusBar){
		this.gStatusBar=gStatusBar;
	}
	/**
	 * @Title:setGStatusBar 
	 * @Description: TODO(得到GStatusBar	状态 0不公开 1公开)
	 * @return Integer
	 */ 
	public Integer getGStatusBar(){
		return gStatusBar;
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
	 * @Title:setGType 
	 * @Description: TODO(设置GType	类型)
	 * @param gType
	 */ 
	public void setGType(Integer gType){
		this.gType=gType;
	}
	/**
	 * @Title:setGType 
	 * @Description: TODO(得到GType	类型)
	 * @return Integer
	 */ 
	public Integer getGType(){
		return gType;
	}
	/**
	 * @Title:toString 
	 * @Description: TODO(toString)
	 */ 
	public String toString() { 
		return "AdvertisingToInform[gId=" + gId + ",gTitle=" + gTitle + ",gContent=" + gContent + ","+
		"gTitleImg=" + gTitleImg + ",gTime=" + gTime + ",gDuedate=" + gDuedate + ","+
		"gReadingQuantity=" + gReadingQuantity + ",gCommentnum=" + gCommentnum + ",gStatusBar=" + gStatusBar + ","+
		"uId=" + uId + ",gType=" + gType + "]";
	}
}

