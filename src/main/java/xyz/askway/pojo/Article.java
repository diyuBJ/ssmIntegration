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
	private Programa programa;//栏目id 外键
	private Label label;//标签id 外键
	private Administrator administrator;//管理员id 外键
	private Integer aStatusBar; 	//状态 0不公开 1公开
	/**
	 * @Description: TODO(无参构造方法) 
	 */ 
	public Article(){
	}

	public Article(String aId, String aTitle, String aContent, String aTitleImg, String aTime, Integer aReadingQuantity, Integer aCommentnum, Programa programa, Label label, Administrator administrator, Integer aStatusBar) {
		this.aId = aId;
		this.aTitle = aTitle;
		this.aContent = aContent;
		this.aTitleImg = aTitleImg;
		this.aTime = aTime;
		this.aReadingQuantity = aReadingQuantity;
		this.aCommentnum = aCommentnum;
		this.programa = programa;
		this.label = label;
		this.administrator = administrator;
		this.aStatusBar = aStatusBar;
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

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	@Override
	public String toString() {
		return "Article{" +
				"aId='" + aId + '\'' +
				", aTitle='" + aTitle + '\'' +
				", aContent='" + aContent + '\'' +
				", aTitleImg='" + aTitleImg + '\'' +
				", aTime='" + aTime + '\'' +
				", aReadingQuantity=" + aReadingQuantity +
				", aCommentnum=" + aCommentnum +
				", aStatusBar=" + aStatusBar +
				'}';
	}
}

