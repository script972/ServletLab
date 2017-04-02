/**
 * Created by script972 on 15.02.2017.
 */
public class Count {

    private double a;
    private double b;
    private double c;

    private double [] x;
    private double [] y;

    public Count(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double resultY(double x){
            if(x<1.4){
                return a*x*x+b*x+c;
            }else
            if(x>1.4){
                return (a+b*x)/Math.sqrt(x*x+1);
            }else
            {
                return a/x+Math.sqrt(x*x+1);

            }
    }

    public int tablH(double h, double s, double f){
        return (int)((f-s)/h);
    }

    public double getX(int number) {
        return this.x[number];
    }
    public double getY(int number) {
        return this.y[number];
    }

    public void createArray(double h, double s, double f){
        this.x=new double[tablH(h,s,f)];
        this.y=new double[tablH(h,s,f)];
        int next=0;
        for (double i = s; i < f ; i=i+h) {
            this.x[next]=i;
            this.y[next]=resultY(i);
            next++;
        }
    }

    public double minArrY(){
        double min=y[0];
        for (int i = 1; i < y.length; i++) {
            if(min>y[i]) {
                min = y[i];
            }
        }
        return min;
    }

    public double maxArrY(){
        double max=y[0];
        for (int i = 1; i < y.length; i++) {
            if(max<y[i]) {
                max = y[i];
            }
        }
        return max;
    }

    public String minArrYOut(){
        double min=minArrY();
        for (int i = 0; i < y.length; i++) {
            if(min==y[i])
                return "Найменше значення масиву значень функції: "+min+" Індекс цього значення "+i;

        }
        return "Помилка пошуку";
    }

    public String maxArrYOut(){
        double max=maxArrY();
        for (int i = 0; i < y.length; i++) {
            if(max==y[i])
                return "Найбільше значення масиву значень функції: "+max+" Індекс цього значення "+i;

        }
        return "Помилка пошуку";
    }

    public double summArrY(){
        double summ=0;
        for (int i = 0; i < x.length; i++) {
            summ=summ+x[i];
        }
        return summ;
    }

    public String summArrYOut(){
        return "Сума всіх значень "+summArrY();
    }

    public String midleSummArrYOut(){
        return "Середне арифметичне "+midleSummArrY();
    }

    public double midleSummArrY(){
        double summ=0;
        for (int i = 0; i < x.length; i++) {
            summ=summ+x[i];
        }
        return summ/x.length;
    }

}
