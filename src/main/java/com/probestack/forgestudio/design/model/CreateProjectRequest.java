package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateProjectRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-06T23:23:39.454893700-07:00[America/Los_Angeles]")public class CreateProjectRequest {

  private String name;

  private UUID orgId;

  private String description;

  private String baseUrl;

  private String specFormat;

  public CreateProjectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateProjectRequest(String name, UUID orgId) {
    this.name = name;
    this.orgId = orgId;
  }

  public CreateProjectRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull   @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateProjectRequest orgId(UUID orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Get orgId
   * @return orgId
  */
  @NotNull @Valid   @Schema(name = "orgId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orgId")
  public UUID getOrgId() {
    return orgId;
  }

  public void setOrgId(UUID orgId) {
    this.orgId = orgId;
  }

  public CreateProjectRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateProjectRequest baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Get baseUrl
   * @return baseUrl
  */
    @Schema(name = "baseUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseUrl")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public CreateProjectRequest specFormat(String specFormat) {
    this.specFormat = specFormat;
    return this;
  }

  /**
   * Get specFormat
   * @return specFormat
  */
    @Schema(name = "specFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specFormat")
  public String getSpecFormat() {
    return specFormat;
  }

  public void setSpecFormat(String specFormat) {
    this.specFormat = specFormat;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectRequest createProjectRequest = (CreateProjectRequest) o;
    return Objects.equals(this.name, createProjectRequest.name) &&
        Objects.equals(this.orgId, createProjectRequest.orgId) &&
        Objects.equals(this.description, createProjectRequest.description) &&
        Objects.equals(this.baseUrl, createProjectRequest.baseUrl) &&
        Objects.equals(this.specFormat, createProjectRequest.specFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, orgId, description, baseUrl, specFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    specFormat: ").append(toIndentedString(specFormat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

