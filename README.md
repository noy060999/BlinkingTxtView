**Demo:**



![](https://media.giphy.com/media/2iZf42ldfBnCqZ8fe0/giphy.gif)



**How To Use?**
When using my element in XML/Java file, use the attribute "app:blinkingRate" to set the time between each blink.

**Step 1. Add it in your root build.gradle at the end of repositories:**

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

```

**Step 2. Add the dependency**

```
dependencies {
	implementation 'com.github.noy060999:BlinkingTxtView:1.0.0'```
}
```
