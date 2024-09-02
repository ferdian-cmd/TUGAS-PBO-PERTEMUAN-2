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
// Kelas `Student` adalah subclass lain dari `CommunityMember` yang menambahkan atribut `major`. 
// Kelas ini menunjukkan bagaimana subclass dapat memperluas superclass.
public class Student extends CommunityMember {
    private String major;

    public Student(String name, String NIM, String major) {
        super(name, NIM);
        this.major = major;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Major: " + major);
    }
}
