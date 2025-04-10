public class TransaksiJual{
	
	private Pembeli pembeli;
	private Product[] produk;

	TransaksiJual(){
		pembeli = new Pembeli();
	}
	TransaksiJual(Pembeli pembeli, Product[] produk){
		this.pembeli = pembeli;
		this.produk = produk;
	}
	public void setProduk(Product[] produk){
		this.produk = produk;
	}
	public Pembeli getPembeli(){
		return pembeli;
	}
	public Product[] getProduk(){
		return produk;
	}
	public int hitungTotal() {
		int total = 0;
		for (Product p : produk) {
			total += p.getHarga();
		}
		return total;
	}

	
	public static void main(String[] args) {

		// Buat objek transaksi dengan constructor default
		TransaksiJual transaksi = new TransaksiJual();

    	// Tampilkan nama pembeli
    	System.out.println("Nama pembeli: " + transaksi.getPembeli().getNama());

    	// Mengisi daftar produk
    	Product[] daftarProduk = new Product[3];
    	daftarProduk[0] = new Product("Baju", 10000);
    	daftarProduk[1] = new Product("Celana", 30000);
    	daftarProduk[2] = new Product("Sepatu", 50000);

    	// Tampilkan semua produk
    	transaksi.setProduk(daftarProduk);
    	System.out.println("Daftar produk");
    	for (Product p : transaksi.getProduk()) {
        	System.out.println(p.getNama() + " (Rp" + p.getHarga()+")");
    	}
    	System.out.println("---------------------");
    	System.out.println("Total Harga = Rp "+transaksi.hitungTotal());
    	System.out.println("----------------------");
	}
}