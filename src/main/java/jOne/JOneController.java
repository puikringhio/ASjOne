package jOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by utente on 06/10/2017.
 */

@Controller
public class JOneController {

    @RequestMapping(value = "")
    public String index()
    {
        return "index.jsp";
    }

}

