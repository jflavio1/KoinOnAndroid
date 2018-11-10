package com.jflavio1.koin.presentation.movies;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.jflavio1.koin.R;
import com.jflavio1.koin.utils.LoadState;

import static org.koin.java.standalone.KoinJavaComponent.*;

/**
 * @author Jose Flavio
 */
public class MoviesActivityJava extends AppCompatActivity {

    private MoviesViewModel vm = get(MoviesViewModel.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_java);
        vm.getMoviesLoadState().observe(this, new Observer<LoadState>() {
            @Override
            public void onChanged(@Nullable LoadState loadState) {

            }
        });
        vm.getMovieListByGenre("horror");
    }
}
