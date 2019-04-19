package ru.dmitriev.simplenumber;


public class Number{

    public long getValue() {
        return value;
    }

    private long value;

    public boolean isSimple() {
        return simple;
    }

    private boolean simple;

    private boolean checkSimplicity(){
        if(value==0)
            return false;
        double n=Math.sqrt(value);
        for(long i=2;i<=n;i++)
            if (value%i==0)
                return false;
        return true;
    }

    public Number(long value) {
        this.value=value;
        simple=checkSimplicity();
    }
}
