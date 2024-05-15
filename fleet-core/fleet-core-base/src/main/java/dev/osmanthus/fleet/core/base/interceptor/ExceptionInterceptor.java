package dev.osmanthus.fleet.core.base.interceptor;

import dev.osmanthus.fleet.common.response.ResponseError;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.*;

@ResponseBody
@RestControllerAdvice
public class ExceptionInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionInterceptor.class);

    /**
     * 异常
     * @param e
     * @return
     */
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
        return new ResponseEntity<>(new ResponseError("异常", "运行时异常", e.getMessage()), HttpStatus.INSUFFICIENT_STORAGE);
    }

    /**
     * 空指针异常
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ResponseError> handler(NullPointerException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("空指针异常", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 算术运算异常
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ResponseError> handler(ArithmeticException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("算术运算异常", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * SQL键值冲突异常
     * @param e
     * @return
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<ResponseError> handler(DuplicateKeyException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("SQL异常", "键值冲突异常", e.getMessage()), HttpStatus.INSUFFICIENT_STORAGE);
    }

    /**
     * SQL语法错误异常
     * @param e
     * @return
     */
    @ExceptionHandler(BadSqlGrammarException.class)
    public ResponseEntity<ResponseError> handler(BadSqlGrammarException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("SQL异常", "SQL语法错误异常", e.getMessage()), HttpStatus.INSUFFICIENT_STORAGE);
    }

    /**
     * SQL异常
     * @param e
     * @return
     */
    @ExceptionHandler(SQLException.class)
    public ResponseEntity<ResponseError> handler(SQLException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("SQL异常", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * SQL重试相同操作失败异常
     * @param e
     * @return
     */
    @ExceptionHandler(SQLNonTransientException.class)
    public ResponseEntity<ResponseError> handler(SQLNonTransientException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("SQL异常", "重试相同操作失败异常", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    /**
     * SQL完整性约束异常
     * @param e
     * @return
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<ResponseError> handler(SQLIntegrityConstraintViolationException e) {
        logger.error(ExceptionUtils.getStackTrace(e));
        return new ResponseEntity<>(new ResponseError("SQL异常", "完整性约束异常", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
