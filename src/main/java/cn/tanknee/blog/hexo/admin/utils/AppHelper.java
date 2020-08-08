package cn.tanknee.blog.hexo.admin.utils;

public class AppHelper {
    /**
     * 获取资源文件的相对路径
     *
     * @param resourceFilePath resources文件夹下的路径
     * @return 完整的相对路径
     */
    public static String getRelativePath(String resourceFilePath) {
        return String.format("./src/main/resources/%s", resourceFilePath);
    }
}
