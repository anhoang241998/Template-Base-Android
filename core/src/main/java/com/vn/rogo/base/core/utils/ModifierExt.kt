package com.vn.rogo.base.core.utils

//import androidx.compose.ui.Modifier
//import androidx.compose.ui.composed
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.LocalDensity
//import androidx.compose.ui.unit.dp
//import com.devcomentry.photogallery.presention.utils.Dimensions.DimensionComparator
//
//fun Modifier.mediaQuery(
//    comparator: DimensionComparator,
//    modifier: Modifier
//): Modifier = composed {
//    val screenWidth = LocalContext.current.resources.displayMetrics.widthPixels.dp /
//            LocalDensity.current.density
//    val screenHeight = LocalContext.current.resources.displayMetrics.heightPixels.dp /
//            LocalDensity.current.density
//    if (comparator.compare(screenWidth, screenHeight)) {
//        this.then(modifier)
//    } else {
//        this
//    }
//}