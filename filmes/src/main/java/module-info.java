module br.com.fiap {
    requires javafx.fxml;
    requires java.sql;

    opens br.com.fiap to javafx.fxml;
    exports br.com.fiap;
}