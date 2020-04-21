package modul4;
public class Person {
protected String nama;
protected String alamat;

public Person(){
System.out.println("inside person:construktor");
nama = "";
alamat = "";
}

public Person(String nama, String alamat) {
this.nama = nama;
this.alamat = alamat;
    }

public String getAlamat() {
returnalamat;
    }

public void setAlamat(String alamat) {
this.alamat = alamat;
    }

public String getNama() {
returnnama;
    }

public void setNama(String nama) {
this.nama = nama;
    }

