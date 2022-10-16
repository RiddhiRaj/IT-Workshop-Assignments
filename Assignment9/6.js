// Write a JavaScript program to find out the roots of a quadratic equation and display the roots

function quadraticEquation(a, b, c) {
    let d = b * b - 4 * a * c;
    let root1 = (-b + Math.sqrt(d)) / (2 * a);
    let root2 = (-b - Math.sqrt(d)) / (2 * a);
    return [root1, root2];
    }

console.log(quadraticEquation(1, -5, 6));
console.log(quadraticEquation(1, 2, 3));

