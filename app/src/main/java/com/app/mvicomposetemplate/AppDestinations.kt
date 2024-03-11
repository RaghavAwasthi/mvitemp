package com.app.mvicomposetemplate

import com.app.base.Destination

open class AppDestinations: Destination() {
    object Home: AppDestinations()
    object Memory: AppDestinations()
}