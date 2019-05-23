package com.config;

/**
 * 项目中的常量定义类
 */
public class Constant {
    /**
     * 企业corpid, 开发者所在企业
     */
    public static final String CORP_ID = "ding5d41daf2d58f584a35c2f4657eb6378f";
    /**
     * 应用的AppKey，登录开发者后台，点击应用管理，进入应用详情可见
     */
    public static final String APPKEY = "dingpzpu2rsmdmtfhc3t";
    /**
     * 应用的AppSecret，登录开发者后台，点击应用管理，进入应用详情可见
     */
    public static final String APPSECRET = "Fyb9OByZcNJZoNOjo3IMdSbs3INOsJdcWsu6kirJG0lu2zpIpEjCboshoReoygZa";

    /**
     * 数据加密密钥。用于回调数据的加密，长度固定为43个字符，从a-z, A-Z, 0-9共62个字符中选取,您可以随机生成
     */
    public static final String ENCODING_AES_KEY = "***";

    /**
     * 加解密需要用到的token，企业可以随机填写。如 "12345"
     */
    public static final String TOKEN = "12345";

    /**
     * 应用的AgentdId，登录开发者后台可查看
     */
    public static final Long AGENTID = 265786482L;

    /**
     * 审批模板唯一标识，可以在审批管理后台找到
     * 以下是采购审批
     */
    public static final String PROCESS_CODE = "PROC-4A647C52-D3C3-4C28-A8BC-162EFF859A39";

    /**
     * 回调host
     */
    public static final String CALLBACK_URL_HOST = "192.168.10.223";
}
