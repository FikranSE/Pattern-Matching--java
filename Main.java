public class Main{
    public static void main(String[] args){
        String teks = "Hello";
        String match = "Helol5";

        Boolean hasil = teks.contains(match);
        if(hasil){
            System.out.println("Cocok!!!");
        }else{
            System.out.println("Tidak Cocok!!!");
        }
    }
}