package di

import org.koin.core.context.startKoin

fun initializeKoin() {
    startKoin {
        modules(mongoModule)
    }
}