package com.company;

public class Gadgets extends Electronics {
    private int batteryCapacity;
    private float CPU_speed;

    Gadgets(){
        super();
        SetBatteryCapacity(0);
        SetCPU_speed(0);
    }

    Gadgets(int p, String s, String m, boolean on, int c, float speed){
        super(p, s, m, on);
        SetBatteryCapacity(c);
        SetCPU_speed(speed);
    }

    public void SetBatteryCapacity(int c){
        if (c > 0){
            batteryCapacity = c;
        }else {
            System.out.println("Wrong value!");
        }
    }

    public void SetCPU_speed(float s){
        if (s > 0 && s < 10){
            CPU_speed = s;
        }else {
            System.out.println("Wrong value!");
        }
    }

    public int GetBatteryCapacity(){
        return batteryCapacity;
    }

    public float GetCPU_speed(){
        return CPU_speed;
    }

    @Override
    public void Show(){
        super.Show();
        System.out.println("; Battery capacity: " + batteryCapacity + " mA/h; CUP speed: " + CPU_speed + " GHz");
    }
}
