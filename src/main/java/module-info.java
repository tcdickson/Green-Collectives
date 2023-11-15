module greenSociety {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.apache.pdfbox;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires android.json;
    requires com.rometools.rome;
    requires javafx.media;
    opens com.example.greensociety to javafx.fxml;
    exports com.example.greensociety;
}