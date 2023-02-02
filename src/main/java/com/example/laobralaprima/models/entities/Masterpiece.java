package com.example.laobralaprima.models.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("masterpieces")
public class Masterpiece {
    @Id
    private String id;
    private String masterpieceName;
    private String masterpieceAuthorName;
    private String masterpieceImageUrl;
    private String masterpieceDescription;
    private String masterpiecePrice;
    private String masterpieceDateCreated;
    private String masterpieceDatePosted;

    public Masterpiece(String id, String masterpieceName, String masterpieceAuthorName, String masterpieceImageUrl, String masterpieceDescription, String masterpiecePrice, String masterpieceDateCreated, String masterpieceDatePosted) {
        this.id = id;
        this.masterpieceName = masterpieceName;
        this.masterpieceAuthorName = masterpieceAuthorName;
        this.masterpieceImageUrl = masterpieceImageUrl;
        this.masterpieceDescription = masterpieceDescription;
        this.masterpiecePrice = masterpiecePrice;
        this.masterpieceDateCreated = masterpieceDateCreated;
        this.masterpieceDatePosted = masterpieceDatePosted;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasterpieceName() {
        return masterpieceName;
    }

    public void setMasterpieceName(String masterpieceName) {
        this.masterpieceName = masterpieceName;
    }

    public String getMasterpieceAuthorName() {
        return masterpieceAuthorName;
    }

    public void setMasterpieceAuthorName(String masterpieceAuthorName) {
        this.masterpieceAuthorName = masterpieceAuthorName;
    }

    public String getMasterpieceImageUrl() {
        return masterpieceImageUrl;
    }

    public void setMasterpieceImageUrl(String masterpieceImageUrl) {
        this.masterpieceImageUrl = masterpieceImageUrl;
    }

    public String getMasterpieceDescription() {
        return masterpieceDescription;
    }

    public void setMasterpieceDescription(String masterpieceDescription) {
        this.masterpieceDescription = masterpieceDescription;
    }

    public String getMasterpiecePrice() {
        return masterpiecePrice;
    }

    public void setMasterpiecePrice(String masterpiecePrice) {
        this.masterpiecePrice = masterpiecePrice;
    }

    public String getMasterpieceDateCreated() {
        return masterpieceDateCreated;
    }

    public void setMasterpieceDateCreated(String masterpieceDateCreated) {
        this.masterpieceDateCreated = masterpieceDateCreated;
    }

    public String getMasterpieceDatePosted() {
        return masterpieceDatePosted;
    }

    public void setMasterpieceDatePosted(String masterpieceDatePosted) {
        this.masterpieceDatePosted = masterpieceDatePosted;
    }

}
