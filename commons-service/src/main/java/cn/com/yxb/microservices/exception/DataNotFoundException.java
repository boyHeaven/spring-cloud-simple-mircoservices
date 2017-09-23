package cn.com.yxb.microservices.exception;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
public class DataNotFoundException extends RuntimeException{

    public DataNotFoundException(String message) {
        super(message);
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
