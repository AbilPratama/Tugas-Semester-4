package Tugas5;

class Guru extends Orang {
    private String subject;
    
    public Guru(String id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }
    
    @Override
    public void displayRole() {
        System.out.println(getName() + " Adalah Guru " + subject);
    }
    
    public Ujian createTest(String title) {
        return new Ujian(title, this);
    }
}