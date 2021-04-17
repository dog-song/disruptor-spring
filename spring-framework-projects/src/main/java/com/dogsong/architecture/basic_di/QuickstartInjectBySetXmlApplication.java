package com.dogsong.architecture.basic_di;

import com.dogsong.architecture.basic_di.bean.Cat;
import com.dogsong.architecture.basic_di.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/17.
 */
public class QuickstartInjectBySetXmlApplication {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }

}
