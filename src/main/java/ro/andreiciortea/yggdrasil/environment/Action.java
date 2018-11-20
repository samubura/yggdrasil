package ro.andreiciortea.yggdrasil.environment;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Action {

  private String name;
  private String type;
  private String description;
  private JsonElement forms;
  private JsonObject original;

  public Action(String name, String type, String description, JsonElement forms, JsonObject original) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.forms = forms;
    this.original = original;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JsonElement getForms() {
    return forms;
  }

  public void setForms(JsonElement forms) {
    this.forms = forms;
  }

  public JsonObject getOriginal() {
    return original;
  }

  public void setOriginal(JsonObject original) {
    this.original = original;
  }

}