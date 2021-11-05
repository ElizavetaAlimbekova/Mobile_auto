import org.junit.jupiter.api.Test;


public class MainClassTest {

    MainClass main = new MainClass ();


    @Test
    void testGetLocalNumber () {
        int number = this.main.getLocalNumber ();
        if (number > 14) {
            System.out.println ("The number cannot be less than 14");
        }
        if (number < 14) {
            System.out.println ("The number cannot be more than 14");
        } else {
            System.out.println ("True");

        }
    }
}
