package test;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


public class MainClassTest {

    @Test
    public void testGetClassNumber () {
        MainClass mainClass = new MainClass ();

        int number = mainClass.getClassNumber ();
        Assert.assertTrue (number< 45,"Number error" );


    }


}

