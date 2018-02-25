package me.stamwoo.core;

import me.stamwoo.annotation.MyController;
import me.stamwoo.annotation.MyRequestMapping;
import me.stamwoo.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param, @MyRequestParam("param2") String param2) {
        System.out.println(param + " : " + param2);
        try {
            response.getWriter().write("doTest method success! param:" + param + ",param2:" + param2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().println("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
