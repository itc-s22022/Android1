package ja.ac.it_college.std.s22022.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import ja.ac.it_college.std.s22022.intentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lvMenu.apply {
            // アダプターとデータをリセット
            adapter = MenuListAdapter(menuList)

            // RecyclerView の表示に関する設定
            LinearLayoutManager(this@MainActivity).let {
                // 直線的(垂直方向)に並べる
                layoutManager = it
                // 区切り線を並べる方向に合わせて表示する
                addItemDecoration(DividerItemDecoration(this@MainActivity, it.orientation))
            }

        }

    }
}