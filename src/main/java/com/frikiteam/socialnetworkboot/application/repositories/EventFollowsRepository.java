package com.frikiteam.socialnetworkboot.application.repositories;


import com.frikiteam.socialnetworkboot.domain.entities.EventFollows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventFollowsRepository <T extends EventFollows> extends JpaRepository<T, UUID> {
}
