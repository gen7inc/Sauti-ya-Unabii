package com.nash.sautiyaunabii;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements LessonsListFragment.Listener, QuestionsListFragment.Listener {
    private ShareActionProvider shareActionProvider; //providing the sharing capabilities.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //override the method to the top bar menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the app bar
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // for the ShareActionProvider
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Hello!\nTafadhali pakua app hii ya Sauti ya Unabii\nLink ni https://googleappstore.com");

        //attach the SectionsPagerAdapter to the ViewPager
        SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(pagerAdapter); //this attaches the FragmentPagerAdapter to the ViewPager

        //attach the view (int)pager to the tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

        return super.onCreateOptionsMenu(menu);
    }

    //we create the setShareActionIntent
    //it creates the intent and passes it to the shareActionProvider using its setShareIntent method
    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    //when an item is selected, where should user be taken?
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_share:
                setShareActionIntent("Thanks for sharing!!"); //but this is already handled
                return true; // returning true tells Android we've dealt with the item being clicked

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    //this method starts the detail activity for the lessons fragment
    //it listens for an item clicked in the lessonsListFragment.
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, LessonsDetailsActivity.class);
        intent.putExtra(LessonsDetailsActivity.EXTRA_LESSON_ID, (int) id);
        startActivity(intent);

    }

    //this method starts the detail activity for the questions fragment
    //it listens for an item clicked in the questionsListFragment.
    @Override
    public void onItemClicked(long id) {
        Intent intent = new Intent(this, QuestionsDetailsActivity.class);
        intent.putExtra(QuestionsDetailsActivity.EXTRA_QUESTION_ID, (int) id);
        startActivity(intent);
    }

    //the pager below
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 3; //make 3 pages
        }

        @Override
        public Fragment getItem(int position) {
            //since getCount has said only 3 pages are needed
            //then, the getItem requests the pages for each position to be displayed
            switch (position) {
                case 0:
                    return new HomeFragment();
                case 1:
                    return new LessonsListFragment();
                case 2:
                    return new QuestionsListFragment();
            }
            return null;
        }

        //this method wil get the text displayed in the tab layout
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getResources().getText(R.string.home);
                case 1:
                    return getResources().getText(R.string.lessons);
                case 2:
                    return getResources().getText(R.string.questions);
            }
            return null;
        }
    }

}