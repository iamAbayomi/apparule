package io.cuesoft.apparule.views.designer;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.cuesoft.apparule.R;
import io.cuesoft.apparule.model.DesignerCatalogueRecyclerModel;


public class MenFragment extends CatalogueBaseFragment {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_men, container, false);
        mRecyclerView =view.findViewById(R.id.recyclerView_Men);
        initilaizeView();
        initilaizeData();
        return view;
    }

    @Override
    public void initilaizeData() {
        // super.initilaizeData();
        TypedArray imageResources =
                getResources().obtainTypedArray(R.array.men);
        for(int i =0; i<imageResources.length(); i++){
            mCatalogueData.add(new DesignerCatalogueRecyclerModel("Versache Bags",
                    "Designed with love from Nikkita Coure", "2 HOURS AGO",
                    "#61,000", imageResources.getResourceId(i,0)));
        }
        imageResources.recycle();
        mAdapter.notifyDataSetChanged();


    }

}
