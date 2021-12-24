package de.frauas.predictivemaintenance.Controller;

import org.apache.catalina.util.ServerInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class OpenApiController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String welcome(HttpServletRequest request) {
        System.out.println("Predictive Maintenance API Base GET s called");
        return "<h2>Predictive Maintenance API</h2>" +
                "Welcome to Pushu's API. Enjoy your stay!! <br/><br/>" +
                ServerInfo.getServerBuilt() + "<br/>" +
                ServerInfo.getServerInfo();

    }
}
