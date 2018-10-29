package xyz.askway.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.askway.controller.StudentController;


/**
 * author:wlm
 * name:log4j控制类
 * function:
 * 2018/10/25 10:48
 */
public class Log4j2Controller {

    private static Logger logger = LogManager.getLogger();


    public Log4j2Controller() {
    }

    //级别从高到低：FATAL、ERROR、WARN、INFO、DEBUG、TRACE
    public static void fatal(Object message){
        logger.fatal(message);
    }
    public static void error(Object message){
        logger.error(message);
    }
    public static void warn(Object message){
        logger.warn(message);
    }
    public static void info(Object message){
        logger.info(message);
    }
    public static void debug(Object message){
        logger.debug(message);
    }
    public static void trace(Object message){
        logger.trace(message);
    }



}
