import org.junit.Assert;
import org.junit.Test;

public class BasicStatisticTest {

    @Test
    public void VerifyNumberofItem()
    {
        // arrange
        BasicStatistic basicStatistic = new BasicStatistic();
        int expec = 0;

        // act

        int result = basicStatistic.numberOfDataItems();

        //assert
        Assert.assertEquals("Error",expec,result);
    }

    @Test
    public void VerifyAddDoubleToData()
    {
        //arrange
        BasicStatistic basicStatistic = new BasicStatistic();
        int expect = 1;

        //act
        basicStatistic.addDoubleToData(2.5);
        int result = basicStatistic.numberOfDataItems();

        //assert
        Assert.assertEquals("Error",expect,result);
    }

    @Test
    public void VerifyClearData()
    {
        //arrange
        BasicStatistic basicStatistic = new BasicStatistic();
        int expect = 0;

        //act
        basicStatistic.addDoubleToData(2.6);
        basicStatistic.addDoubleToData(5.0);
        basicStatistic.clearData();
        int result = basicStatistic.numberOfDataItems();

        //assert
        Assert.assertEquals("Error",expect,result);
    }

    @Test
    public void VerifyaddDoubleToDataForMultipleItems()
    {
        //arrange
        BasicStatistic basicStatistic = new BasicStatistic();
        int firstExpect = 2;
        int secondExpect = 3;

        //act
        basicStatistic.addDoubleToData(2.6);
        basicStatistic.addDoubleToData(3.0);
        int result1 = basicStatistic.numberOfDataItems();
        basicStatistic.addDoubleToData(8.6);
        int result2 = basicStatistic.numberOfDataItems();

        //assert
        Assert.assertEquals("Error",firstExpect,result1);
        Assert.assertEquals("Error",secondExpect,result2);
    }

    @Test
    public void VerifyMethodSum()
    {
        //arrange
        BasicStatistic basicStatistic = new BasicStatistic();
        double expect = 5.6;

        //act
        basicStatistic.addDoubleToData(2.6);
        basicStatistic.addDoubleToData(3.0);
        double result = basicStatistic.sum();

        //assert
        Assert.assertEquals("Error",expect,result,0);
        
    }




}
