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
// Kelas `Faculty` adalah subclass dari `Employee` yang menambahkan atribut `rank`. 
// Kelas ini menunjukkan pewarisan multi-level, di mana kelas ini adalah subclass dari kelas `Employee`, 
// yang merupakan subclass dari `CommunityMember`.
public class Faculty extends Employee {
    protected String rank;

    public Faculty(String name, String NIM, String department, String rank) {
        super(name, NIM, department);
        this.rank = rank;
    }
    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Rank: " + rank);
    }
}