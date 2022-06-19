
package principal;

import com.parser.AlimentosBaseVisitor;
import com.parser.AlimentosParser;

import java.util.*;


public class MyVisitor extends AlimentosBaseVisitor<String> {
    public static HashMap<String, List<String>> memory = new LinkedHashMap<String,List<String>>();

    @Override public String visitEnero(AlimentosParser.EneroContext ctx) {
        String mes = ctx.ENERO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }

        memory.put(mes,frutas);
        return null;
    }

    @Override public String visitFebrero(AlimentosParser.FebreroContext ctx) {
        String mes = ctx.FEBRERO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitMarzo(AlimentosParser.MarzoContext ctx) {
        String mes = ctx.MARZO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitAbril(AlimentosParser.AbrilContext ctx) {
        String mes = ctx.ABRIL().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitMayo(AlimentosParser.MayoContext ctx) {
        String mes = ctx.MAYO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitJunio(AlimentosParser.JunioContext ctx) {
        String mes = ctx.JUNIO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitJulio(AlimentosParser.JulioContext ctx) {
        String mes = ctx.JULIO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitAgosto(AlimentosParser.AgostoContext ctx) {
        String mes = ctx.AGOSTO().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitSeptiembre(AlimentosParser.SeptiembreContext ctx) {
        String mes = ctx.SEPTIEMBRE().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitOctubre(AlimentosParser.OctubreContext ctx) {
        String mes = ctx.OCTUBRE().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitNoviembre(AlimentosParser.NoviembreContext ctx) {
        String mes = ctx.NOVIEMBRE().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }
    @Override public String visitDiciembre(AlimentosParser.DiciembreContext ctx) {
        String mes = ctx.DICIEMBRE().getText();
        List<String> frutas = new ArrayList<>();
        for (int i=0; i<ctx.frutas().size(); i++){
            frutas.add(ctx.frutas(i).getText());
        }
        memory.put(mes,frutas);
        return null;
    }

    public void ShowList(){
        HashMap<String,List<String>> frutaMes = new LinkedHashMap<String,List<String>>();
        for (String key: memory.keySet()) {
            List<String> value = memory.get(key);
            for (int f=0; f<value.size(); f++){
                String currentFruta = value.get(f).toLowerCase(Locale.ROOT);
                if(!frutaMes.containsKey(currentFruta)){
                    frutaMes.putIfAbsent(currentFruta, new ArrayList<String>());
                    frutaMes.get(currentFruta).add(key);
                }else{
                    frutaMes.get(currentFruta).add(key);
                }
            }
        }
        for (String key: frutaMes.keySet()) {
            System.out.print("[*] "+key+" abunda en los meses: ");
            List<String> meses = frutaMes.get(key);
            for(int m=0; m<meses.size(); m++){
                System.out.print(meses.get(m).toLowerCase()+", ");
            }
            System.out.println();
        }
    }
}
