package es.vuejsazure.workshop.demo.entities;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class MyAspect {

    @Around("execution(* es.vuejsazure.workshop.demo.entities.Todo.setTitle (java.lang.String)) && args(sampleName)")
    public Object logAroundAllMethods(ProceedingJoinPoint proceedingJoinPoint, String sampleName) {
        int a = 1;
        System.out.println("1");
        return sampleName;
    }

    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {
        int a = 1;
        System.out.println("1");
    }
}
