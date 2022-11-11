package com.example.helptotalk

import android.media.MediaPlayer
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.helptotalk.R.drawable
import com.example.helptotalk.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var binding: ActivityMainBinding? = null

    private var tts : TextToSpeech? = null

    private var speechText : String = ""

    var onOrOff = false

    var selected1 = false
    var selected2 = false
    var selected3 = false
    var selected4 = false
    var selected5 = false
    var selected6 = false
    var selected7 = false
    var selected8 = false
    var selected9 = false
    var selected10 = false
    var selected11 = false
    var selected12 = false
    var selected13 = false
    var selected14 = false
    var selected15 = false
    var selected16 = false
    var selected17 = false
    var selected18 = false
    var selected19 = false
    var selected20 = false
    var selected21 = false
    var selected22 = false
    var selected23 = false
    var selected24 = false
    var selected25 = false
    var selected26 = false
    var selected27 = false
    var selected28 = false
    var selected29 = false
    var selected30 = false
    var selected31 = false
    var selected32 = false
    var selected33 = false
    var selected34 = false
    var selected35 = false
    var selected36 = false
    var selected37 = false
    var selected38 = false
    var selected39 = false
    var selected40 = false

    private var mSelectedImagePositionInteger = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        tts = TextToSpeech(this, this)

        binding?.result1?.visibility = View.INVISIBLE
        binding?.result2?.visibility = View.INVISIBLE
        binding?.result3?.visibility = View.INVISIBLE

        binding?.alarm!!.setOnClickListener {
            if (onOrOff == false){
                playAlarm()
            } else if (onOrOff == true){
                stopAlarm()
            }
        }

        binding?.textToSpeech?.setOnClickListener {
            if (speechText.isNotEmpty()){
                speakOut(speechText)
            }
        }

        binding?.resetBtn?.setOnClickListener {
            defaultImageView()
        }

        binding?.cold!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                    if(selected1 == false) {
                         selected1 = true
                        it.background =
                            ContextCompat.getDrawable(this, drawable.selected_option_border)
                        speechText += "It is cold in here "
                        when (mSelectedImagePositionInteger) {
                                0 -> {binding?.result1?.setImageResource(R.drawable.cold)
                                binding?.result1?.visibility = View.VISIBLE}
                                1 -> {binding?.result2?.setImageResource(R.drawable.cold)
                                binding?.result2?.visibility = View.VISIBLE}
                                2 -> {binding?.result3?.setImageResource(R.drawable.cold)
                                binding?.result3?.visibility = View.VISIBLE}
                        }
                        mSelectedImagePositionInteger++
                    }
            }
        }

        binding?.hot!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected2 == false) {
                    selected2 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "It is hot in here "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.hot_face)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.hot_face)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.hot_face)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.pls!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected3 == false) {
                    selected3 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.pls)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.pls)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.pls)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                    speechText += "please "
                }
            }
        }

        binding?.salt!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected4 == false) {
                    selected4 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "salt "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.salt)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.salt)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.salt)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.throwUp!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected5 == false) {
                    selected5 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I feel like throwing up "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.vomiting)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.vomiting)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.vomiting)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.brushTeeth!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected6 == false) {
                    selected6 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I need to brush my teeth "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.toothbrush)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.toothbrush)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.toothbrush)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.thumsUp!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected7 == false) {
                    selected7 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Fine "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.thums_up)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.thums_up)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.thums_up)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.fever!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected8 == false) {
                    selected8 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I have a fever "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.thermometer_face)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.thermometer_face)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.thermometer_face)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.sleepy!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected9 == false) {
                    selected9 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I want to sleep "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.sleepy)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.sleepy)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.sleepy)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.turnOn!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected10 == false) {
                    selected10 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Turn on "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.ic_on)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.ic_on)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.ic_on)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.turnOff!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected11 == false) {
                    selected11 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Turn off "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.ic_off)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.ic_off)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.ic_off)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.toilet!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected12 == false) {
                    selected12 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I need to go to the bathroom "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.toilet)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.toilet)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.toilet)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.television!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected13 == false) {
                    selected13 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Television "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.television)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.television)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.television)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.stomachache!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected14 == false) {
                    selected14 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Stomach ache "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.stomacheache)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.stomacheache)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.stomacheache)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.shower!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected15 == false) {
                    selected15 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I need to take a shower "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.shower)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.shower)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.shower)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.ok!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected16 == false) {
                    selected16 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Ok "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.ok)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.ok)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.ok)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.nose!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected17 == false) {
                    selected17 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Nose "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.nose)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.nose)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.nose)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.lungs!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected18 == false) {
                    selected18 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Lungs "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.lungs)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.lungs)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.lungs)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.hearth!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected19 == false) {
                    selected19 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Hearth "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.hearth)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.hearth)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.hearth)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.headache!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected20 == false) {
                    selected20 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Headache "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.headache)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.headache)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.headache)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.goodbye!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected21 == false) {
                    selected21 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Goodbye "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.goodbye)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.goodbye)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.goodbye)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.flu!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected22 == false) {
                    selected22 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Flu "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.flu)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.flu)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.flu)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.eye!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected23 == false) {
                    selected23 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Eye "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.eye)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.eye)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.eye)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.ear!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected24 == false) {
                    selected24 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Ear "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.ear)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.ear)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.ear)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.angry!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected25 == false) {
                    selected25 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "I am angry "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.angry)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.angry)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.angry)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.tooth!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected26 == false) {
                    selected26 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Tooth ache "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.tooth)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.tooth)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.tooth)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.apple!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected27 == false) {
                    selected27 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Apple "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.apple)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.apple)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.apple)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.bacon!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected28 == false) {
                    selected28 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Bacon "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.bacon)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.bacon)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.bacon)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.banana!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected29 == false) {
                    selected29 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Banana "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.banana)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.banana)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.banana)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.candy!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected30 == false) {
                    selected30 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Candy "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.candy)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.candy)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.candy)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.chicken!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected31 == false) {
                    selected31 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Chicken "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.chicken)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.chicken)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.chicken)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.choclate!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected32 == false) {
                    selected32 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Chocolate "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.choclate)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.choclate)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.choclate)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.egg!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected33 == false) {
                    selected33 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Egg "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.egg)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.egg)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.egg)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.lemon!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected34 == false) {
                    selected34 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Lemon "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.lemon)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.lemon)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.lemon)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.light!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected35 == false) {
                    selected35 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Light "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.light)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.light)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.light)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.meat!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected36 == false) {
                    selected36 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Meat "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.meat)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.meat)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.meat)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.sandwich!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected37 == false) {
                    selected37 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Sandwich "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.sandwich)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.sandwich)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.sandwich)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.starwbeery!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected38 == false) {
                    selected38 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Strawberry "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.strawbeerry)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.strawbeerry)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.strawbeerry)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.watermelon!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected39 == false) {
                    selected39 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Watermelon "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.watermelon)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.watermelon)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.watermelon)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

        binding?.music!!.setOnClickListener {
            if (mSelectedImagePositionInteger < 3){
                if (selected40 == false) {
                    selected40 = true
                    it.background = ContextCompat.getDrawable(this, drawable.selected_option_border)
                    speechText += "Music "
                    when (mSelectedImagePositionInteger) {
                        0 -> {binding?.result1?.setImageResource(R.drawable.music)
                            binding?.result1?.visibility = View.VISIBLE}
                        1 -> {binding?.result2?.setImageResource(R.drawable.music)
                            binding?.result2?.visibility = View.VISIBLE}
                        2 -> {binding?.result3?.setImageResource(R.drawable.music)
                            binding?.result3?.visibility = View.VISIBLE}
                    }
                    mSelectedImagePositionInteger++
                }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        if (tts != null){
            tts?.stop()
            tts?.shutdown()
        }

        binding = null
    }

    private var mediaPlayer: MediaPlayer? = null

    private fun playAlarm(){
        if (mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(this, R.raw.alarm_new)
            mediaPlayer!!.isLooping = true
            mediaPlayer!!.start()
            onOrOff = true

            binding?.alarm?.setImageResource(drawable.ic_alarm_off)
        }
    }

    private fun stopAlarm(){
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
        onOrOff = false

        binding?.alarm?.setImageResource(drawable.ic_alarm_on)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS){
            val result = tts!!.setLanguage(Locale("pt","b","S"))

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                Log.e("TTS", "The .language specified is not supported")
            }else {
                Log.e("TTS", "Initialization failed")
            }
        }
    }

    private fun speakOut(text: String){
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
    }

      private fun defaultImageView(){
          val images = ArrayList<FrameLayout>()

        mSelectedImagePositionInteger = 0

            speechText = ""

        binding?.cold?.let {
            images.add(0,it)
        }
        binding?.hot?.let {
            images.add(1,it)
        }
        binding?.salt?.let {
            images.add(2,it)
        }
        binding?.pls?.let {
            images.add(3,it)
        }
          binding?.throwUp?.let {
              images.add(4,it)
          }
          binding?.brushTeeth?.let {
              images.add(5,it)
          }
          binding?.thumsUp?.let {
              images.add(6,it)
          }
          binding?.fever?.let {
              images.add(7,it)
          }
          binding?.sleepy?.let {
              images.add(8,it)
          }
          binding?.turnOn?.let {
              images.add(9,it)
          }
          binding?.turnOff?.let {
              images.add(10,it)
          }
          binding?.toilet?.let {
              images.add(11,it)
          }
          binding?.television?.let {
              images.add(12,it)
          }
          binding?.stomachache?.let {
              images.add(13,it)
          }
          binding?.shower?.let {
              images.add(14,it)
          }
          binding?.ok?.let {
              images.add(15,it)
          }
          binding?.nose?.let {
              images.add(16,it)
          }
          binding?.lungs?.let {
              images.add(17,it)
          }
          binding?.hearth?.let {
              images.add(18,it)
          }
          binding?.headache?.let {
              images.add(19,it)
          }
          binding?.goodbye?.let {
              images.add(20,it)
          }
          binding?.flu?.let {
              images.add(21,it)
          }
          binding?.eye?.let {
              images.add(22,it)
          }
          binding?.ear?.let {
              images.add(23,it)
          }
          binding?.angry?.let {
              images.add(24,it)
          }
          binding?.tooth?.let {
              images.add(25,it)
          }
          binding?.apple?.let {
              images.add(26,it)
          }
          binding?.bacon?.let {
              images.add(27,it)
          }
          binding?.banana?.let {
              images.add(28,it)
          }
          binding?.candy?.let {
              images.add(29,it)
          }
          binding?.chicken?.let {
              images.add(30,it)
          }
          binding?.choclate?.let {
              images.add(31,it)
          }
          binding?.egg?.let {
              images.add(32,it)
          }
          binding?.lemon?.let {
              images.add(33,it)
          }
          binding?.light?.let {
              images.add(34,it)
          }
          binding?.meat?.let {
              images.add(35,it)
          }
          binding?.sandwich?.let {
              images.add(36,it)
          }
          binding?.starwbeery?.let {
              images.add(37,it)
          }
          binding?.watermelon?.let {
              images.add(38,it)
          }
          binding?.music?.let {
              images.add(39,it)
          }

        for (image in images){
            image.background = ContextCompat.getDrawable(this,
            drawable.image_borders_not_selected)
        }

          binding?.result1?.visibility = View.INVISIBLE
          binding?.result2?.visibility = View.INVISIBLE
          binding?.result3?.visibility = View.INVISIBLE

          selected1 = false
          selected2 = false
          selected3 = false
          selected4 = false
          selected5 = false
          selected6 = false
          selected7 = false
          selected8 = false
          selected9 = false
          selected10 = false
          selected11 = false
          selected12 = false
          selected13 = false
          selected14 = false
          selected15 = false
          selected16 = false
          selected17 = false
          selected18 = false
          selected19 = false
          selected20 = false
          selected21 = false
          selected22 = false
          selected23 = false
          selected24 = false
          selected25 = false
          selected26 = false
          selected27 = false
          selected28 = false
          selected29 = false
          selected30 = false
          selected31 = false
          selected32 = false
          selected33 = false
          selected34 = false
          selected35 = false
          selected36 = false
          selected37 = false
          selected38 = false
          selected39 = false
          selected40 = false

      }
}