package com.sharyat.app.data

import com.sharyat.app.model.StatusBody
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiService {

@GET("api/get_competition_list.php")
suspend fun getCompetitionList(@Body statusBody: StatusBody): ResponseBody

@GET("api/get_ad_sliders.php")
suspend fun getAdSliders(): ResponseBody
}
