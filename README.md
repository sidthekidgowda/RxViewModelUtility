# RxViewModelUtility

A library that provides the following classes you need to quickly start any Android project:

  BaseRxViewModel - is an abstract viewmodel that allows easy use and handling of RxJava
  
  RxSchedulers - is a kotlin utility class that allows you to handle thread scheduling
  
  SingleLiveEvent - is a LiveData that only emits once to a subscriber when onChanged is called.
  
  ViewModelFactory - is a factory integrated with Dagger that creates ViewModels with dependencies.
  
  ViewModelKey - is a multibinding dagger can use to add to the ViewModel map, which the ViewModelFactory needs to create that ViewModel 
  

To integrate RxViewModelUtility:

```
build.gradle - project level
allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
}

build.gradle - App level
dependencies {
  implementation 'com.github.sidthekidgowda:rxviewmodelutility:1.0'
}
```
