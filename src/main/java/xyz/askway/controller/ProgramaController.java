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
import javax.servlet.http.HttpSession;
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

    @RequestMapping(value = "/selevtPrograma.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getPrograma(){
        //查询所有栏目
        List<Programa> programas = programaService.selectPrograma();
        String data = JSONObject.toJSONString(programas);
        return data;
    }
    @RequestMapping(value = "/addPrograma.do")
    public void addPrograma(Programa programa){
        //添加栏目
        programaService.addPrograma(programa);
    }
    @RequestMapping(value = "/updatePrograma.do")
    public void updatePrograma(Programa programa){
        //修改栏目
        System.out.println(programa+"*****************");
        programaService.updatePrograma(programa);
    }

    @RequestMapping(value = "/getProgramaById.do",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getProgramaById(Programa programa){
        //根据id查询
        String data = JSONObject.toJSONString(programaService.getProgramaById1(programa.getPId()));
        return data;
    }

}
