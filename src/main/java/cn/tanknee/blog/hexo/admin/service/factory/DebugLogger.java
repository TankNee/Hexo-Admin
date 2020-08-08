package cn.tanknee.blog.hexo.admin.service.factory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class DebugLogger {
    private static Logger debugLogger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    /**
     * 日志记录
     *
     * @param object 需要记录的信息
     */
    public static void Log(Object object) {
        debugLogger.info(object);
    }

    /**
     * 错误记录
     *
     * @param object 错误的信息
     * @param apiMessage     产生错误的异常
     */
    public static void Error(Object object, String apiMessage) {
        debugLogger.error(String.format(apiMessage, object));
    }

    public static void Error(Exception ex) {
        debugLogger.error(ex.getMessage());
    }

    /**
     * 成功记录
     *
     * @param object 成功的信息
     */
    public static void Info(Object object) {
        debugLogger.info(object);
    }
}
