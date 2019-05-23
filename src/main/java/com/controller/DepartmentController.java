package com.controller;

import com.config.URLConstant;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiDepartmentListRequest;
import com.dingtalk.api.response.OapiDepartmentListResponse;
import com.taobao.api.ApiException;
import com.util.AccessTokenUtil;
import com.util.ServiceResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huxiaoxue
 * @version
 * @ClassName
 * @desc: 部门管理
 * @create: 2019-05-23
 **/
@RestController
@RequestMapping("/department")
public class DepartmentController {

    /**
     * 获取部门列表
     * @return
     */
    @GetMapping("/list")
    public ServiceResult getDepartmentIds() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient(URLConstant.URL_GET_DEPARTMENT_LIST);
        OapiDepartmentListRequest request = new OapiDepartmentListRequest();
//        request.setId("123");
        request.setHttpMethod("GET");
        OapiDepartmentListResponse response = client.execute(request, AccessTokenUtil.getToken());
        if (response.getErrcode().longValue() != 0) {
            return ServiceResult.failure(String.valueOf(response.getErrorCode()), response.getErrmsg());
        }
        ServiceResult.success(response.getDepartment());
        return ServiceResult.success(response.getDepartment());
    }

}
