package tn.seddik.rendezvous.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//@Slf4j
public class LoggingAspect {

    //
//    //avant l'execution
//    @Before("execution(* com.seddik.assurance.services.*.ajouter*(..))")
//    public void logMethodEntry(JoinPoint joinPoint) {
//        String name = joinPoint.getSignature().getName();
//        log.info("Début Execution : " + name + " : ");
//    }
//
//    // apres l'execution que ce soit avec ou sans erreur
//    @After("execution(* tn.seddik.rendezvous.services.*.add*(..))")
//    public void logMethodExit(JoinPoint joinPoint) {
//        String name = joinPoint.getSignature().getName();
//        log.info("la methode : " + name + "  a été executée avec succès");
//    }
//
//    // apres execution sans erreur
//    @AfterReturning("execution(* com.seddik.assurance.services.*.ajouter*(..))")
//    public void logMethodExitNoEroor(JoinPoint joinPoint) {
//        String name = joinPoint.getSignature().getName();
//        log.info("Début Execution : " + name + " : ");
//    }
//
    // apres execution avec error
//    @AfterThrowing("execution(* com.seddik.assurance.services.*.ajouter*(..))")
//    public void logMethodExitWithError(JoinPoint joinPoint) {
//        String name = joinPoint.getSignature().getName();
//        log.info("Début Execution : " + name + " : ");
//    }
//
}

