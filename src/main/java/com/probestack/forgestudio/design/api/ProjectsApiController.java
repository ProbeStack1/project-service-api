package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateProjectRequest;
import com.probestack.forgestudio.design.model.Project;
import java.util.UUID;
import com.probestack.forgestudio.design.model.UpdateProjectRequest;
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
import com.probestack.forgestudio.design.service.ProjectsService;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-06T23:23:39.454893700-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.projectService.base-path:/v1}")
public class ProjectsApiController implements ProjectsApi {

    private static final Logger log = LoggerFactory.getLogger(ProjectsApiController.class);

    private final ProjectsService projectsService;

    @Autowired()
    public ProjectsApiController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @Override()
    public ResponseEntity<Project> createProject(@Valid() @RequestBody() CreateProjectRequest createProjectRequest) {
        log.info("Processing createProject request");
        try {
            var response = projectsService.createProject(createProjectRequest);
            log.info("createProject completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createProject: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Project> getProject(@PathVariable() UUID projectId) {
        log.info("Processing getProject request");
        try {
            var response = projectsService.getProject(projectId);
            log.info("getProject completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getProject: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Project>> listProjects() {
        log.info("Processing listProjects request");
        try {
            var response = projectsService.listProjects();
            log.info("listProjects completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listProjects: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Project> updateProject(@PathVariable() UUID projectId, @Valid() @RequestBody() UpdateProjectRequest updateProjectRequest) {
        log.info("Processing updateProject request");
        try {
            var response = projectsService.updateProject(projectId, updateProjectRequest);
            log.info("updateProject completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateProject: {}", e.getMessage(), e);
            throw e;
        }
    }
}
