package typestate.impl.inputstream;

import ideal.ResultReporter;
import ideal.debug.IDebugger;
import soot.jimple.infoflow.solver.cfg.InfoflowCFG;
import typestate.TypestateAnalysis;
import typestate.TypestateDomainValue;

public class InputStreamAnalysis extends TypestateAnalysis {

  public InputStreamAnalysis(InfoflowCFG icfg, ResultReporter<TypestateDomainValue> reporter) {
    super(new InputStreamStateMachine(icfg), icfg,reporter);
  }
  

  public InputStreamAnalysis(InfoflowCFG icfg, ResultReporter<TypestateDomainValue> reporter, IDebugger<TypestateDomainValue> debugger) {
    super(new InputStreamStateMachine(icfg), icfg,reporter, debugger);
  }
}
