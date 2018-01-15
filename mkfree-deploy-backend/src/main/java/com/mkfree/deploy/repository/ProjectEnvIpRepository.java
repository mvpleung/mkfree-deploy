package com.mkfree.deploy.repository;

import com.mkfree.deploy.domain.ProjectEnvIp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by oyhk on 2017/1/23.
 */
@Repository
public interface ProjectEnvIpRepository extends JpaRepository<ProjectEnvIp, Long> {

    List<ProjectEnvIp> findByProjectIdIn(List<Long> projectId);

    ProjectEnvIp findByProjectIdAndEnvIdAndServerIp(Long projectId, Long envId, String serverIp);

    List<ProjectEnvIp> findByProjectIdAndEnvId(Long projectId, Long envId);

    void deleteByProjectIdAndServerIpNotIn(Long projectId, List<String> serverIpList);
}
