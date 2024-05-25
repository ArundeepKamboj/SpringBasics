package com.arundeep.SpringBasics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
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
}
