
package silver.modification.impide;

import edu.umn.cs.melt.copper.runtime.engines.semantics.VirtualLocation;
import core.NLocation;

public class TColor_kwd extends common.Terminal {
  public TColor_kwd(final String lexeme, final VirtualLocation vl, final int index, final int endIndex) {
    super(lexeme, vl, index, endIndex);
  }

  public TColor_kwd(final common.StringCatter lexeme, final NLocation location) {
    super(lexeme, location);
  }

  @Override
  public String getName() { return "silver:modification:impide:Color_kwd"; }

  private static String[] lexerclasses = null;
  @Override
  public String[] getLexerClasses() {
    // Avoid doing more work at class-load time, in case we don't need this
    if (lexerclasses == null) {
      lexerclasses = new String[] {"silver:definition:core:KEYWORD"};
    }
    return lexerclasses;
  }
}

