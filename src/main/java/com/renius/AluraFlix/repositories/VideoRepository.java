package com.renius.AluraFlix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renius.AluraFlix.domain.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer>{

}
