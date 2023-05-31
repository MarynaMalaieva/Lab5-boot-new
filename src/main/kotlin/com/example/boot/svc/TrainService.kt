package com.example.boot.svc

import com.example.boot.dto.TrainRequest
import com.example.boot.dto.TrainResponse


interface TrainService {
    fun createTrain(trainRequest: TrainRequest): TrainResponse
    fun getTrainById(id: Long): TrainResponse
    fun updateTrain(id: Long, trainRequest: TrainRequest): TrainResponse
    fun deleteTrain(id: Long): Boolean
}