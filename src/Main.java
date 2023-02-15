Watch.java
public interface Watch {
    public void setHands(int HandsSum);
    public void printMethodOfGettingCharge();
}
DigitalWatch.java
public interface DigitalWatch {
    public void setHands(int HandsSum);
    public void printMethodOfGettingCharge();
    public void printFunctions();
}

public class HandWatch implements Watch {
    int HandsSum;

    @Override
    public void setHands(int HandsSum){
        this.HandsSum = HandsSum;
    }

}

public class AppleWatch implements DigitalWatch {
    int HandsSum;

    @Override
    public void setLength(int length){
        this.length = length;
    }

    @Override
    public void setWidth(int width){
        this.width = width;
    }

    @Override
    public void printAreaOfRectangle(){
        System.out.println("Area of Tennis Court is " + length*width);
    }
}

