public class Tugas3_13 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoBarangTerbanyak = 0;

        for(int i = 1; i <= jumlahToko; i++){
            System.out.print("Masukkan jumlah pelanggan untuk toko "+ i + ": ");
            int jumlahPelanggan = sc.nextInt();
            int totalBarangPerToko = 0;

            for( int j = 1; j <= jumlahPelanggan; j++){
                System.out.print("Masukkan jumlah barang yang dibeli pelanggan ke-"+j+": ");
                int jumlahBarang = sc.nextInt();
                totalBarangPerToko += jumlahBarang; 
            }
            System.out.println("Toko "+i+"- pelanggan: " +jumlahPelanggan+ ", total barang: "+totalBarangPerToko);
            totalBarangSeluruhToko += totalBarangPerToko;

            if(totalBarangPerToko > maxBarang){
                maxBarang= totalBarangPerToko;
                tokoBarangTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruhtoko: "+totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: "+ tokoBarangTerbanyak);
        sc.close();

    }
}
