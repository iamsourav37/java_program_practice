package test;

public class ExceptionDemo {

    public static void main(String[] args) {

        try{
            int area = area(-12, 14);
            System.out.println(area);

        }catch (Exception e){
            System.out.println(e);
        }

    }

    static public int area(int h, int w) throws NgativeDimensionException {
        if(h<0 || w<0)
            throw new NgativeDimensionException();

        return h*w;
    }
}

class NgativeDimensionException extends Exception{
    public String toString(){
        return "Dimension can not be negative";
    }
}