package com.compose.tugasfront_end

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.compose.tugasfront_end.core.presentation.MainViewModel
import com.compose.tugasfront_end.core.presentation.ViewModelFactory
import com.compose.tugasfront_end.core.presentation.navigation.Destination
import com.compose.tugasfront_end.core.presentation.navigation.ScreenController
import com.compose.tugasfront_end.core.presentation.page.AboutPage
import com.compose.tugasfront_end.core.presentation.page.CoursePage
import com.compose.tugasfront_end.core.presentation.page.VideoPage
import com.compose.tugasfront_end.core.presentation.screen.DetailScreenCategory
import com.compose.tugasfront_end.core.presentation.screen.DetailScreenCourse
import com.compose.tugasfront_end.core.presentation.screen.DetailScreenVideo
import com.compose.tugasfront_end.ui.theme.TugasFrontEndTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            val listOfRoute = listOf(
                NavItem(
                    route = ScreenController.Course.route,
                    label = "Course",
                    imageVector = R.drawable.icon_course
                ),
                NavItem(
                    route = ScreenController.Movie.route,
                    label = "Video",
                    imageVector = R.drawable.icon_video
                ),
                NavItem(
                    route = ScreenController.About.route,
                    label = "About",
                    imageVector = R.drawable.profile
                )
            )
            val mainViewModel by viewModels<MainViewModel> { ViewModelFactory() }
            var currentPage by remember { mutableStateOf(listOfRoute[0].label) }
            var isAnotherPage by remember { mutableStateOf(false) }
            var currentIndex by rememberSaveable {
                mutableIntStateOf(0)
            }

            TugasFrontEndTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors().copy(containerColor = if (!isAnotherPage) Color.Unspecified else Color.Transparent),
                            title = {
                                Text(
                                    text = if (!isAnotherPage) currentPage else "",
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp
                                    )
                                )
                            },
                            navigationIcon = {
                                if (isAnotherPage) {
                                    Icon(
                                        imageVector = Icons.Default.ArrowBack,
                                        contentDescription = "Icon Back",
                                        modifier = Modifier.clickable { navController.navigateUp()
                                            isAnotherPage = false
                                        }
                                    )
                                }
                            },
                        )

                    },

                    bottomBar = {
                        if (!isAnotherPage) {
                            BottomNavigationBar(
                                navController = navController,
                                listOfRoute = listOfRoute,
                                currentIndex = currentIndex
                            ) { destination, index ->
                                currentPage = destination
                                currentIndex = index
                            }
                        }
                    },
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = ScreenController.Course.route,
                        modifier = Modifier.padding(
                            paddingState(addingPaddingContent = isAnotherPage, paddingContent = innerPadding)
                        )
                    ) {
                        composable(route = ScreenController.Course.route) {
                            CoursePage(
                                mainViewModel = mainViewModel,
                                courseOnTapAction = {
                                    navController.navigate(ScreenController.DetailCourse.createRoute(it))
                                    isAnotherPage = true
                                },
                                categoryOnTapAction = {
                                    navController.navigate(ScreenController.DetailCategory.createRoute(it))
                                    isAnotherPage = true
                                }
                            )
                        }
                        composable(route = ScreenController.Movie.route) {
                            VideoPage(
                                mainViewModel = mainViewModel,
                            ) {
                                navController.navigate(ScreenController.DetailVideo.createRoute(it))
                                isAnotherPage = true
                            }
                        }
                        composable(route = ScreenController.About.route) {
                            AboutPage()
                        }
                        composable(
                            route = ScreenController.DetailCourse.route, arguments = listOf(
                                navArgument("detailId") { type = NavType.IntType },
                            )
                        ) {
                            val id = it.arguments?.getInt("detailId") ?: -1
                            DetailScreenCourse(id = id, mainViewModel = mainViewModel) {
                                navController.navigateUp()
                                isAnotherPage = false
                                currentIndex = 0
                            }
                        }
                        composable(
                            route = ScreenController.DetailCategory.route, arguments = listOf(
                                navArgument("detailId") { type = NavType.IntType },
                            )
                        ) {
                            val id = it.arguments?.getInt("detailId") ?: -1
                            DetailScreenCategory(id = id, mainViewModel = mainViewModel) {
                                navController.navigateUp()
                                isAnotherPage = false
                                currentIndex = 0
                            }
                        }
                        composable(
                            route = ScreenController.DetailVideo.route, arguments = listOf(
                                navArgument("detailId") { type = NavType.IntType },
                            )
                        ) {
                            val id = it.arguments?.getInt("detailId") ?: -1
                            DetailScreenVideo(id = id, mainViewModel = mainViewModel) {
                                navController.navigateUp()
                                isAnotherPage = false
                                currentIndex = 1
                            }
                        }
                    }
                }
            }
        }
    }
}

data class NavItem(
    val route: String,
    val label: String,
    @DrawableRes
    val imageVector: Int
)

fun paddingState(addingPaddingContent: Boolean, paddingContent: PaddingValues): PaddingValues {
    return if (addingPaddingContent) PaddingValues(0.dp) else paddingContent
}

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    navController: NavController,
    listOfRoute: List<NavItem>,
    currentIndex: Int,
    onClick: (String, Int) -> Unit
) {
    BottomNavigation(
        modifier = modifier,
        backgroundColor = MaterialTheme.colorScheme.surfaceContainer,
    ) {
        var currentDestination by remember { mutableStateOf(Destination.COURSE.name) }

        listOfRoute.forEachIndexed { index, route ->
            NavigationBarItem(
                selected = currentIndex == index,
                label = { Text(text = route.label, style = MaterialTheme.typography.titleSmall) },
                alwaysShowLabel = false,
                onClick = {
                    onClick(route.label, index)
                    currentDestination = route.route
                    navController.navigate(route = route.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Image(
                        painter = painterResource(id = route.imageVector),
                        contentDescription = route.label,
                        modifier = Modifier.size(24.dp),
                    )
                }
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TugasFrontEndTheme {
        Greeting("Android")
    }
}