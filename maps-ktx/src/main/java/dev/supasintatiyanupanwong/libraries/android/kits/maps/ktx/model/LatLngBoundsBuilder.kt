package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.LatLng
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.LatLngBounds

fun LatLngBoundsBuilder(): LatLngBounds.Builder = MapKit.newLatLngBoundsBuilder()
