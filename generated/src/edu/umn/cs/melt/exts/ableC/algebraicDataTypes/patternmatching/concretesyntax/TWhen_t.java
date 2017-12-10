
package edu.umn.cs.melt.exts.ableC.algebraicDataTypes.patternmatching.concretesyntax;

import edu.umn.cs.melt.copper.runtime.engines.semantics.VirtualLocation;
import core.NLocation;

public class TWhen_t extends common.Terminal {
  public TWhen_t(final String lexeme, final VirtualLocation vl, final int index, final int endIndex) {
    super(lexeme, vl, index, endIndex);
  }

  public TWhen_t(final common.StringCatter lexeme, final NLocation location) {
    super(lexeme, location);
  }

  @Override
  public String getName() { return "edu:umn:cs:melt:exts:ableC:algebraicDataTypes:patternmatching:concretesyntax:When_t"; }

  private static String[] lexerclasses = null;
  @Override
  public String[] getLexerClasses() {
    // Avoid doing more work at class-load time, in case we don't need this
    if (lexerclasses == null) {
      lexerclasses = new String[] {"edu:umn:cs:melt:ableC:concretesyntax:Ckeyword"};
    }
    return lexerclasses;
  }
}

