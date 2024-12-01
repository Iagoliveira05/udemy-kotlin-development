package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)


val libraries = listOf<Lib>(
    Lib(R.drawable.outline_music_note_24, "Playlist"),
    Lib(R.drawable.baseline_person_search_24, "Artists"),
    Lib(R.drawable.baseline_album_24, "Album"),
    Lib(R.drawable.outline_library_music_24, "Songs"),
    Lib(R.drawable.baseline_recent_actors_24, "Genre")

)