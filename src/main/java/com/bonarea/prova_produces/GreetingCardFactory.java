/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_produces;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

/**
 *
 * @author ramon.simona
 */
@SessionScoped
public class GreetingCardFactory implements Serializable {

    //private GreetingType greetingType;

    @Produces
    @Greetings(GreetingType.HELLO)
    public GreetingCard getGreetingCard() {
        return new GreetingCardImpl();
    }

    @Produces
    @Greetings(GreetingType.HI)
    public GreetingCard getAnotherGreetingCard() {
        return new AnotherGreetingCardImpl();
    }
}
