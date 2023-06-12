package com.example.a10120214akbmyselfapp;

public class MediaModel {
        int image;
        String title;
        String penyanyi;

        public MediaModel(int image, String title, String penyanyi) {
            this.image = image;
            this.title = title;
            this.penyanyi = penyanyi;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPenyanyi() {
            return penyanyi;
        }

        public void setPenyanyi(String penyanyi) {
            this.penyanyi = penyanyi;
        }
    }
