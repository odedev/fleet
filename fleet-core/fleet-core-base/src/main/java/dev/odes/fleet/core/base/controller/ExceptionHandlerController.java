package dev.odes.fleet.core.base.controller;

import dev.odes.fleet.common.response.ResponseError;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);

    /**
     * 异常
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handler(Exception e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return e.getMessage();
    }

    /**
     * 运行时异常
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseError> handler(RuntimeException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("运行时异常", e.getMessage()), HttpStatus.INSUFFICIENT_STORAGE);
    }

    /**
     * 空指针异常
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResponseError>  handler(NullPointerException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("空指针异常", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 算术运算异常
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    public Object handler(ArithmeticException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseError("算术运算异常", e.getMessage());
    }
}
