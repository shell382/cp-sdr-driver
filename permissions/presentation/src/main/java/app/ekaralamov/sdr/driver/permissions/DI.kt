package app.ekaralamov.sdr.driver.permissions

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_PresentationModule::class])
object PresentationModule
