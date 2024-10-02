function firstNonRepeatingChar(str) {
    const charCount = {};

    
    // Step 1: Count the frequency of each character
    for (let char of str) {
        charCount[char] = (charCount[char] || 0) + 1;
    }

    console.log(JSON.stringify(charCount),charCount['a'])

    // Step 2: Find the first character with a frequency of 1
    for (let char of str) {
        if (charCount[char] === 1) {
            return char;
        }
    }

    return null; // If no non-repeating character is found
}

// Example usage:
const input = "abracadabra";
const result = firstNonRepeatingChar(input);
//console.log(result); // Output: "c"
