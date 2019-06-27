/*
 * Huawei Network Slice Management NBI
 * Author: Kevin McDonnell kwx420965
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateSliceDataNetworkName
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T14:45:21.709Z")
public class CreateSliceDataNetworkName {
  @SerializedName("serviceId")
  private String serviceId = null;

  @SerializedName("operationId")
  private String operationId = null;

  public CreateSliceDataNetworkName serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * 
   * @return serviceId
  **/
  @ApiModelProperty(example = "xxxxxxxxx", required = true, value = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public CreateSliceDataNetworkName operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * 
   * @return operationId
  **/
  @ApiModelProperty(example = "xxxcccvvvv", required = true, value = "")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSliceDataNetworkName createSliceDataNetworkName = (CreateSliceDataNetworkName) o;
    return Objects.equals(this.serviceId, createSliceDataNetworkName.serviceId) &&
        Objects.equals(this.operationId, createSliceDataNetworkName.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, operationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSliceDataNetworkName {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

