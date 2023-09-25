@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.LatLng

inline fun LatLng(latitude: Double, longitude: Double): LatLng = MapKit.newLatLng(latitude, longitude)

/**
 * Returns the [LatLng.latitude][LatLng.getLatitude] of this [LatLng].
 *
 * e.g.
 * ```
 * val (lat, _) = latLng
 * ```
 */
inline operator fun LatLng.component1(): Double = this.latitude

/**
 * Returns the [LatLng.longitude][LatLng.getLongitude] of this [LatLng].
 *
 * e.g.
 * ```
 * val (_, lng) = latLng
 * ```
 */
inline operator fun LatLng.component2(): Double = this.longitude
