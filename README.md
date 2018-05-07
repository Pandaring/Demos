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


# 第二章 技术点记录

# 1.

# 2.

# 3.

