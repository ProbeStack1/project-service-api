package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AddProjectMemberRequest
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-06T23:23:39.454893700-07:00[America/Los_Angeles]")public class AddProjectMemberRequest {

  private UUID userId;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    OWNER("owner"),
    
    EDITOR("editor"),
    
    VIEWER("viewer");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RoleEnum role;

  public AddProjectMemberRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddProjectMemberRequest(UUID userId) {
    this.userId = userId;
  }

  public AddProjectMemberRequest userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull @Valid   @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public AddProjectMemberRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
    @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddProjectMemberRequest addProjectMemberRequest = (AddProjectMemberRequest) o;
    return Objects.equals(this.userId, addProjectMemberRequest.userId) &&
        Objects.equals(this.role, addProjectMemberRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddProjectMemberRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

