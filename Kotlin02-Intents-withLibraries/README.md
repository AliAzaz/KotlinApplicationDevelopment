  ## Kotlin02 - Intents with Library
 <br>
  Say goodbye to 'findViewById' by using Kotlin Android Extension. and now throw out the tutorials we will use this extension.
 <br>
 ## Setup Library
 For Extension installation, Add this Line <br>
     <article>
        <strong>apply plugin: 'kotlin-android-extensions'</strong>
     </article>
 in App build.gradle file on the top like:
     <article>
         <strong>apply plugin: 'com.android.application'</strong><br>
         <strong>apply plugin: 'kotlin-android'</strong><br>
         <strong>apply plugin: 'kotlin-android-extensions'</strong>
      </article>
 <br>
 ## Working
 For example we have this xml:<br>
     <article>
         <android.support.constraint.ConstraintLayout
             android:layout_width="match_parent"
             android:layout_height="match_parent">

             <EditText
                 android:id="@+id/edit_data"
                 android:layout_width="248dp"
                 android:layout_height="66dp"
                 android:inputType="textPersonName"
                 android:text="Data" />

             <Button
                 android:id="@+id/btn_next"
                 android:layout_width="248dp"
                 android:layout_height="89dp"/>
         </android.support.constraint.ConstraintLayout>
     </article>

  Now our code is like: <br>
  <article>
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            /* btn_next is already casted to a proper type of "Button"
             instead of being a "View"*/

            btn_next.text = "Next Activity"

            btn_next.setOnClickListener { view ->
                if (!edit_data.text.isEmpty()) {
                    Toast.makeText(view.context, edit_data.text, Toast.LENGTH_SHORT).show()
                    finish()
                    nextActivity(view.context, edit_data.text)
                }
            }
        }
  </article>

 ## Contributors

 Contributer: Ali Azaz Alam <ali.azaz.alam@hotmail.com>
