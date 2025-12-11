package com.keny.bibliothequeapi.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoggingInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long start = System.currentTimeMillis();
        request.setAttribute("startTime", start);
        log.info("➡️ Requête entrante : {} {}", request.getMethod(), request.getRequestURI());
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
        throws Exception {
        log.info("📦 Controller exécuté, préparation de la réponse...");
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
        throws Exception {
        long starTime= (long) request.getAttribute("startTime");
        long endTime= System.currentTimeMillis() - starTime ;
        log.info("⬅️ Réponse envoyée : {} {} - Status: {} - Durée: {}ms",
                request.getMethod(),
                request.getRequestURI(),
                response.getStatus(),
                endTime);
        log.info("--------------------------------------------");
    }
}
