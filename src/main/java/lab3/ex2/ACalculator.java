package lab3.ex2;

public abstract class ACalculator {
    Object state;

    public void clear(){
        init();
    }

    public Object result(){
        return state;
    }

    public abstract void init();
}
