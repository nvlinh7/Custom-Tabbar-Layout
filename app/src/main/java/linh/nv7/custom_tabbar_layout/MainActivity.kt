package linh.nv7.custom_tabbar_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager
import linh.nv7.custom_tabbar_layout.adapter.PagerViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var mViewPager: ViewPager
    private lateinit var homeBtn: ImageButton
    private lateinit var searchBtn: ImageButton
    private lateinit var addBtn: ImageButton
    private lateinit var notificationBtn: ImageButton
    private lateinit var profileBtn: ImageButton
    private lateinit var mPageAdapter: PagerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init views
        mViewPager = findViewById(R.id.mViewPager)

        //init image buttons
        homeBtn = findViewById(R.id.homeBtn)
        searchBtn = findViewById(R.id.searchBtn)
        addBtn = findViewById(R.id.addBtn)
        notificationBtn = findViewById(R.id.notiBtn)
        profileBtn = findViewById(R.id.profileBtn)

        mPageAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPageAdapter
        mViewPager.offscreenPageLimit = 5

        //onclick listner
        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }

        searchBtn.setOnClickListener {

            mViewPager.currentItem = 1

        }

        addBtn.setOnClickListener {
            mViewPager.currentItem = 2

        }

        notificationBtn.setOnClickListener {
            mViewPager.currentItem = 3

        }

        profileBtn.setOnClickListener {
            mViewPager.currentItem = 4

        }
        // add page change listener
        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                changingTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })

        // default
        mViewPager.currentItem = 0
        homeBtn.setImageResource(R.drawable.ic_home_pink)
    }

    private fun changingTabs(position: Int) {
        when (position) {
            0 -> {
                homeBtn.setImageResource(R.drawable.ic_home_pink)
                searchBtn.setImageResource(R.drawable.ic_search_black)
                addBtn.setImageResource(R.drawable.ic_add_black)
                notificationBtn.setImageResource(R.drawable.ic_notifications_black)
                profileBtn.setImageResource(R.drawable.ic_person_black)
            }

            1 -> {
                homeBtn.setImageResource(R.drawable.ic_home_black)
                searchBtn.setImageResource(R.drawable.ic_search_pink)
                addBtn.setImageResource(R.drawable.ic_add_black)
                notificationBtn.setImageResource(R.drawable.ic_notifications_black)
                profileBtn.setImageResource(R.drawable.ic_person_black)
            }

            2 -> {
                homeBtn.setImageResource(R.drawable.ic_home_black)
                searchBtn.setImageResource(R.drawable.ic_search_black)
                addBtn.setImageResource(R.drawable.ic_add_pink)
                notificationBtn.setImageResource(R.drawable.ic_notifications_black)
                profileBtn.setImageResource(R.drawable.ic_person_black)
            }

            3 -> {
                homeBtn.setImageResource(R.drawable.ic_home_black)
                searchBtn.setImageResource(R.drawable.ic_search_black)
                addBtn.setImageResource(R.drawable.ic_add_black)
                notificationBtn.setImageResource(R.drawable.ic_notifications_pink)
                profileBtn.setImageResource(R.drawable.ic_person_black)
            }

            4 -> {
                homeBtn.setImageResource(R.drawable.ic_home_black)
                searchBtn.setImageResource(R.drawable.ic_search_black)
                addBtn.setImageResource(R.drawable.ic_add_black)
                notificationBtn.setImageResource(R.drawable.ic_notifications_black)
                profileBtn.setImageResource(R.drawable.ic_person_pink)
            }

        }
    }
}