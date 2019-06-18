package com.weixin.demo.repository;

import com.weixin.demo.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Schedule,String> {
    
}
