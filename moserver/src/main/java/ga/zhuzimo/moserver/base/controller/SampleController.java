package ga.zhuzimo.moserver.base.controller;

import ga.zhuzimo.moserver.base.model.CommonResponse;
import ga.zhuzimo.moserver.base.model.SysUser;
import ga.zhuzimo.moserver.base.model.TCommonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample")
@Api(tags={"样例接口"})
public class SampleController {

    @GetMapping("test1")
    @ApiOperation(value="对象接口")
    public CommonResponse test1(){
        CommonResponse response = new CommonResponse();
        response.setSuccess("测试成功");
        return response;
    }

    @GetMapping("test2")
    @ApiOperation(value="泛型接口")
    public TCommonResponse<SysUser> test2(){
        TCommonResponse<SysUser> response = new TCommonResponse<>();
        SysUser sysUser = new SysUser();
        sysUser.setUserName("用户名");
        response.setSuccess(sysUser);
        return response;
    }
}
