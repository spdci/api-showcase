/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.46).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-24T11:13:24.172677407Z[GMT]")
@Validated
public interface RegistryApi {

    @Operation(summary = "/registry/notify", description = "Registry to notify a life event to subscrbiers", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Async" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))) })
    @RequestMapping(value = "/registry/notify",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse401> postRegNotify(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistryNotifyBody body);


    @Operation(summary = "/registry/on-search", description = "Search results through callback", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Async" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Acknowledgement of message received after successful validation of message and signature", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault.class))) })
    @RequestMapping(value = "/registry/on-search",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault> postRegOnSearch(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistryOnsearchBody body);


    @Operation(summary = "/registry/txn/on-status", description = "Response to async status check of previous civil registrt transanctions using callback", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Async" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Acknowledgement of message received after successful validation of message and signature", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault.class))) })
    @RequestMapping(value = "/registry/txn/on-status",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault> postRegOnTxnstatus(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody TxnOnstatusBody body);


    @Operation(summary = "/registry/search", description = "Search person(s) in registry using identifier or custome attributes", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Async" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Acknowledgement of message received after successful validation of message and signature", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault.class))) })
    @RequestMapping(value = "/registry/search",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault> postRegSearch(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistrySearchBody body);


    @Operation(summary = "/registry/subscribe", description = "Subscribe to a life event with registry", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Async" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Acknowledgement of message received after successful validation of message and signature", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault.class))) })
    @RequestMapping(value = "/registry/subscribe",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault> postRegSubscribe(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegistrySubscribeBody body);


    @Operation(summary = "/registry/sync/search", description = "Search person(s) in registry using identifier or custome attributes", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Sync" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Registry search response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RegistryOnsearchBody.class))) })
    @RequestMapping(value = "/registry/sync/search",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<RegistryOnsearchBody> postRegSyncSearch(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SyncSearchBody body);


    @Operation(summary = "/registry/sync/subscriptions", description = "To retrive list of subscriptions", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Sync" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Subscription list response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault1.class))) })
    @RequestMapping(value = "/registry/sync/subscriptions",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault1> postRegSyncSubscriptions(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SyncSubscriptionsBody body);


    @Operation(summary = "/registry/sync/txn/status", description = "Perform async status check of previous civil registry transanctions using transaction_id and/or reference_id(s)", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Sync" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Transaction status check response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault3.class))) })
    @RequestMapping(value = "/registry/sync/txn/status",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault3> postRegSyncTxnstatus(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody TxnStatusBody2 body);


    @Operation(summary = "/registry/sync/unsubscribe", description = "Unsubscribe to a life event with registry", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Sync" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Unsubscribe response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault2.class))) })
    @RequestMapping(value = "/registry/sync/unsubscribe",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault2> postRegSyncUnsubscribe(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody SyncUnsubscribeBody body);


    @Operation(summary = "/registry/txn/status", description = "Perform async status check of previous civil registry transanctions using transaction_id and/or reference_id(s)", security = {
        @SecurityRequirement(name = "x-access-token")    }, tags={ "Async" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "401", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "403", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "500", description = "HTTP layer error details", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse401.class))),
        
        @ApiResponse(responseCode = "200", description = "Acknowledgement of message received after successful validation of message and signature", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponseDefault.class))) })
    @RequestMapping(value = "/registry/txn/status",
        produces = { "application/json" }, 
        consumes = { "application/json", "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponseDefault> postRegTxnstatus(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody TxnStatusBody body);

}
