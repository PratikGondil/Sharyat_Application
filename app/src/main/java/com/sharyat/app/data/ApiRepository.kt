package com.sharyat.app.data

import com.sharyat.app.model.StatusBody
import okhttp3.ResponseBody
import javax.inject.Inject

class ApiRepository @Inject constructor(val apiService: ApiService) {
    suspend fun getCompetitionList(statusBody: StatusBody): ResponseBody {
        return apiService.getCompetitionList(statusBody)
    }

    suspend fun getAdSliders(): ResponseBody {
        return apiService.getAdSliders()
    }
}