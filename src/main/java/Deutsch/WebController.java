package Deutsch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.jvm.hotspot.oops.CompressedOops;

@Controller
public class WebController {
    private DataObject dataObject;

    @Autowired
    public void setDataObject(DataObject dataObject) {
        this.dataObject = dataObject;
    }
    @RequestMapping("/")
    public String getHomepage(Model model)
    {
        DeutschWort wort=new DeutschWort();
        model.addAttribute("wort",wort);
        return "homepage";
    }
    @RequestMapping("/save")
    public String getSavepage(@ModelAttribute DeutschWort wort)
    {
        System.out.println(wort.getDeutsch_text());
        System.out.println(wort.getRussisch_text());
        dataObject.saveWord(wort);
        return "savepage";
    }
}
