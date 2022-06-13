package ru.yandex.practicum.contacts.utils.model;

import ru.yandex.practicum.contacts.R;
import ru.yandex.practicum.contacts.model.ContactType;
import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactType;
import ru.yandex.practicum.contacts.utils.Constants;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContactTypeUtils {

    @DrawableRes
    public static int getIconRes(@NonNull String type) {
        switch (type) {
            case ContactType.TELEGRAM:
                return R.drawable.ic_type_telegram;
            case ContactType.WHATS_APP:
                return R.drawable.ic_type_whatsapp;
            case ContactType.VIBER:
                return R.drawable.ic_type_viber;
            case ContactType.SIGNAL:
                return R.drawable.ic_type_signal;
            case ContactType.THREEMA:
                return R.drawable.ic_type_threema;
            case ContactType.PHONE:
                return R.drawable.ic_type_phone;
            case ContactType.EMAIL:
                return R.drawable.ic_type_email;
            default:
                throw new IllegalArgumentException("Not supported type of ContactType");
        }
    }

    public static FilterContactType toFilterContactType(String type) {
        switch (type) {
            case ContactType.TELEGRAM:
                return FilterContactType.TELEGRAM;
            case ContactType.WHATS_APP:
                return FilterContactType.WHATS_APP;
            case ContactType.VIBER:
                return FilterContactType.VIBER;
            case ContactType.SIGNAL:
                return FilterContactType.SIGNAL;
            case ContactType.THREEMA:
                return FilterContactType.THREEMA;
            case ContactType.PHONE:
                return FilterContactType.PHONE;
            case ContactType.EMAIL:
                return FilterContactType.EMAIL;
            default:
                throw new IllegalArgumentException("Not supported ContactType");
        }
    }

    @Nullable
    public static String parse(String value) {
        switch (value) {
            case Constants.StorageType.TELEGRAM:
                return ContactType.TELEGRAM;
            case Constants.StorageType.WHATSAPP:
                return ContactType.WHATS_APP;
            case Constants.StorageType.VIBER:
                return ContactType.VIBER;
            case Constants.StorageType.SIGNAL:
                return ContactType.SIGNAL;
            case Constants.StorageType.THREEMA:
                return ContactType.THREEMA;
            default:
                return null;
        }
    }
}
