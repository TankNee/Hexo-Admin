package cn.tanknee.blog.hexo.admin.utils;

import cn.tanknee.blog.hexo.admin.internal.message.ApiMessage;
import cn.tanknee.blog.hexo.admin.service.factory.DebugLogger;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hexo utils
 */
public class HexoHelper {

    final static String HEXO_CHECK_ENVIRONMENT_COMMAND = "cd ";

    final static String HEXO_VERSION_COMMAND = "hexo --version";

    final static String NODE_CHECK_ENVIRONMENT_COMMAND = "node --version";

    final static String NODE_VERSION_COMMAND = "node --version";

    final static String NPM_VERSION_COMMAND = "npm -v";


    /**
     * 检测Hexo运行环境
     *
     * @return Boolean 是否存在
     */
    @NotNull
    public static Boolean checkHexoEnvironment() {
        return checkEnvironment(HEXO_CHECK_ENVIRONMENT_COMMAND);
    }

    /**
     * 检查node环境是否存在
     *
     * @return Boolean 是否存在
     */
    @NotNull
    public static Boolean checkNodeEnvironment() {
        return checkEnvironment(NODE_CHECK_ENVIRONMENT_COMMAND);
    }

    /**
     * 获取Hexo的版本号
     *
     * @return 版本号
     */
    @NotNull
    public static String getHexoVersion() {
        return getVersion(HEXO_VERSION_COMMAND);
    }

    /**
     * 获取Node的版本号
     *
     * @return 版本号
     */
    @NotNull
    public static String getNodeVersion() {
        return getVersion(NODE_VERSION_COMMAND);
    }

    /**
     * 获取Node的版本号
     *
     * @return 版本号
     */
    @NotNull
    public static String getNPMVersion() {
        return getVersion(NPM_VERSION_COMMAND);
    }

    @NotNull
    private static Boolean checkEnvironment(String command) {
        Process process;
        try {
            process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                DebugLogger.Info(command + " SUCCESS");
            }
            String line;
            while ((line = reader.readLine()) != null) {
                DebugLogger.Info(line);
            }
            return true;
        } catch (IOException | InterruptedException ex) {
            DebugLogger.Error(command, ApiMessage.COMMAND_FAILED);
            DebugLogger.Error(ex);
        } catch (Exception ex) {
            DebugLogger.Error(ex);
        }
        return false;
    }

    @NotNull
    private static String getVersion(String command) {
        Process process;
        try {
            process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                DebugLogger.Info(command + " SUCCESS");
            }
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (IOException | InterruptedException ex) {
            DebugLogger.Error(command, ApiMessage.COMMAND_FAILED);
            DebugLogger.Error(ex);
        } catch (Exception ex) {
            DebugLogger.Error(ex);
        }
        return "";
    }
}
