package com.example.boot.svc

import com.example.boot.dto.WayRequest
import com.example.boot.dto.WayResponse

interface WayService {
    fun createWay(request: WayRequest): WayResponse
    fun getWayById(id: Long): WayResponse
    fun updateWay(id: Long, request: WayRequest): WayResponse
    fun deleteWay(id: Long): Boolean
}