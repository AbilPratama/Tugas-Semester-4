package Tugas5;

class Orang {
    private String id;
    private String name;
    
    public Orang(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() { 
        return name; }
    
    public void displayRole() { 
        System.out.println(name + " (Peran umum)");
    }
}