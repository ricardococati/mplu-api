package com.ricardococati.mpluapi.gateways.http;

import com.ricardococati.mpluapi.domains.ApiPaymentRequest;
import com.ricardococati.mpluapi.domains.ApiPaymentResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(
    value = "/api/payment",
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class ApiPaymentController {

  @ApiOperation(
      value = "paymentApi",
      notes = "call payment api",
      response = ApiPaymentResponse.class)
  @ApiResponses(
      value = {
          @ApiResponse(code = 200, message = "Payment API OK"),
          @ApiResponse(code = 404, message = "Not Found"),
          @ApiResponse(code = 400, message = "Bad Request"),
          @ApiResponse(code = 500, message = "Internal Server Error")
      }
  )
  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<ApiPaymentResponse> paymentApi(@RequestBody ApiPaymentRequest request) {
    return new ResponseEntity<ApiPaymentResponse>(new ApiPaymentResponse(), HttpStatus.OK);
  }
}
