package cn.tanknee.blog.hexo.admin.internal.bo;

import cn.tanknee.blog.hexo.admin.internal.vo.out.EnvironmentOutVO;
import cn.tanknee.blog.hexo.admin.utils.HexoHelper;

public class EnvironmentApi {
    public static EnvironmentOutVO getEnvironmentInfo(){
        Boolean nodeEnable = HexoHelper.checkNodeEnvironment();
        Boolean hexoEnable = HexoHelper.checkHexoEnvironment();
        String nodeVersion = HexoHelper.getNodeVersion();
        String hexoVersion = HexoHelper.getHexoVersion();
        String npmVersion = HexoHelper.getNPMVersion();
        return new EnvironmentOutVO(nodeEnable,hexoEnable,nodeVersion,hexoVersion,npmVersion);
    }
}
