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
// Kelas `Main` digunakan untuk mendemonstrasikan bagaimana semua kelas berinteraksi satu sama lain 
// melalui konsep pewarisan dan polimorfisme.

import community.*;

public class Main {
     public static void main(String[] args) {
        // Membuat objek dari setiap kelas dan menampilkan informasinya
        Student student = new Student("John Doe", "12345", "Computer Science");
        student.getInformation();

        Faculty faculty = new Faculty("Jane Smith", "67890", "Computer Science", "Professor");
        faculty.getInformation();

        Administrator admin = new Administrator("Alice Johnson", "11223", "Computer Science", "Associate Professor", "Department Head");
        admin.getInformation();

        Teacher teacher = new Teacher("Bob Williams", "44556", "Computer Science", "Lecturer", "Mathematics");
        teacher.getInformation();

        Staff staff = new Staff("Charlie Brown", "77889", "HR", "Lab Technician");
        staff.getInformation();

        Alumnus alumnus = new Alumnus("Daniel Harris", "99887", 2020);
        alumnus.getInformation();
    }
}
