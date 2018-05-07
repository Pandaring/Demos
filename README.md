# BaseDemo

> 用于新建项目时使用的基础应用架构.

# 第一章 构建记录

# 1. 网络络框架构建

## 1.1 init Project

> 新建EmptyActivity构成的初始化项目.

## 1.2 添加网络框架的依赖

1. 添加获取网络状态的权限

```xml
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
```

2. 添加网络框架的相关依赖

```groovy

    // 网络请求
    implementation 'com.google.code.gson:gson:2.8.1'

    implementation('com.squareup.retrofit2:retrofit:2.1.0') {
        exclude module: 'com.squareup.okhttp3:okhttp:3.4.1'
        exclude module: 'com.squareup.okio:okio:1.9.0'
    }
    implementation 'com.squareup.okhttp3:okhttp:3.9.0'
    implementation 'com.squareup.okio:okio:1.14.0'

    implementation 'com.squareup.retrofit2:converter-gson:2.3.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:3.9.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava:2.3.0

```


## 1.3 新建网络框架分包`http`

在`http`文件夹下,保存这些类:

```bash
.
├── BuildFactory.java
├── CheckNetwork.java
├── HttpHead.java
├── HttpUtils.java
├── IpmlTokenGetListener.java
├── NullOnEmptyConverterFactory.java
└── ParamNames.java

```

## 1.4 完成网络框架的构建


# 2. 可以下拉刷新上拉加载并自定义Header&Footer的RecyclerView

## 2.1 定义常用依赖的版本号.

在`project`级别的`build.gradle`文件里添加以下代码:

```groove

// Define versions in a single place
ext {
    // Support library and architecture components support minSdk 19 and above.
    minSdkVersion = 19
    targetSdkVersion = 26
    compileSdkVersion = 26
    buildToolsVersion = '26.0.2'

    // App dependencies
    supportLibraryVersion = '27.0.2'
    junitVersion = '4.12'
    roomVersion = "1.0.0"
}

```

## 2.1 添加`RecyclerView`依赖

```groove
    compile "com.android.support:appcompat-v7:$rootProject.supportLibraryVersion"
    compile "com.android.support:recyclerview-v7:$rootProject.supportLibraryVersion"
```

## 2.2 添加`view/xrecyclerview`分包

添加以下类:

```bash
├── BaseRefreshHeader.java
├── LoadingMoreFooter.java
├── WrapAdapter.java
├── XRecyclerView.java
└── YunRefreshHeader.java
```

## 2.3 添加资源文件

1. 添加图片资源文件
```
mipmap-xhdpi/
├── app_loading0.png
├── app_loading1.png
├── app_loading2.png
├── app_loading3.png
├── header_loading0.png
├── header_loading1.png
├── header_loading2.png
├── header_loading3.png
├── ic_launcher.png
├── ic_launcher_round.png
└── loading_image.png

0 directories, 11 files
```

2. 添加头部动画的`.xml`文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<animation-list xmlns:android="http://schemas.android.com/apk/res/android"
    android:oneshot="false">

    <item
        android:drawable="@mipmap/header_loading0"
        android:duration="250" />
    <item
        android:drawable="@mipmap/header_loading1"
        android:duration="250" />
    <item
        android:drawable="@mipmap/header_loading2"
        android:duration="250" />
    <item
        android:drawable="@mipmap/header_loading3"
        android:duration="250" />

</animation-list>
```

3. 添加Footer动画的`.xml`文件

```xml
 <?xml version="1.0" encoding="utf-8"?>
 <animation-list xmlns:android="http://schemas.android.com/apk/res/android"
     android:oneshot="false">

     <item
         android:drawable="@mipmap/app_loading0"
         android:duration="150" />
     <item
         android:drawable="@mipmap/app_loading1"
         android:duration="150" />
     <item
         android:drawable="@mipmap/app_loading2"
         android:duration="150" />
     <item
         android:drawable="@mipmap/app_loading3"
         android:duration="150" />

 </animation-list>
```

4. 添加通用的圆圈进度动画

```xml
<?xml version="1.0" encoding="utf-8"?>
<rotate xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@mipmap/loading_image"
    android:fromDegrees="0"
    android:pivotX="50%"
    android:pivotY="50%"
    android:toDegrees="360">

</rotate>
```

# 第二章 技术点记录

# 1.

# 2.

# 3.

