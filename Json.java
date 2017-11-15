import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Json extends SampBaseListener {

    ArrayList< Map > arr = new ArrayList< Map>();
    Map<String, String> mapObj ;


    public ArrayList< Map > getParserListenerResult(){
        return arr;
    }

    @Override
    public void enterInfo(SampParser.InfoContext ctx){
        mapObj = new LinkedHashMap<String, String>() ;
    }

    @Override
    public void exitInfo(SampParser.InfoContext ctx) {

        arr.add(mapObj);
    }
    @Override
    public void enterFrom(SampParser.FromContext ctx) {

        mapObj.put("from", ctx.getText());
    }

    @Override
    public void enterTo(SampParser.ToContext ctx) {

        mapObj.put("to", ctx.getText());
    }

    @Override
    public void enterContent(SampParser.ContentContext ctx) {

        mapObj.put("content", ctx.getText());
    }

    @Override
    public void enterDate(SampParser.DateContext ctx) {

        mapObj.put("date", ctx.getText());
    }

}