package com.cis3515.dogs;

import android.content.Context;

import java.util.ArrayList;

public class DogsContent {
    private ArrayList<DogImageDescription> dogsDescription = new ArrayList<>();
    private String[] dogs_description_arr;

    public DogsContent(Context context) {
        dogs_description_arr = context.getResources().getStringArray(R.array.dogs_description_arr);
        addDog(R.drawable.bernese_mountain_dog);
        addDog(R.drawable.chinook);
        addDog(R.drawable.hovawart);
        addDog(R.drawable.pitbull_terrier);
        addDog(R.drawable.samoyed);
        addDog(R.drawable.airedale_terrier);
        addDog(R.drawable.afghan_hound);
        addDog(R.drawable.alaskan_malamute);
        addDog(R.drawable.american_staffordshire_terrier);
        addDog(R.drawable.australian_shepherd);
        addDog(R.drawable.basset_hound);
        addDog(R.drawable.belgian_malinois);
        addDog(R.drawable.belgian_sheepdog);
        addDog(R.drawable.belgian_tervuren);
        addDog(R.drawable.boxer);
        addDog(R.drawable.borzoi);
        addDog(R.drawable.bull_terrier);
    }

    private void addDog(int image) {
        dogsDescription.add(new DogImageDescription(image, dogs_description_arr[dogsDescription.size()]));
    }

    public int getSize() {
        return dogsDescription.size();
    }

    public int getResourceId(int dogPosition) {
        return dogsDescription.get(dogPosition).getResourceId();
    }

    public String getDescription(int dogPosition) {
        return dogsDescription.get(dogPosition).getDescription();
    }

    public ArrayList<String> getDescriptionList() {
        ArrayList<String> descriptions = new ArrayList<>();
        for(DogImageDescription id: dogsDescription) {
            descriptions.add(id.getDescription());
        }
        return descriptions;
    }
}
