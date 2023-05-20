/**
 * @return {Function}
 */
var createHelloWorld = function() {//difficulty easy https://leetcode.com/problems/create-hello-world-function/
    return function(...args) {
        return "Hello World";
    }
};


const f = createHelloWorld();
f(); // "Hello World"
