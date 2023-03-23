# AND-Coding-Challenge_Text-In-Transit
Challenge 3 - "Text in Transit"

Implementation of the Text in Transit challenge as part of AND's 2023 coding challenges using Java.

---

<b>Requirements</b>

1. Java >= 11
2. An OS/Terminal capable of displaying ANSI Codes. Linux and MacOS should work fine, Windows may be unreliable.

---

<b>Running (Default)</b>

1. Download `AND-Coding-Challenge_Text-In-Transit.jar` from the releases page.
2. In a terminal, navigate inside the folder where it downloaded to.
3. Type `java -jar AND-Coding-Challenge_Text-In-Transit.jar` for the default output.

---

<b>Running (Custom)</b>

1. As above, except on `Step 3` you can define custom parameters.
2. For example, `java -jar AND-Coding-Challenge_Text-In-Transit.jar 8 4 "This is a very interesting sentence that I want to display!"` will print the custom message with a screen width of 8 and 4 words-per-second.
3. In your custom message, you can generally wrap words with bold, underline, red, green and blue tags. The syntax is defined below...

- [B][/B] = Bold
- [U][/U] = Underline
- [C:R][/C:R] = Colour Red
- [C:G][/C:G] = Colour Green
- [C:B][/C:B] = Colour Blue

Ex. 1 - "[B]Hello[/B]"

Ex. 2 - "[B][U]You can chain[/U] words together![/B] including [B][C:R]with[/C:R] [U][C:B] colour![/C:B][/U][/B]"

Ex. Full - `java -jar AND-Coding-Challenge_Text-In-Transit.jar 4 2 "[B]My[/B] [U]N[/U][B]A[/B][U]M[/U][B]E[/B] [C:R]is[/C:R] [B][C:G][U]Je[/C:G][C:B]ff[/U][/C:B][/B]"`
