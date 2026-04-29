package ua.melnyk.application

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform