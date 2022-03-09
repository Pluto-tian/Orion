package com.pluto.interceptor;

import com.Pluto.E_Commerce_Platform.vo.ResStaus;
import com.Pluto.E_Commerce_Platform.vo.ResultOV;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Hoaer
 * @version 1.0
 */
@Component
public class CheckTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //预检
        String method = request.getMethod();
        if ("OPTIONS".equalsIgnoreCase(method)){
            return true;
        }
        String token = request.getHeader("token");

        if (token == null) {
            ResultOV resultOV = new ResultOV(ResStaus.NO, "请先登录", null);
            doResponse(response,resultOV);
            return false;
        } else {
            try {
                //校验token,
                JwtParser parser = Jwts.parser();
                parser.setSigningKey("IntelliJ IDEA 2021.3.1");
                parser.parseClaimsJws(token);
                return true;
            } catch (Exception e) {
                ResultOV resultOV = new ResultOV(ResStaus.NO, "请先登录", null);
                doResponse(response,resultOV);
                return false;
            }
        }
    }
    private void doResponse(HttpServletResponse response,ResultOV resultOV) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(resultOV);
        out.print(s);
        out.flush();
        out.close();
    }
}
