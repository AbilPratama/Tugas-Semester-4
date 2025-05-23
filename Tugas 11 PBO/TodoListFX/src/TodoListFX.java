import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TodoListFX extends Application {
    private ListView<String> listView;

    public static void main(String[] args) {
        TodoList.loadTodo();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Todo List GUI");

        listView = new ListView<>();
        listView.getItems().addAll(TodoList.todolist);

        TextField inputField = new TextField();
        inputField.setPromptText("Tambah Todo Baru");

        Button addButton = new Button("Tambah");
        Button editButton = new Button("Edit");
        Button deleteButton = new Button("Hapus");

        addButton.setOnAction(e -> {
            String text = inputField.getText().trim();
            if (!text.isEmpty()) {
                TodoList.todolist.add(text);
                TodoList.saveTodo();
                listView.getItems().add(text);
                inputField.clear();
            }
        });

        editButton.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                String oldValue = TodoList.todolist.get(selectedIndex);
                TextInputDialog dialog = new TextInputDialog(oldValue);
                dialog.setHeaderText("Edit Todo");
                dialog.setContentText("Ubah jadi");
                dialog.showAndWait().ifPresent(newValue -> {
                    TodoList.todolist.set(selectedIndex, newValue);
                    TodoList.saveTodo();
                    listView.getItems().set(selectedIndex, newValue);
                });
            }
        });

        deleteButton.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                TodoList.todolist.remove(selectedIndex);
                TodoList.saveTodo();
                listView.getItems().remove(selectedIndex);
            }
        });

        HBox inputBox = new HBox(10, inputField, addButton);
        HBox buttonBox = new HBox(10, editButton, deleteButton);
        VBox root = new VBox(10, listView, inputBox, buttonBox);
        root.setPadding(new Insets(15));

        primaryStage.setScene(new Scene(root, 400, 450));
        primaryStage.show();
    }

}
