package com.example.boot.svc.impl

import com.example.boot.dto.TrainRequest
import com.example.boot.dto.TrainResponse
import com.example.boot.entity.Train
import com.example.boot.repository.TrainRepository
import com.example.boot.svc.TrainService
import org.springframework.stereotype.Service
import org.springframework.security.access.prepost.PreAuthorize

@Service
class TrainServiceImpl(private val trainRepository: TrainRepository) : TrainService {
    @PreAuthorize("hasAuthority('EDITOR')")
    override fun createTrain(trainRequest: TrainRequest): TrainResponse {
        val train = Train(model = trainRequest.model, manufacturer = trainRequest.manufacturer)
        val newTrain = trainRepository.save(train)
        return TrainResponse.fromEntity(newTrain)
    }

    @PreAuthorize("permitAll()")
    override fun getTrainById(id: Long): TrainResponse {
        val train = trainRepository.findById(id).orElseThrow()
        return TrainResponse.fromEntity(train)
    }

    @PreAuthorize("hasAuthority('EDITOR')")
    override fun updateTrain(id: Long, trainRequest: TrainRequest): TrainResponse {
        val train = trainRepository.findById(id).orElseThrow()
        train.model = trainRequest.model
        train.manufacturer = trainRequest.manufacturer
        val updatedTrain = trainRepository.save(train)
        return TrainResponse.fromEntity(updatedTrain)
    }

    @PreAuthorize("hasAuthority('EDITOR')")
    override fun deleteTrain(id: Long): Boolean {
        trainRepository.deleteById(id)
        return true
    }
}