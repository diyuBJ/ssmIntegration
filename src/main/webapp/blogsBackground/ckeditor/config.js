/**
 * @license Copyright (c) 2003-2017, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	 //图片上传到服务器跳转的action
	 config.filebrowserUploadUrl="/uploadImg.do";//ckeditorUpload
	 config.language = 'zh-cn';//设置中文语言
	 //背景色
	 config.uiColor = '#ffffff';
	 //高度
	 config.height = 700;
	 config.width = 920; // 宽度
	 config.removePlugins = 'elementspath,resize'; // 移除编辑器底部状态栏显示的元素路径和调整编辑器大小的按钮
	 config.allowedContent = false; // 是否允许使用源码模式进行编辑
	 config.forcePasteAsPlainText = true; // 是否强制复制过来的文字去除格式
	 config.enterMode = CKEDITOR.ENTER_BR; // 编辑器中回车产生的标签CKEDITOR.ENTER_BR(<br>),CKEDITOR.ENTER_P(<p>),CKEDITOR_ENTER(回车)
	 // 设置快捷键
	// 用于实现Ctrl + V进行粘贴
	// 无此配置，无法进行快捷键粘贴
	config.keystrokes = [
	[CKEDITOR.CTRL + 86 /* V */, 'paste']
	];
	 
	// 设置快捷键，可能与浏览器冲突plugins/keystrokes/plugin.js
	// 用于实现Ctrl + V进行粘贴
	// 此配置将会启动粘贴之前进行过滤，若无此配置，将会出现粘贴之后才弹出过滤框
	config.blockedKeystrokes = [
	    CKEDITOR.CTRL + 86
	];

	// 图片上传相关
//	config.extraPlugins='imagepaste,uploadimage,image2';
	config.filebrowserImageUploadUrl = '/uploadImg.do'; // 图片上传路径
	config.image_previewText = ' '; // 图片信息面板预览区内容的文字内容，默认显示CKEditor自带的内容
	config.removeDialogTabs = 'image:advanced;image:Link'; // 移除图片上传页面的'高级','链接'页签
	
	config.font_names = '宋体/SimSun;新宋体/NSimSun;仿宋/FangSong;楷体/KaiTi;仿宋_GB2312/FangSong_GB2312;'+  
    '楷体_GB2312/KaiTi_GB2312;黑体/SimHei;华文细黑/STXihei;华文楷体/STKaiti;华文宋体/STSong;华文中宋/STZhongsong;'+  
    '华文仿宋/STFangsong;华文彩云/STCaiyun;华文琥珀/STHupo;华文隶书/STLiti;华文行楷/STXingkai;华文新魏/STXinwei;'+  
    '方正舒体/FZShuTi;方正姚体/FZYaoti;细明体/MingLiU;新细明体/PMingLiU;微软雅黑/Microsoft YaHei;微软正黑/Microsoft JhengHei;'+  
    'Arial Black/Arial Black;'+ config.font_names;  

    
    config.toolbar = 'Full';// 工具栏风格（基础'Basic'、全能'Full'、自定义）
};

