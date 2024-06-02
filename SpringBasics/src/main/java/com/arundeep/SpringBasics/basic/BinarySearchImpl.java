package com.arundeep.SpringBasics.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
//    @Qualifier("bubble")
    public SortAlgorithm sortAlgorithm;

    @Autowired
    @Qualifier("quick")
    public SortAlgorithm sortAlgorithm2;

    public int binarySearch(int[] numbers, int numberToSearch){
        // Sort and array
        sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("PostConstruct is called");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("PreDestroy is called.");
    }
}
