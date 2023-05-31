package com.example.boot.repository

import com.example.boot.entity.Way
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface WayRepository : JpaRepository<Way, Long>