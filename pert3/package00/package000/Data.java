package pert3.package00.package000;

public class Data{

	private String nama;
	private int nomor;

	public void setNama(String nama){
		this.nama = nama;
	}
	public void setNomor(int nomor){
		this.nomor = nomor;
	}
	public String getNama(){return nama;}
	public int getNomor(){return nomor;}

	public void tampil(){
		System.out.println("Nama  : "+getNama());
		System.out.println("Nomor : "+getNomor());
	}
}