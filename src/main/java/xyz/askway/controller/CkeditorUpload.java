package xyz.askway.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.askway.util.ImageUploadUtil;

/** 
 * @ClassName: CkeditorUpload 
 * @Description: TODO(ckeditor图片上传)
 * @author Uncle
 *  
 */
@Controller
public class CkeditorUpload {
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

