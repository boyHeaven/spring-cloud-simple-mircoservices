package cn.com.yxb.microservices.common;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public class ReturnInfo {


    private String code;
    private String message;

    public ReturnInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
