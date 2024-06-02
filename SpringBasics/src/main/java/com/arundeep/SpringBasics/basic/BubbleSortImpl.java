package com.arundeep.SpringBasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Qualifier("bubble")
public class BubbleSortImpl implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
