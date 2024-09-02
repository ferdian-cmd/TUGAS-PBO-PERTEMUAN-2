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
// Kelas `Employee` adalah subclass dari `CommunityMember` yang mewarisi properti dan method dari kelas `CommunityMember`.
// Ini adalah contoh dari konsep pewarisan (inheritance).

public class Employee extends CommunityMember {
    protected String department;

    public Employee(String name, String NIM, String department) {
        super(name, NIM);
        this.department = department;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Department: " + department);
    }
}
