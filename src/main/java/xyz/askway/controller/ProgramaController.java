package xyz.askway.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.askway.pojo.Programa;
import xyz.askway.service.ProgramaService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Uncle Liu
 * @ClassName: ProgramaController
 * @Description: TODO(类说明 ：)
 * @date 2018/10/30 21:27
 */
@Controller
public class ProgramaController {
    @Resource
    private ProgramaService programaService;

    @RequestMapping(value = "/selevtPrograma.do",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String selevtPrograma(){
        List<Programa> programas = programaService.selectPrograma();
        String data = JSONObject.toJSONString(programas);
        return data;
    }


}
