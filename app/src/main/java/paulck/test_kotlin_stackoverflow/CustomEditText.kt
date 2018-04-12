package paulck.test_kotlin_stackoverflow

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.widget.EditText
import android.widget.Toast

/**
 * Created by paulck on 12/4/2018.
 */


class CustomEditText : EditText {

    private var mContext: Context? = null
    private var attributeSet: AttributeSet? = null

    constructor(context: Context) : super(context) {
        this.mContext = context
        initCustomEditText()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        this.mContext = context
        this.attributeSet = attrs
        initCustomEditText()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        this.mContext = context
        this.attributeSet = attrs
        initCustomEditText()
    }

    private fun initCustomEditText() {

        this.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }
            override fun afterTextChanged(arg0: Editable) {
                if(context is MainActivity){
                    Toast.makeText(mContext,"MainActivity",Toast.LENGTH_SHORT).show()
                }else if(context is MainActivity2){
                    Toast.makeText(mContext,"MainActivity2",Toast.LENGTH_SHORT).show()
                 //   (context as MainActivity2).tI_description_auxiliary_charges_info.isErrorEnabled=false
                }
                // ... other Activity
            }
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        })

    }

}