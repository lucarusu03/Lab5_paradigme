package lab3.ex1;

public class IntCalculator {
    protected int state;

    public IntCalculator(){
        state=0;
    }
    public IntCalculator(int state){
        this.state=state;
    }

    public IntCalculator add(int nr){
        this.state+=nr;
        return this;
    }

    public IntCalculator subtract(int nr){
        this.state-=nr;
        return this;
    }

    public IntCalculator multiply(int nr){
        this.state*=nr;
        return  this;
    }

    public int result(){
        return state;
    }

    public void clear(){
        state=0;
    }

}
