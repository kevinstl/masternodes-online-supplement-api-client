package com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.api;

import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model.MasternodesOnlineSupplement;
import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model.ProfileInfoVM;
import com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model.Test1;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-18T11:02:13.290-05:00")

@Api(value = "api", description = "the api API")
public interface MasternodesOnlineSupplementApi {

    @ApiOperation(value = "createMasternodesOnlineSupplement", notes = "", response = MasternodesOnlineSupplement.class, tags={ "masternodes-online-supplement-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 201, message = "Created", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/masternodes-online-supplements",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<MasternodesOnlineSupplement> createMasternodesOnlineSupplementUsingPOST(
        @RequestHeader("Authorization") String bearerToken,
        @ApiParam(value = "masternodesOnlineSupplement", required = true) @RequestBody MasternodesOnlineSupplement masternodesOnlineSupplement);


    @ApiOperation(value = "createTest1", notes = "", response = Test1.class, tags={ "test-1-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Test1.class),
        @ApiResponse(code = 201, message = "Created", response = Test1.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Test1.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Test1.class),
        @ApiResponse(code = 404, message = "Not Found", response = Test1.class) })
    @RequestMapping(value = "/api/test-1-s",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Test1> createTest1UsingPOST(@ApiParam(value = "test1", required = true) @RequestBody Test1 test1);


    @ApiOperation(value = "deleteMasternodesOnlineSupplement", notes = "", response = Void.class, tags={ "masternodes-online-supplement-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/api/masternodes-online-supplements/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMasternodesOnlineSupplementUsingDELETE(@ApiParam(value = "id", required = true) @PathVariable("id") String id);


    @ApiOperation(value = "deleteTest1", notes = "", response = Void.class, tags={ "test-1-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 204, message = "No Content", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Void.class) })
    @RequestMapping(value = "/api/test-1-s/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTest1UsingDELETE(@ApiParam(value = "id", required = true) @PathVariable("id") String id);


    @ApiOperation(value = "getActiveProfiles", notes = "", response = ProfileInfoVM.class, tags={ "profile-info-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ProfileInfoVM.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ProfileInfoVM.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ProfileInfoVM.class),
        @ApiResponse(code = 404, message = "Not Found", response = ProfileInfoVM.class) })
    @RequestMapping(value = "/api/profile-info",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ProfileInfoVM> getActiveProfilesUsingGET();


    @ApiOperation(value = "getAllMasternodesOnlineSupplements", notes = "", response = MasternodesOnlineSupplement.class, responseContainer = "List", tags={ "masternodes-online-supplement-public-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/public/masternodes-online-supplements",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<MasternodesOnlineSupplement>> getAllMasternodesOnlineSupplementsUsingGET(@ApiParam(value = "Page number of the requested page") @RequestParam(value = "page", required = false) Integer page,
                                                                                                 @ApiParam(value = "Size of a page") @RequestParam(value = "size", required = false) Integer size,
                                                                                                 @ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getAllMasternodesOnlineSupplements", notes = "", response = MasternodesOnlineSupplement.class, responseContainer = "List", tags={ "masternodes-online-supplement-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/masternodes-online-supplements",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<MasternodesOnlineSupplement>> getAllMasternodesOnlineSupplementsUsingGET1(
        @RequestHeader("Authorization") String bearerToken,
        @ApiParam(value = "Page number of the requested page") @RequestParam(value = "page", required = false) Integer page,
          @ApiParam(value = "Size of a page") @RequestParam(value = "size", required = false) Integer size,
          @ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getAllTest1S", notes = "", response = Test1.class, responseContainer = "List", tags={ "test-1-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Test1.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Test1.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Test1.class),
        @ApiResponse(code = 404, message = "Not Found", response = Test1.class) })
    @RequestMapping(value = "/api/test-1-s",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<Test1>> getAllTest1SUsingGET();


    @ApiOperation(value = "getMasternodesOnlineSupplement", notes = "", response = MasternodesOnlineSupplement.class, tags={ "masternodes-online-supplement-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/masternodes-online-supplements/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<MasternodesOnlineSupplement> getMasternodesOnlineSupplementUsingGET(@ApiParam(value = "id", required = true) @PathVariable("id") String id);


    @ApiOperation(value = "getTest1", notes = "", response = Test1.class, tags={ "test-1-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Test1.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Test1.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Test1.class),
        @ApiResponse(code = 404, message = "Not Found", response = Test1.class) })
    @RequestMapping(value = "/api/test-1-s/{id}",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Test1> getTest1UsingGET(@ApiParam(value = "id", required = true) @PathVariable("id") String id);


    @ApiOperation(value = "searchMasternodesOnlineSupplements", notes = "", response = MasternodesOnlineSupplement.class, responseContainer = "List", tags={ "masternodes-online-supplement-public-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/public/_search/masternodes-online-supplements",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<MasternodesOnlineSupplement>> searchMasternodesOnlineSupplementsUsingGET(@ApiParam(value = "query", required = true) @RequestParam(value = "query", required = true) String query,
                                                                                                 @ApiParam(value = "Page number of the requested page") @RequestParam(value = "page", required = false) Integer page,
                                                                                                 @ApiParam(value = "Size of a page") @RequestParam(value = "size", required = false) Integer size,
                                                                                                 @ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "searchMasternodesOnlineSupplements", notes = "", response = MasternodesOnlineSupplement.class, responseContainer = "List", tags={ "masternodes-online-supplement-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/_search/masternodes-online-supplements",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<MasternodesOnlineSupplement>> searchMasternodesOnlineSupplementsUsingGET1(@ApiParam(value = "query", required = true) @RequestParam(value = "query", required = true) String query,
                                                                                                  @ApiParam(value = "Page number of the requested page") @RequestParam(value = "page", required = false) Integer page,
                                                                                                  @ApiParam(value = "Size of a page") @RequestParam(value = "size", required = false) Integer size,
                                                                                                  @ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "searchTest1S", notes = "", response = Test1.class, responseContainer = "List", tags={ "test-1-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Test1.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Test1.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Test1.class),
        @ApiResponse(code = 404, message = "Not Found", response = Test1.class) })
    @RequestMapping(value = "/api/_search/test-1-s",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<List<Test1>> searchTest1SUsingGET(@ApiParam(value = "query", required = true) @RequestParam(value = "query", required = true) String query);


    @ApiOperation(value = "updateMasternodesOnlineSupplement", notes = "", response = MasternodesOnlineSupplement.class, tags={ "masternodes-online-supplement-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 201, message = "Created", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 403, message = "Forbidden", response = MasternodesOnlineSupplement.class),
        @ApiResponse(code = 404, message = "Not Found", response = MasternodesOnlineSupplement.class) })
    @RequestMapping(value = "/api/masternodes-online-supplements",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<MasternodesOnlineSupplement> updateMasternodesOnlineSupplementUsingPUT(@ApiParam(value = "masternodesOnlineSupplement", required = true) @RequestBody MasternodesOnlineSupplement masternodesOnlineSupplement);


    @ApiOperation(value = "updateTest1", notes = "", response = Test1.class, tags={ "test-1-resource", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Test1.class),
        @ApiResponse(code = 201, message = "Created", response = Test1.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Test1.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Test1.class),
        @ApiResponse(code = 404, message = "Not Found", response = Test1.class) })
    @RequestMapping(value = "/api/test-1-s",
        produces = "*/*",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Test1> updateTest1UsingPUT(@ApiParam(value = "test1", required = true) @RequestBody Test1 test1);

}
