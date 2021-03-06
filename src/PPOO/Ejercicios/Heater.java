public class Heater {
    
    private double temperature;
    private double min;
    private double max;
    private double increment;

    public Heater(double min, double max){
        this.temperature = 15.0;
        this.max = max;
        this.min = min;
        this.increment = 5.0;
    }

    public void warmer(){
        if ((temperature + increment) <= max){
            temperature = temperature + increment;
        }
    }

    public void cooler(){
        if (temperature - increment >= min){
            temperature = temperature - increment;
        }
    }

    public double getTemperature(){
        return temperature;
    }

    public void setIncrement(double inc){
        if (inc >= 1.0 && inc <= 5.0){
            increment = inc;
        }
    }
}
