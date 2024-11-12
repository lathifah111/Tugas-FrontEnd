package com.compose.tugasfront_end.core.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.Locale

class MainViewModel: ViewModel() {

    private var _Course = MutableStateFlow(Utils.generateCourseDummy())
    val course = _Course.asStateFlow()

    private var _Category = MutableStateFlow(Utils.generateCategoryList())
    val category = _Category.asStateFlow()

    private var _Video = MutableStateFlow(Utils.generateVideoDummy())
    val video = _Video.asStateFlow()

    val query = MutableStateFlow("")
    val queryVideo = MutableStateFlow("")

    fun queryChange(value: String) {
        query.update {
            value
        }
        val data = Utils.generateCourseDummy().filter { it.name.toLowerCase(Locale.ROOT).contains(query.value.toLowerCase(Locale.ROOT)) }
        _Course.update { data }
    }

    fun queryVideoChange(value: String) {
        queryVideo.update { value }
        val data = Utils.generateVideoDummy().filter { it.name.toLowerCase(Locale.ROOT).contains(queryVideo.value.toLowerCase(Locale.ROOT)) }
        _Video.update { data }

    }

}