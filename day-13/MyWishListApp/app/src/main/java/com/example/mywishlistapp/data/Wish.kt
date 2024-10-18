package com.example.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An Android Watch"),
        Wish(title = "Oculus", description = "A VR headset for listening music"),
        Wish(title = "Book", description = "A book for reading"),
        Wish(title = "TV", description = "A TV for to see series"),
    )
}
