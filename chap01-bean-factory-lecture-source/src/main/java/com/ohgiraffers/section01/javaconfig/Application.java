package com.ohgiraffers.section01.javaconfig;


import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 설명. ContextConfiguration으로 설정한 내용을 바탕으로 IOC 컨테이너 생성 */
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames){
            System.out.println("beanName = " + beanName);
        }

        /* 설명. 1. bean의 이름(id)을 가지고 컨테이너에서 추출 */
        MemberDTO member = (MemberDTO)context.getBean("member");
        System.out.println("첫 번째 member: " + member );

        /* 설명. 2. bean의 클래스의 메타 정보(bean의 타입)을 전달하며 추출 */
        MemberDTO member2 = context.getBean(MemberDTO.class);
        System.out.println("두 번째 member: " + member2);

        /* 설명. 3. bean의 id와 클래스의 메타 정보를 전다라며 추출 */
        MemberDTO member3 = context.getBean("member",MemberDTO.class);
        System.out.println("세 번째 member: " + member3);
    }
}
