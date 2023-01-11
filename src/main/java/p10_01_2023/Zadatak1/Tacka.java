package p10_01_2023.Zadatak1;

public class Tacka {
    private int x;
    private int y;

    public void stampaj(){
        System.out.println("Koordinate ove tacke su: " + this.x +"," + this.y);
    }

    public Tacka(){
    }

    public Tacka(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }
}
