package com.compose.tugasfront_end.core.presentation.navigation

sealed class ScreenController(
    val route: String,
) {
    data object Course : ScreenController(route = Destination.COURSE.name)
    data object Movie : ScreenController(route = Destination.MOVIE.name)
    data object DetailCourse : ScreenController(route = "${Destination.DETAILCOURSE.name}/{detailId}") {
        fun createRoute(detailId: Int) = "${Destination.DETAILCOURSE.name}/$detailId"
    }
    data object DetailCategory : ScreenController(route = "${Destination.DETAILCATEGORY.name}/{detailId}") {
        fun createRoute(detailId: Int) = "${Destination.DETAILCATEGORY.name}/$detailId"
    }
    data object DetailVideo : ScreenController(route = "${Destination.DETAILVIDEO.name}/{detailId}") {
        fun createRoute(detailId: Int) = "${Destination.DETAILVIDEO.name}/$detailId"
    }

    data object About : ScreenController(route = Destination.ABOUT.name)
}

enum class Destination {
    COURSE,
    MOVIE,
    DETAILCOURSE,
    DETAILCATEGORY,
    DETAILVIDEO,
    ABOUT
}