# RxViewModelUtility

A library that provides the following classes you need to quickly start any Android project:

  #### BaseRxViewModel
  - is an abstract viewmodel that handles RxJava subscriptions.
  
  #### RxSchedulers 
  - is a kotlin utility class that allows upstream and downstream thread scheduling of Flowable, Single, Observable, and Completable classes.
  
  #### SingleLiveEvent 
  - is a LiveData that only emits once to a subscriber when onChanged is called.
  
  #### ViewModelFactory 
  - is a factory integrated with Dagger that is used to generate ViewModels via ViewModelProviders(ViewModelStoreOwner owner, Factory factory).
  
  #### ViewModelKey 
  - is a multibinding Dagger can use to add to the ViewModel map, which the ViewModelFactory needs to create that ViewModel. 
  

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
