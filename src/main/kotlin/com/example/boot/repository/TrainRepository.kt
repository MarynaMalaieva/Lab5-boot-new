package com.example.boot.repository

import com.example.boot.entity.Train
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TrainRepository : JpaRepository<Train, Long>