package com.example.jetpact1.reader

interface MovieReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}