package com.ricardococati.mpluapi.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiPaymentRequest {

  private String appId;

  private String appPass;

  private String userId;

}
