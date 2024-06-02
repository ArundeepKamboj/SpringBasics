package com.arundeep.SpringBasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Qualifier("quick")
public class QuickSortImpl implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
