@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.GroundOverlay

@Suppress("FunctionName")
inline fun GroundOverlayOptions(): GroundOverlay.Options = MapKit.newGroundOverlayOptions()
