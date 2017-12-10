
package edu.umn.cs.melt.ableC.concretesyntax;

import edu.umn.cs.melt.copper.runtime.engines.semantics.VirtualLocation;
import core.NLocation;

public class TRIGHT_ASSIGN extends common.Terminal {
  public TRIGHT_ASSIGN(final String lexeme, final VirtualLocation vl, final int index, final int endIndex) {
    super(lexeme, vl, index, endIndex);
  }

  public TRIGHT_ASSIGN(final common.StringCatter lexeme, final NLocation location) {
    super(lexeme, location);
  }

  @Override
  public String getName() { return "edu:umn:cs:melt:ableC:concretesyntax:RIGHT_ASSIGN"; }

  private static String[] lexerclasses = null;
  @Override
  public String[] getLexerClasses() {
    // Avoid doing more work at class-load time, in case we don't need this
    if (lexerclasses == null) {
      lexerclasses = new String[] {"edu:umn:cs:melt:ableC:concretesyntax:Cassignment"};
    }
    return lexerclasses;
  }
}

