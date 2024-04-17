package am.app.soundbox.ui.activity

import am.app.soundbox.R
import am.app.soundbox.databinding.ActivitySplashBinding
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.Transition
import androidx.transition.TransitionInflater

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    private lateinit var iconTran: Transition
    private lateinit var textTran: Transition

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        iconTran = TransitionInflater.from(this).inflateTransition(R.transition.splash_app_icon)
        iconTran.addTarget(binding.imageView)
    }


}