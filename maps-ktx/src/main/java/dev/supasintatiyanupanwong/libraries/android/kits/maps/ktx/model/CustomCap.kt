@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.BitmapDescriptor
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.CustomCap

inline fun CustomCap(bitmapDescriptor: BitmapDescriptor): CustomCap = MapKit.newCustomCap(bitmapDescriptor)

inline fun CustomCap(bitmapDescriptor: BitmapDescriptor, refWidth: Float): CustomCap = MapKit.newCustomCap(bitmapDescriptor, refWidth)
