/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Task {
    // Properti dari class Task
    private String title;
    private String description;
    private boolean isCompleted;

    // Constructor untuk menginisialisasi objek Task
    public Task(String title, String description, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    // Method untuk menampilkan informasi tugas
    public void displayTaskInfo() {
        System.out.println("Judul: " + title);
        System.out.println("Deskripsi: " + description);
        System.out.println("Status: " + (isCompleted ? "Selesai" : "Belum Selesai"));
    }

    // Getter dan Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
