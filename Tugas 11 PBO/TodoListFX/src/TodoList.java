import java.io.*;
import java.util.*;

public class TodoList {
    static final String TodoApp;
    static List<String> todolist;
    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
        todolist = new ArrayList<>();

        String filepath = System.console() == null ? "/src/todolist.txt" : "/todolist.txt";
        TodoApp = System.getProperty("user.dir") + filepath;

        File file = new File(TodoApp);
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Gagal membuat file " + e.getMessage());

        }
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
        }
    }

    static void clearScreen() {
        try {
            String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Tidak bisa clear screen " + e.getMessage());
        }
    }

    static void showMenu() {
        System.out.println("=== Todo List App ===");
        System.out.println("[1] Lihat Todo List");
        System.out.println("[2] Tambah Todo List");
        System.out.println("[3] Edit Todo List");
        System.out.println("[4] Hapus Todo List");
        System.out.println("[0] Keluar");
        System.out.println("Pilih menu>");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                showTodoList();
                break;
            case "2":
                addTodo();
                break;
            case "3":
                editTodo();
                break;
            case "4":
                deleteTodo();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Menu tidak ada");
                backToMenu();
        }
    }

    static void backToMenu() {
        System.out.println("\nTekan [Enter] untuk kembali ke menu");
        scanner.nextLine();
        clearScreen();
    }

    public static void loadTodo() {
        todolist.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(TodoApp))) {
            String line;
            while ((line = reader.readLine()) != null) {
                todolist.add(line);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file " + e.getMessage());
        }
    }

    public static void saveTodo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TodoApp))) {
            for (String item : todolist) {
                writer.write(item);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data " + e.getMessage());
        }
    }

    static void showTodoList() {
        clearScreen();
        loadTodo();
        if (todolist.isEmpty()) {
            System.out.println("Belum ada data dalam todo list");
        } else {
            System.out.println("Todo List");
            for (int i = 0; i < todolist.size(); i++) {
                System.out.printf("[%d] %s%n ", i, todolist.get(i));
            }
        }
        backToMenu();
    }

    static void addTodo() {
        clearScreen();
        System.out.println("Masukkan Todo baru");
        String newTodo = scanner.nextLine();
        loadTodo();
        todolist.add(newTodo);
        saveTodo();
        System.out.println("Berhasil ditambahkan");
        backToMenu();
    }

    static void editTodo() {
        clearScreen();
        loadTodo();
        showTodoList();

        System.out.print("Masukkan index yang ingin diubah : ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index >= todolist.size()) {
                System.out.println("Index tidak valid");
            } else {
                System.out.println("Masukkan data baru: ");
                String newValue = scanner.nextLine();
                todolist.set(index, newValue);
                saveTodo();
                System.out.println("Berhasil diubah");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input bukan angka yang valid");
        }
        backToMenu();
    }

    static void deleteTodo() {
        clearScreen();
        loadTodo();
        showTodoList();

        System.out.println("Masukkan index yang ingin dihapus");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index >= todolist.size()) {
                System.out.println("Index tidak valid");
            } else {
                System.out.printf("Anda yakin ingin menghapus [%d] %s? (y/n): ", index, todolist.get(index));
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("y")) {
                    todolist.remove(index);
                    saveTodo();
                    System.out.println("Berhasil dihapus");
                } else {
                    System.out.println("Penghapusan dibatalkan");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Input bukan angka yang valid");
        }
        backToMenu();
    }

    static void showTodoListNoClear() {
        if (todolist.isEmpty()) {
            System.out.println("Todo list kosong");
        } else {
            for (int i = 0; i < todolist.size(); i++) {
                System.out.printf("[%d] %s%n ", i, todolist.get(i));
            }
        }
    }
}