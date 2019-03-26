package ro.andreiciortea.yggdrasil.template.acta4h;

import ro.andreiciortea.yggdrasil.template.annotation.Action;
import ro.andreiciortea.yggdrasil.template.annotation.Artifact;
import ro.andreiciortea.yggdrasil.template.annotation.ObservableProperty;

@Artifact(type = "Radiator")
public class Radiator {

  @ObservableProperty
  public String command = "";

  @ObservableProperty
  public String instruction = "";

  @ObservableProperty
  public String effectiveInstruction = "";

  @ObservableProperty
  public String instructionChange = "";

  @ObservableProperty
  public String window = "";

  @ObservableProperty
  public String baseMode = "";

  @ObservableProperty
  public String effectiveMode = "";

  @ObservableProperty
  public String presence = "";

  @ObservableProperty
  public double temperature = 0;

  @Action(path = "/actions/setCommand")
  public String setCommand(String command) {
    this.command = command;
    return this.command;
  }

  @Action(path = "/actions/setInstruction")
  public String setInstruction(String instruction) {
    this.instruction = instruction;
    return this.instruction;
  }

  @Action(path = "/actions/setEffectiveInstruction")
  public String setEffectiveInstruction(String effectiveInstruction) {
    this.effectiveInstruction = effectiveInstruction;
    return this.effectiveInstruction;
  }

  @Action(path = "/actions/setInstructionChange")
  public String setInstructionChange(String instructionChange) {
    this.instructionChange = instructionChange;
    return this.instructionChange;
  }

  @Action(path = "/actions/setWindow")
  public String setWindwow(String window) {
    this.window = window;
    return this.window;
  }

  @Action(path = "/actions/setBaseMode")
  public String setBaseMode(String baseMode) {
    this.baseMode = baseMode;
    return this.baseMode;
  }

  @Action(path = "/actions/setEffectiveMode")
  public String setEffectiveMode(String effectiveMode) {
    this.effectiveMode = effectiveMode;
    return this.effectiveMode;
  }

  @Action(path = "/actions/setPresence")
  public String setPresence(String presence) {
    this.presence = presence;
    return this.presence;
  }

  @Action(path = "/actions/setTemperature")
  public double setTemperature(double temperature) {
    this.temperature = temperature;
    return this.temperature;
  }
}