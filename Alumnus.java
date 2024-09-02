/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package community;

/**
 *
 * @author ferdian
 */
// Nama: Ferdian Wahyu Nabillah
// NIM: (09040623059)

// Penjelasan: 
// Kelas `Alumnus` adalah subclass dari `CommunityMember` yang menambahkan atribut `graduationYear`. 
// Ini adalah contoh pewarisan dengan penambahan properti unik.

public class Alumnus extends CommunityMember {
    private int graduationYear;

    public Alumnus(String name, String NIM, int graduationYear) {
        super(name, NIM);
        this.graduationYear = graduationYear;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Graduation Year: " + graduationYear);
    }
}