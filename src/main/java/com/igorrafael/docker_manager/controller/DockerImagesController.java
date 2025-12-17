package com.igorrafael.docker_manager.controller;
import com.igorrafael.docker_manager.service.DockerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/images")

public class DockerImagesController {

    public class DockerImagesController {
        private final DockerService dockerService;

        public DockerImagesController(DockerService dockerService) {
            this.dockerService = dockerService;
        }
        @GetMapping("/filter")
        public java.util.List<Image> filterImages() {
            return dockerService.listImages();
        }
        @GetMapping
        public List<Image> getImages(@RequestBody String imageName) {
            return dockerService.listImages();
        }
    }

}
