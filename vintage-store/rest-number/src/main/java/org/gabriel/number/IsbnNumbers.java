package org.gabriel.number;

import java.time.Instant;

public class IsbnNumbers {

    public String isbn10;
    public String isbn13;
    public Instant generationDate;

    @Override
    public String toString() {
        return "IsbnNumbers{" +
            "isbn13='" + isbn13 + '\'' +
            ", isbn10='" + isbn10 + '\'' +
            ", generationDate=" + generationDate +
            '}';
    }
}
