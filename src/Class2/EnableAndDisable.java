package Class2;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test(groups = "smoke")
    public void firstTest(){
        System.out.println("i am the first test");
    }
    @Test(enabled = false)
    public void secondTest(){
        System.out.println("i am the second test");
    }
    @Test(groups = "smoke")
    public void thirdTest(){
        System.out.println("i am the third test");
    }

}
