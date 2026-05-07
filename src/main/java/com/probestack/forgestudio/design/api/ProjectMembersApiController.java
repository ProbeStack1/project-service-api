package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AddProjectMemberRequest;
import com.probestack.forgestudio.design.model.ProjectMember;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ProjectMembersService;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-06T23:23:39.454893700-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.projectService.base-path:/v1}")
public class ProjectMembersApiController implements ProjectMembersApi {

    private static final Logger log = LoggerFactory.getLogger(ProjectMembersApiController.class);

    private final ProjectMembersService projectMembersService;

    @Autowired()
    public ProjectMembersApiController(ProjectMembersService projectMembersService) {
        this.projectMembersService = projectMembersService;
    }

    @Override()
    public ResponseEntity<List<ProjectMember>> projectsProjectIdMembersGet(@PathVariable() UUID projectId) {
        log.info("Processing projectsProjectIdMembersGet request");
        try {
            var response = projectMembersService.projectsProjectIdMembersGet(projectId);
            log.info("projectsProjectIdMembersGet completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process projectsProjectIdMembersGet: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> projectsProjectIdMembersPost(@PathVariable() UUID projectId, @Valid() @RequestBody() AddProjectMemberRequest addProjectMemberRequest) {
        log.info("Processing projectsProjectIdMembersPost request");
        try {
            var response = projectMembersService.projectsProjectIdMembersPost(projectId, addProjectMemberRequest);
            log.info("projectsProjectIdMembersPost completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process projectsProjectIdMembersPost: {}", e.getMessage(), e);
            throw e;
        }
    }
}
