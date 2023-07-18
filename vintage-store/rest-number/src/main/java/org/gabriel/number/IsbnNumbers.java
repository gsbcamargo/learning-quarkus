package org.gabriel.number;

import java.time.Instant;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

@Schema(description = "Several ISBN numbers for books")
public class IsbnNumbers {

    @Schema(required = true)
    @JsonbProperty("isbn_10")
    public String isbn10;

    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;

    @JsonbTransient
    public Instant generationDate;

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public Instant getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Instant generationDate) {
        this.generationDate = generationDate;
    }

    @Override
    public String toString() {
        return "IsbnNumbers{" +
                "isbn13='" + isbn13 + '\'' +
                ", isbn10='" + isbn10 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
