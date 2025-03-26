package Tugas5;

class Ujian {
    private String title;
    private Guru guru;
    
    public Ujian(String title, Guru guru) {
        this.title = title;
        this.guru = guru;
    }

    public String getTitle() { return title; }
    
    public void displayInfo() {
        System.out.println("Ujian " + title + " dikelola oleh " + guru.getName());
    }
}