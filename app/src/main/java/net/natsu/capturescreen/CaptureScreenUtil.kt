package net.natsu.capturescreen

import android.graphics.Bitmap
import android.view.View
import androidx.core.graphics.applyCanvas

fun View.customDrawToBitmap(config: Bitmap.Config = Bitmap.Config.ARGB_8888): Bitmap {
    measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
    return Bitmap.createBitmap(measuredWidth, measuredHeight, config).applyCanvas {
        layout(0, 0, width, height)
        translate(-scrollX.toFloat(), -scrollY.toFloat())
        draw(this)
    }
}