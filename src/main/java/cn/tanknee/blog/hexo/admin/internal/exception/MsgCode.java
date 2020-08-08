package cn.tanknee.blog.hexo.admin.internal.exception;

public enum MsgCode {
    SUCCESS(0), COMMAND_FAILED(1);

    public Integer code;

    MsgCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code.toString();
    }
}
