package prgram6CaHap03;

public class Point {
    private int x,y;
    int getPointX() {
    	return x;
    }
    int getPointY() {
    	return y;
    }
    public Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    public String toString() {
    		return "x 좌표 : " + x + ", y 자표 :" +  y + "\n";
}
}