package xyz.askway.ly.controller;


import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import xyz.askway.util.ImageUploadUtil;

/** 
 * @ClassName: CkeditorUpload 
 * @Description: TODO() 
 * @author Uncle
 * @date 2018��7��18�� ����5:46:07 
 *  
 */
@Controller
public class CkeditorUpload {
//    @Autowired
//    ServletContext context;
//    @Resource
//    private File file;
//    @Resource
//    private String uploadContentType;
//    @Resource
//    private String uploadFileName;
//
//    @RequestMapping(value = "/uploadImg.do")
//    public String uplodaImg(HttpServletRequest request, HttpServletResponse response, PrintWriter out) {
//        response.setCharacterEncoding("UTF-8");
//        // CKEditor提交的很重要的一个参数
//        String callback = request.getParameter("CKEditorFuncNum");
//        String expandedName = "";  // 文件扩展名
//        if (uploadContentType.equals("image/pjpeg") || uploadContentType.equals("image/jpeg")) {
//            // IE6上传jpg图片的headimageContentType是image/pjpeg，而IE9以及火狐上传的jpg图片是image/jpeg
//            expandedName = ".jpg";
//        } else if (uploadContentType.equals("image/png") || uploadContentType.equals("image/x-png")) {
//            // IE6上传的png图片的headimageContentType是"image/x-png"
//            expandedName = ".png";
//        } else if (uploadContentType.equals("image/gif")) {
//            expandedName = ".gif";
//        } else if (uploadContentType.equals("image/bmp")) {
//            expandedName = ".bmp";
//        } else {
//            out.println("<script type=\"text/javascript\">");
//            out.println("window.parent.CKEDITOR.tools.callFunction(" + callback + ",''," + "'文件格式不正确（必须为.jpg/.gif/.bmp/.png文件）');");
//            out.println("</script>");
//            return null;
//        }
//
//        if (file.length() > 600 * 1024) {
//            out.println("<script type=\"text/javascript\">");
//            out.println("window.parent.CKEDITOR.tools.callFunction(" + callback + ",''," + "'文件大小不得大于600k');");
//            out.println("</script>");
//            return null;
//        }
//
//        try {
//            InputStream is = new FileInputStream(file);
//            //文件保存路径
//            String uploadPath = context.getRealPath("/upload");
//            //文件名
//            String fileName = java.util.UUID.randomUUID().toString(); // 采用UUID的方式命名保证不会重复
//            fileName += expandedName;  //拼接格式
//            File toFile = new File(uploadPath, fileName);
//            OutputStream os = new FileOutputStream(toFile);
//            // 文件复制到指定位置
//            byte[] buffer = new byte[1024];
//            int length = 0;
//            while ((length = is.read(buffer)) > 0) {
//                os.write(buffer, 0, length);
//            }
//            is.close();
//            os.close();
//
//            // 返回“图像”选项卡并显示图片
//            out.println("<script type=\"text/javascript\">");
//            // 相对路径用于显示图片
//            out.println("window.parent.CKEDITOR.tools.callFunction(" + callback + ",'" + "upload/" + fileName + "','')");
//            out.println("</script>");
//
//            return null;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}

    /**
     * ckeditor图片上传
     *
     * @Title imageUpload
     * @param request
     * @param response
     */
    @RequestMapping(value = "/uploadImg.do", method = RequestMethod.POST)
    public void imageUpload(HttpServletRequest request, HttpServletResponse response) {
        String DirectoryName = "upload/";
        try {
            ImageUploadUtil.ckeditor(request, response, DirectoryName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

