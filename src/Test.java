public class Test{

    public static void main(String args[]){

        int previous = 0;

        for(double i = 0.1; i >= 0.000000000000000001; i*=0.1){

            Approx pascal = new Approx(0.5,i, previous);

            int next = pascal.start();
            if(previous != 0) {
                System.out.println(next + " " + (next / (double) previous));
            }
            previous = next;


        }
     /*for(double i = 5.1; i < 6; i+=0.1){
         Approx pascal = new Approx(i, 0.000000000000001);
         System.out.println(pascal.start());
     }*/

    }

}