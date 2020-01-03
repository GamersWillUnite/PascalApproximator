public class Approx {

    public double y;

    public double z;

    public int start;

    public Approx(double y, double z, int start) {

        this.y=y;

        this.z=z;

        this.start = start;

    }

    public int start(){

        while(start < 100000){

            if(sum(start) <= Math.pow(2,y) - 1 + z && sum(start) >= Math.pow(2,y) - 1 - z){

                return start;

            }

            start++;

        }

        return start;

    }

    public double func(int i){

        return (y-i)/(i+1);

    }

    public double prod(int z){

        double product = 1;

        for(int i = 0; i <= z; i++){

            product *= func(i);

        }

        return product;

    }

    public double sum(int x){

        double sum = 0;



        for(int i = 0; i <=x; i++){

            sum +=prod(i);

        }

        return sum;
    }





}