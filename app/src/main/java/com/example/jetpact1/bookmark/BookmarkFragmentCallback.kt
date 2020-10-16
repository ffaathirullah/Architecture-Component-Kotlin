package com.example.jetpact1.bookmark

import com.example.jetpact1.data.MovieEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: MovieEntity)
}
