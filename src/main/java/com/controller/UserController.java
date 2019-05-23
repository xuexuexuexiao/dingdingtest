package com.controller;

import com.config.URLConstant;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiUserGetDeptMemberRequest;
import com.dingtalk.api.response.OapiUserGetDeptMemberResponse;
import com.taobao.api.ApiException;
import com.util.AccessTokenUtil;
import com.util.ServiceResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 用户controller
 * @create: 2019-05-23
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/list")
    public ServiceResult getUserList() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient(URLConstant.User.URL_GET_USERID_LIST);
        OapiUserGetDeptMemberRequest req = new OapiUserGetDeptMemberRequest();
        req.setDeptId("1");
        req.setHttpMethod("GET");
        OapiUserGetDeptMemberResponse rsp = client.execute(req, AccessTokenUtil.getToken());
        return ServiceResult.success(rsp.getUserIds());
    }
}
