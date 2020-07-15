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

    @Test
    public void run4(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        Integer id = idService.addId(2);
        System.out.println(id);
    }
    @Test
    public void addIds2(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        ArrayList<Integer> idsList = idService.addIds(10, 2);
        System.out.println(idsList);
    }
    @Test
    public void showStatus(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        Integer status = idService.showStatus(1000027);
        System.out.println(status);
    }
    @Test
    public void showMaxIdByStatus(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        Integer id = idService.showMaxIdByStatus(2);
        System.out.println(id);
    }
    @Test
    public void showAllIdsByStatus(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        ArrayList<Integer> idList = idService.showAllIdsByStatus(0);
        System.out.println(idList);
    }
    @Test
    public void getOneFreeId(){
        String config = "conf/applicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        IdServiceImpl idService = (IdServiceImpl) act.getBean("UserIdService");
        System.out.println(idService.getOneFreeId());
    }


}
