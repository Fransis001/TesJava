import java.util.ArrayList;

public class TransaksiJual {

    private Pembeli pembeli;
    private ArrayList<Product> produk;

    // Constructor default
    TransaksiJual() {
        pembeli = new Pembeli();
        produk = new ArrayList<>();
    }
    // Constructor dengan parameter
    TransaksiJual(Pembeli pembeli, ArrayList<Product> produk) {
        this.pembeli = pembeli;
        this.produk = produk;
    }
    // Setter dan Getter
    public void setProduk(ArrayList<Product> produk) {
        this.produk = produk;
    }
    public Pembeli getPembeli() {
        return pembeli;
    }
    public ArrayList<Product> getProduk() {
        return produk;
    }
    // Hitung total harga
    public int hitungTotal() {
        int total = 0;
        for (Product p : produk) {
            total += p.getHarga();
        }
        return total;
    }
    public static void main(String[] args) {
        // Buat objek transaksi
        TransaksiJual transaksi = new TransaksiJual();

        // Tampilkan nama pembeli
        System.out.println("------------------------");
        System.out.println("Nama Pembeli: " + transaksi.getPembeli().getNama());
        System.out.println("------------------------");

        // Tambahkan produk ke ArrayList
        ArrayList<Product> daftarProduk = new ArrayList<>();
        daftarProduk.add(new Product("Baju", 10000));
        daftarProduk.add(new Product("Celana", 30000));
        daftarProduk.add(new Product("Sepatu", 50000));

        // Set daftar produk ke transaksi
        transaksi.setProduk(daftarProduk);

        // Tampilkan produk
        System.out.println("Produk yang dibeli:");
        int n = 0;
        for (Product p : transaksi.getProduk()) {
            System.out.println((++n)+". "+p.getNama() + " (Rp " + p.getHarga() + ")");
        }

        System.out.println("------------------------");
        System.out.println("Total Harga = Rp " + transaksi.hitungTotal());
        System.out.println("------------------------");
    }
}