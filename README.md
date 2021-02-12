# tflite-android-app
Modified TFLite Android App for Thesis's purposes at my campus HTW Berlin 

DISCLAIMER: This repository is very similar to the repository TheAIGuysCode: [tensorflow-yolov4-tflite/android](https://github.com/theAIGuysCode/tensorflow-yolov4-tflite/tree/master/android). I created this repository to add a new feature to be implemented with my custom YOLOv4-tiny model, and they may worsen the overal speed of the application and make it not optimized in respect to time complexity.

The classes of the custom model are: Human Hand, Human Head and Box.
The model name is yolov4-tiny3l-416-opt.tflite on app\src\main\assets folder.

The app has 5 clickable buttons. Two buttons on the left side are to make the prediction of the showed image, the other two on the right side are for make live mode prediction with rear phone camera. To make prediction of “human hand”, “human head” and “box”, the buttons “3 Classes” can be clicked, otherwise the tiny version of pre-trained detection model can be picked to make inference of 80 available classes.

### The Looks of the App
Check out how the App looks like.
<p align="center"><img src="android/screenshots/TFL Detect.jpg" width="416"\></p>
