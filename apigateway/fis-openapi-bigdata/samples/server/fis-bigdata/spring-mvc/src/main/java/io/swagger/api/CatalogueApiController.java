package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-04T16:19:27.367Z")

@Controller
public class CatalogueApiController implements CatalogueApi {

    private static final Logger log = LoggerFactory.getLogger(CatalogueApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CatalogueApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> cataloguesGETMaxNumber(@ApiParam(value = "JSON Web Token (JWT) entregado al usuario en la autenticación." ,required=true) @RequestHeader(value="Authorization", required=true) Object authorization,@ApiParam(value = "Identificación única de la solicitud o petición." ,required=true) @RequestHeader(value="X-Request-ID", required=true) Object xRequestID,@ApiParam(value = "Login de usuario en la aplicación de front-end que realiza la petición." ,required=true) @RequestHeader(value="X-EndUser-Login", required=true) Object xEndUserLogin,@ApiParam(value = "Fecha y hora en la que se originó la solicitud o petición por el usuario en la aplicación de front-end." ,required=true) @RequestHeader(value="X-EndUser-RequestDateTime", required=true) Object xEndUserRequestDateTime,@ApiParam(value = "Terminal (IP, número de teléfono, o identificador del dispositivo) desde el cual se originó la solicitud o petición por el usuario en la aplicación de front-end." ,required=true) @RequestHeader(value="X-EndUser-Terminal", required=true) Object xEndUserTerminal,@ApiParam(value = "Código del catálogo.",required=true) @PathVariable("catalogue") Object catalogue,@ApiParam(value = "ID del banco o entidad financiera que provee el servicio de cuentas de ahorros." ) @RequestHeader(value="X-Financial-ID", required=false) Object xFinancialID,@ApiParam(value = "Fecha y hora del último logueo del usuario en la aplicación." ) @RequestHeader(value="X-EndUser-LastLoggedDateTime", required=false) Object xEndUserLastLoggedDateTime) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
