---


---

<p>When using my element in XML/Java file, use the attribute “app:blinkingRate” to set the time between each blink.<br>
<a href="https://youtu.be/9QPYJK_yvnQ">For Demo -&gt; Click ME ! </a></p>
<p><strong>Step 1. Add it in your root build.gradle at the end of repositories:</strong></p>
<pre><code>allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

</code></pre>
<p><strong>Step 2. Add the dependency</strong></p>
<pre><code>dependencies {
	implementation 'com.github.noy060999:BlinkingTxtView:1.0.0'```
}
</code></pre>

