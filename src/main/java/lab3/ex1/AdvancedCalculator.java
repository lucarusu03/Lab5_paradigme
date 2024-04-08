package lab3.ex1;

public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int state){
        super(state);
    }
    public AdvancedCalculator impart(int nr){
        this.state/=nr;
        return this;
    }

    public AdvancedCalculator power(int nr){
        this.state=(int)Math.pow(state,nr);
        return this;
    }

    public AdvancedCalculator radical(int nr){
        this.state=(int)Math.pow(state, (double) 1 /nr);
        return this;
    }
}
