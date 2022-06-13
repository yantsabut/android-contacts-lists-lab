package ru.yandex.practicum.contacts.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import ru.yandex.practicum.contacts.utils.model.ContactTypeUtils;

import androidx.annotation.NonNull;

public class ContactTypeImageView extends StackImageView<String> {

    public ContactTypeImageView(Context context) {
        super(context);
    }

    public ContactTypeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ContactTypeImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ContactTypeImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void loadItem(String item, @NonNull ImageView icon) {
        int iconRes = ContactTypeUtils.getIconRes(item);
        icon.setImageResource(iconRes);
    }
}
