/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Category;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-30T12:42:14.200Z[GMT]")
@Validated
public interface CategoriesApi {

    @Operation(summary = "Returns the list of all products categories", description = "Returns the list of all products and categories  which is available on shopOnline portal ", security = {
        @SecurityRequirement(name = "BasicAuth")    }, tags={ "Categories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A List of catergories", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Category.class)))),
        
        @ApiResponse(responseCode = "500", description = "### An error has occured please contant hemkant.india@gmail.com for assistance ") })
    @RequestMapping(value = "/categories",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Category>> getCategories( @Max(1000) @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={  }, maximum="1000"
)) @Valid @RequestParam(value = "categoryId", required = false) Integer categoryId);


    @Operation(summary = "Returns the list of all products categories", description = "Returns the list of all products and categories which is available on shopOnline portal", tags={ "Categories" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A List of catergories", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Category.class))),
        
        @ApiResponse(responseCode = "500", description = "### An error has occured please contant hemkant.india@gmail.com for assistance ") })
    @RequestMapping(value = "/categories/{categoryId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Category> getCategoryDetails( @Max(1000) @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema(allowableValues={  }, maximum="1000"
)) @PathVariable("categoryId") Integer categoryId);

}

