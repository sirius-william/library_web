/**
 * Demo class
 *
 * @author Sirius
 * @date 2020-07-14 18:44
 */
package com.sirius;

import com.sirius.service.impl.IdServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class MyTest {
    @Test
    public void run(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        Integer newId = idService.addId();
        System.out.println(newId);
    }
    @Test
    public void run2(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        ArrayList<Integer> newIds = idService.addIds(20);
        System.out.println(newIds);
    }
    @Test
    public void run3(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        Boolean success = idService.changeStatus(1000000, 1);
        System.out.println(success);
    }
}
