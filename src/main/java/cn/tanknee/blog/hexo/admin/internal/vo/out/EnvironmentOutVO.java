package cn.tanknee.blog.hexo.admin.internal.vo.out;

import cn.tanknee.blog.hexo.admin.internal.vo.base.BaseOutVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnvironmentOutVO extends BaseOutVO {
    public Boolean nodeEnable;
    public Boolean hexoEnable;
    public String nodeVersion;
    public String hexoVersion;
    public String npmVersion;
}
