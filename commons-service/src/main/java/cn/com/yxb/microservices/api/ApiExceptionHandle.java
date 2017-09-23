package cn.com.yxb.microservices.api;

import cn.com.yxb.microservices.common.ReturnInfo;
import cn.com.yxb.microservices.common.ReturnStatus;
import cn.com.yxb.microservices.exception.DataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created on 2017/9/23.
 *
 * @author frank.
 */
@ControllerAdvice(basePackages = "cn.com.yxb.microservice")
public class ApiExceptionHandle {

    /**
     * Handler data not found exception return info.
     *
     * @param ex the ex
     * @return the return info
     */
    @ExceptionHandler(DataNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ReturnInfo handlerDataNotFoundException(DataNotFoundException ex) {

        return new ReturnInfo(ReturnStatus.FAILED_DATA_EMPTY.getCode(), ReturnStatus.FAILED_DATA_EMPTY.getMesage());

    }

    /**
     * Handler illegal argument exception return info.
     *
     * @param ex the ex
     * @return the return info
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ReturnInfo handlerIllegalArgumentException(IllegalArgumentException ex) {
        return new ReturnInfo(ReturnStatus.FAILED_KEY_DATA_EMPTY.getCode(), ReturnStatus.FAILED_DATA_EMPTY.getMesage());
    }
}
