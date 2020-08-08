package cn.tanknee.blog.hexo.admin.controller.web;

import cn.tanknee.blog.hexo.admin.internal.bo.EnvironmentApi;
import cn.tanknee.blog.hexo.admin.internal.response.ApiResponse;
import cn.tanknee.blog.hexo.admin.internal.vo.out.EnvironmentOutVO;
import cn.tanknee.blog.hexo.admin.internal.vo.out.VoidOutVO;
import cn.tanknee.blog.hexo.admin.utils.HexoHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/dashboard")
public class DashboardController {
    @RequestMapping(value = "/loadscreenview", method = RequestMethod.GET)
    public ApiResponse<VoidOutVO> loadScreenView() {
        return new ApiResponse<>(HexoHelper.checkHexoEnvironment());
    }

    @RequestMapping(value = "environment", method = RequestMethod.GET)
    public ApiResponse<EnvironmentOutVO> getEnvironment() {
        return new ApiResponse<>(EnvironmentApi.getEnvironmentInfo());
    }
}
