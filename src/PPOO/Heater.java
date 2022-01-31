package PPOO;
public class Heater {
    private double temperature;
    private double max,min,increment;

    public Heater(double temperature, double max,double min,double increment) {

        temperature = 15.0;
        this.max = maximo;
        this.min = minimo;
        this.increment = incr8ement;
    }

    public  void warmer(double temperature,double increment){
        this.increment = increment;
        warmer = temperature + increment;
        if (temperature >max){
            return warmer;
        }else{
            System.out.println("La temperatura es denasiado elevada");
        }
    }

    public void cooler(double temperature,double increment) {
        this.increment = increment;
        cooler = temperature - increment;
        if (temperature >min){
            return cooler;
        }else{
            System.out.println("La temperatura es denasiado baja");
        }

    }

    public double getTemperature() {
        return this.temperature;

    }


    public void setIncrement(double increment) {
        this.increment = increment;
    }
}