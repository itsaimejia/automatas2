
package principal;

import com.parser.AlimentosBaseVisitor;
import com.parser.AlimentosParser;

public class MyVisitor extends AlimentosBaseVisitor<String> {
    @Override public String visitEnero(AlimentosParser.EneroContext ctx) {

        System.out.println(ctx.ENERO().getText());
        return null;
    }
}
