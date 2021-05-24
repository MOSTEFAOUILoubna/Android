package com.example.applicationtest;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Repository {

    PlatDao pd ;
    CategoriesDao cd;
    AlimentsDao ad;
    LiveData<List<Categories>> listcategories;
    LiveData<List<Aliments>> listaliments;

    //LiveData<List<Categories>> listcategorie;
    //LiveData<List<Aliments>> listaliment;




    public Repository(Application application) {

        DataBase bd = DataBase.getInstance(application);

        pd = bd.platDao();
        cd = bd.categoriesDao();
        ad = bd.alimentsDao();
        listcategories=cd.getAllCategories();
        listaliments=ad.getAllAliments();

        //  listcategorie=cd.getCategoriesById();
        // listaliment=ad.getAlimentsById();


    }

    // inserer plat , categorie , aliments

    public void insert (Plat plat){
        new InsererAsync(pd).execute(plat);

    }
    public void insert (Categories categories){
        new InsertAsync(cd).execute(categories);

    }
    public void insert (Aliments aliments){
        new  InsererrAsync(ad).execute(aliments);

    }


    // modifier plat,categorie, aliments

    public void update (Plat plat) {
        new UpdateeAsync(pd).execute(plat);

    }
    public void update (Categories categories) {
        new UpdateAsync(cd).execute(categories);
    }
    public void update (Aliments aliments) {
        new UpdateeeAsync(ad).execute(aliments);

    }

    // supprimer plat , categorie , aliments

    public void delete (Plat plat){
        new DelettAsync(pd).execute(plat);
    }
    public void delete (Categories categories){

        new DeleteAsync(cd).execute(categories);
    }
    public void delete (Aliments aliments){

        new DeletttAsync(ad).execute(aliments);
    }

    // selectionner


    public LiveData<List<Aliments>> getListaliments() {
        return listaliments;
    }

    public LiveData<List<Categories>> getListcategories() {
        return listcategories;
    }

    //// POUR INSERER


    private static class InsertAsync extends AsyncTask< Categories, Void, Void> {
        CategoriesDao cd;
        public InsertAsync(CategoriesDao cd) {
            this.cd = cd;
        }

        @Override
        protected Void doInBackground(Categories... categories) {
            cd.insert(categories[1]);
            return null;
        }
    }



    private static class InsererAsync extends AsyncTask<Plat, Void, Void> {
        PlatDao pd;
        public InsererAsync(PlatDao pd) {
            this.pd=pd;
        }

        @Override
        protected Void doInBackground(Plat... plats) {
            pd.insert(plats[0]);
            return null;
        }
    }

    private static class InsererrAsync extends AsyncTask<Aliments, Void, Void> {
        AlimentsDao ad;
        public InsererrAsync(AlimentsDao ad) {
            this.ad = ad;
        }

        @Override
        protected Void doInBackground(Aliments...aliments) {
            ad.insert(aliments[2]);
            return null;
        }
    }

    /// POUR MODIFIER


    private static class UpdateAsync extends AsyncTask< Categories, Void, Void> {
        CategoriesDao cd;
        public UpdateAsync(CategoriesDao cd) {
            this.cd = cd;
        }

        @Override
        protected Void doInBackground(Categories... categories) {
            cd.update(categories[1]);
            return null;
        }
    }



    private static class UpdateeAsync extends AsyncTask<Plat, Void, Void> {
        PlatDao pd;
        public UpdateeAsync(PlatDao pd) {
            this.pd=pd;
        }

        @Override
        protected Void doInBackground(Plat... plats) {
            pd.update(plats[0]);
            return null;
        }
    }

    private static class UpdateeeAsync extends AsyncTask<Aliments, Void, Void> {
        AlimentsDao ad;
        public UpdateeeAsync(AlimentsDao ad) {
            this.ad = ad;
        }

        @Override
        protected Void doInBackground(Aliments...aliments) {
            ad.update(aliments[2]);
            return null;
        }
    }


    // POUR SUPPRIMER

    private static class DeleteAsync extends AsyncTask< Categories, Void, Void> {
        CategoriesDao cd;
        public DeleteAsync(CategoriesDao cd) {
            this.cd = cd;
        }

        @Override
        protected Void doInBackground(Categories... categories) {
            cd.delete(categories[1]);
            return null;
        }
    }


    private static class DelettAsync extends AsyncTask<Plat, Void, Void> {
        PlatDao pd;
        public DelettAsync(PlatDao pd) {
            this.pd=pd;
        }

        @Override
        protected Void doInBackground(Plat... plats) {
            pd.delete(plats[0]);
            return null;
        }
    }

    private static class DeletttAsync extends AsyncTask<Aliments, Void, Void> {
        AlimentsDao ad;

        public DeletttAsync(AlimentsDao ad) {
            this.ad = ad;
        }

        @Override
        protected Void doInBackground(Aliments... aliments) {
            ad.delete(aliments[2]);
            return null;
        }
    }
}


