import java.util.ArrayList;

/**
 * very simple implementation of the BasicStatisticInterface
 */
public class BasicStatistic implements BasicStatisticInterface {

    private ArrayList<Double> data = new ArrayList<>() ;



    @Override
    public void addDoubleToData(Double valueToAdd){
        data.add(valueToAdd);
    }

    @Override
    public void clearData(){
        data.clear();
    };
	
    @Override
    public int numberOfDataItems(){
        int rv = 0;
        if(data.size() >0){
            rv = data.size();
            return rv;
        }
        return rv;
    }

    @Override
    public Double sum(){
        double rv = 0.0;
        if (data.size() ==0){
            return rv;
        }
        else {
            for (int i =0; i<data.size();i++){
                rv = rv +data.get(i);
            }
        }
        return rv;
    }

}
