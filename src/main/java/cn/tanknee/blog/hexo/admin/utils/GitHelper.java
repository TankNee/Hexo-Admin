package cn.tanknee.blog.hexo.admin.utils;

import cn.tanknee.blog.hexo.admin.service.factory.DebugLogger;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;

public class GitHelper {
    public static void clone(String remoteUrl, String targetDirectory) {
        try {
            File file = new File(AppHelper.getRelativePath(targetDirectory));
            Git git = Git
                    .cloneRepository()
                    .setURI(remoteUrl)
                    .setDirectory(file)
                    .call();
        } catch (GitAPIException e) {
            DebugLogger.Error(e);
        }
    }
}
