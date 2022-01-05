package de.frauas.predictivemaintenance.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.catalina.util.ServerInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@RestController
@Api(value = "OpenAPIHomepageController", description = "Openly available for all")
public class OpenApiController {

    private static final Logger LOGGER = Logger.getLogger(OpenApiController.class.getName());

    @ApiOperation(value = "Welcome", notes = "Checks whether the API is up or not")
    @ApiResponses(value = {
            @ApiResponse(code= 200, message = "Checking whether the API is up or not", response = OpenApiController.class, responseContainer = "String"),
            @ApiResponse(code = 401, message = "You are not authorized to view this resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String welcome(HttpServletRequest request) {
        System.out.println("Predictive Maintenance API Base GET is called");
        LOGGER.info("Predictive Maintenance API Base GET is called");
        return "<h2>Predictive Maintenance API</h2>" +
                "Welcome to  API. Enjoy your stay!! <br/><br/>" +
                ServerInfo.getServerBuilt() + "<br/>" +
                ServerInfo.getServerInfo();

    }

    @RequestMapping(value = "/again", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String welcomeagain(HttpServletRequest request) {
        System.out.println("Predictive Maintenance API Base GET s called");
        return "<h2>abcd</h2>" +
                "uzubuuzuzbu <br/><br/>" +
                ServerInfo.getServerBuilt() + "<br/>" +
                ServerInfo.getServerInfo();

    }
}
