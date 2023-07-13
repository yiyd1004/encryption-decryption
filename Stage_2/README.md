# Knowledge is key!
<div class="step-text">
<h3 id="description">Description</h3>
<p>In this stage, the encryption will be controlled by a <strong>key</strong>, a special parameter that controls the behavior of our encryption algorithm. See the picture below for more information.</p>
<br/>
<h3>The encryption process</h3>
<div style="text-align: center;">
<figure class="image" style=""><img alt="Encryption process in the Encryption-Decryption program" height="354" src="https://ucarecdn.com/60ec14dd-7cef-4895-b147-8115e83c533e/" width="662"/>
<figcaption></figcaption>
</figure>
</div>
<p>The key is assumed to mean that if a person knows the value of the key, they will be able to decrypt the text, and if they do not know it, they will not be able to decrypt the text. It's like a real key that can open up access to the message text.</p>
<h3 id="objectives">Objectives</h3>
<p>Write a program that reads an English message and an integer number (key) from the standard input and shifts each letter by the specified number according to its order in the alphabet. If you reach the end of the alphabet, start back at the beginning (<code class="java">a</code> follows <code class="java">z</code>).</p>
<p>The English alphabet is below:</p>
<pre><code class="java">abcdefghijklmnopqrstuvwxyz</code></pre>
<p>The program should not modify non-letter characters.</p>
<h3 id="example">Example</h3>
<p>The greater-than symbol followed by a space (<code class="java">&gt; </code>) represents the user input. Note that it's not part of the input.</p>
<pre><code class="java">&gt; welcome to hyperskill
&gt; 5
bjqhtrj yt mdujwxpnqq</code></pre>
</div>
