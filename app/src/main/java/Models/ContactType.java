package Models;

import com.innopolis.android.androidstudents.R;

/**
 * Created by _red_ on 08.06.17.
 */
public enum ContactType {
    ADDRESS(R.drawable.home),
    PHONE(R.drawable.phone),
    EMAIL(R.drawable.gmail),
    TELEGRAM(R.drawable.telegram),
    TWITTER(R.drawable.twitter),
    SKYPE(R.drawable.skype),
    VK(R.drawable.vkontakte),
    FACEBOOK(R.drawable.facebook),
    GOOGLE_PLUS(R.drawable.google);

    private int imageIndex;

    ContactType(int imageIndex) {
        this.imageIndex = imageIndex;
    }

    public int getImageIndex() {
        return imageIndex;
    }
}
