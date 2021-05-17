package com.dee.doodleblue.MVVM


class Repository constructor(
    private val api: Api
) : SafeApiCall {

    //for assets
    suspend fun AssestsRepo() = safeApiCall {
        api.AssestsApi()
    }

}
