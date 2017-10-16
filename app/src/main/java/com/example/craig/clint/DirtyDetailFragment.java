package com.example.craig.clint;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DirtyDetailFragment extends Fragment {
    private long dirtyId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            dirtyId = savedInstanceState.getLong("dirtyId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_western_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Dirty dirty = Dirty.dirtys[(int) dirtyId];
            title.setText(dirty.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(dirty.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("dirtyId", dirtyId);
    }

    public void setDirty(long id) {
        this.dirtyId = id;
    }
}