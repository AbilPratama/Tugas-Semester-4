package Tugas5;

class Admin extends Orang {
    public Admin(String id, String name) {
        super(id, name);
    }
    
    @Override
    public void displayRole() {
        System.out.println(getName() + " Adalah Admin");
    }
    
    public void manage(Orang p) {
        System.out.println(getName() + " Mengelola pekerjaan " + p.getName());
    }
}