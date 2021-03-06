package com.mkfree.deploy.repository;

import com.mkfree.deploy.domain.Project;
import com.mkfree.deploy.domain.User;
import com.mkfree.deploy.domain.enumclass.BuildStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by oyhk on 2017/1/23.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByName(String name);

    Page<Project> findByProjectTagId(Pageable pageable, Long projectTagId);

    Page<Project> findByIdIn(List<Long> idList, Pageable pageable);

}
