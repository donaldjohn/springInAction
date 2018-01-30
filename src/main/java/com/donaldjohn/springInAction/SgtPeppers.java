package com.donaldjohn.springInAction;

import org.springframework.stereotype.Component;

/**
 * Created by donaldjohn on 1/30/18.
 */
@Component
public class SgtPeppers implements CompactDisc
{

    public void play()
    {
        System.out.println("SgtPeppers.play");
    }
}
