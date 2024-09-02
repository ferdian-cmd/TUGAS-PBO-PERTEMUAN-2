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
// Kelas `Staff` adalah subclass dari `Employee` yang menambahkan atribut `role`. 
// Ini adalah contoh bagaimana kelas turunan dapat memiliki properti yang spesifik.

public class Staff extends Employee {
    private String role;

    public Staff(String name, String NIM, String department, String role) {
        super(name, NIM, department);
        this.role = role;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Role: " + role);
    }
}
