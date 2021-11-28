package test;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class MainClassTest {

    @Test
    public void testGetClassString () {
        MainClass mainClass = new MainClass ();

        String str = mainClass.getClassString ();
        Assert.assertTrue ( str.contains ("Hello") || str.contains ("hello") , "Contains the string");



    }


}

