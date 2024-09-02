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
// Kelas `Teacher` adalah subclass dari `Faculty` yang menambahkan atribut `subject`. 
// Ini menunjukkan bagaimana konsep polimorfisme dapat diterapkan dengan meng-override method dari superclass.

public class Teacher extends Faculty {
    private String subject;

    public Teacher(String name, String NIM, String department, String rank, String subject) {
        super(name, NIM, department, rank);
        this.subject = subject;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Subject: " + subject);
    }
}
