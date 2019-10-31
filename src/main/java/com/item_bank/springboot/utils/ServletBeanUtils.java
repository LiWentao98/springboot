package com.item_bank.springboot.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
/*
* 将request中的请求数据放到对应的javabean对象中
* */
public class ServletBeanUtils {
    public static void populate(Object bean, HttpServletRequest request){
        Class<? extends Object> clazz = bean.getClass();
        Method ms[] = clazz.getDeclaredMethods();
        String mname;
        String field;
        String fieldType;
        String value;
        for(Method m : ms){
            mname = m.getName();
            if(!mname.startsWith("set")
                    || ArrayUtils.isEmpty(m.getParameterTypes())){
                continue;
            }
            try{
                field = mname.toLowerCase().charAt(3) + mname.substring(4, mname.length());
                value = request.getParameter(field);
                if(StringUtils.isEmpty(value)){
                    continue;
                }
                fieldType = m.getParameterTypes()[0].getName();
                //以下可以确认value为String类型
                if(String.class.getName().equals(fieldType)){
                    m.invoke(bean, (String)value);
                }else if(Integer.class.getName().equals(fieldType) && NumberUtils.isDigits((String)value)){
                    m.invoke(bean, Integer.valueOf((String)value));
                }else if(Short.class.getName().equals(fieldType) && NumberUtils.isDigits((String)value)){
                    m.invoke(bean, Short.valueOf((String)value));
                }else if(Float.class.getName().equals(fieldType) && NumberUtils.isNumber((String)value)){
                    m.invoke(bean, Float.valueOf((String)value));
                }else if(Double.class.getName().equals(fieldType) && NumberUtils.isNumber((String)value)){
                    m.invoke(bean, Double.valueOf((String)value));
                }else if(Date.class.getName().equals(fieldType)){
                    m.invoke(bean, DateUtils.parseDate((String)value, "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss"));
                }else{

                    m.invoke(bean, value);
                }
            }catch(Exception e){
                e.printStackTrace();
                continue;
            }
        }
    }


}
