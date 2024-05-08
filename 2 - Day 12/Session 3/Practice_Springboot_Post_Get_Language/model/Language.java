package com.examly.springapp.model;
 
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
 
@Entity
public class Language {
    
@Id
@GeneratedValue
private int languageId;
private String languageName;
private String languageComplexity;
 
public Language(){}
 
public Language(int languageId, String languageName, String languageComplexity) {
    this.languageId = languageId;
    this.languageName = languageName;
    this.languageComplexity = languageComplexity;
}
 
public int getLanguageId() {
    return languageId;
}
 
public void setLanguageId(int languageId) {
    this.languageId = languageId;
}
 
public String getLanguageName() {
    return languageName;
}
 
public void setLanguageName(String languageName) {
    this.languageName = languageName;
}
 
public String getLanguageComplexity() {
    return languageComplexity;
}
 
public void setLanguageComplexity(String languageComplexity) {
    this.languageComplexity = languageComplexity;
}
 
}
