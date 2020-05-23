package com.example.demo.control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * @Deacription
 * @Author chenpengwei
 * @Date 2019/12/20 下午 8:40
 * @Version 1.0
 **/
@ControllerAdvice
public class ErrorJumpController {
    /**

     * 统一异常处理

     *

     * @param exception

     *            exception

     * @return

     */

    @ExceptionHandler({ RuntimeException.class })

    @ResponseStatus(HttpStatus.OK)

    public ModelAndView processException(RuntimeException exception) {
        return new ModelAndView("../static/404Error/" + new Random().nextInt(18));
    }



    /**

     * 统一异常处理

     *

     * @param exception

     *            exception

     * @return

     */

    @ExceptionHandler({ Exception.class })

    @ResponseStatus(HttpStatus.OK)

    public ModelAndView processException(Exception exception) {
        return new ModelAndView("../static/404Error/" + new Random().nextInt(18));
    }

}
