package ru.yandex.practicum.contacts.presentation.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;
import ru.yandex.practicum.contacts.model.MergedContact;
import ru.yandex.practicum.contacts.presentation.sort.model.SortType;

import androidx.annotation.NonNull;

public class MainState {

    private final SortType defaultSortType = SortType.BY_NAME;
    private final Set<String> defaultContactTypes = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(ContactType.getContactTypes())));

    private List<MergedContact> allContacts = Collections.emptyList();
    private SortType sortType = defaultSortType;
    private Set<String> contactTypes = new HashSet<>(defaultContactTypes);
    private String query = "";

    @NonNull
    public List<MergedContact> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(@NonNull List<MergedContact> allContacts) {
        this.allContacts = allContacts;
    }

    @NonNull
    public SortType getDefaultSortType() {
        return defaultSortType;
    }

    @NonNull
    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(@NonNull SortType sortType) {
        this.sortType = sortType;
    }

    @NonNull
    public Set<String> getDefaultContactTypes() {
        return defaultContactTypes;
    }

    @NonNull
    public Set<String> getContactTypes() {
        return contactTypes;
    }

    public void setContactTypes(@NonNull Set<String> contactTypes) {
        this.contactTypes = contactTypes;
    }

    @NonNull
    public String getQuery() {
        return query;
    }

    public void setQuery(@NonNull String query) {
        this.query = query;
    }
}
