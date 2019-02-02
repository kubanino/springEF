package com.example.springef.interceptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class CommonInterceptor extends HandlerInterceptorAdapter
{
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView
            modelAndView) throws Exception
    {
        if (!isEmpty(request.getParameter("lang")))
        {
            modelAndView.getModel().put("lang", request.getParameter("lang"));
        }
        super.postHandle(request, response, handler, modelAndView);
    }
}
