
package silver.definition.core;

import edu.umn.cs.melt.copper.runtime.engines.semantics.VirtualLocation;
import core.NLocation;

public class TRCurly_t extends common.Terminal {
  public TRCurly_t(final String lexeme, final VirtualLocation vl, final int index, final int endIndex) {
    super(lexeme, vl, index, endIndex);
  }

  public TRCurly_t(final common.StringCatter lexeme, final NLocation location) {
    super(lexeme, location);
  }

  @Override
  public String getName() { return "silver:definition:core:RCurly_t"; }

  private static String[] lexerclasses = null;
  @Override
  public String[] getLexerClasses() {
    // Avoid doing more work at class-load time, in case we don't need this
    if (lexerclasses == null) {
      lexerclasses = new String[] {};
    }
    return lexerclasses;
  }
}
