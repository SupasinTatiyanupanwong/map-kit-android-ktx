@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.LatLng
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.LatLngBounds

inline fun LatLngBounds(southwest: LatLng, northeast: LatLng): LatLngBounds {
    return MapKit.newLatLngBounds(southwest, northeast)
}

inline fun LatLngBounds(actions: LatLngBounds.Builder.() -> Unit): LatLngBounds {
    return MapKit.newLatLngBoundsBuilder().apply(actions).build()
}
