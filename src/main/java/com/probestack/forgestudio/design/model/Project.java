package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Project
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-06T23:23:39.454893700-07:00[America/Los_Angeles]")public class Project {

  private UUID id;

  private UUID orgId;

  private String name;

  private String description;

  private String baseUrl;

  private String specFormat;

  private Boolean isArchived;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public Project id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid   @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Project orgId(UUID orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Get orgId
   * @return orgId
  */
  @Valid   @Schema(name = "orgId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgId")
  public UUID getOrgId() {
    return orgId;
  }

  public void setOrgId(UUID orgId) {
    this.orgId = orgId;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project description(String description) {
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

  public Project baseUrl(String baseUrl) {
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

  public Project specFormat(String specFormat) {
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

  public Project isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

  /**
   * Get isArchived
   * @return isArchived
  */
    @Schema(name = "isArchived", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isArchived")
  public Boolean getIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public Project createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.orgId, project.orgId) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.baseUrl, project.baseUrl) &&
        Objects.equals(this.specFormat, project.specFormat) &&
        Objects.equals(this.isArchived, project.isArchived) &&
        Objects.equals(this.createdAt, project.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, name, description, baseUrl, specFormat, isArchived, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    specFormat: ").append(toIndentedString(specFormat)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

