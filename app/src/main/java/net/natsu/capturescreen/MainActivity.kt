package net.natsu.capturescreen

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.view.drawToBitmap
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initInstance()
    }

    private fun initInstance() {
        btnCaptureScreen.setOnClickListener {
//            captureScreen(rootLayout)
//            captureScreen(createAwesomeView())
        }
    }

    private fun createAwesomeView(): View {
        val newLayout = RelativeLayout(this).apply {
            layoutParams = RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            )
            setBackgroundColor(Color.BLACK)
        }

        val imageAppIcon = ImageView(this).apply {
            layoutParams = RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            )
            (layoutParams as RelativeLayout.LayoutParams).addRule(RelativeLayout.CENTER_IN_PARENT)
            setImageResource(R.drawable.ic_launcher_foreground)
        }
        newLayout.addView(imageAppIcon)

        return newLayout
    }

    private fun captureScreen(view: View) {
        /** for view in xml **/
//        val screen = view.drawToBitmap()

        /** for view in create programmatically **/
//        val screen = view.customDrawToBitmap()
    }

}
