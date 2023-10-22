package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapFragment
import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.MapClient
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * A suspending function that provides an instance of a [MapClient] from this [MapFragment].
 * This is an alternative to [MapFragment.getMapAsync] by using coroutines to obtain a [MapClient].
 *
 * @return the [MapClient] instance associated with this [MapFragment].
 */
suspend inline fun MapFragment.awaitMap(): MapClient =
    suspendCancellableCoroutine { continuation ->
        getMapAsync(MapKit.OnMapReadyCallback { continuation.resume(it) })
    }

/**
 * A suspending function that provides an instance of a [MapClient] from this [MapFragment].
 * This is an alternative to [MapFragment.getMapAsync] by using coroutines to obtain a [MapClient].
 *
 * @return the [MapClient] instance associated with this [MapFragment].
 */
suspend inline fun MapFragment.awaitMapAndView(): MapClient =
    suspendCancellableCoroutine { continuation ->
        getMapAsync(MapKit.OnMapAndViewReadyCallback { continuation.resume(it) })
    }
