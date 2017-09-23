package cn.com.yxb.microservices.common;

import com.google.common.base.MoreObjects;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public enum ReturnStatus {
    /**
     * The SUCCEED.
     */
    SUCCEED("00000", "交易成功"),
    /**
     * Failed return status.
     */
    FAILED("00001", "交易失败"),
    /**
     * Captcha error return status.
     */
    CAPTCHA_ERROR("00405", "验证码错误"),

    /**
     * Failed database query return status.
     */
    FAILED_DATABASE_QUERY("00201", "查询数据库异常"),
    /**
     * Failed database insert return status.
     */
    FAILED_DATABASE_INSERT("00202", "插入数据异常"),
    /**
     * Failed database update return status.
     */
    FAILED_DATABASE_UPDATE("00203", "修改数据异常"),
    /**
     * Failed database delete return status.
     */
    FAILED_DATABASE_DELETE("00204", "删除数据异常"),
    /**
     * Failed database process return status.
     */
    FAILED_DATABASE_PROCESS("00205", "过程执行异常"),

    /**
     * Failed key data empty return status.
     */
    FAILED_KEY_DATA_EMPTY("00401", "关键数据项不能为空"),
    /**
     * Failed data empty return status.
     */
    FAILED_DATA_EMPTY("00402", "业务数据内容不存在"),
    /**
     * Failed data formart return status.
     */
    FAILED_DATA_FORMART("00403", "数据格式不正确"),
    /**
     * Failed process return status.
     */
    FAILED_PROCESS("00404", "业务逻辑执行错误"),

    /**
     * Failed service connection return status.
     */
    FAILED_SERVICE_CONNECTION("00601", "连接服务异常"),
    /**
     * Failed service disrupt return status.
     */
    FAILED_SERVICE_DISRUPT("00602", "断开服务异常"),
    /**
     * Failed data send return status.
     */
    FAILED_DATA_SEND("00603", "发送数据异常"),
    /**
     * Failed data receive return status.
     */
    FAILED_DATA_RECEIVE("00604", "接收数据失败");


    private final String code;
    private final String mesage;


    ReturnStatus(String code, String mesage) {
        this.code = code;
        this.mesage = mesage;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }


    public String getMesage() {
        return mesage;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("code", code)
                .add("mesage", mesage)
                .toString();
    }
}
