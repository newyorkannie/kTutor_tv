/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package example.ktutor;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Beginner",
            "Intermediate",
            "Advanced",
            "Professional",
            "Practice",
            "My Love From Another Star",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Home For Summer",
                "Good Doctor",
                "Descendants of the Sun",
                "The Gentlemen of Wolgyesu Tailor Shop",
                "Mother of Mine"
        };

        String description = "You last watched ep. 112, watch ep 113."
                + "Chatbot url: https://tinyurl.com/y2weov8m"
                + ""
                + ""
                + ""
                + "";
        String studio[] = {
                "kTutor and KBS", "kTutor and KBS", "kTutor and KBS", "kTutor and KBS", "kTutor and KBS"
        };
        String videoUrl[] = {
                "https://wvw.newasiantv.tv/watch/home-for-summer-episode-113-engsub.5749.120491.html",
                "https://www.youtube.com/watch?v=pbYdii8Cdac",
                "https://www.youtube.com/watch?v=Zzg7B_6c0lQ",
                "https://www.youtube.com/watch?v=0nDZMwWIECM",
                "https://www.youtube.com/playlist?list=PLsnpTOazyTkWC_jZBVSGdLfICuqRc2Bd-"
        };
        String bgImageUrl[] = {
                "https://mydramalist.com/33799-queen-s-children/episodes",
                "http://asianwiki.com/Good_Doctor",
                "https://en.wikipedia.org/wiki/Descendants_of_the_Sun",
                "https://en.wikipedia.org/wiki/The_Gentlemen_of_Wolgyesu_Tailor_Shop",
                "http://asianwiki.com/Mother_of_Mine",
        };
        String cardImageUrl[] = {
                "https://mydramalist.com/33799-queen-s-children/episodes",
                "http://asianwiki.com/Good_Doctor",
                "https://en.wikipedia.org/wiki/Descendants_of_the_Sun",
                "https://en.wikipedia.org/wiki/The_Gentlemen_of_Wolgyesu_Tailor_Shop",
                "http://asianwiki.com/Mother_of_Mine"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}