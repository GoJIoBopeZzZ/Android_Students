package com.innopolis.android.androidstudents.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.innopolis.android.androidstudents.R;

import Models.ContactType;
import Models.Contacts;

/**
 * Created by _red_ on 28.06.17.
 */

public class StudentDetailContactsAdapter extends RecyclerView.Adapter<StudentDetailContactsAdapter.ContactHolder> {

    private Contacts contacts;
    private ContactType[] contactTypes;

    public class ContactHolder extends RecyclerView.ViewHolder {

        private ImageView iconImage;
        private TextView contactTypeView;

        public ContactHolder(View itemView) {
            super(itemView);

            iconImage = (ImageView) itemView.findViewById(R.id.ivContactIcon);
            contactTypeView = (TextView) itemView.findViewById(R.id.tvContactType);
        }

        public void bindContact(ContactType contactType, String value) {
            iconImage.setImageResource(contactType.getImageIndex());
            contactTypeView.setText(value);
        }
    }

    public StudentDetailContactsAdapter(Contacts contacts) {
        this.contacts = contacts;
        contactTypes = contacts.getContactTypes();
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflated = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_contacts, parent, false);
        return new ContactHolder(inflated);
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        ContactType contactType = contactTypes[position];
        holder.bindContact(contactType, contacts.get(contactType).get(0));
    }

    @Override
    public int getItemCount() {
        return contacts.getCount();
    }
}
