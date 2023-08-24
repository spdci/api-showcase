package io.swagger.api;

import io.swagger.model.InlineResponse401;
import io.swagger.model.InlineResponseDefault;
import io.swagger.model.InlineResponseDefault1;
import io.swagger.model.InlineResponseDefault2;
import io.swagger.model.InlineResponseDefault3;
import io.swagger.model.RegistryNotifyBody;
import io.swagger.model.RegistryOnsearchBody;
import io.swagger.model.RegistrySearchBody;
import io.swagger.model.RegistrySubscribeBody;
import io.swagger.model.SyncSearchBody;
import io.swagger.model.SyncSubscriptionsBody;
import io.swagger.model.SyncUnsubscribeBody;
import io.swagger.model.TxnOnstatusBody;
import io.swagger.model.TxnStatusBody;
import io.swagger.model.TxnStatusBody2;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")
@RestController
public class RegistryApiController implements RegistryApi {

    private static final Logger log = LoggerFactory.getLogger(RegistryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegistryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse401> postRegNotify(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistryNotifyBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse401>(objectMapper.readValue("{\n  \"error\" : {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }\n}", InlineResponse401.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse401>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse401>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault> postRegOnSearch(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistryOnsearchBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault>(objectMapper.readValue("{\n  \"message\" : {\n    \"error\" : {\n      \"code\" : \"err.request.bad\",\n      \"message\" : \"message\"\n    },\n    \"ack_status\" : \"ACK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }\n}", InlineResponseDefault.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault> postRegOnTxnstatus(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody TxnOnstatusBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault>(objectMapper.readValue("{\n  \"message\" : {\n    \"error\" : {\n      \"code\" : \"err.request.bad\",\n      \"message\" : \"message\"\n    },\n    \"ack_status\" : \"ACK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }\n}", InlineResponseDefault.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault> postRegSearch(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistrySearchBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault>(objectMapper.readValue("{\n  \"message\" : {\n    \"error\" : {\n      \"code\" : \"err.request.bad\",\n      \"message\" : \"message\"\n    },\n    \"ack_status\" : \"ACK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }\n}", InlineResponseDefault.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault> postRegSubscribe(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistrySubscribeBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault>(objectMapper.readValue("{\n  \"message\" : {\n    \"error\" : {\n      \"code\" : \"err.request.bad\",\n      \"message\" : \"message\"\n    },\n    \"ack_status\" : \"ACK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }\n}", InlineResponseDefault.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RegistryOnsearchBody> postRegSyncSearch(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SyncSearchBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RegistryOnsearchBody>(objectMapper.readValue("", RegistryOnsearchBody.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RegistryOnsearchBody>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RegistryOnsearchBody>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault1> postRegSyncSubscriptions(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SyncSubscriptionsBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault1>(objectMapper.readValue("", InlineResponseDefault1.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault1>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault3> postRegSyncTxnstatus(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody TxnStatusBody2 body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault3>(objectMapper.readValue("", InlineResponseDefault3.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault3>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault3>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault2> postRegSyncUnsubscribe(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SyncUnsubscribeBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault2>(objectMapper.readValue("", InlineResponseDefault2.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault2>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault2>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponseDefault> postRegTxnstatus(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody TxnStatusBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponseDefault>(objectMapper.readValue("{\n  \"message\" : {\n    \"error\" : {\n      \"code\" : \"err.request.bad\",\n      \"message\" : \"message\"\n    },\n    \"ack_status\" : \"ACK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }\n}", InlineResponseDefault.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponseDefault>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponseDefault>(HttpStatus.NOT_IMPLEMENTED);
    }

}
