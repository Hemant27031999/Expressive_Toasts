<div align="center">
<h1> Expressive_Toasts </h1>
	<img src="https://img.shields.io/badge/platform-Android-brightgreen.svg" alt="Platform" />
  <img src="https://img.shields.io/badge/API-21%2B-blue.svg" alt="API" /> 
	<a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-red.svg"
      alt="License: MIT" />
  </a>
	<a href="https://jitpack.io/#Hemant27031999/Expressive_Toasts"><img src="https://img.shields.io/badge/jitpack-0.0.2-yellowgreen" alt="version" /></a>
</div>

</br>
</br>

Expressive toast is a simple android library which helps you add more expressive toasts with sounds and background color. See its demo [here](https://drive.google.com/open?id=17nVxHlU7tEfOECOu2QSW1LYNUtZs9os0)
</br>
</br>

Success Toast             |  Failure Toast          |  Restricted Toast      |   Warning Toast        
:-------------------------:|:-------------------------:|:-------------------------:|:-------------------------:
![](https://github.com/Hemant27031999/Expressive_Toasts/blob/master/gallery/success.jpeg)  |  ![](https://github.com/Hemant27031999/Expressive_Toasts/blob/master/gallery/failure.jpeg) |  ![](https://github.com/Hemant27031999/Expressive_Toasts/blob/master/gallery/restricted.jpeg) |  ![](https://github.com/Hemant27031999/Expressive_Toasts/blob/master/gallery/warned.jpeg)

</br>
Not only this, you can also add color yourself to these toasts and also add sounds that play along them.
</br>
</br>
</br>

## Adding it to your App


#### Adding Dependency
First add the repository into your project gradle file

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Then add the following Dependency to your app gradle file

```java
dependencies {
    ...
    implementation 'com.github.Hemant27031999:Expressive_Toasts:0.0.2'
}
```
</br>
</br>

## Making Toasts

</br>

The library provides different methods to make different types of toasts. Call them as follows : 

</br>

To make a **success** toast with green background and success sound track :

```java
MyToast.success(Context context, String message, float duration);
```

</br>

To make a **failure** toast with red background and failure sound track :

```java
MyToast.failure(Context context, String message, float duration);
```

</br>

To make a **warning** toast with light blue background and warning sound track :

```java
MyToast.warning(Context context, String message, float duration);
```

</br>

To make a **restriction** toast with light pink background and restriction sound track :

```java
MyToast.restricted(Context context, String message, float duration);
```

</br>

To make a **applause** toast with light purple background and applause sound track :

```java
MyToast.applause(Context context, String message, float duration);
```

</br>

To make a **simple** toast with grey background and tweek sound track :

```java
MyToast.simple(Context context, String message, float duration);
```

</br>

You can also add custom toast with/without sound and your own background color.
</br>
Call the following method to make a **Custom toast with your background color and without sound** :

```java
MyToast.customToast(Context context, String message, String hexColor, float duration);
```

</br>

Call the following method to make a **Custom toast with your background color and with sound**. Note that you must have your **audio resource pasted in raw directory** under res folder.

```java
MyToast.customToast(Context context, String message, String hexColor, @RawRes int resId, float duration);
```

</br>

Please note that the hexColor should be a **complete hexColor string with '#' as the first charachter**. For eg : Pass "#FFFFFF" for white background toast.

</br>
</br>


## Bugs or Issues
If you find any bug or issue, feel free to report it. Your suggestions and PRs are also welcomed. 
