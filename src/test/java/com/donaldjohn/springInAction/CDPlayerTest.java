package com.donaldjohn.springInAction;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by donaldjohn on 1/30/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest
{
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull()
    {
        Assert.assertNotNull(cd);
    }
}
