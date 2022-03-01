
package principal;

import com.parser.AlimentosBaseVisitor;
import com.parser.AlimentosParser;

public class MyVisitor extends AlimentosBaseVisitor<String> {
    @Override public String visitGrupo(AlimentosParser.GrupoContext ctx) {
        System.out.println(ctx.children);
        return null;
    }
}
