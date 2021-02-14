import org.junit.Assert;
import org.junit.Test;

public class Test1 {


        @Test
        public void test1(){
            System.out.println("running test 1");
            Assert.fail();
        }

    @Test
    public void test2(){
        System.out.println("running test 2");
        Assert.fail();
    }

    @Test
    public void test3(){
        System.out.println("running test 3");
    }


    @Test
    public void test4(){
        System.out.println("running test 4");
    }

    @Test
    public void test5(){
        System.out.println("running test 5");
    }
}
