package com.company;

public class Electronics {
    protected int power;
    protected String socketType, name;
    protected boolean isOn;

    Electronics(){
        SetPower(0);
        SetModelName("not set");
        SetSocketType("not set");
        SetOn(false);
    }

    Electronics(int p, String s, String m, boolean on){
        SetPower(p);
        SetModelName(m);
        SetSocketType(s);
        SetOn(on);
    }

    public void SetPower(int p){
        if (p > 0){
            power = p;
        }else {
            System.out.println("Wrong value!");
        }
    }

    public void SetSocketType(String t){
        if (t != null){
            socketType = t;
        }else {
            System.out.println("Socket type should be a string.");
        }
    }

    public void SetModelName(String m){
        if (m != null){
            name = m;
        }else {
            System.out.println("Model name should be a string.");
        }
    }

    public void SetOn(boolean on){
        isOn = on;
    }

    public int GetPower(){
        return power;
    }

    public String GetName(){
        return name;
    }

    public String GetSocketType(){
        return socketType;
    }

    public boolean GetOn(){
        return isOn;
    }

    public void Show(){
        System.out.print("Type: " + name + "; Power: " + power + "W ; Socket type: " + socketType + "; Is on?: " + ((isOn ? "yes" : "no")));
    }
}
