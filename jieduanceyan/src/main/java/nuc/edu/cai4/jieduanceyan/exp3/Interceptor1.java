package nuc.edu.cai4.jieduanceyan.exp3;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    public class Interceptor1 implements HandlerInterceptor {
        @Override
        public boolean preHandle(
                HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler)

          throws Exception {
            System.out.println("处理器前方法");
            // 返回true，不会拦截后续的处理
            return true;
        }
        @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
            System.out.println("处理器后方法");
        }
        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
          throws Exception {
            System.out.println("处理器完成方法");
        }
    }

