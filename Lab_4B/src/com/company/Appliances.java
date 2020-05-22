package com.company;

public class Appliances extends Electronics{
    private int cabelLength;
    private int weight;

    Appliances(){
        super();
        SetCabelLength(0);
        SetWeight(0);
    }

    Appliances(int p, String s, String m, boolean on, int c, int w){
        super(p, s, m, on);
        SetCabelLength(c);
        SetWeight(w);
    }

    public void SetCabelLength(int c){
        if (c > 0){
            cabelLength = c;
        }else {
            System.out.println("Wrong value!");
        }
    }

    public void SetWeight(int w){
        if (w > 0){
            weight = w;
        }else {
            System.out.println("Wrong value!");
        }
    }

    public int GetCabelLength(){
        return  cabelLength;
    }

    public int GetWeight(){
        return weight;
    }

    @Override
    public void Show(){
        super.Show();
        System.out.println("; Cabel length: " + cabelLength + " m; Weight: " + weight + " kg");
    }
}
