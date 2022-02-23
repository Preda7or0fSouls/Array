public  class EjercicioRepasoArrays {

    public static void main(String[] args) {

        int [] num = new int[1000];

        int mult3 = 3;
        int mult7 = 7;

        for (int i= 0; i <num.length; i = i +2){
            num [i] = mult3;
            mult3 = mult3 + 3;

        }
        for (int i= 1; i <num.length; i = i +2){
            num [i] = mult7;
            mult7 = mult7 + 7;
        }
       for (int i = 13; i<num.length; i = i +13){
           System.out.print(num[i]);
       }
    }
}