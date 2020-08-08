package cn.tanknee.blog.hexo.admin.internal.response;

import cn.tanknee.blog.hexo.admin.internal.exception.MsgCode;

public class ApiResponse<T> {

    public MsgCode code = MsgCode.SUCCESS;

    public T data;

    public ApiResponse() {

    }

    public ApiResponse(T outVO) {
        this.data = outVO;
    }

    public ApiResponse(Boolean bool) {

    }
}
