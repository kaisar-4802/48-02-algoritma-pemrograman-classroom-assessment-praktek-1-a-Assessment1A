public class Nomor1{
    public static void main(String[] args){
            int jamLembur =(28); 
        // Variabel untuk menyimpan honor lembur
        double honorLembur = 0;
        
        // Kondisi menghitung honor lembur berdasarkan ketentuan
        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000; // Tarif 10.000/jam
        } else {
            honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000); // 16 jam pertama + sisa jam
        }
        
        // Output hasil
        System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honorLembur);
    }
}
