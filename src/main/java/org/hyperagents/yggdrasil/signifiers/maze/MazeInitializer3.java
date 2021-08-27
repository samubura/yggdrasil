package org.hyperagents.yggdrasil.signifiers.maze;

import org.hyperagents.yggdrasil.signifiers.Visibility;

public class MazeInitializer3 extends MazeInitializer {

  public MazeInitializer3(){
    super();
    Visibility v = new VisibilityMaze3();
    SignifierTuple t1 = new SignifierTuple("exit1", Util.createPathSignifier(1,2),v);
    this.signifiers.add(t1);
    SignifierTuple t2 = new SignifierTuple("exit2", Util.createPathSignifier(1,3),v);
    this.signifiers.add(t2);
    SignifierTuple t3 = new SignifierTuple("exit3", Util.createPathSignifier(1,4),v);
    this.signifiers.add(t3);
    SignifierTuple t4 = new SignifierTuple("exit4", Util.createPathSignifier(1,5),v);
    this.signifiers.add(t4);
    SignifierTuple t5 = new SignifierTuple("exit5", Util.createPathSignifier(1,6),v);
    this.signifiers.add(t5);
    SignifierTuple t6 = new SignifierTuple("exit6", Util.createPathSignifier(1,7),v);
    this.signifiers.add(t6);
    SignifierTuple t7 = new SignifierTuple("exit7", Util.createPathSignifier(1,8),v);
    this.signifiers.add(t7);
    SignifierTuple t8 = new SignifierTuple("exit8", Util.createPathSignifier(1,9),v);
    this.signifiers.add(t8);
  }
}