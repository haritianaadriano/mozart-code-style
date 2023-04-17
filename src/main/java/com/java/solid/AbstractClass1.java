package com.java.solid;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
    ConcreteDependance1 concreteDependance1;
    ConcreteDependance2 concreteDependance2;
}
